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
public class MchPhotoGetResponse extends AbstractHstypayResponse {
    /** 商户号 */
    @JacksonXmlProperty(localName = "merchant_id")
    @JacksonXmlCData
    private String merchantId;

    /** 图片类型 返回图片的Url链接
     *  1 身份证照（含正反面，以','分割）
     *  2 银行卡
     *  3 门头照
     *  4 营业执照
     */
    @JacksonXmlProperty(localName = "photo_type")
    @JacksonXmlCData
    private Integer photoType;

    /**
     *  图片的Url链接,若请求的是身份证，则返回两个链接，以‘，’分隔
     *  身份证照（含正反面，以','分割）
     */
    @JacksonXmlProperty(localName = "photo_url")
    @JacksonXmlCData
    private String photoUrl;
}
