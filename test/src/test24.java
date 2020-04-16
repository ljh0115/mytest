import java.util.Scanner;

public class test24 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("输入一个数");
		int a=0;//正数的个数
		int b=0;//负数的个数
		for(;;){
			int sum=s.nextInt();
			if(sum>0){
			a++;
			}else if(sum<0){
				b++;
			}else{
				break;
			}
			}
		System.out.println("正数的个数为："+a);
		System.out.println("负数的个数为："+b);
	}
}
