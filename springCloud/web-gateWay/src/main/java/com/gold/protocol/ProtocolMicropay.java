package com.gold.protocol;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;


/**
 * ClassName: ProtocolMicropay
 * Function: 统一小额支付协议
 * Date:     2017年7月1日 下午2:34:46
 * @author   hansong
 * @since    JDK 1.6
 */
@Getter
@Setter
public class ProtocolMicropay extends ProtocolPayment{
	private static final long serialVersionUID = -5524965128354053156L;

	public static final String service = "unified.trade.micropay";

	/**
	 * 世明会员卡支付服务apiCode
	 */
	public static final String SHIMING_MICROPAY_SERVICE = "pay.shiming.micropay";
	
	@NotBlank
    @Length(max=128)
    private String auth_code; //授权码
}

