package com.gold.decorated;

/**
 * Created by 朱冬金 on 2018/4/3.
 */
public class DecorationMian {
	public static void main(String[] args) {
		basis bs=new MrZhang();
		LianHuaShan lhs=new LianHuaShan(bs);
		WuTongShan wts=new WuTongShan(lhs);
		System.out.println(bs.name()+"跑了"+lhs.mileage()+"公里！");
	}
}
