package UtilDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC2 {
	public static void main(String[] args) {
		//获取连接
		Connection conn=null;
		try {
			conn=TestUtil.getConn();
			System.out.println("连接成功");
			//创建Statement对象
			Statement st=conn.prepareStatement(null);
			String sql="select*from TestJdbc";
			ResultSet rs=st.executeQuery(sql);
			/*
			 * 	ResultSet 执行查询语句后 得到结果集
			 * 	常用方法：next()
			 *  1.将光标执行下一行  默认指向的是第一行之前
			 *  2.如果光标执行是有效行 返回true 否则返回false
			 */
			while(rs.next()){
				//使用getXXX(第几列)或getXXX("列名")
				System.out.println(rs.getInt(1)+"\t"+rs.getString("stuName")+"\t"+rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			//关闭资源
			TestUtil.getClose(conn);
		}
	}
}
