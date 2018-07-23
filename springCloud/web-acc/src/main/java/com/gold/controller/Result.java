package com.gold.controller;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:Result
 * Function: 返回结果
 * Date:     2017年7月1日 下午3:42:45
 * @author   hansong
 * @since    JDK 1.6
 */
@Getter
@Setter
public class Result implements Serializable {
	private static final long serialVersionUID = -6944740038367719511L;
	
	//200表示成功非200表示失败此字段是通信标识，非交易标识，交易是否成功需要查看 result_code 来判断
	protected String status	= "200";
	//返回信息，如非空，为错误原因签名失败参数格式校验错误
	protected String message;
	
	//0表示成功非0表示失败
	protected String result_code;
	//错误码
	protected String err_code;
	//错误信息
	protected String err_msg;
	//签名类型
	protected String sign_type = "MD5";
	//字符集
	protected String charset = "UTF-8";
	//版本号
	protected String version = "1.0";
	//签名
	protected String sign;
	
	// 订单号(方便订单追踪记录)
	protected String orderNo;
	
	//其它信息
	protected Map<String,Object> other_info = new HashMap<String,Object>();
	
	public Result(){
	}
	
	public Result(String status, String message){
		this.status = status;
		this.message = message;
	}
	
	public Result(String result_code, String err_code, String err_msg){
		this.result_code = result_code;
		this.err_code = err_code;
		this.err_msg = err_msg;
	}

}

