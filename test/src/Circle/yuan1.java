package Circle;

public class yuan1 {
	//属性
	final double PI=3.14;//Π
	double r;//半径
	//行为
	public void mj(){
		System.out.println(PI*r*r);
	}
	public void zc(){
		System.out.println(2*PI*r);
	}
	//创建无参构造器
	public yuan1(){
		
	}
	//创建无参构造器
	public yuan1(double r){
		this.r=r;
	}
}
