package com.base.demo.interfaces;

public interface Behavior {
	public void watch();
	void say();
	int TIME = 0;
	String name = "Behavior";
	private void show() {
		System.out.println("never use the private method in interface");
		System.out.println("can not use protected method in interface");
	}
}
