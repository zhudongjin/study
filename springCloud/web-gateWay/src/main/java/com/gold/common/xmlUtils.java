package com.gold.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.gold.common.encrypt.MD5Encryption;
import com.gold.common.error.ErrorCode;
import com.gold.common.exception.BusinessException;
import com.gold.common.exception.CommonErrorCodes;
import com.gold.request.AbstractHstypayRequest;
import com.gold.response.AbstractHstypayResponse;
import com.gold.vo.HstypayAccount;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.*;

/**
 * 作者：gold.zhu
 * 创建时间：10点21分
 * 备注：xml帮助类
 */
@Slf4j
public class xmlUtils {
    private static final XmlMapper mapper = new XmlMapper();
    /**
     * 将对象转换为对象
     * @param xml
     * @return
     */
    public static Map<String, String> xmlToMap(String xml) {
        if (StringUtils.isBlank(xml)) {
            log.info("请求体为空:{}", xml);
            throw new BusinessException(ErrorCode.create("400", "service参数必须"));
        }
        Map<String, String> paramMap;
        try {
            paramMap = mapper.readValue(xml, new TypeReference<Map<String,String>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            log.info("报文格式错误:{}", xml);
            throw new BusinessException(ErrorCode.create("500", "报文格式错误"));
        }
        return paramMap;

    }
    /**
     * 将对象转换为对象
     * @param xml
     * @param clazz>
     * @return
     */
    public static <S extends AbstractHstypayRequest> S parseFromXml(String xml, Class<S> clazz) {
        try {
            return mapper.readValue(xml, clazz);
        } catch (IOException e) {
            e.printStackTrace();
            log.info("报文格式错误:{}", xml);
            throw new BusinessException(ErrorCode.create("500", "报文格式错误"));
        }

    }
    /**
     * 将对象转换为xml
     * @param response
     * @param <S>
     * @return
     */
    public static <S extends AbstractHstypayResponse> String parseToXml(S response) {
        try {
            return mapper.writeValueAsString(response).replaceFirst(" xmlns=\"\"", ""); // 去掉xmlns属性
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new BusinessException(ErrorCode.create("500", "内部服务错误"));
        }

    }

    /**
     * 验证签名
     * @param account
     */
    public static <T extends AbstractHstypayRequest> void checkSign(T request, HstypayAccount account) {
        // 收集
        SortedMap<String, String> paramMap = request.getXmlMap();
        log.info("参数Map: {}", paramMap);
        //去除签名字段
        paramMap.remove("sign");
        // 拼接字符串
        StringBuilder buf = new StringBuilder((paramMap.size() + 1) * 10);
        buildPayParams(buf, paramMap, false);
        String preStr = buf.toString() + "&key=" + account.getSignKey();
        log.debug("预加密数据："+ preStr);

        String sign = MD5Encryption.encrypt(preStr, account.getCharset()).toUpperCase();
        log.debug("生成的签名："+ sign);

        if (!request.getSign().equalsIgnoreCase(sign)) {
            throw new BusinessException(CommonErrorCodes.SIGN_ERROR.toErrorCode());
        }
    }

    /**
     * 签名方法
     * @param account
     */
    public static <S extends AbstractHstypayResponse> void sign(S response, HstypayAccount account) {
        // 签名放在转换前
        // 将对象转为为Map
        SortedMap<String, String> paramMap = mapper.convertValue(response, new TypeReference<SortedMap<String,String>>() {});
        log.debug("转换后的Map: {}", paramMap);
        //去除签名字段， 避免前端已经设置了签名
        paramMap.remove("sign");

        // 拼接字符串
        StringBuilder buf = new StringBuilder((paramMap.size() + 1) * 10);
        buildPayParams(buf, paramMap, false);
        String preStr = buf.toString() + "&key=" + account.getSignKey();
        log.debug("待签名数据" + preStr);

        String sign = MD5Encryption.encrypt(preStr, account.getCharset()).toUpperCase();
        response.setSign(sign);
    }

    /** 把数组所有元素排序，并按照“key1=value1&key2=value2…”的格式拼接
     * @author
     * @param payParams
     * @return
     */
    public static void buildPayParams(StringBuilder sb, Map<String, String> payParams, boolean encoding){
        List<String> keys = new ArrayList<String>(payParams.keySet());
        Collections.sort(keys);
        for(String key : keys){
            sb.append(key).append("=");
            if(encoding){
                sb.append(urlEncode(payParams.get(key)));
            }else{
                sb.append(payParams.get(key));
            }
            sb.append("&");
        }
        sb.setLength(sb.length() - 1);
    }

    public static String urlEncode(String str){
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable e) {
            return str;
        }
    }
}
