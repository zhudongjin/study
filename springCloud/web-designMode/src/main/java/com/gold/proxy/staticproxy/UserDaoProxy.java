package com.gold.proxy.staticproxy;

/**
 * 静态代理
 * Created by 朱冬金 on 2018/6/6.
 */
public class UserDaoProxy implements IUserDao {

	private IUserDao iuserDao;

	public UserDaoProxy(IUserDao iuserDao){
		this.iuserDao=iuserDao;
	}

	@Override
	public void save() {
		System.out.println("开始事务...");
		System.out.println("--------userdaoProxy------------");
		System.out.println("提交事务...");
	}
}
