package com.gold.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName: SwiftpassPayAccount
 * @Description: 威富通支付配置信息
 * @author linwenwei
 * @date 2017年4月17日16:33:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HstypayAccount implements Serializable {

    private static final long serialVersionUID = -8271611567127172961L;
    private String merchantId;
    private String signKey;

    private String signAgentno;
    private String version;
    private String charset;
    private String signType;

    public HstypayAccount(String merchantId, String signKey) {
        this(merchantId, signKey,null,"v1.0", "UTF-8", "MD5");
    }
    public HstypayAccount(String merchantId, String signAgentno, String signKey) {
        this(merchantId, signKey, signAgentno,"v1.0", "UTF-8", "MD5");
    }

}
