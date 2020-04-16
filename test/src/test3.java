
public class test3 {
	public static void main(String[] args){
		//声明变量存储，一个四位整数
		int a=8723;
		//声明变量存储千位
		int q=a/1000;
		//声明变量存储百位
		int b=(a%1000)/100;
		//声明变量存储十位
		int s=(a%100)/10;
		//声明变量存储个位
		int g=a%10;
		//打印该四位数的千位 百位 十位 个位
		System.out.println(a+"的千位："+q+"百位："+b+"十位："+s+"个位："+g);
	}
}
