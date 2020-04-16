/*
 * 	有返回值 有参数的方法
 * 	
 */
public class ff4 {
	public static int max(int[] arr){
	int max=arr[0];
	//遍历数组 找出所有元素
	for (int i = 0; i < arr.length; i++) {
		if(max<arr[i]){
			max=arr[i];
		}
	}
	return max;
	}
}
