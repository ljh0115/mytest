package DateDemo;
/**
 *	8个基本数据类型 不具备类功能
 * 	Java机制为了加强基本数据运用为每一个数据类型都提供了一个类(包装类)
 * 	包装类主要提供基本数据类型与包装类和String
 * 	以 int Integer String为例
 */
public class TestMath {
	public static void main(String[] args) {
		//int转换为Integer
		int a=10;
		Integer it=new Integer(a);
		System.out.println(it.toString());
		
		//Integer转换为int
		Integer it2=new Integer(20);
		int a2=it2.intValue();
		System.out.println(a2);
		
		//String转换为Integer
		String s="100";
		System.out.println(s+1);
		Integer it3=new Integer(a);
		System.out.println(it3+1);
		
		//Integer转换为String
		Integer it4=new Integer(30);
		String s2=it4.toString();
		System.out.println(s2);
		//int转换为String
		int a3=100;
		String s3=Integer.toString(a3);
		System.out.println(s3);
		//String转换为int
		String s4="50";
		int a4 =Integer.parseInt(s4);
		System.out.println(a4);
		
		//double转换为String
		double s5=12.2;
		String a5=String.valueOf(s5);
		System.out.println(a5+1);
		//String转换位double
		String s6="32";
		double a6=Integer.parseInt(s6);
		System.out.println(a6);
	}
}
