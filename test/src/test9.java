 import java.util.Scanner;
public class test9 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int a=s.nextInt();
		System.out.println("请输入一个数：");
		int b=s.nextInt();
		System.out.println("请输入一个数：");
		int c=s.nextInt();
		if(a>b){
			if(a>c){
				System.out.println(a);
			}
		}else if(b>c){
				System.out.println(b);
		}
		else if(c>b){
			System.out.println(c);
		}
	}

}
