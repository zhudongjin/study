package com.gold.common.constant;

/**
 * 网关 模块常量
 *
 * @author code-generator
 * @version 1.0.0 2017-06-29 17:58:32
 */
public interface GatewayConstant {
	String SERVICE_MERCHANT_BILL_DOWNLOAD = "pay.bill.merchant";
	String SERVICE_STORE_MERCHANT_BILL_DOWNLOAD = "pay.bill.storeMerchant";
	String UNIFIED_MCH_ADD = "unified.merchant.add";
	String UNIFIED_MCH_SEARCH = "unified.merchant.search";
	String WEIXIN_SUBDEV_CONFADD = "wechat.subdev.confadd";
	String WEIXIN_SUBDEV_CONFSEARCH = "wechat.subdev.confsearch";

	/**
	 * 支付相关
	 */
	String UNIFIED_TRADE_QUERY = "unified.trade.query";
	String UNIFIED_REFUND_QUERY = "unified.refund.query";

	/** 机构类型代码：商户 */
	int ORG_TYPE_MCH = 2;
}
