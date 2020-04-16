package sklx;
/*
FileWriter:输出流 字符流 节点流

 字符流自带缓冲区 需要刷新缓冲区 
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		//创建数据去往的目的端
		File file=new File("E:\\IO\\流练习.txt");
		//判断文件是否存在
		if(!file.exists()){
		//获取父目录
		File f2=file.getParentFile();
			//判断目录是否存在
			if(!f2.exists()){
			//不存在目录 创建
				f2.mkdirs();
			}
			//不存在创建
			file.createNewFile();
		}
				
		//创建输出流
		FileWriter fw=new FileWriter(file);
		//创建待传输的数据
		String s="雷超弹吉他";
				
		//写出数据
//		fw.write(s.toCharArray());
		fw.write(s);
		//刷新缓冲区
//		fw.flush();//
		
		//关闭流
		fw.close();//自动调用flush() 刷新缓冲区
	}
}
