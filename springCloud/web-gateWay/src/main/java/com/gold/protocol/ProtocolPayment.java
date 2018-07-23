package com.gold.protocol;

import com.gold.common.validator.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * ClassName: ProtocolPayment 
 * Function: 支付请求协议
 * date: 2017年7月1日 下午2:03:15
 *
 * @author hansong
 */
@Getter
@Setter
public class ProtocolPayment extends ProtocolHeader{
	private static final long serialVersionUID = -8991355241820127725L;

	@NotBlank
    @Length(max=32)
    private String out_trade_no;//商户订单号
	
	@NotNull
	@Min(value=1)
	@Max(value=5000000)
    private int total_fee;//总金额，以分为单位，不允许包含任何字、符号
	
	@Pattern(matching="CNY|GBP|HKD|USD|JPY|CAD|AUD|EUR")
	private String fee_type = "CNY";//币种
	
	@NotBlank
	@Length(max=16)
    private String mch_create_ip;//订单生成的机器IP
	
	@Length(max=128)
    private String attach;//商户附加信息，可做扩展参数
	
	@Length(max=128)
    private String body;
	
	@Length(max=14)
    private String expire_time;//订单失效时间，格式为 yyyymmddhhmmss
	
	@Length(max=32)
    private String goods_tag;//商品标记
	
    @Pattern(matching="0|1")
    private String limit_credit_pay;//是否限制信用卡支付  1：限制，0：不限制
}

