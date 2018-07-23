package com.gold.controller;

import com.gold.common.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者：gold.zhu
 * 创建时间：10点21分
 * 备注：网关入口
 */
@RestController()
public class AccController extends BaseController {

    @RequestMapping(value = "/checkSrcAndGetSignAccount",method = RequestMethod.POST)
    HstypayAccount checkSrcAndGetSignAccount(String service, AbstractHstypayRequest request, HttpInfo httpInfo){
        return new HstypayAccount();
    }

    @RequestMapping(value = "/apply2",method = RequestMethod.POST)
    AbstractHstypayResponse apply2(String service, AbstractHstypayRequest request){
        return null;
    }

    @RequestMapping(value = "/parseResult",method = RequestMethod.POST)
    String parseResult(String service, AbstractHstypayResponse response){
        return "parseResult";
    }

    @RequestMapping(value = "/apply",method = RequestMethod.POST)
    Result apply(ProtocolHeader protocolHeader){
        return new Result();
    }
    @RequestMapping(value = "/insertOrderTrack",method = RequestMethod.POST)
    void insertOrderTrack(OrderTrackDTO orderTrackDTO){

    }

}
