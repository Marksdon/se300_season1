package com.xzc.se300Season1.oop.polymorphism;

/**
 * 编译时变量，运行时变量
 * 运算符 instanceof
 * @author randall
 *
 */
public class PolymorphismTest {
	
	public static void testVoice(Animal a){
		a.vioce();
		// instanceof 关键字
		if (a instanceof Cat) {
			((Cat) a).catchMouse();
		}
	}
	
	public static void main(String[] args) {
//		Animal a = new Cat(); //父类引用子类对象
		Animal a = new Cat();
		Cat c = (Cat)a;
		c.catchMouse();
		testVoice(a);
	}
}
