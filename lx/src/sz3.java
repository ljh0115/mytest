//求数组中的最大最小值
public class sz3 {
	public static void main(String[] args){
		//创建数组
		int arr[]={90,34,-23,18,12};
		//声明变量 存放最大值 假设第一个元素是最大值
		int max=arr[0];
		//声明变量 存放最小值 假设第一个元素是最小值
		int min=arr[0];
		//遍历数组 获取数组中的所有元素
	for(int i=0;i<arr.length;i++){
		//求出最大值
		if(arr[i]>max){
			max=arr[i];
		}
		//求出最小值
		if(arr[i]<min){
			min=arr[i];
		}
	}
	System.out.println("数组中的最大值"+max);
	System.out.println("数组中的最小值"+min);
	}
}
