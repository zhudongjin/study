package com.gold.response.mch;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.gold.common.MchSearchResultSerializer;
import com.gold.response.AbstractHstypayResponse;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 商户进件响应结果类
 * @author
 */

@JacksonXmlRootElement(localName = "xml")
@Data
public class MchSearchResponse extends AbstractHstypayResponse {
    /**
     * 商户基本信息
     */
    @JacksonXmlProperty(localName = "data_list")
    @JsonSerialize(using = MchSearchResultSerializer.class)
    @JacksonXmlCData
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<MchSearchResult> dataList;

    @Data
    @NoArgsConstructor
    public static class MchSearchResult {
        /** 商户号 */
        private String merchantId;
        /** 商户名称 */
        private String merchantName;

        /**
         * 审核状态
         * 0 - 待审核
         * 1 - 审核通过
         * 2 - 审核不通过
         */
        private Integer examineStatus;

        /**
         * 激活状态
         * 0 - 冻结
         * 1 - 正常
         * */
        private Integer activateStatus;

        /** 交易状态
         * 0 不可交易
         * 10 可交易
         * */
        private Integer tradeStatus;

    }
}
