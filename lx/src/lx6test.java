
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class lx6test {
	public static void main(String[] args) {
		lx5 a1=new lx5();
		a1.name="张三";
		a1.className="java1班";
		a1.a=88.0;
		lx5 a2=new lx5();
		a2.name="李四";
		a2.className="java2班";
		a2.a=60.5;
		lx5 a3=new lx5();
		a3.name="王五";
		a3.className="java3班";
		a3.a=95.0;
		ArrayList<Serializable> list=new ArrayList<Serializable>();
		list.add(a1.toString());
		list.add(a2.toString());
		list.add(a3.toString());
		//第一种 根据list集合特点
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
			}
		System.out.println("************");
		//第二种 用加强for循环	for(元素类型 变量名:待遍历容器){}
		for (Object o:list) {
				System.out.println(o);
			}
		System.out.println("************");
		//第三种
		Iterator<Serializable> it= list.iterator();
		while(it.hasNext()){//判断迭代器中是否还有元素可以迭代
			//获取元素
			System.out.println(it.next());
		}
	}
}
