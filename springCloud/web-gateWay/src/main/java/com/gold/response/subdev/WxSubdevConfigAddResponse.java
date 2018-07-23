package com.gold.response.subdev;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.gold.response.AbstractHstypayResponse;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

/**
 * ClassName:ProtocolRefund
 * Function: 订单查询请求协议
 * Date:     2017年7月5日 下午2:32:26
 * @author   hansong
 */
@Setter
@Getter
@JacksonXmlRootElement(localName = "xml")
public class WxSubdevConfigAddResponse extends AbstractHstypayResponse {
	/** 公众账号支付授权目录 */
	@Length(max=256)
	@JacksonXmlCData
	private String path;

	/** appid */
	@Length(max=32)
	@JacksonXmlCData
	private String appid;

	/** 推 荐关注公 众账号 APPID */
	@Length(max=32)
	@JacksonXmlProperty(localName = "subscribe_appid")
	@JacksonXmlCData
	private String subscribeAppid;

}

