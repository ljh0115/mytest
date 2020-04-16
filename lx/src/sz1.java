//把数组中的数据倒过来打印
public class sz1 {
	public static void main(String[] args){
		//创建数组
		int []arr={10,20,30,40,50};
		for(int a=arr.length-1;a>=0;a--){
			System.out.println(arr[a]);
		}
	}
}
