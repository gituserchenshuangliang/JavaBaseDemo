package com.base.demo;

import com.base.demo.entity.Clothes;

/**
 * @author Cherry 
  封装：隐藏细节，提高代码复用性。 
  继承：子类可以扩展父类，便于维护。 
  多态：单一接口操作多种对象。
  传值调用,不定长度自变量 
 * 2020年4月1日
 */
public class DemoB extends Base{
	public static void main(String[] args) {
//		Some s = new Some();
//		Some s1 = new Some(1,"Aa",true);
//		Some s2 = new Some(2,"Bb",false);
//		setValues(s1);
//		setValues(s2);
//		unLength(s1,s2,s);
//		new Other();
//		Three t = new Three(4);
//		show(t.i);
//		Three.getInt(4);
//		Three.getInt(Integer.valueOf(34));
		Clothes c = new Clothes("red", 'L');
		boolean flag = c instanceof Clothes ? true : false;
		show(flag);
	}
	
	public static void unLength(Some...somes) {
//		for (int i = 0; i < somes.length; i++) {
//			show(somes.toString());
//		}
		for (Some some : somes) {
			show(some.toString());
		}
	}
	
	public static void setValues(Some s){
		s.s = "cherry";
	}
	
	public void s(){
		setValues(new Some());
	}
}
class Some extends Base{
	public int i;
	public String s;
	public boolean f;
	public Some() {
		super();
//		show("無參數构造函数");
	}
	public Some(int i, String s) {
		super();
		this.i = i;
		this.s = s;
	}
	public Some(int i, String s, boolean f) {
		super();
		this.i = i;
		this.s = s;
		this.f = f;
	}
	@Override
	public String toString() {
		return "Some [i=" + i + ", s=" + s + ", f=" + f + "]";
	}
	{
//		show("静态static区块，优先执行！");
	}
}
class Other extends Some{
	public Other() {
		super();
	}
	public Other(int i, String s) {
		super(i, s);
	}
}

class Three extends Base{
	public final int i;
	Three(int i){
		this.i = i;
	}
	public static void getInt(int i) {
		show("int");
	}
    public static void getInt(Integer i) {
		show("Integer");
	}
}