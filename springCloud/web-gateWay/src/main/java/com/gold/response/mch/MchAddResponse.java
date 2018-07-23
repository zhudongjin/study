package com.gold.response.mch;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.gold.response.AbstractHstypayResponse;
import lombok.Data;

/**
 * 商户进件响应结果类
 * @author
 */

@JacksonXmlRootElement(localName = "xml")
@Data
public class MchAddResponse extends AbstractHstypayResponse {
    /** 商户号 */
    @JacksonXmlProperty(localName = "merchant_id")
    @JacksonXmlCData
    private String merchantId;
    /** 商户名称 */
    @JacksonXmlProperty(localName = "merchant_name")
    @JacksonXmlCData
    private String merchantName;

    /** 默认门店ID */
    @JacksonXmlProperty(localName = "store_merchant_id")
    @JacksonXmlCData
    private String storeMerchantId;

    /** 账户id */
    @JacksonXmlProperty(localName = "account_code")
    @JacksonXmlCData
    private String accountCode;
    /** 系统用户名 */
    @JacksonXmlProperty(localName = "user_name")
    @JacksonXmlCData
    private String userName;

    public MchAddResponse() {
        super();
    }
}
