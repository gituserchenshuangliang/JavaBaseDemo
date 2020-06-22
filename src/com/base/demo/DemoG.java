package com.base.demo;

import com.base.demo.enums.Province;

/**
 * 枚举类
 * @author Cherry
 * 2020年4月4日
 */
public class DemoG {

	public static void main(String[] args) {
		System.out.printf("(%d,%s)%n",Province.HuBei.getCode(),Province.HuBei.getAbbr());
		System.out.println(Province.HuNan.toString());
		System.out.println(Province.FuJian);
		System.out.println("---------------------");
		for (Enum p : Province.values()) {
			System.out.println(p);
		}
		System.out.println("---------------------");
		for (Province p : Province.values()) {
			System.out.println(p);
		}
	}

}
