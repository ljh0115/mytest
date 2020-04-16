package Demo1;
	//饲养员类
public class Feeder {
	//属性
	String feederName;
	//行为
	public void feed(Cat a){
		System.out.println(feederName+"正在喂"+a.catName);
	} 
}
