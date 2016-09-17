package priv.xzc.se300Season1.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDate {
	public static void main(String[] args) {
		/**
		 * java.util.Date
		 */
		Date date = new Date();
		
		/**
		 * 下面就是时间和字符串之间的转换,format(),parse（）
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("G yyyy-MM-dd HH:mm:ss:SS 星期E"
				+ " 一年中的第D天，时区z");
		Date d = new Date();
		//format成为字符串
		String dateStr = sdf.format(d);
		System.out.println(dateStr);
		
		
		/**
		 * 字符串解析为日期，两者的格式一定要向对应，不然抛出
		 * UnparseDateException
		 */
		String str = "2016-09-06";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date2 = sdf1.parse(str);
			System.out.println(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
