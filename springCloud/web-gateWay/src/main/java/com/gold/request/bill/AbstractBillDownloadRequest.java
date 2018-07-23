package com.gold.request.bill;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.gold.request.AbstractHstypayRequest;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * ClassName:MerchantBillDownloadRequest
 * Function: 商户账单下载请求
 * Date:     2017年7月5日 下午2:32:26
 * @author   hansong
 */
@Data
public abstract class AbstractBillDownloadRequest extends AbstractHstypayRequest {

	/** 账单日期，格式：yyyyMMdd(如：20150101) */
	@NotNull(message = "账单日期必须")
	@Past(message = "账单日期需要早于当前日期")
	@JacksonXmlProperty(localName = "bill_date")
	@JsonFormat(pattern = "yyyyMMdd", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyyMMdd")
	private Date billDate;

	/** 账单类型，ALL：全部;  SUCCESS：成功;  REFUND：退款 */
	@NotBlank(message = "账单类型必须")
	@Length(max=8)
	@JacksonXmlProperty(localName = "bill_type")
	private String billType;

}

