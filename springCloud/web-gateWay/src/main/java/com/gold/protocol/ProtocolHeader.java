package com.gold.protocol;

import com.gold.common.validator.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * ClassName: ProtocolHeader 
 * Function: 支付协议头
 * date: 2017年7月1日 下午12:00:33
 *
 * @author hansong
 */
@Getter
@Setter
public class ProtocolHeader implements Serializable {
	private static final long serialVersionUID = -1748552789922994298L;

	@NotBlank
    @Length(max=32)
    private String service;	// 支付类型

    @Length(max=32)
    private String store_merchant_id;//门店号（门店主体，每个商户下面至少挂有一个门店）

    @Length(max=32)
    private String mch_id;//商户号

	@Length(max=32)
    private String sign_agentno;//服务商ID

	@Pattern(matching="1.0")
    private String version = "1.0";//默认版本：1.0
    
	@Pattern(matching="UTF-8")
    private String charset = "UTF-8"; //目前仅支持：utf-8
    
	@Pattern(matching="MD5")
    private String sign_type = "MD5";//目前仅支持：md5
    
    @Length(max=32)
    private String op_user_id;//操作员编号
    
	@Length(max=64)
    private String device_info;//设备信息
    
    @NotBlank
    @Length(max=32)
    private String nonce_str; //随机字符串
    
    @NotBlank
    @Length(max=32)
    private String sign; //签名串
    
}

