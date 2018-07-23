package com.gold.request.mch;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

/**
 * ClassName:MerchantBillDownloadRequest
 * Function: 新增商户请求
 * Date:     2017年7月5日 下午2:32:26
 * @author   hansong
 */
@JacksonXmlRootElement(localName = "xml")
@Data
public class MchPhotoGetRequest extends AbstractMchRequest {
	public final static String SERVICE = "merchant.photo.get";

	/** 商户号 */
	@NotBlank
	@JacksonXmlProperty(localName = "merchant_id")
	@JacksonXmlCData
	private String merchantId;

	/** 图片类型 返回图片的Url链接
	 *  1 身份证照（含正反面，以','分割）
	 *  2 银行卡
	 *  3 门头照
	 *  4 营业执照
	 */
	@NotNull
	@Range(min = 1, max = 4)
	@JacksonXmlProperty(localName = "photo_type")
	private Integer photoType;


}

