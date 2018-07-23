package com.gold.controller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.gold.common.validator.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.SortedMap;

/**
 * ClassName: ProtocolHeader 
 * Function: 支付协议头
 * date: 2017年7月1日 下午12:00:33
 *
 * @author hansong
 */
@Getter
@Setter
public class AbstractHstypayRequest implements Serializable {
	private static final long serialVersionUID = -1748552789922994298L;

	/** 支付类型 */
	@NotBlank
    @Length(max=32)
    private String service;

	/** 服务商ID */
	@Length(max=32)
    @JacksonXmlProperty(localName = "sign_agentno")
    private String signAgentno;

	/** 默认版本：1.0 */
	@Pattern(matching="1.0")
    private String version;

	/** 目前仅支持：utf-8  */
	@Pattern(matching="UTF-8")
    private String charset;

	/** 目前仅支持：md5  */
	@Pattern(matching="MD5")
    @JacksonXmlProperty(localName = "sign_type")
    private String signType;

    /** 操作员编号 */
    @Length(max=32)
    @JacksonXmlProperty(localName = "op_user_id")
    private String opUserId;

    /** 设备信息 */
	@Length(max=64)
    @JacksonXmlProperty(localName = "device_info")
    private String deviceInfo;

	/** 随机字符串 */
    @NotBlank
    @Length(max=32)
    @JacksonXmlProperty(localName = "nonce_str")
    private String nonceStr;

    /** 签名串 */
    @NotBlank
    @Length(max=32)
    private String sign;

    private SortedMap<String, String> xmlMap;
}

