package Demo4;
/*
 * 
 * @author Administrator
 *	某公司的雇员分为以下若干类：
Employee：这是所有员工总的父类，声明为抽象类 属性：员工的姓名,员工的生日月份。提供抽象方法：getSalary(int month) 根据参数月份来确定工资，如果该月员工过生日，则公司会额外奖励100元。
SalariedEmployee：Employee的子类，拿固定工资的员工。属性：月薪
SalesEmployee：Employee的子类，销售人员，工资由月销售额和提成率决定。属性：月销售额、提成率
 */
public class TestEmployee {
	public static void main(String[] args) {
		//创建拿固定工资员工对象
		SalariedEmployee se=new SalariedEmployee();
		se.setName("张三");//名字
		se.setBirthday(5);//生日月份
		se.setSalary(3000);//月薪
		se.getSalary(5);//计算5月份工资
		
		//创建销售人员对象
		SalesEmployee sa=new SalesEmployee();
		sa.setName("李四");//姓名
		sa.setBirthday(5);//生日月份
		sa.setSale(100000);//销售额
		sa.setTcSale(0.2);//提成率
		sa.getSalary(5);//计算5月份工资
	}
}
//员工类的总父类 是抽象类 有属性 姓名 生日月份 及计算工资方法 
abstract class Employee{
	//属性
	private String name;//姓名
	private int birthday;//生日月份
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	//行为 不确定部门 所有没有具体计算方式 抽象方法设计
	public abstract void getSalary(int month);
}
//拿固定工资 子类 
class SalariedEmployee extends Employee{
	//需要属性月薪 没有继承到 扩展属性月薪
	private double salary;//月薪
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//重写计算工资方法
	@Override
	public void getSalary(int month) {
		//判断是否过生日
		if(month==getBirthday()){
			System.out.println(getName()+month+"月工资："+(salary+100));
		}else{
			System.out.println(getName()+month+"月工资："+salary);
		}
	}
}
//销售人员 子类
class SalesEmployee extends Employee{
	//需要数组销售额 及提成率 没有继承到 需要扩展
	private double sale;//销售额
	private double tcSale;//提成率
	public double getSale() {
		return sale;
	}
	public void setSale(double sale) {
		this.sale = sale;
	}
	public double getTcSale() {
		return tcSale;
	}
	public void setTcSale(double tcSale) {
		this.tcSale = tcSale;
	}
	//重写计算工资方法
	@Override
	public void getSalary(int month) {
		//判断是否过生日
		if(month==getBirthday()){
			System.out.println(getName()+month+"月工资："+(sale*tcSale+100));
		}else{
			System.out.println(getName()+month+"月工资："+sale*tcSale);
		}	
	}
}