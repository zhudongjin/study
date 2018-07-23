package com.gold.request.mch;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * ClassName:MerchantBillDownloadRequest
 * Function: 新增商户请求
 * Date:     2017年7月5日 下午2:32:26
 * @author   hansong
 */
@JacksonXmlRootElement(localName = "xml")
@Data
public class MchSearchRequest extends AbstractMchRequest {

	/** 商户号 */
	@JacksonXmlProperty(localName = "merchant_id")
	@JacksonXmlCData
	private String merchantId;

	/** 商户名称，模糊匹配 */
	@Length(max=32)
	@JacksonXmlProperty(localName = "merchant_name")
	private String merchantName;

	/**
	 * 查询的开始创建时间
	 */
	@JsonFormat(pattern = "yyyyMMddHHmmss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyyMMddHHmmss")
	@JacksonXmlProperty(localName = "begin_create_date")
	private Date beginCreateDate;

	/**
	 * 查询的结束创建时间
	 */
	@JsonFormat(pattern = "yyyyMMddHHmmss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyyMMddHHmmss")
	@JacksonXmlProperty(localName = "end_create_date")
	private Date endCreateDate;

	/**
	 * 分页，从1开始，每次最多返回100条
	 */
	@JacksonXmlProperty(localName = "page_num")
	private Integer pageNum;
}

