package com.gold.protocol.tenpay;

import com.gold.protocol.ProtocolPayment;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;


/**
 * ClassName: ProtocolTenpayJspay
 * Function: 手Qjspay支付协议
 * Date:     2017年7月1日 下午2:34:46
 * @author   hansong
 */
@Getter
@Setter
public class ProtocolTenpayJspay extends ProtocolPayment {
	private static final long serialVersionUID = -2432659062858231775L;

	public static final String service = "pay.tenpay.jspay";

	@NotBlank
    @Length(max=250)
//    @LegalUrl()
    private String notify_url;

	@Length(max=1024)
    private String callback_url;

}

