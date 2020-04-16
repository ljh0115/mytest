package Demo4;
/*
 * @author Administrator
 *	设计一个形状类(接口)Shape,方法:求周长和求面积 形状类(接口)的子类(实现类):
 *	Rect(矩形),Circle(圆形)  Rect类的子类:Square(正方形) 
 *	不同的子类会有不同的计算周长和面积的方法 
 *	创建三个不同的形状对象,放在Shape类型的数组里,分别打印出每个对象的周长和面积
 */
public class TestShape {
	public static void main(String[] args) {
		//创建矩形对象
		Rect r=new Rect();
		r.setLength(4);
		r.setWidth(2);
		//创建圆形对象
		Circle c=new Circle();
		c.setR(1);
		//创建正方形对象
		Square s=new Square();
		s.setSide(4);
		
		//创建一个自定义类型数组
		Shape[] arr={r,c,s};
		//指定了属性类为Shape 那么该属性只能存Shape类型数据或比Shape类级别低的数据
		
		//遍历属性 会分别得到各个图形的对象名
		for (int i = 0; i < arr.length; i++) {
			//通过对象名调用他们的面积和周长方法
			arr[i].area();
			arr[i].girth();
		}
	}
}
//图形类总父类 作为接口
interface Shape{
	void area();//面积方法
	void girth();//周长方法
}
//实现类  矩形  类与接口之间是实现关系 用法类似继承
class Rect implements Shape{
	//扩展属性
	private int length;//长
	private int width;//宽
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	//重写方法
	@Override
	public void area() {
		System.out.println("矩形面积:"+length*width);
	}
	@Override
	public void girth() {
		System.out.println("矩形周长："+2*(length+width));
	}
}
//实现类  圆形
class Circle implements Shape{
	//扩展属性
	private double r;//半径
	final double PI=3.14;//圆周率
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	//重写方法
	@Override
	public void area() {
		System.out.println("圆形面积："+PI*r*r);
	}
	@Override
	public void girth() {
		System.out.println("圆形周长："+2*PI*r);
	}
}
//矩形类 子类 正方形  类与类之间是继承
class Square extends Rect{
	//扩展属性
	private int side;//边长
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	//重写方法
	@Override
	public void area() {
		System.out.println("正方形面积："+side*side);
	}
	@Override
	public void girth() {
		System.out.println("正方形周长："+4*side);
	}
}