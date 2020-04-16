package Demo1;
/**
 * 
 * @author Administrator
 *	这个类是讲述构造器(构造器方法)：
 *
 *		构造器的声明:
 *
 *			[修饰符] 构造器名([参数列表]){}
 *
 *			1.构造器没有返回值类型 连void也不能有
 *
 *			2.构造器名需要和类名保持一致 包括大小写
 *
 *			3.构造器放在关键字new后面 用来实例化对象
 *
 *			4.如果一个类没有显示声明构造器 那么该类会默认提供一个无参数构造器
 *				如果显示声明构造器(有参或无参) 那么就不在提供这么默认无参数构造器
 *
 *			5.构造器有两种 第一种 无参数构造器 用于实例化对象
 *				第二种 有参构造器 用于实例化对象同时初始化成员变量(给属性赋值)
 */
public class Teacher {

	//属性
	String name;
	int age;
	
	//行为 讲课
	public void speak(){
		System.out.println(age+"岁的"+name+"正在上课");
	}
	//无参构造器
	public Teacher(){
		System.out.println("无参");
	}
	//有参构造器
	public Teacher(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	
}
