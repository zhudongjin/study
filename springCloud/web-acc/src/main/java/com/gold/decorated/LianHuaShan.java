package com.gold.decorated;

/**
 * Created by 朱冬金 on 2018/4/3.
 */
public class LianHuaShan extends AbstractDecoration {
	public LianHuaShan(basis bs) {
		super(bs);
	}

	public int mileage(){
		return super.mileage()+20000;
	}

	public String name(){
		return super.name()+"去爬莲花山";
	}
}
