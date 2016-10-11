package com.xzc.se300Season1.oop.polymorphism.servlet;

public class ServletTest {
	public static void main(String[] args) {
		//内存分析
		HttpServlet s = new MyServlet();
		//理解this就知道调用哪个了
		s.service();
	}
}
