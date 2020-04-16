package DateDemo;

import java.util.Calendar;
	/**
	 * java.util.Calendar类
	 * 日历类 获取一个瞬间对应日历信息
	 * Calendar是抽象类 不能直接实例化对象
	 * 可以通过自己的类方法获取类型对象
	 * static Calendar getInstance()
	 * 常用方法：
	 * 		int get(int field)获取指定字段
	 * 		
	 */
public class TestCalendar {
	public static void main(String[] args) {
		//创建日历对象
		Calendar c=Calendar.getInstance();
		System.out.println(c);
		//修改日历对象
		c.set(2016,2,1);
		//偏移时间
		c.add(Calendar.DAY_OF_MONTH,-1);
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH)+1;
		int day=c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"年"+month+"月"+day+"日");
		
	}
}
