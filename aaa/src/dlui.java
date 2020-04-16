import java.sql.SQLException;
import java.util.Scanner;


public class dlui {
	public static void DLUI() throws SQLException{
		Scanner s=new Scanner(System.in);
		System.out.println("«Î ‰»Î’À∫≈£∫");
		String username=s.next();
		System.out.println("«Î ‰»Î√‹¬Î£∫");
		String pwd=s.next();
		shiti sh=new shiti();
		sh.setUsername(username);
		sh.setPwd(pwd);
		boolean bn=dl.Dl(sh);
		if(bn==true){
			System.out.println("µ«¬Ω≥…π¶");
		}else{
			System.out.println("µ«¬Ω ß∞‹");
		}
	}
}
