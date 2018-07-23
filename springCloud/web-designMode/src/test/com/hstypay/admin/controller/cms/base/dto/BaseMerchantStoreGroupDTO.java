package com.hstypay.admin.controller.cms.base.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 商户门店分组表:
 *
 * @author code-generator
 * @version 1.0.0 2017-06-29 19:51:19
 */
@Getter
@Setter
public class BaseMerchantStoreGroupDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    /** 分组编号 */
    private Long groupId;
    /** 分组名称 */
    private String groupName;
    /** 所属商户 */
    private String merchantId;
    /** 所属服务商 */
    private String serviceProviderId;
    /** 所属渠道商 */
    private String serviceChannelId;
    /** 分组下门店数量 */
    private Integer storeCount;

    /** 分组下的门店列表 */
    private List<BaseMerchantDTO> baseMerchantDTOList;

}
