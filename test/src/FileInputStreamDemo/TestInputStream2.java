package FileInputStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestInputStream2 {
	public static void main(String[] args) throws IOException {
		//创建待读取的文件
		File file =new File("E:\\a\\test.txt");
		//创建输入流
		FileInputStream fis=new FileInputStream(file);
		//创建byte[]数组
		byte[] by=new byte[1024];//1024读取速度最快
		//声明变量 存放每次读取长度
		int len=0;
		//循环读取
		while((len=fis.read(by))!=-1){//1120
			//将每次读取的长度数据转换为字符串
			String s=new String(by,0,len);
			System.out.println(s);
		}
		fis.close();
	}
}
