package sklx;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

/*
 	讲述Map集合
 		Map集合的特点：
 					1.map是以键值对的形式存储数据
 					2.需要保证键的唯一性 建议使用String数据类型
 					3.一个键最多映射一个值
 					4.允许null键null值
 					5.添加元素 键重复 值覆盖
 */
public class HashMapDemo {
	public static void main(String[] args) {
		//创建Map集合
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		//添加元素
		h.put(1,"王二");
		h.put(2,"张三");
		h.put(3,"李四");
		h.put(4,"林一");
		//删除元素
		h.remove(4);
		//查询是否存在元素
		System.out.println(h.containsKey(4));
		//元素个数
		System.out.println(h.size());
		//遍历
		//第一种 调用KeySet() 返回一个Set集合
		Set<Integer> set=h.keySet();
		//遍历Set集合
		for (Integer it : set) {
			String v=h.get(it);
			System.out.println(it+"\t"+v);
		}
		System.out.println("************");
		//第二种 使用的Map集合的内部类Entry Map集合的每个键值对关系都会对应一个Entry对象
		Set<Entry<Integer,String>>set1=h.entrySet();
		//遍历
		for (Entry<Integer, String> e : set1) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
	}
	
}
