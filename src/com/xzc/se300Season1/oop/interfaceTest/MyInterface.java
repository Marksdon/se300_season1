package com.xzc.se300Season1.oop.interfaceTest;

public interface MyInterface {
	/**
	 * 就两东西：常量，抽象方法
	 */
	public static final int MAX_SPEED = 1000;
	//接口中常量的默认定义public static final
	int MIN_SPEED = 1;
	public abstract void test01();
	
	//接口中抽象方法的定义public abstract，和上面一样的
	void test02();
}	
