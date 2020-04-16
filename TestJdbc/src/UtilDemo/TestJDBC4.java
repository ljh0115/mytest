package UtilDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestJDBC4 {
	public static void main(String[] args) throws SQLException {
		//获取连接
		Connection conn=TestUtil.getConn();
		//模拟登入
		Scanner s=new Scanner(System.in);
		System.err.println("请输入账号：");
		String user=s.next();
		System.out.println("请输入密码：");
		String pwd=s.next();
		String sql="select*from Users where user_name=? and user_pwd=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,user);
		ps.setString(2,pwd);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			System.out.println("登陆成功");
		}else{
			System.out.println("登陆失败");
		}
	}
}
