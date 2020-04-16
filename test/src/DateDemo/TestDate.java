package DateDemo;

import java.util.Date;
	/*日期时间类 表示特点瞬间 
	构造器：
	1.new Dtae()
	2.new Dtae(long time)
	方法：
	1.getTime()获取一个指定日期对应的毫秒值时间
	*/
	public class TestDate {
	public static void main(String[] args) {
		//创建Data对象
		Date date=new Date();
		System.out.println(date);
		//获取当前系统时间对应的毫秒值时间
		long time=date.getTime();
		System.out.println(time);
		//创建Data对象 用有参构造器
		Date date2=new Date(1538288756072L);
		System.out.println(date2);
	}
}
