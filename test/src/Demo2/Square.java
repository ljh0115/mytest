package Demo2;
//正方形
public class Square extends Rect{
	private double b;
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	@Override
	public void zc(){
		System.out.println("正方形周长为："+4*b);
	}
	@Override
	public void mj(){
		System.out.println("正方形面积为："+b*b);
	}
}

