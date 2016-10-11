package com.xzc.se300Season1.array;

/**
 * 
 * @author randall
 *
 */
public class StringTest {
	public static void main(String[] args) {
		String str = "adsfadas1";
//		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('a', 2));
		
		char[] charArr = {'a','b','c'};
		String s = new String(charArr);
		System.out.println(s);
		
		
		/**
		 * ==与equals()的区别
		 * ==比较的是内存地址，equals比较地址也比较内容（地址相同返回true，常量池共享一个的返回true）
		 */
		String str0 = new String("abc");
		String str1 = new String("abc");
		System.out.println(str0 == str1);
		System.out.println(str0.equals(str1));
		
		String str2 = " aBc ";
		String str3 = "abc";
		System.out.println(str3 == str2);
		System.out.println(str2.equals(str3));
		
		/**
		 * 常用方法
		 */
		str2.trim();//去掉首位的空字符
		str2.equalsIgnoreCase("abc");//忽律大小写比较字符串内容
		System.out.println(str2.equalsIgnoreCase("abc"));
		System.out.println(str2.startsWith("abc"));
		System.out.println(str2.endsWith("abc"));
		System.out.println(str2.toLowerCase());
		System.out.println(str2.toUpperCase());
		
		StringBuilder builder = new StringBuilder();
		
	}

  
}
