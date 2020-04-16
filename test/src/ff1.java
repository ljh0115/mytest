/*
 * 	1.修饰符 可写可不写
 * 	2.返回值类型
 * 		1.有返回值	统一用void表示
 * 		2.有返回值	用数据类型替换 任意类型
 * 	3.方法名 符合标识符命名规范
 * 	4.参数列表
 * 		个数	任意
 * 		类型	任意
 * 	5.方法体	功能代码
 * 	
 * 	没有返回值	没有参数的方法
 * 	没有返回值	有参数的方法
 * 	有返回值	没有参数的方法
 * 	有返回值	有参数的方法
 */
/*		[修饰符]	返回值类型	方法名([参数列表])
 * 	public static void main(String[] args) {
	
	}
	*/
public class ff1 {
	public static void aaa() {
		System.out.println("没有返回值 没有参数的方法1");
	}
	public static void main(String[] args) {
		aaa();
		System.out.println("程序主入口3");
	}
}
