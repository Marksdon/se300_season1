package priv.xzc.se300Season1.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 测试日期
 * 注意：
 * 月份：一月是0，二月是1，....十二月是11
 * 星期：周日是1，周一是2，....周六是7
 * @author randall
 *
 */
public class UtilCalendar {
	public static void main(String[] args) {
		/**
		 * 设置日期，获取日期
		 */
		Calendar c = new GregorianCalendar();
		//设置时间
//		c.set(2015, 9, 16, 03, 23, 34);//1
		/**
		 * 注意：
		 * 	如果其中某个域是没有设置的，就不会是默认为0，而是用
		 * 当前的时间的
		 */
		c.set(Calendar.YEAR, 2005);//分开域来设置
		c.set(Calendar.MONTH, 1);//二月
		
		c.setTime(new Date());//直接设置为当前时间
		
		Date date = c.getTime();//获取整个时间
		int year = c.get(Calendar.YEAR);//获取时间的某个域
		System.out.println(date);
		System.out.println(year);
		
		/**
		 * 计算日期
		 */
		c.add(Calendar.YEAR, 6);//加6年
		c.add(Calendar.DATE, 9);//加9天
		c.add(Calendar.MONTH, -7);//减7个月
		System.out.println(c);
		
		
	}
	
}
