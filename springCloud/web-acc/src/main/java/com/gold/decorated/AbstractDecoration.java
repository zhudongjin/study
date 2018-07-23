package com.gold.decorated;

/**
 * @描述:定义装饰者抽象类
 * @创建人：gold
 * @创建时间：2018-04-03 19:28:00
 */
public abstract class AbstractDecoration implements basis{
	private basis bs;
	public AbstractDecoration(basis bs){
		super();
		this.bs=bs;
	}

	public int mileage(){
		return bs.mileage();
	}

	public String name(){
		return bs.name();
	}
}
