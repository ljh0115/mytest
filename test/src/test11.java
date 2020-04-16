 import java.util.Scanner;
public class test11 {
	public static void main(String[] args){
	//创建Scanner对象
	Scanner s=new Scanner(System.in);
	//输入身高
	System.out.println("身高(cm)：");
	int height=s.nextInt();
	//输入存款
	System.out.println("存款(万)：");
	double money=s.nextDouble();
	//输入是否
	System.out.println("帅否(true/false)：");
	boolean bn=s.nextBoolean();
	//判断三个条件是否全满足
	if(height>180&&money>1000&&bn==true){
		//满足则输出
		System.out.println("我一定要嫁给他!!!");
	}
	//判断三个条件是否最少有一个满足
	else if(height>180||money>1000||bn==true){
		//满足则输出
		System.out.println("嫁吧,比上不足,比下有余.");
	}
	//判断三个条件是否全不满足
	else if(height<=180&&money<=1000&&bn==false){
		//不满足则输出
		System.out.println("不嫁!");
	}
	}
}
