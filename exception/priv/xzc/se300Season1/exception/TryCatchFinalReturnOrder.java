package priv.xzc.se300Season1.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * test the order between try,catch,finally and return
 * 注意try,catch,finally,return的顺序
 * return的两个作用（1.赋返回值，2.结束程序）
 * @author randall
 *
 */
public class TryCatchFinalReturnOrder {

	public static void main(String[] args) {
		String pathName = "/home/randall/readme.txt";
		String result = readFile(pathName);
		System.out.println("result: " + result);	}
	
	public static String readFile(String pathName){
		/**
		 * 执行顺序是：
		 * 1.try,catch,赋返回值（并没有结束）
		 * 2.finally
		 * 3.return (如果载finally中加上return，返回值就会被覆盖，
		 * 并且结束程序)
		 */
		FileReader reader = null;
		try {
			reader = new FileReader(pathName);
			int temp = 0;
			StringBuilder result = new StringBuilder("");
			while((temp=reader.read()) != -1){
				result.append(temp);
			}
//			System.out.println("result: " + result);
			return result.toString(); //成功运行返回这个
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return "--FileNotFoundException--"; //发生FileNotFoundException返回这个
		} catch (IOException e) {
			e.printStackTrace();
			return "--IOException--";//发生IOException返回这个
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
//			return "--finally--"; //千万不要在finally中加return
		}
	}
}
