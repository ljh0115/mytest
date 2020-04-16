package sklx;

import java.util.ArrayList;

/**
 * 讲述List集合
 * 		List集合特点：
 * 					1.有序
 * 					2.允许元素重复
 * 					3.可以存储多个null元素
 * 		List集合添加排序功能：
 * 					Collection.
 */
public class lx1 {
	public static void main(String[] args) {
		//创建List集合
		ArrayList<String> list=new ArrayList<String>();
		//添加元素
		list.add("张三");
		list.add("李四");
		list.add("王二");
		list.add("王二");
		//在集合的指定位置添加元素
		list.add(0,"王二狗");
		//删除指定元素
		list.remove("王二");
		//list.remove(3);
		//修改元素
		list.set(0, "王鹏");
		//获取列表中元素的个数
		list.size();
		//获取指定位置的元素
		Object o=list.get(0);
		System.out.println(o);
		System.out.println(list);
	}
}
