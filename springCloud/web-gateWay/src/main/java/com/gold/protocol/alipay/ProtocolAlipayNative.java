package com.gold.protocol.alipay;

import com.gold.protocol.ProtocolPayment;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * ClassName: ProtocolAlipayNative
 * Function: 支付宝正扫支付协议
 * Date:     2017年7月1日 下午2:34:46
 * @author   hansong
 */
@Getter
@Setter
public class ProtocolAlipayNative extends ProtocolPayment {
	private static final long serialVersionUID = 1446249279628556619L;

	public static final String service = "pay.alipay.native";

	@NotBlank
    @Length(max=255)
//    @LegalUrl
    private String notify_url;
}

