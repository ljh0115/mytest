import java.util.ArrayList;
import java.util.Collections;
/*
 	定义一个Employee类,
 属性:name:String,age:int,salary:double 
把若干Employee对象放在List中,
排序并遍历输出,排序规则:salary低的在前面,
salary相同时age小的在前面,
age也相同时按照name升序排列
 */
public class lx6 {
	public static void main(String[] args) {
		//创建List集合
		ArrayList<Employee> list=new ArrayList<Employee>();
		//添加元素
		list.add(new Employee("唐三",25,6000));
		list.add(new Employee("王二",25,6000));
		list.add(new Employee("萧炎",19,6000));
		list.add(new Employee("林动",25,5500));
		//给List集合添加排序功能
		Collections.sort(list);
		//遍历
		for (Employee e : list) {
			System.out.println(e);
		}
	}
}
class Employee implements Comparable<Employee>{
	private String name;
	private int age;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//构造器
	public Employee() {
	}
	public Employee(String name, int age, double salary){
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	//重写方法
	@Override
	public String toString() {
		return name+"---"+age+"---"+salary;
	}
	@Override
	public int compareTo(Employee o) {//制定规则
		//工资升序  工资相等 按照年龄升序  年龄相等 按照姓名
		if(this.salary!=o.salary){
			return (int)(this.salary-o.salary);
		}
		if(this.age!=o.age){
			return this.age-o.age;
		}
		return this.name.compareTo(o.name);
	}
}