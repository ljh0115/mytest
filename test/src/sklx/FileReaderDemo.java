package sklx;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 	FileReader:输出流 字符流
 */
public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//创建待读取的文件
		File file =new File("E:\\a\\test.txt");
		//创建输入流
		FileReader fis=new FileReader(file);
		//创建byte[]数组
		char[] ch=new char[1024];//1024读取速度最快
		//声明变量 存放每次读取长度
		int len=0;
		//循环读取
		while((len=fis.read(ch))!=-1){//1120
			//将每次读取的长度数据转换为字符串
			String s=new String(ch,0,len);
			System.out.println(s);
		}
		//关闭流
		fis.close();
	}
}
