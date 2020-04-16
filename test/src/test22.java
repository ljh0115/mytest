
public class test22 {
    public static void main(String [] args) {
     for(int i=1;i<=10;i++){
    	 //随机生成10个数
        int number=(int)(Math.random()*3);
        switch(number){
            case 0:
            System.out.println("生成了一只白猪，我好怕怕");
            break;  
            case 1:
            System.out.println("生成了一只黑猪，我好喜欢");
            break;
            case 2:
            System.out.println("生成了一只红猪，有下酒菜了");
            break;
            default:
            break;
        }
    }
  }
}