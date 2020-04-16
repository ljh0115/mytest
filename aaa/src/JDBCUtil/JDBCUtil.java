package JDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConn(){
		Connection conn=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			try {
				conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ljh","sa","1320217325");
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}	
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;				
	}
	public static void getClose(Connection c){
		if(c!=null){
			try {
				c.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
