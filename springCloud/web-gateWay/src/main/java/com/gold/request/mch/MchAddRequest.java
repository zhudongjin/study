package com.gold.request.mch;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * ClassName:MerchantBillDownloadRequest
 * Function: 新增商户请求
 * Date:     2017年7月5日 下午2:32:26
 * @author   hansong
 */
@JacksonXmlRootElement(localName = "xml")
@Data
public class MchAddRequest extends AbstractMchRequest {
	/** 邀请码 */
	@NotBlank
	@JacksonXmlProperty(localName = "invite_code")
	private String inviteCode;

	/**
	 * 以下属性是商户基本属性
	 */
	/** 商户名称 */
	@Length(max=32)
	@NotBlank
	@JacksonXmlProperty(localName = "merchant_name")
	private String merchantName;
	/** 商户类别, 1 企业商户 2 个人商户 */
	@Range(min = 1, max = 2)
	@JacksonXmlProperty(localName = "merchant_class")
	private Integer merchantClass;
	/** 商户经营类型, 0:全部;1:实体;2:虚拟 */
	@JacksonXmlProperty(localName = "merchant_deal_type")
	@Range(min = 0, max = 2)
	private Integer merchantDealType;

	/**
	 * 以下属性是商户详情所需属性
	 */
	/** 商户简称 */
	@Length(max=32)
	@NotBlank
	@JacksonXmlProperty(localName = "merchant_short_name")
	private String merchantShortName;
	/** 行业类别, 关联行业类别表主键 0 表示未设置 */
	@JacksonXmlProperty(localName = "industry_id")
	@Min(value = 1, message = "industry_id 不正确")
	private Long industryId;
	/** 区/县 */
	@NotBlank
	private String county;
	/** 地址 */
	@NotBlank
	private String address;
	/** 客服电话 */
	@JacksonXmlProperty(localName = "service_phone")
	private String servicePhone;
	/** 公司网址 */
	@JacksonXmlProperty(localName = "web_site")
	private String webSite;
	/** 联系人 */
	@NotBlank
	private String principal;
	/** 联系人身份证号 */
	@NotBlank
	@JacksonXmlProperty(localName = "id_code")
	private String idCode;
	/** 联系电话 */
	@NotBlank
	private String telphone;
	/** 常用邮箱 */
	private String email;
	/** 营业执照注册号 */
	@JacksonXmlProperty(localName = "license_code")
	@NotBlank
	@Pattern(regexp = "([a-zA-Z0-9]{15}$|[a-zA-Z0-9]{18}$)", message = "营业执照注册号只能是15位或18位字母数字组合")
	private String licenseCode;
	/** 营业执照 */
	@NotNull
	@JacksonXmlProperty(localName = "license_photo")
	private Base64Photo licensePhoto;
	/** 身份证件正反照 */
	@NotNull
	@JacksonXmlProperty(localName = "id_card_photo_front")
	private Base64Photo idCardPhotoFront;
	@NotNull
	@JacksonXmlProperty(localName = "id_card_photo_back")
	private Base64Photo idCardPhotoBack;
	/** 组织机构证照 */
	@JacksonXmlProperty(localName = "org_photo")
	private Base64Photo orgPhoto;
	/** 经营场所照 */
	@JacksonXmlProperty(localName = "company_photo")
	private Base64Photo companyPhoto;
	/** 手持身份证照 */
	@JacksonXmlProperty(localName = "hand_idcard_photo")
	private Base64Photo handIdcardPhoto;
	/** 银行卡正面照 */
	@NotNull(message = "bk_card_photo 不能为空")
	@JacksonXmlProperty(localName = "bk_card_photo")
	private Base64Photo bkCardPhoto;
	/** 开户许可证 */
	@JacksonXmlProperty(localName = "bk_license_photo")
	private Base64Photo bkLicensePhoto;
	/** 备注 */
	private String remark;

	/**
	 * 下面字段是银行账户所需要的属性
	 */
	/** 银行卡号 */
	@NotBlank
	@JacksonXmlProperty(localName = "account_code")
	private String accountCode;
	/** 开户人，企业账户的话是企业账户名称 */
	@NotBlank
	@JacksonXmlProperty(localName = "account_name")
	private String accountName;
	/** 账户类型, 1 对公 2 对私 */
	@Range(min = 1, max = 2)
	@JacksonXmlProperty(localName = "account_type")
	private Integer accountType;
	/** 联行号 */
	@NotBlank
	@JacksonXmlProperty(localName = "contact_line")
	private String contactLine;
	/** 预留号码, 若为空，则直接使用联系人联系电话telphone **/
	private String tel;



}

