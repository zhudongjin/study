package com.gold.request.subdev;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * ClassName:ProtocolRefund
 * Function: 订单查询请求协议
 * Date:     2017年7月5日 下午2:32:26
 * @author   hansong
 */
@Data
public class WxSubdevConfigAddRequest extends AbstractWxSubdevConfRequest {

	/** 公众账号支付授权目录 */
	@Length(max=256)
	private String path;

	/** appid */
	@Length(max=32)
	private String appid;

	/** 推 荐关注公 众账号 APPID */
	@Length(max=32)
	@JacksonXmlProperty(localName = "subscribe_appid")
	private String subscribeAppid;

}

