package com.xzc.se300season1.oop;

public class Student {
	//静态属性
	String name;
	int id;
	int age;
	String gender;
	int weight;
	Computer computer;
	
	//动态行为
	public void study(){
		System.out.println(name + "在学习");
	}
	
	public void sayHello(String sname){
		System.out.println(name+"向"+sname+"说你好");
	}
	
}
