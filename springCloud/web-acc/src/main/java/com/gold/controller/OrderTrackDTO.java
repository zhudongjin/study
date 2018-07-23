package com.gold.controller;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单追踪:
 *
 * @author code-generator
 * @version 1.0.0 2017-06-29 17:31:20
 */
@Getter
@Setter
public class OrderTrackDTO implements Serializable {
	private static final long serialVersionUID = -2111522418929986208L;
	
	/** 主键 */
    private Long id;
    /** 日志序号 */
    private String msgNo;
    /** 订单号 */
    private String orderNo;
    /** 订单金额 */
    private Integer orderMoney;
    /** 外部请求报文 */
    private String outReqXml;
    /** 平台请求报文 */
    private String reqXml;
    /** 平台收到报文 */
    private String rspXml;
    /** 外部收到报文 */
    private String outRspXml;
    /** 调用前状态, 取支付订单状态的快照 */
    private Integer preStatus;
    /** 调用后状态, 取支付订单状态的快照 */
    private Integer afterStatus;
    /** 支付接口编号, 例如：pay.weixin.native */
    private String apiCode;
    /** 接口耗时, 毫秒数 */
    private Integer tookTime;
    /** 出错信息 */
    private String errorMsg;
    /** 服务器的ip */
    private String serviceIp;
    /** 创建时间 */
    private Date createTime;
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
