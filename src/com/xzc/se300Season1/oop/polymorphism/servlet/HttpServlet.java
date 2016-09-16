package com.xzc.se300Season1.oop.polymorphism.servlet;

public class HttpServlet {
	public void service(){
		System.out.println("calling service");
		doGet();
	}
	
	public void doGet(){
		System.out.println("calling doGet");
	}
}
