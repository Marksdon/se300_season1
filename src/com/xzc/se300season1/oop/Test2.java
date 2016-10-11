package com.xzc.se300season1.oop;
/**
 * jvm先在方法区中查看是否有类Test2,发现没有，就重CLASSPATH中找到Test2，通过类加载器载入
 * Class Loader载入到方法区
 */

public class Test2 {

	public static void main(String[] args) {
		//通过类加载器Class Loader载入类
		Student s1 = new Student();
		s1.name = "高其";
		
		Computer c = new Computer();
		c.brang = "联想";
		c.cupSpeed = 100;
		
		s1.computer = c;
		
		c.brang = "dell";
		System.out.println(s1.computer.brang);
		
	}
}
