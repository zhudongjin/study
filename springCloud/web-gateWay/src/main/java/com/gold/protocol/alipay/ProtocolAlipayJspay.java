package com.gold.protocol.alipay;

import com.gold.protocol.ProtocolPayment;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;


/**
 * ClassName: ProtocolAlipayJspay
 * Function: 支付宝jspay支付协议
 * Date:     2017年7月1日 下午2:34:46
 * @author   hansong
 */
@Getter
@Setter
public class ProtocolAlipayJspay extends ProtocolPayment {
	private static final long serialVersionUID = -2432659062858231775L;

	public static final String service = "pay.alipay.jspay";

	@Length(max=100)
	private String buyer_logon_id; //买家支付宝账号，和buger_id不能同时为空
	
	@Length(max=100)
	private String buyer_id; // 买家支付宝用户ID，和buyer_logon_id不能同时为空
	
	@NotBlank
    @Length(max=250)
//    @LegalUrl()
    private String notify_url;

	@Length(max=1024)
    private String callback_url;

}

