package com.gold.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by 朱冬金 on 2018/6/6.
 */
public class dynamicproxyMain {
	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		InvocationHandler handler=new ProxyFactory(realSubject);
		Subject subject= (Subject)Proxy.newProxyInstance(handler.getClass().getClassLoader(),realSubject.getClass().getInterfaces(),handler);
		subject.hello("cccc");
		subject.rent();
	}
}
