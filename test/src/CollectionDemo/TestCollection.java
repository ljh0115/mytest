package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
/**
 * 
 * @author LJH
 *	这个类讲述集合
 *		被用于存储 传输 操作和删除数据的集合
 * 		集合的特点：
 * 				1.集合的长度是可变的
 * 				2.集合存储都是引用数据类型
 * 				3.集合中不能出现基本数据类型值
 * 		常用方法：
 * 			添加：add()添加单个元素
 * 				addAll(Collection c)添加所有元素
 * 			获取：size()
 * 			删除：remove()
 * 				removeAll()
 * 			其它：contains()
 * 			
 */
public class TestCollection {
	public static void main(String[] args) {
		//创建集合
		Collection<String> c=new ArrayList<String>();
		//添加元素
		c.add("10");//new Integer(10)自动装箱
		c.add("王二");
		c.add("李四");
		//获取集合长度
		int a=c.size();
		//删除元素
		c.remove("李四");
		//判断集合中是否包含某个元素
		boolean bn1=c.contains(10);
		System.out.println(bn1);
		//判断集合中是否有元素
		boolean bn2=c.isEmpty();
		System.out.println(bn2);
		System.out.println(c);
		System.out.println(a);
	}
}
