import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBCUtil.JDBCUtil;


public class dl {
	public static boolean Dl(shiti sh) throws SQLException{
		boolean bn=false;
		Connection conn=JDBCUtil.getConn();
		String sql="select * from t3";
		PreparedStatement pst=conn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			boolean b1=rs.getString(1).equals(sh.getUsername());
			boolean b2=rs.getString(2).equals(sh.getPwd());
			if(b1==true&& b2==true){
				bn=true;
			}
			break;
		}		
		return bn;
	}
}
