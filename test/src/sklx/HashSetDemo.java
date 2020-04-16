package sklx;

import java.util.HashSet;
import java.util.Iterator;

/*
 	讲述Set集合：
 			HashSet是以哈希码的形式实现了Set
 	Set集合的特点：
 			1.无序的 是指添加和获取元素的顺序不一致
 			2.不允许元素重复
 			3.最多存储一个null
 	泛型：
 			集合一旦指定泛型之后 只能存储指定类型数据 提高安全性
 */
public class HashSetDemo {
	public static void main(String[] args) {
		//创建Set集合
		HashSet<Integer> set=new HashSet<Integer>();
		//添加元素
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		@SuppressWarnings("unused")
		int[] arr={10,20,30,40};
		//遍历集合
	for(Integer o:set){
		System.out.println(o);
	}
	System.out.println("**********");
	Iterator<Integer> it= set.iterator();
	while(it.hasNext()){//判断迭代器中是否还有元素可以迭代
		//获取元素
		System.out.println(it.next());
	}
	}
}
