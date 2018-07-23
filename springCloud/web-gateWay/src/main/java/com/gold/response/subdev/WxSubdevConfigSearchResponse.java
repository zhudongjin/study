package com.gold.response.subdev;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.gold.common.MchSearchResultSerializer;
import com.gold.response.AbstractHstypayResponse;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * ClassName:ProtocolRefund
 * Function: 订单查询请求协议
 * Date:     2017年7月5日 下午2:32:26
 * @author   hansong
 */
@Setter
@Getter
@JacksonXmlRootElement(localName = "xml")
public class WxSubdevConfigSearchResponse extends AbstractHstypayResponse {
	/** 公众账号支付授权目录 */
    @JacksonXmlCData
	private String path;

	/** appid */
    @JacksonXmlCData
	private String appid;

	/** 推 荐关注公 众账号 APPID */
	@JacksonXmlProperty(localName = "subscribe_appid")
    @JacksonXmlCData
	private String subscribeAppid;

	/**
	 * 关注公众号和appid的匹配关系
	 * 使用JSON字符串格式转换,
	 */
	@JsonSerialize(using = MchSearchResultSerializer.class)
	@JacksonXmlCData
	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "appid_mapping_subscribe_appid")
	private List<AppidMappingsubcribeAppid> appidMappingsubcribeAppid;

	@Data
	@NoArgsConstructor
	public static class AppidMappingsubcribeAppid {
		private String subAppid;

		private String subscribeAppid;
	}
}

