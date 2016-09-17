package priv.xzc.se300Season1.generalClass.wrapClass;

/**
 *Java 不是纯的面向对象语言，有8中数据类型，有时并不需要所有都高成为
 *对象，基本数据类型更快简单；有时需要把基本数据类型变成对象处理，如集合
 *1.结构关系
 *2.常用方法和属性
 *3.自动装箱/拆箱
 *4.缓存问题
 * @author randall
 *
 */
public class WrapperClass {
	

	public static void main(String[] args) {
		/**
		 * 常用法
		 */
		Integer i0 = new Integer(123);//把123封装成为对象成员
		Integer i1 = new Integer("123");
		
		System.out.println(i0==i1);
		System.out.println(i0.equals(i1));
		
		//最大最小值
		int minValue = Integer.MIN_VALUE;
		int maxValue = Integer.MAX_VALUE;
		
		int a = Integer.parseInt("123");//把字符串转成为基本类型
		//内部方法就是强转，继承实现抽象类Number，所以包装类都有
		long l = i0.longValue(); 
		
		//把一个基本类型转成为字符串很简单
		String str = 123 + "";
		
		/**
		 * 自动装箱和拆箱，since jdk1.5 ，编译器做了变动
		 * 基本数据类型和对象的转换
		 */
		//装箱，基本数据类型转成为对象
		Integer i2 = 1234;//这不符合Java语法，实际上运行的是Integer i2 = new Integer(1234);
		int b = new Integer(456);//拆箱，对象变为基本数据类型
		
/*		Integer d = null;
		int e = d; //实际执行d.intValue()，会报空指针异常
*/		
		
		/**
		 * 缓存问题,下面的用法在[-128,127]的数，jdk处理时会当作基本数据类型
		 */
		Integer d0 = 100;
		Integer d1 = 100;
		System.out.println(d0 == d1); //true,理论上时比较两个对象的内存地址，但是这里比较基本数值
		System.out.println(d0.equals(d1));
		
		
		
	}
	
	
}
