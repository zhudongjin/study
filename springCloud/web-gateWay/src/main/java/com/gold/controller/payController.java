package com.gold.controller;

import com.gold.common.*;
import com.gold.request.AbstractHstypayRequest;
import com.gold.response.AbstractHstypayResponse;
import com.gold.response.Result;
import com.gold.service.GatewayService;
import com.gold.vo.HstypayAccount;
import com.gold.common.IP.IpUtil;
import com.gold.common.controller.BaseController;
import com.gold.common.error.ErrorCode;
import com.gold.common.exception.BusinessException;
import feign.Feign;
import feign.Headers;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletInputStream;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * 作者：gold.zhu
 * 创建时间：10点21分
 * 备注：网关入口
 */
@RestController()
public class payController extends BaseController {

    @Resource
    protected GatewayService gatewayService;

    @ResponseBody
    @RequestMapping(value = "/gateway", method = RequestMethod.GET,  produces="application/xml;charset=UTF-8")
    public String gatewayNoSupport(){
        return failure(new Result("400", "Require POST method"));
    }

    @RequestMapping(value = "/gateway",method = RequestMethod.POST)
    String index(){
        // 初始化http信息
        HttpInfo httpInfo = this.initHttpInfo();

        String xml = parseInputStream();
        // 根据xml转对象
        ProtocolTrack track = this.parseProtocol(xml);
        // 解析请求参数,获取输入输出对象类
        AbstractHstypayRequest request = RequestUtil.parse(xml, track);
        // 验证请求参数
        this.checkProtocol(request);
        // 获取汇商的支付账户
        HstypayAccount account = gatewayService.checkSrcAndGetSignAccount(track.getService(), request, httpInfo);

        // 校验签名
        xmlUtils.checkSign(request, account);

        // 处理业务逻辑
        AbstractHstypayResponse response = this.call(request, httpInfo);

        // 转换结果后返回
        String resultStr = gatewayService.parseResult(track.getService(), response);

        if (StringUtils.isNotBlank(resultStr)) {
            return resultStr;
        }
        //对返回结果进行配置及签名
        this.signResponse(request, account, response);
        //将对象转换为xml
        return xmlUtils.parseToXml(response);
    }

    /**
     * 对返回结果进行配置及签名
     * @param request
     * @param account
     * @param response
     */
    protected void signResponse(AbstractHstypayRequest request, HstypayAccount account, AbstractHstypayResponse response) {
        response.setNonceStr(request.getNonceStr());
        response.setCharset(account.getCharset());
        response.setMchId(account.getMerchantId());
        response.setSignAgentno(account.getSignAgentno());
        response.setVersion(account.getVersion());
        response.setDeviceInfo(request.getDeviceInfo());
        // 对返回结果进行签名
        xmlUtils.sign(response, account);
    }

    protected AbstractHstypayResponse call(AbstractHstypayRequest request, HttpInfo httpInfo) {
        class FeignInterceptor implements RequestInterceptor {
            @Override
            public void apply(RequestTemplate requestTemplate) {
                requestTemplate.header("X-MSGNO", httpInfo.getMsgNo());
                requestTemplate.header("X-CLIENTIP", httpInfo.getClientIp());
                requestTemplate.header("X-CLIENTHOST", httpInfo.getClientHost());
            }
        }
        AbstractHstypayResponse response = gatewayService.apply2(request.getService(), request);
        return response;
    }

    // 获取http信息
    protected HttpInfo initHttpInfo() {
        HttpInfo httpInfo = new HttpInfo();
        httpInfo.setMsgNo(UUID.randomUUID().toString().replaceAll("-", ""));
        httpInfo.setClientIp(IpUtil.getClientIp(request.getHeader("X-Forwarded-For")));
        httpInfo.setClientHost(request.getHeader("Host"));
        httpInfo.setStartTime(System.currentTimeMillis());

        return httpInfo;
    }
    protected String parseInputStream() {
        try {
            ServletInputStream inputStream = request.getInputStream();
            StringBuilder content = new StringBuilder();
            int size = request.getContentLength();
            byte[] b = new byte[size];
            int lens;
            while ((lens = inputStream.read(b)) > 0) {
                content.append(new String(b, 0, lens, CHARSET));
            }
            return content.toString();
        } catch (IOException e) {
            throw new BusinessException();
        }

    }
    /**
     * parseParam:解析请求参数
     *
     * @author tkf
     * @param xml
     */
    protected ProtocolTrack parseProtocol(String xml){
        ProtocolTrack track = new ProtocolTrack();
        Map<String, String> xmlMap = xmlUtils.xmlToMap(xml);

        track.setService(xmlMap.get("service"));
        track.setXmlMap(xmlMap);
        track.setOutReqXml(xml);

        return track;
    }
    /**
     * validateProtocol:验证请求参数
     *
     * @author tangkaifei
     * @param request
     */
    protected void checkProtocol(AbstractHstypayRequest request){
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        //验证某个对象,，其实也可以只验证其中的某一个属性的
        Set<ConstraintViolation<AbstractHstypayRequest>> constraintViolations = validator.validate(request);

        Iterator<ConstraintViolation<AbstractHstypayRequest>> iter = constraintViolations .iterator();
        while  (iter.hasNext()) {
            ConstraintViolation<AbstractHstypayRequest> violation = iter.next();
            String errMsg = String.format("%s:%s", violation.getPropertyPath(),violation.getMessage());
            throw new BusinessException(ErrorCode.create("400", errMsg));
        }
    }

    /**
     * failure:组装异常xml报文
     *
     * @author hansong
     * @param result
     * @return
     */
    protected String failure(Result result){
        StringBuilder buf = new StringBuilder();
        buf.append("<xml>");
        buf.append("<version><![CDATA[").append(result.getVersion()).append("]]></version>\n");
        buf.append("<charset><![CDATA[").append(result.getCharset()).append("]]></charset>\n");
        buf.append("<sign_type><![CDATA[").append(result.getSign_type()).append("]]></sign_type>\n");
        buf.append("<status><![CDATA[").append(result.getStatus()).append("]]></status>\n");
        buf.append("<message><![CDATA[").append(result.getMessage()).append("]]></message>\n");
        buf.append("</xml>");
        return buf.toString();
    }
}
