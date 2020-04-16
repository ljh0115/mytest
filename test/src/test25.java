import java.util.Scanner;

public class test25 {
	public static void main(String[] args){
		float sum=0;
		float i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("输出学生的成绩：");
		for(int a=1;a<=5;a++){	
			float b=s.nextFloat();
			sum+=b;
		}
		i=sum/5;
		System.out.println("总分："+sum+"平均分："+i);
	}
}
