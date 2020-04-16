import java.util.Scanner;
//循环输入大于0的数字进行累加，直到输入的数字为0，就结束循环，并最后输出累加的结果。
public class test23 {
	public static void main(String [] args){
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个正数");
		for(;;){
		int a=sc.nextInt();
			sum=sum+a;
		if(a==0){
			System.out.println("累加的结果为："+sum);
			
		}
		}
	}	
}
