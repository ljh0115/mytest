import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
 使用Scanner从控制台读取一个字符串，统计字符串中某个字符出现的次数，要求使用学习过的知识完成以上要求 
实现思路根据Map集合的特性完成。
Scanner src=new Scanner(System.in);
Src.nextLine();//读取一行

 */
public class lx7 {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("请输入：");
		String s=src.nextLine();//读取一行
		//abcdea
		//假设单个字符作为键
		//出现次数作为值
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		//将字符串转化为char类型数组
		char[] arr=s.toCharArray();
		for (char c : arr) {
			//判断map集合中是否包含指定字符串作为键
			if(map.containsKey(c)){
				Object o=map.get(c);//根据键获取值
				map.put(c, (Integer)o+1);
			}else{
				map.put(c, 1);
			}
		}
		//遍历
		Set<Character> set=map.keySet();
		for (Object c : set) {
			System.out.println(c+"出现了："+map.get(c)+"次");
		}
	}
}
