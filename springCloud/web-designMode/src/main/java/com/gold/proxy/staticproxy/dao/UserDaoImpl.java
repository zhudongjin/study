package com.gold.proxy.staticproxy.dao;

import com.gold.proxy.staticproxy.IUserDao;

/**
 * Created by 朱冬金 on 2018/6/6.
 */
public class UserDaoImpl implements IUserDao {
	@Override
	public void save() {
		System.out.println("--------------save----------------");
	}
}
