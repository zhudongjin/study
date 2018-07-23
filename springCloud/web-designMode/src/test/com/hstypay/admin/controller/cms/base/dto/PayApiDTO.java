package com.hstypay.admin.controller.cms.base.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 支付接口表:
 *
 * @author code-generator
 * @version 1.0.0 2017-06-29 19:51:20
 */
@Getter
@Setter
public class PayApiDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    /** 扫码支付的正则表达式, 以apiCode以native结尾 */
    public static final String REG_NATIVE = ".*\\.native\\d?$";
    /** 扫码支付的正则表达式, 以apiCode以native结尾 */
    public static final String REG_MICROPAY = ".*\\.micropay\\d?$";

    /** 接口编码 */
    private String apiCode;
    /** 接口名称 */
    private String apiName;
    /** 接口提供方, 1:微信;2:支付宝;3:财付通;4:qq钱包;5-银联;99:未知 */
    private Integer apiProvider;
    /** 接口提供方名称 */
    private String apiProviderName;
    /** 备注 */
    private String remark;
}
