package com.gold.proxy.staticproxy;

import com.gold.proxy.staticproxy.dao.UserDaoImpl;

/**
 * Created by 朱冬金 on 2018/6/6.
 */
public class ProxyMain {
	public static void main(String[] args) {
		UserDaoImpl uim=new UserDaoImpl();
		UserDaoProxy up=new UserDaoProxy(uim);
		up.save();
		uim.save();
	}
}
