package wwww;

import java.io.File;

//递归打印多级文件夹路径
public class RecursionTest2 {

	public static void main(String[] args) {
		  File src_file = new File("E:\\test");
		  RecursionTest2 recursionTest2 = new RecursionTest2();
		  RecursionTest2.showPath(src_file);
	}
	public static void showPath(File src_file){
		File files[] = src_file.listFiles();
		for(int i =0;i<files.length;i++){
			File tem_file = files[i];
				System.out.println(tem_file.getName());
				if(tem_file.isDirectory()){
				showPath(tem_file);
			}
		}
	}
	}


