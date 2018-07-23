
package com.hstypay.admin.controller.cms.base.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * 商户支付类型表:
 *
 * @author code-generator
 * @version 1.0.0 2017-06-29 19:51:20
 */
@Getter
@Setter
public class PayMchTypeDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;
    /** 商户号, 商户号标识 */
    private String merchantId;
    /** 所属服务商 */
    private String serviceProviderId;
    /** 所属支付通道 */
    private Long payCenterId;
    /** 支付类型id */
    private Long payTypeId;
    /** 支付接口编号, 例如：pay.weixin.native */
    private String apiCode;
    /** 第三方支付接口, 防止四方平台与上游接口编号不一致 */
    private String thirdApiCode;
    /** 第三方商户号, 对应威富通进件后的商户编号 */
    private String thirdMerchantId;
    /** 支付成本费率, 以百万为单位:6000,表示千分之6，支付中心维度默认值，商户支付类型有配置的以商户配置为准。 */
    private Integer costRate;
    /** 支付成本费率类型, 0:固定费率;1:浮动费率 */
    private Integer costRateType;
    /** 单笔限额, 单位分 0表示不限制 */
    private Integer singleTradeLimit;
    /** 当日限额, 单位分 0表示不限制 */
    private Long dayTradeLimit;
    /** 报备状态, 0:初始,1:报备成功,2:报备失败,3:修改待报备 */
    private Integer status;
    /** 报备状态描述 */
    private String statusRemark;
    /** 报备失败原因 */
    private String registeFailDesc;
    /** 成功报备时间 */
    private Date registeTime;
    /** 交易识别码 */
    private String tradeCode;
    /** 是否启用, true 启用 false 停用 */
    private Boolean enable;
    /** 备注 */
    private String remark;
    /** 备用字段1 交易识别码查询结果 */
    private String standby1;
    /** 备用字段2 */
    private String standby2;
    /** 备用字段3 */
    private String standby3;
    
    //以下为冗余支付通道属性
    /** 支付通道名称*/
    private String centerName;
    /** 签约银行*/
    private String contractBank;
    /** 接口提供方*/
    private Integer apiProvider;
    /** 手续费计算规则*/
    private Integer calculationRules;
    /** 对账方式*/
    private Integer checkWay;
    /** 第三方渠道编号*/
    private String thirdChannelId;
    /** 第三方渠道密钥*/
    private String thirdChannelKey;
    /** 是否默认*/
    private Boolean defaultFlag;
    /** 支付渠道编号 */
    private String payChannelId;
    /** 支付渠道编号密钥 */
    private String payChannelKey;

    private PayApiDTO payApiDTO;
    
    /** 服务商费率 */
    private Integer spCostRate;
    
    private Float costRateFt;

    private List<String> merchantIds;

    /** 用途, 0 支付 1 充值 */
    private Integer regType;

}
