package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化类
 * 将Date对象格式化为一个String类型时间
 * format()
 * 将String类型时间解析为Date对象
 * parse()
 * 注意：带解析的字符串时间 格式需要一致
 */
public class TestSimpleDateFormat {
	public static void main(String[] args) throws ParseException {
		//创建Data对象
		Date d=new Date();
		System.out.println(d);
		//创建格式器	默认风格
		SimpleDateFormat sdf=new SimpleDateFormat();
		String s=sdf.format(d);
		System.out.println(s);
		//创建格式器	指定风格
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String s2=sdf2.format(d);
		System.out.println(s2);
		//
		String s3="2018-9-30";
		//解析器
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd");
		Date d2=sdf3.parse(s3);
		System.out.println(d2);
	}
}
