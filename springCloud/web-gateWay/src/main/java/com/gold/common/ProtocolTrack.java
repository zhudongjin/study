package com.gold.common;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * 作者：gold.zhu
 * 创建时间：10点21分
 * 备注：请求所有相关参数
 */
@Getter
@Setter
public class ProtocolTrack {
	// 请求接口
	private String service;
	// 外部请求xml报文
	private String outReqXml;
	// 外部返回xml报文
	private String outRspXml;
	// 外部请求字节数组
	private byte[] xmlByte;
	// 外部请求map
	private Map<String,String> xmlMap;

}

