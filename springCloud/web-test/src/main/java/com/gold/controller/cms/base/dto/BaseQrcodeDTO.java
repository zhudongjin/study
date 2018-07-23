package com.hstypay.admin.controller.cms.base.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 二维码表:
 *
 * @author code-generator
 * @version 1.0.0 2017-07-06 16:30:56
 */
@Getter
@Setter
public class BaseQrcodeDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;
    /** 二维码编码, uuid生成 */
    private String qrcode;
    /** 所属服务商 */
    private String serviceProviderId;
    /** 所属渠道商 */
    private String serviceChannelId;
    /** 使用状态, 0-未绑定  1-已绑定   2-已失效 3-禁用 */
    private Integer useStatus;
    /** 生成批次 */
    private Long batchId;
    /** logo, 二维码logo路径 */
    private String qrLogo;
    /** 二维码访问路径 */
    private String qrUrl;
    /** 生成时间 */
    private Date initTime;
    /** 备注 */
    private String remark;
    /** 设备号起 */
    private Long startId;
    /** 设备号止 */
    private Long endId;
    /** 所属业务员 */
    private Long salesmanId;
    /**
     * 页面所需字段
     */
    private String merchantId;//商户编号
 	private String merchantName;//商户名字
    private String groupName;//分组名字
    private String storeName;//门店名字
 	private String storeMerchantId;//门店编号
 	private Date bindingTime;//绑定时间
 	 //1禁用,2启用
 	private	Integer type;
 	//用来区分 searchbar
    private String merchantCode;//商户编号
    private String storeMerchantCode;//门店
    private String serviceProviderName;//合伙人
 	
}
