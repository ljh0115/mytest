 import java.util.Scanner;
public class test8 {
	public static void main(String[] args){
		//创建Scanner对象
		Scanner s=new Scanner(System.in);
		//提示用户输入一个整数
		System.out.println("请输入一个数：");
		System.out.println("请输入一个数：");
		//接收用户输入的整数  next() nextInt() nextDouble()
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b&a!=b){
			System.out.println(a+"更大");		
		}
		if(b>a&a!=b){
			System.out.println(b+"更大");	
		}
	}
}
