package FileOutputStreamDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 	TestInputStream1:	输出流 字节流 节点流
 */
public class TestOutputStream1 {
	private static boolean turn;

	public static void main(String[] args) throws IOException {
		File file=new File("E:\\a\\test1.txt");
		//判断文件是否存在
		if(!file.exists()){
			//获取父目录
			File f=file.getParentFile();
			if(!f.exists()){
				//不存在目录时 创建目录
				f.mkdirs();
			}
			//不存在文件时 创建文件
			file.createNewFile();
		}
		//创建输出流
		//FileOutputStream fos=new FileOutputStream(file);//覆盖
		FileOutputStream fos=new FileOutputStream(file,turn);//续写
		//创建待传输的数据
		String s="1354";
		//写出数据
		fos.write(s.getBytes());
		//关闭流
		fos.close();
	}
}
