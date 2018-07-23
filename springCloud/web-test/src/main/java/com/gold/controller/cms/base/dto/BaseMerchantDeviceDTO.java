package com.hstypay.admin.controller.cms.base.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 商户设备表:
 *
 * @author code-generator
 * @version 1.0.0 2018-01-11 17:12:37
 */
@Getter
@Setter
public class BaseMerchantDeviceDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;
    /** 商户号 */
    private String merchantId;
    /** 门店号 */
    private String storeMerchantId;
    /** 设备唯一识别码 */
    private String sn;
    /** 状态, 0:待激活 1:已激活 2:已解绑 */
    private Integer status;
    /** 签名key */
    private String signKey;
    
    /***********************************冗余业务字段************************************/
    /** 商户名称 */
    private String merchantName;
    /** 业务员id, 关联员工表 的 EMP_ID 字段 0表示无业务员 */
    private Long salesmanId;
    /** 所属服务商 */
    private String serviceProviderId;
    /** 状态, 0:待激活 1:已激活 2:已解绑 */
    private List<Integer> statusList;
}
