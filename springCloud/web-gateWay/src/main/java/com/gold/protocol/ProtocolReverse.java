package com.gold.protocol;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * ClassName:ProtocolRefund
 * Function: 订单冲正请求协议
 * Date:     2017年7月5日 下午2:32:26
 * @author   hansong
 */
@Getter
@Setter
public class ProtocolReverse extends ProtocolHeader{
	private static final long serialVersionUID = -1837154609141120511L;

	public static final String SERVICE = "unified.trade.reverse";

	/** 商户订单号 */
	@NotBlank
	@Length(max=32)
	private String out_trade_no;

}

