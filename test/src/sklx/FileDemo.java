package sklx;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	讲述Java.io.File
 		表示一个文件或目录
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		//创建file对象
		File file=new File("E:\\第16章 java IO系统.pptx");
		//获取文件名
		System.out.println(file.getName());
		//获取父目录
		System.out.println(file.getParent());
		//获取最后一次修改的时间
		long time=file.lastModified();
		Date date=new Date(time);
		String s=new SimpleDateFormat().format(date);
		System.out.println(s);
		//(毫秒值)
		System.out.println(file.lastModified());
		//删除文件
		file.delete();
		//在根目录下创建文件
		//判断文件是否存在
		if(file.exists()){
			//不存在创建
		file.createNewFile();
		}
		//在多级目录下创建文件
		File file2=new File("E:\\a\\第16章 java IO系统.pptx");
		//判断文件是否存在
		if(!file2.exists()){
			//获取父目录
			File f2=file2.getParentFile();
			if(!f2.exists()){
				//不存在目录时 创建目录
				f2.mkdirs();
			}
			//不存在文件时 创建文件
			file2.createNewFile();
		}
	}
}
