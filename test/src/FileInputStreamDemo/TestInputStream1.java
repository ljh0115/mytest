package FileInputStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
  流的概念：
  		流是两个设备间的数据传输
  		流的本质就是数据传输
 流的分类：
 		1.方向 把程序作为参考
 			输入流：从数据源读取到程序中
 			输出流：将程序中数据写到指定文件中
 		2.操作数据类型：
 			字节流：以Stream结尾 以字节为单位数据传输
 			字符流：以Reader或Writer以字符为单位数据传输
 		3.功能：
 			节点流：具备将数据从一端传输到另一端功能
 			过滤流(处理流)：不具备数据传输功能 主要为节点流添加功能
 			
 TestInputStream：输入流 字节流 节点流
 */
public class TestInputStream1 {
	public static void main(String[] args) throws IOException {
		//创建待读取的文件
		File file =new File("E:\\a\\test.txt");
		//创建输入流
		FileInputStream fis=new FileInputStream(file);
		//创建byte[]数组
		// byte[(int)file.length()];文件的字节长度
		byte[] by=new byte[1024];//1024读取速度最快
		//读取数据
		fis.read(by);
		//byte[]转换为String
		String s=new String(by);
		System.out.println(s);
		//关闭流
		fis.close();
	}
}
