package priv.xzc.se300Season1.files;

import java.io.File;

public class FileTree {
	public static void main(String[] args) {
		File file = new File("/home/randall/Documents/commonstatistics");
		recursePrintFileTree(file, 0);
	}
	
	public static void recursePrintFileTree(File file, int level){
		for(int i = 0; i < level; i ++){
			System.out.print("-|");
		}
		System.out.println(file.getName());
		
		if (file.isDirectory()) {
			File[] list = file.listFiles();
			for (File temp : list) {
				recursePrintFileTree(temp, level+1);
			}
		}
	}
}
