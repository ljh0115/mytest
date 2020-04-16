import java.util.Scanner;

//判断一个数是否是质数
public class test17 {
	public static void main(String[] args) {
		//键盘输入一个数
		Scanner s=new Scanner(System.in);
		System.out.println("输入一个数：");
		int a=s.nextInt();
		//声明变量 统计约数的个数
		int c=0;
		//用循环找到1到该整数之间所有的数字
		for(int i=1;i<=a;i++){
			//判断输入的整数取模1到它本身之间所有的数字
			if(a%i==0){
				c++;//记录成立次数
			}
		}
		if(c==2){
			System.out.println("是质数");
		}else{
			System.out.println("不是质数");
		}
	}
}
