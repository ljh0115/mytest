package sklx;

import java.util.ArrayList;
import java.util.Iterator;

public class lx2 {
	public static void main(String[] args) {
		//创建List集合
		ArrayList<String>  list=new ArrayList<String>();
		//添加元素
		list.add("张三");
		list.add("李四");
		list.add("王二");
		list.add("王二");
		//第一种 根据list集合特点
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println( );
		//第二种 用加强for循环	for(元素类型 变量名:待遍历容器){}
		for (Object o:list) {
			System.out.println(o);
		}
		System.out.println( );
		//第三种 用迭代器
		Iterator<String> it=list.iterator();
		while(it.hasNext()){//判断迭代器中是否还有元素可以迭代
			//获取元素
			System.out.println(it.next());
		}
	}
}
