package UtilDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBC3 {
	public static void main(String[] args) throws SQLException {
	//获取连接
	Connection conn=TestUtil.getConn();
	//使用PreparedStatement对象 使用？作为占位符  通过setXXX(index,value)赋值
	//增加数据
	String sql="insert into stuinfo values(?,?,?)";
	PreparedStatement pst=conn.prepareStatement(sql);
	pst.setInt(1, 3);
	pst.setString(2,"张三");
	pst.setString(3,"男");
	pst.executeUpdate();
	//修改
	String f1="update stuinfo set stuName=? where stuId=?";
	PreparedStatement f2=conn.prepareStatement(f1);
	f2.setString(1,"胡丢丢");
	f2.setInt(2,1003);
	f2.executeUpdate();
	//删除
	String f3="delete from Stuinfo where stuId=? ";
	PreparedStatement f4=conn.prepareStatement(f3);
	f4.setInt(1, 1003);
	f4.executeUpdate();
	//查询
	String f5="select*from stuinfo";
	PreparedStatement f6=conn.prepareStatement(f5);
	ResultSet rs = f6.executeQuery();
     //遍历结果
     while(rs.next()) {
         //假如 Users 表中 有个 stuName 列
         System.out.println("stuName ---"+rs.getString("stuName")+"\t"+"stuId ---"+rs.getString("stuId"));
     }
	}
	
}
