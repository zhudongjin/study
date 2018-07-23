package com.gold.service;


import com.gold.dto.OrderTrackDTO;
import com.gold.protocol.ProtocolHeader;
import com.gold.response.Result;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName:PayWechatService
 * Function: 支付：FeignClient服务
 * Date:     2017年7月1日 下午3:26:50
 * @author   hansong
 * @since    JDK 1.8
 */
@FeignClient(value = "acc")
public interface PayService {

	/**
	 * apply:支付接口服务
	 *
	 * @author hansong
	 * @param protocolHeader
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST,value = "/apply")
	public Result apply(@RequestParam("protocolHeader")ProtocolHeader protocolHeader);
	
	/**
	 * insertOrderTrack:插入订单追踪记录
	 *
	 * @author hansong
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST,value = "/insertOrderTrack")
	public void insertOrderTrack(@RequestParam("orderTrackDTO")OrderTrackDTO orderTrackDTO);
}

