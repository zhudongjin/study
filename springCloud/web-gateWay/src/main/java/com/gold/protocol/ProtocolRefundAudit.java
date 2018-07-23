package com.gold.protocol;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * ClassName: ProtocolRefundAudit
 * Function: 内部退款审核请求协议
 * Date:     2017年7月5日 下午2:32:26
 * @author   hansong
 */
@Setter
@Getter
public class ProtocolRefundAudit extends ProtocolHeader{
	public static final String REFUND_AUDIT_PASS = "2";

	private static final long serialVersionUID = -5472017066753958920L;
	/** 汇商交易号，out_trade_no和transaction_id至少一个必填，同时存在时transaction_id优先 */
	@Length(max=32)
	private String transaction_id;

	/** 商户订单，out_trade_no和transaction_id至少一个必填，同时存在时transaction_id优先 */
	@Length(max=32)
	private String out_trade_no;

	/** 汇商退款单号 */
	@Length(max=32)
	private String refund_id;
	/** 商户退款单号 */
	@Length(max=32)
	private String out_refund_no;

	/** 审核状态 success代表审核通过，传入其它值表示为审核拒绝 */
	@NotBlank
	private String audit_status;
	/** 审核原因 */
	@NotBlank
	@Length(max=255)
	private String audit_reason;

	
}

