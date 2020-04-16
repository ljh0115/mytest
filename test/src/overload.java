
public class overload {
	public void over(){
		System.out.println("方法1");
	}
	public void over(double a){
		System.out.println("方法2");
	}
	public void over(int a){
		System.out.println("方法3");
	}
	public void over(int a,double b){
		System.out.println("方法4");
	}
	public static void main(String[] args) {
		overload aa=new overload();
		aa.over(10);
	}
}
