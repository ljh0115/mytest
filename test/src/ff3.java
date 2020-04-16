/*
 * 	有返回值 没有参数的方法
 * 	没有返回值 用void表示
 * 	有返回值 数据类型替换void 类型任意
 * 	return后面跟着语句类型需要和方法返回值类型一致
 * 	return语句需要书写在方法执行流程的最后一步
 */
public class ff3 {
	public static int aa(){
		return 10;
	}
	public static void main(String[] args) {
		System.out.println(aa());
	}
}
