
public class lx8 {
	public static void main(String[] args) {
		Student a=new Student();
		a.setName("张三");
		a.setAge(200);
		System.out.println("姓名："+a.getName()+"\t年龄："+a.getAge());
	}
}
	class Student{
		private String name;
		private int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			if(age<0){
				//抛出自定义异常
				throw new AgeLT0Exception();
			}if(age>150){
				throw new AgeGT150Exception();
			}
			this.age = age;
		}
	}
	//自定义异常 
	class AgeLT0Exception extends RuntimeException{
		private static final long serialVersionUID = -8109089402445554475L;

		public  AgeLT0Exception() {
			super("年龄负数异常");
		}
	}
	class AgeGT150Exception extends RuntimeException{
		private static final long serialVersionUID = -5492256193650847271L;

		public  AgeGT150Exception() {
			super("年龄过大异常");
		}
	}

