package com.base.demo;

import java.util.Arrays;

import com.base.demo.Base;
import com.base.demo.entity.Clothes;

/**
 * 深层复制与浅层复制 自动拆箱装箱 值传递和引用传递
 * 
 * @author Cherry 2020年3月31日
 */
public class DemoA extends Base {

	public static void main(String[] args) {
//		a();
//		b();
//		c();
//		d();
//		e();
	    f();
	}
	
	public static void f() {
	    char s = '汉';
	    char a = 'A';
        /*
         * 占位符 说明 %d 格式化输出整数 %x 格式化输出十六进制整数 %f 格式化输出浮点数 %e 格式化输出科学计数法表示的浮点数 %s
         * 格式化字符串
         */
	    String format = String.format("%d,%f,%b,%s", 12,23.5,true,"world");
	    System.out.println(format);
	    
//	    从Java 12开始，switch语句升级为更简洁的表达式语法,新的switch语法，不但不需要break，还可以直接返回值。
//	    String fruit = "apple";
//        switch (fruit) {
//        case "apple" -> System.out.println("Selected apple");
//        case "pear" -> System.out.println("Selected pear");
//        case "mango" -> {
//            System.out.println("Selected mango");
//            System.out.println("Good choice!");
//        }
//        default -> System.out.println("No fruit selected");
//        }
	    
	    String[] array = {"A","B","C","D","E"};
	    System.out.println(Arrays.toString(array));
	    System.out.println(String.join("-", array));
	}
	
	public static void a() {
		String s = "chen";
		String s1 = s;
		s = "marry";
		show(s1);

		int[] i = { 12, 23, 34, 24 };
		int[] j = i;
		i[0] = 0;
		show(j[0]);
	}

	public static void b() {
		Clothes c = new Clothes("red", 'L');
		Clothes c1 = c;
		c.setColor("bule");
		show(c1.getColor());
	}

	public static void c() {
		int[] i = { 12, 23, 34, 24 };
		int[] j = Arrays.copyOf(i, i.length);
		i[0] = 0;
		show(j[0]);
	}

	public static void d() {
		int i = 300;
		int j = 300;
		Integer k = i;
		Integer l = j;
		show(k.equals(i));
		show(l.equals(j));
	}

	
	public static void e() {
		int[] arr = { 12, 32, 5, 43, 76, 32, 6, 4, 5 };
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if(arr[j-1] > arr[j]) {
					int k = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = k;
				}
			}
		}
		show(arr);
	}
}
