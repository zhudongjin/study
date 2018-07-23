package com.gold.protocol;

import com.gold.common.validator.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * ClassName:ProtocolRefund
 * Function: 统一申请退款请求协议
 * Date:     2017年7月5日 下午2:32:26
 * @author   hansong
 */
@Setter
@Getter
public class ProtocolRefundApply extends ProtocolHeader{
	private static final long serialVersionUID = -5472017066753958920L;

	/** 汇商交易号，out_trade_no和transaction_id至少一个必填，同时存在时transaction_id优先 */
	@Length(max=32)
	private String transaction_id;

	/** 商户订单，out_trade_no和transaction_id至少一个必填，同时存在时transaction_id优先 */
	@Length(max=32)
	private String out_trade_no;

	/** 商户退款单号 */
	@NotBlank
	@Length(max=32)
	private String out_refund_no;

	/** 退款金额，单位：分 */
	@NotNull
	@Min(value = 1, message = "退款金额应大于1")
	private int refund_fee;

	/** 退款渠道（1-原路返回，默认  2-余额） */
	@Pattern(matching="1|2")
	private String refund_channel;

}

