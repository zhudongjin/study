package com.gold.request.bill;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * ClassName:MerchantBillDownloadRequest
 * Function: 商户账单下载请求
 * Date:     2017年7月5日 下午2:32:26
 * @author   hansong
 */
@Data
public class StoreBillDownloadRequest extends AbstractBillDownloadRequest {


	/* 推 荐关注公 众账号 APPID */
	@NotBlank
	@Length(max=32)
	@JacksonXmlProperty(localName = "store_merchant_id")
	private String storeMerchantId;

}

