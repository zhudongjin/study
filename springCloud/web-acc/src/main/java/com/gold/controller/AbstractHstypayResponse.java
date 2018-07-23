package com.gold.controller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * 汇商网关响应抽象类
 * @author tangkaifei
 */
@Data
public abstract class AbstractHstypayResponse implements Serializable {
    public static final String STATUS_OK = "200";
    public static final String RESULT_CODE_OK = "0";
    private static final long serialVersionUID = 3130670214011430976L;

    @JacksonXmlCData
    protected String version;
    @JacksonXmlCData
    protected String charset;
    @JacksonXmlProperty(localName = "sign_type")
    @JacksonXmlCData
    protected String signType;
    @JacksonXmlCData
    protected String status;
    @JacksonXmlCData
    protected String message;

    @JacksonXmlProperty(localName = "result_code")
    @JacksonXmlCData
    protected String resultCode;

    /** 服务商ID */
    @Length(max=32)
    @JacksonXmlProperty(localName = "sign_agentno")
    @JacksonXmlCData
    private String signAgentno;

    @JacksonXmlProperty(localName = "mch_id")
    @JacksonXmlCData
    protected String mchId;

//    @JacksonXmlProperty(localName = "store_merchant_id")
//    protected String storeMerchantId;

    @JacksonXmlProperty(localName = "device_info")
    @JacksonXmlCData
    protected String deviceInfo;

    @JacksonXmlProperty(localName = "nonce_str")
    @JacksonXmlCData
    protected String nonceStr;

    @JacksonXmlProperty(localName = "err_code")
    @JacksonXmlCData
    protected String errCode;

    @JacksonXmlProperty(localName = "err_msg")
    @JacksonXmlCData
    protected String errMsg;
    
    @JacksonXmlCData
    protected String sign;

    public AbstractHstypayResponse() {
        this.status = STATUS_OK;
        this.resultCode = RESULT_CODE_OK;
    }
}
