package com.xzc.se300Season1.array;

import java.util.Arrays;

/**
 * StringBuilder and StringBuffer 基本相同，不同是
 * StringBuiler（非线程安全，效率高），StringBuffer(线程安全，效率低)
 * @author randall
 *
 */
public class StringBuilderAndBufferTest {
	public static void main(String[] args) {
		/**
		 * StringBuilder类
		 */
		//构造器
		StringBuilder sb = new StringBuilder();
		StringBuilder builder = new StringBuilder(12);
		System.out.println(sb.length());
		System.out.println(builder.length());
		
		//append(*)
		//掌握数组括容,其实就是将新的数组代替原来的数组，这对后来学习容器很重要
		builder.append("aa").append("ddd").append("cc");//append方法链
		System.out.println(builder);
		
		/**
		 * 数组拷贝
		 */
		int[] a = {1,2,5};
		int[] b = Arrays.copyOf(a, 7);//核心代码
		for(int i = 0; i < b.length; i ++){
			System.out.println(b[i]);
		}
		
		/**
		 * 反转
		 */
		builder.reverse();
		System.out.println(builder);
	}
}
