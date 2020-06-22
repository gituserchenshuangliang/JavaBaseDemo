package com.base.demo;

/**
 * 父類子構造函數
 * @author Cherry
 * 2020年4月1日
 */
public abstract class DemoC extends Base{

	public static void main(String[] args) {
		new DemoD();
		show("------------------");
		new DemoD(5);
	}
}
class DemoE extends Base{
	DemoE(){
		this(10);
		show("父類無參數");
	}
	DemoE(int j){
		show("父類有從參數");
	}
}
class DemoD extends DemoE{
	DemoD(){
		super(10);
		show("子類無參數");
	}
	
	DemoD(int i){
		show("子類有參數");
	}
}