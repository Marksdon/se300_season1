package com.xzc.se300Season1.array;

/**
 * 数组也是对象，画内存即可理解
 * @author randall
 *
 */
public class ArrayDeclare {
	
	int[] b = new int[4];
	public static void main(String[] args) {
		//数组的声明，大多号可以在变量前或者后面
		int[] a;
		int b[];
		
		//对象的创建
		a = new int[3];
		b = new int[4];
		
		/**
		 * 数组的初始化，指的是数组元素的初始化
		 * 有三种初始化方式
		 * 静态，动态
		 */
		//动态初始化数据元素
		for(int i = 0; i < a.length; i ++){
			a[i] = i*12;
		}
		
		//静态初始化数组元素
		int[] c  = {1,23,56};
		Car[] cars = {new Car("奔驰"), new Car("宝马")};
		
		
	}
	

	
}
