package Demo1;


public class TestTeacher {

	public static void main(String[] args) {
		//调用无参数构造器创建对象
		Teacher t=new Teacher();
		t.name="管老师";
		t.age=30;
		t.speak();
		
		//调用有参构造器创建对象
		Teacher t2=new Teacher("老杜",18);
		t2.speak();
	}
}
