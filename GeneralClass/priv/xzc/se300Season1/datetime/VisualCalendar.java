package priv.xzc.se300Season1.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 可视化日历小程序
 * 能做，先把能做的做出来，有个效果，然后难点各个击破
 * @author randall
 *
 */
public class VisualCalendar {

	public static void main(String[] args) {
		String testStr = "2016-09-17";

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date testDate = df.parse(testStr);
			Calendar c = new GregorianCalendar();
			c.setTime(testDate);
			
			c.set(Calendar.DATE, 1);
			//这个月的第一天（1号）是星期几
			int weekDate = c.get(Calendar.DAY_OF_WEEK);
			//这个月有多少天,最大天数
			int maxDate = c.getActualMaximum(Calendar.DATE);

			//当前日期
			Date currentDate = getCurrentDate();
			Calendar currentCalendar = new GregorianCalendar();
			currentCalendar.setTime(currentDate);

			System.out.println("日\t一\t二\t三\t四\t五\t六");

			for(int i = 1; i < weekDate; i ++){
				System.out.print("\t");
			}

			for(int i = 1; i <=maxDate; i ++){
				if (currentDate.equals(c.getTime())) {
					System.out.print("*" +i + "\t");
				} else {
					System.out.print(i + "\t");
				}
				//每逢周六换行
				if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
					System.out.println();
				}
				//加一天
				c.add(Calendar.DATE, 1);
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}


	}
	
	
	/**
	 * 获取当前日期
	 * @return 但前时间的日期
	 */
	public static Date getCurrentDate(){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String currentDateStr = df.format(new Date());
		Date currentDate = null;
		try {
			currentDate = df.parse(currentDateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return currentDate;
	}
}
