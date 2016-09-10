package com.xzc.se300season1.oop;

/**
 * 测试构造器
 * 构造器的作用就只有一个作用，构造一个类实例
 * 1.构造器只能通过new调用
 * 2.构造器虽然有返回值（只能返回该类的实例），不能定义返回
 * 类型（一定该类的类型），不用在构造器里调用return
 * 3.与类名一致
 * 4.如果没有定义，系统编译器自动定义一个无参的，如果定义系统就不添加了
 * 5.作用：构造类实例，初始化
 * @author randall
 */

/**
 *内存分析
 *jvm先在方法区中查看是否有ConstructorTest类，发现没有就从CLASSPATH中
 *找到，通过类加载器载入到方法区中
 *从main方法中开始
 * 
 *
 */
public class ConstructorTest {
	public static void main(String[] args) {
		
		Point p0 = new Point(4, 3, 2);
		p0.setX(5);
		
		Point p1 = new Point(9, 2, 6);
		System.out.println(p0.distance(p1));
	}
}
