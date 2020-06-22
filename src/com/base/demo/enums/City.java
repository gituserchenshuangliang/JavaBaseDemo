package com.base.demo.enums;

public enum City {
	Beijin("BJ"), ShangHai("SH"), GuangZhou("GZ");
	private String abbrivation;
	
	private City(String abbrivation) {
		this.abbrivation = abbrivation;
	}
	public String getAbbrivation(){
		return abbrivation;
	}
}
