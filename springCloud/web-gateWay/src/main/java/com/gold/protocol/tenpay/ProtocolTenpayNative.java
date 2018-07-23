package com.gold.protocol.tenpay;

import com.gold.protocol.ProtocolPayment;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * ClassName: ProtocolTenpayNative
 * Function: 手Q正扫支付协议
 * Date:     2017年7月1日 下午2:34:46
 * @author   hansong
 */
@Getter
@Setter
public class ProtocolTenpayNative extends ProtocolPayment {
	private static final long serialVersionUID = 1446249279628556619L;

	public static final String service = "pay.tenpay.native";

	@NotBlank
    @Length(max=255)
//    @LegalUrl
    private String notify_url;
}

