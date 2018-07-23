package com.gold.service;

import com.gold.common.HttpInfo;
import com.gold.request.AbstractHstypayRequest;
import com.gold.response.AbstractHstypayResponse;
import com.gold.vo.HstypayAccount;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 作者：gold.zhu
 * 创建时间：10点21分
 * 备注：服务调用
 */
@FeignClient(value = "acc")
public interface GatewayService {

    /**
     * 获取用于签名的汇商账户
     * @param request
     * @return
     *
     */
    @RequestMapping(method = RequestMethod.POST,value = "/checkSrcAndGetSignAccount")
    HstypayAccount checkSrcAndGetSignAccount(@RequestParam("service")String service, @RequestParam("request")AbstractHstypayRequest request, @RequestParam("httpInfo")HttpInfo httpInfo);

    /**
     * 对服务进行处理
     * @param request
     * @return
     */
    @RequestMapping(method = RequestMethod.POST,value = "/apply2")
    AbstractHstypayResponse apply2(@RequestParam("service")String service, @RequestParam("request")AbstractHstypayRequest request);

    /**
     * 对结果进行转换
     * @param response
     * @return
     */
    @RequestMapping(method = RequestMethod.POST,value = "/parseResult")
    String parseResult(@RequestParam("service")String service, @RequestParam("response")AbstractHstypayResponse response);
}
