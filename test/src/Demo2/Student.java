package Demo2;

public class Student {
	static{
		System.out.println("静态代码块");
	}
	//实例变量
	String name;
	char sex;//性别
	int age;
	//类变量
	static String className="计网2班";
	static double classMoney=1000;//班费
	public void spend(double money){
		System.out.println("原有班费"+classMoney);//类方法
		classMoney=classMoney-money;
		System.out.println(name+"花了"+money+"还剩"+classMoney);
	}
	//构造器
	public Student(){
		
	}
	public Student(String name, char sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

}