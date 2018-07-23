package com.gold.common;


import com.gold.common.constant.GatewayConstant;
import com.gold.common.error.ErrorCode;
import com.gold.common.exception.BusinessException;
import com.gold.request.AbstractHstypayRequest;
import com.gold.request.bill.MerchantBillDownloadRequest;
import com.gold.request.bill.StoreBillDownloadRequest;
import com.gold.request.mch.MchAddRequest;
import com.gold.request.mch.MchPhotoGetRequest;
import com.gold.request.mch.MchSearchRequest;
import com.gold.request.subdev.WxSubdevConfigAddRequest;
import com.gold.request.subdev.WxSubdevConfigSearchRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * ClassName:ProtocolUtil
 * Function: 协议帮助类
 * Date:     2017年7月11日 下午4:12:31
 * @author   hansong
 */
public class RequestUtil {

	public static final String CHARSET = "UTF-8";
	private static Map<String, Class<? extends AbstractHstypayRequest>> normalProtocols = new HashMap<String, Class<? extends AbstractHstypayRequest>>();
	
	static{
		initBillDownload();
		initMch();
	}

	private static void initBillDownload(){
		normalProtocols.put(GatewayConstant.SERVICE_MERCHANT_BILL_DOWNLOAD, MerchantBillDownloadRequest.class);
		normalProtocols.put(GatewayConstant.SERVICE_STORE_MERCHANT_BILL_DOWNLOAD, StoreBillDownloadRequest.class);
	}

	private static void initMch(){
		normalProtocols.put(GatewayConstant.UNIFIED_MCH_ADD, MchAddRequest.class);
		normalProtocols.put(GatewayConstant.UNIFIED_MCH_SEARCH, MchSearchRequest.class);
		normalProtocols.put(MchPhotoGetRequest.SERVICE, MchPhotoGetRequest.class);
		normalProtocols.put(GatewayConstant.WEIXIN_SUBDEV_CONFADD, WxSubdevConfigAddRequest.class);
		normalProtocols.put(GatewayConstant.WEIXIN_SUBDEV_CONFSEARCH, WxSubdevConfigSearchRequest.class);
	}

	public static AbstractHstypayRequest parse(String xml, ProtocolTrack track) {
		Class<? extends AbstractHstypayRequest> clazz = normalProtocols.get(track.getService());
		if(clazz == null){
			throw new BusinessException(ErrorCode.create("400", "参数service无效"));
		}
		AbstractHstypayRequest request = xmlUtils.parseFromXml(xml, clazz);
		request.setXmlMap(new TreeMap<String, String>(track.getXmlMap()));
		return request;
	}

}

