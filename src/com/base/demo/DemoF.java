package com.base.demo;

import com.base.demo.enums.City;
import com.base.demo.interfaces.Behavior;
import com.base.demo.interfaces.Dog;

/**
 * 接口细节，枚举类
 * @author Cherry
 * 2020年4月2日
 */
public class DemoF extends Base{
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Man n = new Man();
		n.watch();
		show(n.TIME);
		show(n.name);
		Behavior b = new Behavior() {

			@Override
			public void watch() {
				System.out.println("watch method");
			}

			@Override
			public void say() {
				System.out.println("say method");
			}
		};
		b.say();
		show(b.name);
		show(City.Beijin);
		
		Dog g = new Dog() {

			@Override
			public void watch() {
			}

			@Override
			public void say() {
			}

			@Override
			public void eat() {
			}
			
		};
		show(g.c);
	}
}
