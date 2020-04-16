 import java.util.Scanner;
public class test7 {
	public static void main(String[] args){
		//创建Scanner对象
		Scanner s=new Scanner(System.in);
		//提示用户输入一个整数
		System.out.println("请输入一个数：");
		//接收用户输入的整数  next() nextInt() nextDouble()
		int a=s.nextInt();
		//String b=a>=60?"及格":"不及格";
		//System.out.println(b);
		if(60<=a&a<=100){
			System.out.println("及格");		
		}
		if(0<=a&a<60){
			System.out.println("不及格");	
		}
	}
}
