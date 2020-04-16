import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

/*
 模拟QQ聊天  用户输入聊天内容 可以到历史记录中查看记录 
 
 InputStreamReader	将字节数据转化为字符数据流
 BufferedReader		过滤
 */
public class lx12 {
	public static void main(String[] args) throws IOException {
		File file=new File("E:\\a\\test.txt");
		if (!file.exists()) {
			// 获取父目录
			File f = file.getParentFile();
			// 判断目录是否存在
			if (!f.exists()) {
				f.mkdirs();// 创建文件
			}
			f.createNewFile();
			//键盘读取数据
			//方式一创建Scanner对象	全面
			//Scanner s=new Scanner(System.in);
			//方式二
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			//创建输出流	运行快		
			FileWriter fw=new FileWriter(file);
			while (true) {
				//键盘输入信息
				System.out.println("请输入：");
				String str=br.readLine();
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
