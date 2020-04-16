
public class sz1 {
	public static void main(String[] args){
		//第一种方式
		int[] arr={10,20,30,40,50};
		String[] arr2={"10","20","30"};
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(arr[2]);
		//第二种方式
		double[] arr3=new double[10];
		arr3[0]=10;
		System.out.println(arr3[0]);
		//第三种方式
		String[] arr4=new String[]{"张三","李四"};
		System.out.println(arr4[1]);
	}
}
