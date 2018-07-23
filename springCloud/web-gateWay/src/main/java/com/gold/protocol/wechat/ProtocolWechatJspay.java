package com.gold.protocol.wechat;

import com.gold.common.validator.Pattern;
import com.gold.protocol.ProtocolPayment;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;


/**
 * ClassName:ProtocolWechatMicropay
 * Function: 微信jspay支付协议
 * Date:     2017年7月1日 下午2:34:46
 * @author   hansong
 */
@Getter
@Setter
public class ProtocolWechatJspay extends ProtocolPayment {
	private static final long serialVersionUID = -2432659062858231775L;

	public static final String service = "pay.wechat.jspay";

	@NotBlank
    @Length(max=128)
	private String sub_openid;
    
	@NotBlank
    @Length(max=32)
    private String sub_appid;
	
	@Pattern(matching="0|1")
	private String is_raw;	// 是否原生态（0否、1是；不传默认是0）
	
	@NotBlank
    @Length(max=250)
//    @LegalUrl()
    private String notify_url;

	@Length(max=1024)
    private String callback_url;

}

