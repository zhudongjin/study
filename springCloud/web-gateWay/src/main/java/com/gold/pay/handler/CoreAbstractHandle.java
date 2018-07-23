package com.gold.pay.handler;

import com.gold.pay.PayFacade;

/**
 * 核心公共抽象处理
 */
public abstract class CoreAbstractHandle implements PayFacade {

	public String apply(String str){
		System.out.println("核心公共抽象处理 CoreAbstractHandle"+str);
		return str;
	}
}
