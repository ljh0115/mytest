//从小到大排序
//冒泡排序：相邻的两个元素进行比较 按照需求进性交换
//每次循环得到一个最大值放在最后面 下一次循环安照相同原来操作数据
//比较趟数：数组长度-1	每趟比较次数：数组长度-比较趟数
//import java.util.Arrays;
public class sz4 {
	public static void main(String[] args) {
		int []arr={90,34,-23,18,12};
		//冒泡循环
		for(int i=0;i<arr.length-1;i++){//比较趟数
			for(int j=0;j<arr.length-i-1;j++){//每趟比较次数
				//比较两个相邻的元素
				if(arr[j]>arr[j+1]){
					int k=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=k;
				}
			}	
		}
		//快速排序 默认是升序
		//Arrays.sort(arr);
		//遍历排序后的数组
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	}
}
