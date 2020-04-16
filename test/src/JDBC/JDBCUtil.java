package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {

	//获取连接
	public static Connection getConn(){
		Connection conn=null;
		try {
			//加载驱动类
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//创建连接
			conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TestJdbc","sa","1320217325");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//关闭资源
	public static void getClose(Connection c){
		
		if(c!=null){
			try {
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
