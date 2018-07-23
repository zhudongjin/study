package com.gold.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * Created by 朱冬金 on 2018/6/6.
 */
public class ProxyFactory implements InvocationHandler  {

	private Object object;

	public ProxyFactory(Object object){
		this.object=object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(object,args);
	}
}
