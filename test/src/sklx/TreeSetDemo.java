package sklx;

import java.util.TreeSet;

/*
 	讲述TreeSet
 	是以二叉树形式实现 自带自然排序	
 	自定义的类创建对象 存放到TreeSet集合中
 	由于TreeSet
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		//创建TreeSet集合
		TreeSet<String> set=new TreeSet<String>();
		set.add("a");
		set.add("c");
		set.add("d");
		set.add("b");
		//遍历
		for (String s:set) {
			System.out.println(s);
		}
	}
}
