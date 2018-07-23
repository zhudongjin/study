package com.hstypay.admin.controller.cms.base.dto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 商户详情表:
 *
 * @author code-generator
 * @version 1.0.0 2017-06-29 19:51:19
 */
@Getter
@Setter
@ToString
public class BaseMerchantDetailDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    /** 商户号 */
    private String merchantId;
    /** 商户简称 */
    private String merchantShortName;
    /** 行业类别, 关联行业类别表主键 0 表示未设置 */
    private Long industryId;
    /** 省份 */
    private String province;
    /** 城市 */
    private String city;
    /** 区/县 */
    private String county;
    /** 地址 */
    private String address;
    /** 客服电话 */
    private String servicePhone;
    /** 公司网址 */
    private String webSite;
    /** 联系人 */
    private String principal;
    /** 联系人身份证号 */
    private String idCode;
    /** 联系电话 */
    private String telphone;
    /** 常用邮箱 */
    private String email;
    /** 营业执照注册号 */
    private String licenseCode;
    /** 营业执照 */
    private String licensePhoto;
    /** 身份证件正反照 */
    private String idCardPhotos;
    /** 组织机构证照 */
    private String orgPhoto;
    /** 经营场所照 */
    private String companyPhoto;
    /** 手持身份证照 */
    private String handIdcardPhoto;
    /** 银行卡正面照 */
    private String bkCardPhoto;
    /** 开户许可证 */
    private String bkLicensePhoto;
    /** 备注 */
    private String remark;
    /** 备用字段1 */
    private String standby1;
    /** 备用字段2 */
    private String standby2;
    /** 备用字段3 */
    private String standby3;
    /** 备用字段4 */
    private String standby4;
    /** 备用字段5 */
    private String standby5;
    /** 备用字段6 */
    private String standby6;
    /** 备用字段7 */
    private String standby7;
    /** 备用字段8 */
    private String standby8;
    /** 备用字段9 */
    private String standby9;
    
    /** 冗余字段 **/
    /** 数据来源, 1:终端界面录入;2:基础资料导入导出:3:数据迁移 4 PC界面录入 */
    private Integer dataSource;
}
