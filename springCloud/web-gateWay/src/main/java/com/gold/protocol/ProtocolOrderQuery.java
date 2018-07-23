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
public class ProtocolOrderQuery extends ProtocolHeader{
	private static final long serialVersionUID = 570772667838973465L;

	@Length(max=32)
	private String transaction_id;//汇商交易号，out_trade_no和transaction_id至少一个必填，同时存在时transaction_id优先
	
	@Length(max=32)
	private String out_trade_no; //商户订单，out_trade_no和transaction_id至少一个必填，同时存在时transaction_id优先
	
}

