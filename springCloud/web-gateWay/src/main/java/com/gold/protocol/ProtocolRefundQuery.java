package com.gold.protocol;

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
public class ProtocolRefundQuery extends ProtocolHeader{
	private static final long serialVersionUID = 570772667838973465L;

	/** 平台退款单号refund_id、out_refund_no两个参数必填一个， 如果同事存在优先级为：refund_id>out_refund_no */
	@Length(max=32)
	private String refund_id;

	/** 商户退款单号，32个字符内、可包含字母,确保在商户系统唯一。 */
	@Length(max=32)
	private String out_refund_no;
	
}

