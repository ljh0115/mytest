package Demo2;
//矩形类  计算面积和周长需要属性 由于没有继承属性 所以需要子类扩展属性  需要重写
public class Rect extends Shape{
	private double c;//长
	private double k;//宽
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getK() {                                                                           
		return k;
	}
	public void setK(double k) {
		this.k = k;
	}
	@Override
	public void zc(){
	System.out.println("矩形周长为："+2*(c+k));
	}
	@Override
	public void mj(){
	System.out.println("矩形面积为："+c*k);
	}
}
