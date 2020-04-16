package DateDemo;
/**
 * 
 * @author LJH
 *	char类的包装类Character类
 *	除了提供和String相互转换的方法之外
 *	还有一些比较使用的方法
 *	isLetter(char a)判断是否包含字母
 *	isDigit（char a）判断是否包含数字
 */
public class TestCharacter {
	public static void main(String[] args) {
		//判断用户名是否包含字母
		String name= "41651frs";
		//转换为char类型数组
		char[] arr=name.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(Character.isDigit(arr[i])){
			System.out.println("包含数字");
			break;
			}
		}
	}
}
