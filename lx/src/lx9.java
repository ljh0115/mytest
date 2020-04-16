
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class lx9 {
	public static void main(String[] args) throws IOException {
		// 创建file对象
		File file = new File("E:\\图片.jpg");
		// 创建文件去往目的地
		File to = new File("E:\\times\\图片.jpg");
		// 判断目的地是否存在
		if (!to.exists()) {
			// 获取父目录
			File f = to.getParentFile();
			// 判断目录是否存在
			if (!f.exists()) {
				f.mkdirs();// 创建文件
			}
			// 创建输入流
			FileInputStream fis = new FileInputStream(file);
			// 创建输出流
			FileOutputStream fos = new FileOutputStream(to);
			// 创建byte类型数组
			byte[] by = new byte[1024];

			int len = 0;// 声明变量 存放每次读取的长度
			// 循环读取数据
			while ((len = fis.read(by)) != -1) {
				// 循环写出数据
				fos.write(by, 0, len);

			}
			// 关闭流
			fos.close();
			fis.close();

		}

	}

}