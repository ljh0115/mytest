
public class lx3 {
	public static void main(String[] args) {
		//被7整除的数的和
		int b=0;
		//1~100的数
		for(int a=0;a<=100;a++){
		//被7整除
		if(a%7==0){
			b=b+a;
		}
		}
		System.out.println("能被七整除的和："+b);
	}

}
