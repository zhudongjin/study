package com.hstypay.admin.controller.cms.base.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * 商户表:
 *
 * @author code-generator
 * @version 1.0.0 2017-07-01 15:34:04
 */
@Getter
@Setter
@ToString
public class BaseMerchantDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    /** 商户号 */
    private String merchantId;
    /** 商户名称 */
    private String merchantName;
    /** 商户类型, 商户-11,直营门店-21,加盟门店-22 */
    private Integer merchantType;
    /** 商户类别, 1 企业商户 2 个人商户 */
    private Integer merchantClass;
    /** 商户经营类型, 0:全部;1:实体;2:虚拟 */
    private Integer merchantDealType;
    /** 币种, 多个币种使用英文逗号分隔 */
    private String feeType;
    /** 所属服务商 */
    private String serviceProviderId;
    /** 所属渠道商 */
    private String serviceChannelId;
    /** 所属商户, 商户没有父级商户，仅仅门店拥有父级商户 */
    private String parentMerchant;
    /** 所属部门id, 关联部门表的 DEPT_ID */
    private String deptId;
    /** 业务员id, 关联员工表 的 EMP_ID 字段 0表示无业务员 */
    private Long salesmanId;
    /** 所属分组, 对应商户门店分组表主键，0表示无分组 */
    private Long storeGroup;
    /** 风控等级 */
    private Long riskId;
    /** 单笔限额, 单位分 0表示不限制 */
    private Integer singleTradeLimit;
    /** 当日限额, 单位分 0表示不限制 */
    private Long dayTradeLimit;
    /** 退款是否需要审核, true(1) 是 false(0) 否 */
    private Boolean refundAuditFlag;
    /** 支付商品名称*/
    private String payGoodsName;
    /** 审核状态, 0 待审核 1 审核通过 2 审核不通过*/
    private Integer examineStatus;
    /** 交易状态, 0 不可交易 10 可交易 */
    private Integer tradeStatus;
    /** 交易状态变更时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date tradeStatusModTime;
    /** 签约状态, 0 未签约 10 签约用户协议 20 签约银行协议 30 签约银行失败 */
    private Integer contractStatus;
    /** 审核时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date examineTime;
    /** 审核备注 */
    private String examineRemark;
    /** 审核用户 */
    private Long examineUser;
    /** 审核用户名称 */
    private String examineUserName;
    /** 激活状态, 0 未激活 1 激活成功 2 激活失败 */
    private Integer activateStatus;
    /** 激活时间 */
    private Date activateTime;
    /** 激活备注 */
    private String activateRemark;
    /** 激活用户 */
    private Long activateUser;
    /** 激活用户名称 */
    private String activateUserName;
    /** 签名key */
    @JsonIgnore
    private String signKey;
    /** 数据来源, 1 终端输入(汇旺财App) 2 导入导出 3 数据迁移 4 PC后台添加 5 API进件 6 业务员App注册 7 公众号*/
    private Integer dataSource;
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
    //变更商户简称时使用
    private String standby7;
    /** 备用字段8 */
    //商户提额时使用
    private String standby8;
    /** 备用字段9 */
    //变更银行结算信息时使用
    private String standby9;
    
    /***********************************冗余业务字段************************************/
    /** 用户id*/
    private Long userId;
    /** 联系人 */
    private String principal;
    /** 联系电话 */
    private String telphone;
    /** 邀请码 */
    private String invitationCode;
    /** 第三方商户号 */
    private String thirdMerchantId;
    /** 签约银行 */
    private String contractBank;
    /** 商户详情*/
    private BaseMerchantDetailDTO baseMerchantDetailDto;
    /** 门店分组*/
    private BaseMerchantStoreGroupDTO baseMerchantStoreGroupDto;
    /** 结算账户*/
    private BaseBankAccountDTO baseBankAccountDto;
    /** 商户支付类型信息*/
    private List<PayMchTypeDTO> payMchTypeDtos;
    /** 门店二维码信息*/
    private List<BaseQrcodeDTO> qrcodeDTOList;
    /**所属店长*/
    private Long shopManagerId;
    /** 业务员APP查询字段 */
    private String search;
    /** 省份 */
    private String province;
    /** 城市 */
    private String city;
    /** 区/县 */
    private String county;
    /** 地址 */
    private String address;
    /** 行业列表 */
    private List<Long> industryIds;
    /** 交易金额最低 */
    private Long minTradeMoney;
    /** 交易金额最高 */
    private Long maxTradeMoney;
    /** 行业类别, 关联行业类别表主键 0 表示未设置 */
    private Long industryId;
    /** 交易金额 */
    private Long totalTradeMoney;
    /** 门店设备信息*/
    private List<BaseMerchantDeviceDTO> baseMerchantDeviceDTOList;
    /** 搜索关键字 */
    private String keywords;
    
    /**
     * 获取实际渠道号
     * 如果为合伙人则返回合伙人id
     * @return
     */
    public String gainRealChannelId(){
        if ("0".equals(serviceChannelId)){
            return serviceProviderId;
        }else {
            return serviceChannelId;
        }
    }
}
