package sklx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 	这个类讲述异常：
 		概念：
 			是程序在编译期或运行期出现的例外
 			这个例外有些可以避免 有些无法避免
 		分类：
 			运行期异常 是RuntimeException及其子类 异常可以通过严密逻辑思维避免 不需要处理
 				常见：
 					数组异常： ArrayIndexOutOfBoundsException
 					算术异常：
 					类型转换异常：
 					空指针异常：
 			编译器异常 是以Exception及其子类 除了RuntimeException
 			不可避免 必须处理 Java机制提供了以下两种
 			1.抛出异常
 					throws 异常类型
 			2.捕获异常
 					try{可能出现异常的代码块
 					}catch(异常类型 异常名){捕获异常后 处理异常的代码
 					}finally{不管是否捕获异常 总是运行的代码块
 					}
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		/*数组下标越界异常
		 int[] arr=new int[10];
		 System.out.println(arr[10]);
		
		算术异常
		 int a=10;
		 System.out.println(a/0);
		类型转换异常
		 Object o=new Integer(10);
			String s=(String)o;
			System.out.println(s);
		控指针
		 String s=null;
		 System.out.println(s.toString());
		 */
		try {
			String s="2018.10.9";
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Date d=sdf.parse(s);
			System.out.println(d);
		} catch (ParseException e) {
			e.printStackTrace();
//			System.out.println("抓到异常了");
		}finally{
			 System.out.println("不管是否捕获异常 总是执行代码块");	
		}
		
		System.out.println(666);
	}
}
