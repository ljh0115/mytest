package Demo3;

public class TestShape {
	public static void main(String[] args) {

	}
	abstract class Shape{
		
	}
	class Rect extends Shape{
		private double z;
		private double k;
		public double getZ() {
			return z;
		}
		public void setZ(double z) {
			this.z = z;
		}
		public double getK() {
			return k;
		}
		public void setK(double k) {
			this.k = k;
		}
		public void zc(){
			System.out.println("周长为："+2*(z+k));
		}
		public void mj(){
			System.out.println("面积为："+z*k);
		}	
	}
}
