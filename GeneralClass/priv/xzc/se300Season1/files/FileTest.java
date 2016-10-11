package priv.xzc.se300Season1.files;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.concurrent.SynchronousQueue;

public class FileTest {
	
	public static void main(String[] args) {
		File file = new File("/home/randall/myRecord.txt");//file
		File file2 = new File("/home/randall");//directory
		File file3 = new File(file2, "myRecord.txt");
		File file4 = new File(file2,"testNewFile.java");
		File file5 = new File(file2,"/testd0/testd1/testd2");
		
		//访问文件的属性
		if (file.isFile()) {
			System.out.println(file.getName() + " is a file ,"
					+ " its parent is " + file.getParent());
			System.out.println("its absolute path is " + file.getAbsolutePath());
		}
		System.out.println(new Date(file.lastModified()));
		System.out.println(file.length());
		
		//创建文件/目录
		/*		try {
			//create a file
			if (file4.createNewFile()) {
				System.out.println("testNewFile.java created successfully");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//delete a file
		if (file4.delete()) {
			System.out.println("testNewFile.java has been deleted successfully");

		}*/
		
		if (file5.mkdirs()) {
			System.out.println("directory has been created successfully");
		}
		file5.delete();
		
	}
}
