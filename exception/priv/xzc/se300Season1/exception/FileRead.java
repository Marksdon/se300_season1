package priv.xzc.se300Season1.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) {
		String pathName = "/home/randall/readme.txt";
		FileReader reader = null;
		try {
			reader = new FileReader(pathName);
			int temp ;
			while((temp = reader.read()) != -1){
				System.out.println("reading ..." + temp);
			}
			System.out.println("read end");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
					System.out.println("read close");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
