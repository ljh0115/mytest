import java.util.Scanner;
//输入两个整数，放入到a与b变量中去，如果a>=b就将a与b中的值进行交换，
//否则就不交换。目地就是要让a中放的值总是小于或等于b中的数，输出变量a和b的值
public class test20 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入两个数:");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>=b){
		int c=b;
		b=a;
		a=c;
		}
		System.out.println(a);
	}	
}
