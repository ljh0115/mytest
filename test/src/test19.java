import java.util.Scanner;
// 键盘输入一个5位数，判断它是不是回文数
public class test19 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("请输入五个数:");
	int i=s.nextInt();
	
	int w=i/10000;
	int q=i/1000%10;
	int sh=i/10%10;
	int g=i%10;
	
		if(g==w&&q==sh){
			System.out.println("是回文数");
		}else{
			System.out.println("不是回文数");
		}
	
	}
}
