package com.xzc.se300season1.oop;

/**
 * 测试重载（overload）
 * 两同三不同：同类，同方法名，参数不同（类型，个数，顺序）
 * 不构成重载：不同参数名，不同返回值--调用时不管这些
 * 构造器可以重载
 * 核心：不构成歧义即可
 * @author randall
 *
 */
public class OverloadTest {

	
	class MyMath{
		
		public int add(int a, int b){
			return a+b;
		}
		
		public int add(int a, int b, int c){
			return a+b+c;
		}

	}
}
