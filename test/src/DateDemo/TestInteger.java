package DateDemo;

public class TestInteger {
public static void main(String[] args) {
	Integer i=10;//自动装箱 Integer i=new Integer
	int a=i+1;//自动拆箱	int a=i.intValue
	System.out.println(i+a);
}
}
