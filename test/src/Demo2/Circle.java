package Demo2;
//final 关键字 最终的不可修改的	final修饰的变量 可以看作常量	不能重写	不能被继承
public class Circle extends Shape{
	private double r;
	final double PI=3.14;
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	@Override
	public void zc(){
		System.out.println("圆周长为："+2*PI*r);
	}
	@Override
	public void mj(){
		System.out.println("圆面积为："+PI*r*r);
	}
}
