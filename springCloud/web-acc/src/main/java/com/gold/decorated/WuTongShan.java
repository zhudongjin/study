package com.gold.decorated;

/**
 * Created by 朱冬金 on 2018/4/3.
 */
public class WuTongShan extends AbstractDecoration {

	public WuTongShan(basis bs) {
		super(bs);
	}

	public int mileage(){
		return super.mileage()+1000;
	}
	public String name(){
		return super.name()+"爬梧桐山";
	}
}
