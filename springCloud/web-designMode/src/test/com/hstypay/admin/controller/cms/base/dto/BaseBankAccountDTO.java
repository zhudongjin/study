package com.hstypay.admin.controller.cms.base.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 结算账户表:
 *
 * @author code-generator
 * @version 1.0.0 2017-06-29 19:51:20
 */
@Getter
@Setter
public class BaseBankAccountDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    /** 账户id */
    private Long accountId;
    /** 服务商/商户 */
    private String orgId;
    /** 机构类型, 1 服务商 2 商户 */
    private Integer orgType;
    /** 银行卡号 */
    private String accountCode;
    /** 开户银行, 关联银行表 */
    private Long bankId;
    /** 开户人 */
    private String accountName;
    /** 账户类型, 1 企业 2 个人 */
    private Integer accountType;
    /** 联行号, 网点号、联行号 */
    private String contactLine;
    /** 汇出方银行卡号, 兴业叫汇出方银行卡号，浦发叫现代支付号 */
    private String remitAccountCode;
    /** 是否行内账号, true:是，false:不是 */
    private Boolean isInline;
    /** 开户支行id */
    private Long bankBranchId;
    /** 开户支行名称 */
    private String bankName;
    /** 开户支行所在省 */
    private String province;
    /** 开户支行所在市 */
    private String city;
    /** 持卡人证件类型, 从系统类型表来 */
    private Integer idCardType;
    /** 持卡人证件号码 */
    private String idCard;
    /** 持卡人地址 */
    private String address;
    /** 手机号码 */
    private String tel;
    /** 开户人英文名 */
    private String accountEnName;
    /** 开户人证件有效期 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date accountExpiredDate;
    /** 邮编 */
    private String accountPostcode;
    /** 是否鉴权, 1-清分鉴权通过   2-清分鉴权失败 */
    private Integer checkAuth;
    /** 电子账户 */
    private String eAccountCode;
    /** 审核状态, 0:未审核;1:审核通过;2:审核不通过;3:需再次审核 */
    private Integer examineStatus;
    /** 审核时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date examineTime;
    /** 审核备注 */
    private String examineStatusRemark;
    /** 审核用户 */
    private Long examineUser;
    /** 审核用户名称 */
    private String examineUserName;
    /** 是否启用, 0 停用 1 启用 */
    private Boolean enabled;
    /** 数据签名 */
    private String dataSign;
    /** 数据来源, 1:界面录入;2:基础资料导入导出:3:数据迁移 */
    private Integer dataSource;
    /** 3要素实名状态, 1:3要素鉴权成功 2:失败 */
    private Integer checkAuth3;
    /** 4要素实名状态, 1:4要素鉴权成功 2:失败 */
    private Integer checkAuth4;
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
}
