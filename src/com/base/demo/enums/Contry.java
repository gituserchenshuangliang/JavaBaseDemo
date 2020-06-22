package com.base.demo.enums;

import com.base.demo.interfaces.Dog;

public enum Contry implements Dog{
	China,Japan;

	@Override
	public void watch() {
		System.out.println("wathc method");
	}

	@Override
	public void say() {
	}

	@Override
	public void eat() {
	}

}
