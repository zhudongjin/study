package com.gold.protocol.wechat;

import com.gold.protocol.ProtocolPayment;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * ClassName:ProtocolWechatMicropay
 * Function: 微信正扫支付协议
 * Date:     2017年7月1日 下午2:34:46
 * @author   hansong
 */
@Getter
@Setter
public class ProtocolWechatNative extends ProtocolPayment {
	private static final long serialVersionUID = 1446249279628556619L;

	public static final String service = "pay.wechat.native";

	@NotBlank
    @Length(max=255)
//    @LegalUrl
    private String notify_url;
}

