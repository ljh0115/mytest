
public class test6 {
	public static void main(String[] args){
		int a=10;
		int b=20;
		System.out.println("交换前：a="+a+" b="+b);
		int c=a;//把a赋值给c
		a=b;//把b赋值给a
		b=c;//把c赋值给b
		System.out.println("交换后：a="+a+" b="+b);
	}
}
