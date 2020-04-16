import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 从控制台输入数据，写入到文件中，
 输入exit表示结束写文件操作. 
 */
public class lx11 {
	public static void main(String[] args) throws IOException {
		//创建数据去往的目的地
		File file=new File("E:\\a\\test.txt");
		if (!file.exists()) {
			// 获取父目录
			File f = file.getParentFile();
			// 判断目录是否存在
			if (!f.exists()) {
				f.mkdirs();// 创建文件
			}
			f.createNewFile();
			//创建Scanner对象
			Scanner s=new Scanner(System.in);
			//创建输出流
			FileWriter fw=new FileWriter(file);
			while (true) {
				//键盘输入信息
				System.out.println("请输入：");
				String str=s.nextLine();
				//判断输入的数据是否为exit
				if (str.equals("exit")) {
					break;
				}
				//写出数据到指定文件
				fw.write(str);
				//刷新
				fw.flush();
			}
		}
	}
}
