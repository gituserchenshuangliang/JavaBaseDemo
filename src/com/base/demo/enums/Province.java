package com.base.demo.enums;
/**
 *   枚举类
 * @author Cherry
 * 2020年4月4日
 */
public enum Province {
	HuBei(1,"HB"),HuNan(2,"HN"),FuJian(3,"FJ");
	 private int code;
	 private String abbr;
	 /*
	  * 创建构造函数
	  */
	 private Province(int code,String abbr){
	  this.code = code;
	  this.abbr = abbr;
	 }
	 public int getCode(){
	  return code;
	 }
	 public String getAbbr() {
		 return abbr;
	 }
	 
	@Override
	public String toString() {
		return String.format("(%d,%s)",this.code,this.abbr);
	}
}
