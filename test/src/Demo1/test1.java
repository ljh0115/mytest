package Demo1;

public class test1 {
	public static void main(String[] args) {
		//创建食物对象
		Fish f=new Fish();
		f.fishName="三文鱼";
		
		//创建动物对象
		Cat a=new Cat();
		a.catName="汤姆猫";
		
		//创建饲养员对象
		Feeder fe=new Feeder();
		fe.feederName="旭旭";
		
		//发送指令
		fe.feed(a);
		a.eat(f);
	}
}
