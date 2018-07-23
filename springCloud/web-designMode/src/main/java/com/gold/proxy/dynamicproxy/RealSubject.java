package com.gold.proxy.dynamicproxy;

/**
 * Created by 朱冬金 on 2018/6/6.
 */
public class RealSubject implements Subject {

	@Override
	public void rent() {
		System.out.println("I want to rent my house");
	}

	@Override
	public void hello(String str) {
		System.out.println("hello: " + str);
	}
}
