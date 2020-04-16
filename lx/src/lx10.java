import java.io.*;
/*
  1.用字符输入和输出流 复制一个文档（写本子）
 */
public class lx10 {
	public static void main(String[] args) throws IOException {
		// 创建file对象
		File file = new File("E:\\a\\test.txt");
		// 创建文件去往目的地
		File to = new File("E:\\times\\test.txt");
		// 判断目的地是否存在
		if (!to.exists()) {
			// 获取父目录
			File f = to.getParentFile();
			// 判断目录是否存在
			if (!f.exists()) {
				f.mkdirs();// 创建文件
			}
			// 创建输入流
			FileReader rd= new FileReader(file);
			// 创建输出流
			FileWriter fw = new FileWriter(to);
			//读写数据
			  int read = rd.read();
	            while(read != -1){
	                fw.write(read);
	                read = rd.read();
			}
			//刷新缓冲区
			fw.flush();
			// 关闭流
			fw.close();
			rd.close();
		}
		System.out.println("复制成功");
	}
} 
