package com.hopu.bms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


import com.hopu.bms.entiy.Book;
import com.hopu.bms.entiy.Borrow;
import com.hopu.bms.entiy.Login;
import com.hopu.bms.entiy.Reader;
import com.hopu.bms.ui.BookMUI;
import com.hopu.bms.ui.LoginUI;
import com.hopu.bms.util.JDBCUtil;

//管理员信息逻辑处理
public class Logininfo {
	//注册用户
	public static boolean login1(Login a) throws SQLException {
		//假设没有该用户存在
		boolean bn=false;
		Connection conn=JDBCUtil.getConn();
		//查询是否有该用户
		String sql="select*from Logininfo";
		PreparedStatement pst=conn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			//输入的账号密码和数据库中账号密码比较
			boolean b1=rs.getString(1).equals(a.getUserName());
			boolean b2=rs.getString(2).equals(a.getPwd());
			//账号密码同时相等时 登入成功
			if(b1==true&&b2==true){
				bn=true;
			}else{
				//如果用户不存在 创建用户
				Login lo1=new Login();
				Connection conn1=JDBCUtil.getConn();
				String sql1="insert into Logininfo values(?,?)";//创建语句
				PreparedStatement pst1=conn1.prepareStatement(sql1);
				pst1.setString(1,lo1.getUserName());
				pst1.setString(2,lo1.getPwd());
				pst1.executeUpdate();
			}
		}
		return bn;
	}
	//登录 传进管理员输入的账号和密码
	public static boolean login(Login a) throws SQLException {
		//假设登录失败
		boolean bn=false;
		//连接数据库
		Connection conn=JDBCUtil.getConn();
		//查询是否有该用户
		String sql="select*from Logininfo";
		PreparedStatement pst=conn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			//输入的账号密码和数据库中账号密码比较
			boolean b1=rs.getString(1).equals(a.getUserName());
			boolean b2=rs.getString(2).equals(a.getPwd());
			//账号密码同时相等时 登入成功
			if(b1==true&&b2==true){
				bn=true;//登录成功
			break;
			}
		}
		return bn;
	}
	//主菜单
	public static boolean login2() throws SQLException {
		BookMUI.bookMUI1();
		return false;
	}
	//进入书籍管理
	public static boolean login2_1() throws SQLException {
		BookMUI.bookMUI2();
		return false;
	}
	//进入读者管理
	public static boolean login2_2() throws SQLException {
		BookMUI.bookMUI3();
		return false;
	}
	//进入书籍借阅
	public static boolean login2_3() throws SQLException {
		BookMUI.bookMUI4();
		return false;
	}
	//查询书籍
	public static void login2_21() throws SQLException {
		Connection conn=null;
		try {
			conn=JDBCUtil.getConn();
			//声明变量 存放SQL语句
			String s="select * from Logbook";
			//将SQL发送数据库中
			PreparedStatement pst=conn.prepareStatement(s);
			//执行SQL语句
			ResultSet rs=pst.executeQuery();
			//创建list存储数据库中所有书籍信息 一条记录对应一本书对象
			ArrayList<Book> list=new ArrayList<Book>();
			//判断结果集中下一行是否有有效行 默认指向第0行
			while(rs.next()){
				Book bok=new Book();
				bok.setBookNo(rs.getInt(1));
				bok.setBookName(rs.getString(2));
				bok.setBookJG(rs.getInt(3));
				bok.setBookJF(rs.getInt(4));
				bok.setBookNumber(rs.getInt(5));
				list.add(bok);
			}
			//集合遍历
			for (Book book : list) {
				System.out.println(book);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Scanner s=new Scanner(System.in);
		System.out.println("是否选择继续管理书籍？"+"请选择(yes/no)");
		String x="yes";
		String y="no";
		String z=s.next();
		//equals是等于的意思
		if(z.equals(x)){
			LoginUI.loginUI2_1();
		}else if(z.equals(y)){
			LoginUI.loginUI();
			LoginUI.loginUI2();
		}else{
			System.out.println("请重新选择");
		}
	}
	//新增书籍
	public static boolean login2_22(Book b) throws SQLException {
		boolean bn=false;
		Connection conn=null;
		try {
			conn=JDBCUtil.getConn();
			//声明变量 存放SQL语句
			String st="select * from Logbook where BookName=?";
			//将SQL发送数据库中
			PreparedStatement pst=conn.prepareStatement(st);
			 pst.setString(1, b.getBookName());
			//执行SQL语句
			ResultSet rs=pst.executeQuery();
			//判断结果集中下一行是否有有效行 默认指向第0行
			if(rs.next()){
				String sql="update Logbook set BookNumber=BookNumber+? where BookName=?";
				PreparedStatement pst1=conn.prepareStatement(sql);
				pst1.setInt(1, b.getBookNumber());
				pst1.setString(2, b.getBookName());
				pst1.executeUpdate();
					bn=true;
			}else{
				Connection conn1=JDBCUtil.getConn();
				String sql1="insert into Logbook values(?,?,?,?,?)";//创建语句
				PreparedStatement pst2=conn1.prepareStatement(sql1);
				pst2.setInt(1,b.getBookNo());
				pst2.setString(2,b.getBookName());
				pst2.setInt(3,b.getBookJG());
				pst2.setInt(4,b.getBookJF());
				pst2.setInt(5,b.getBookNumber());
				pst2.executeUpdate();
				}			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return bn;
	}
	//修改书籍信息
	public static boolean login2_23(Book b1,Book b2) throws SQLException {
		//假设修改失败
		boolean bn=false;
		Connection conn=null;
		conn=JDBCUtil.getConn();
		//创建String类型变量  声明变量 存放SQL语句  表示查询表中指定名称书籍
		String st="select * from Logbook where BookNo=? and BookName=?";
		//将SQL发送数据库中
		PreparedStatement pst;
		try {
			pst=conn.prepareStatement(st);
			//给占位符赋值
			pst.setInt(1,b1.getBookNo());
			pst.setString(2,b1.getBookName());
		//执行SQL语句 得到满足SQL语句数据 存在结果集中
		ResultSet rs=pst.executeQuery();
		//判断结果集中下一行是否有有效行 默认指向第0行 结果集中是否有记录		
		if(rs.next()){
			String sql="update Logbook set BookName=?,BookJG=?,BookJF=?,BookNumber=? where BookNo=?";
			PreparedStatement pst1=conn.prepareStatement(sql);
			pst1.setString(1,b2.getBookName());
			pst1.setInt(2, b2.getBookJG());
			pst1.setInt(3, b2.getBookJF());
			pst1.setInt(4, b2.getBookNumber());				
			pst1.setInt(5, b1.getBookNo());
			pst1.executeUpdate();
			//表示要修改的书籍已经存在
			bn=true;	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			return bn;
	}
	//删除书籍信息
	public static  boolean login2_24(Book b) throws SQLException {
		boolean bn=false;
		Connection conn=null;
		try {
			conn=JDBCUtil.getConn();
			//将自动提交事物关闭
			conn.setAutoCommit(false);
			//声明变量 存放SQL语句
			String st="select * from Logbook where BookNo=? and BookName=?";
			//将SQL发送数据库中
			PreparedStatement pst=conn.prepareStatement(st);
			pst.setInt(1, b.getBookNo());
			pst.setString(2, b.getBookName());
			//执行SQL语句
			ResultSet rs=pst.executeQuery();
			//判断结果集中下一行是否有有效行 默认指向第0行
			if(rs.next()){
				String sql="delete from Logbook where BookNo=? and BookName=?";
				PreparedStatement pst1=conn.prepareStatement(sql);
				pst1.setInt(1, b.getBookNo());
				pst1.setString(2, b.getBookName());	
				pst1.executeUpdate();
				bn=true;
			}
			//手动提交事物
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();//回滚
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			// TODO: handle exception
			e.printStackTrace();
		}
		return bn;
	}
	//查询读者信息
	public static void login2_31() throws SQLException {
		Connection conn=null;
		try {
			conn=JDBCUtil.getConn();
			//声明变量 存放SQL语句
			String s="select * from Logreader";
			//将SQL发送数据库中
			PreparedStatement pst=conn.prepareStatement(s);
			//执行SQL语句
			ResultSet rs=pst.executeQuery();
			//创建list存储数据库中所有读者信息 一条记录对应一个读者对象
			ArrayList<Reader> list=new ArrayList<Reader>();
			//判断结果集中下一行是否有有效行 默认指向第0行
			while(rs.next()){
				Reader read=new Reader();
				read.setReaderNo(rs.getInt(1));
				read.setReaderName(rs.getString(2));
				read.setReaderJF(rs.getInt(3));
				read.setReaderNumber(rs.getInt(4));
				list.add(read);
			}
			//集合遍历
			for (Reader read : list) {
				System.out.println(read);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Scanner s=new Scanner(System.in);
		System.out.println("是否选择继续管理读者？"+"请选择(yes/no)");
		String x="yes";
		String y="no";
		String z=s.next();
		//equals是等于的意思
		if(z.equals(x)){
			LoginUI.loginUI2_2();
		}else if(z.equals(y)){
			LoginUI.loginUI();
			LoginUI.loginUI2();
		}else{
			System.out.println("请重新选择");
		}
	}
	//新增读者信息
	public static boolean login2_32(Reader r) throws SQLException {
		boolean bn=false;
		Connection conn=null;
		try {
			conn=JDBCUtil.getConn();
			//声明变量 存放SQL语句
			String st="select * from Logreader where ReaderName=?";
			//将SQL发送数据库中
			PreparedStatement pst=conn.prepareStatement(st);
			 pst.setString(1, r.getReaderName());
			//执行SQL语句
			ResultSet rs=pst.executeQuery();
			//判断结果集中下一行是否有有效行 默认指向第0行
			if(rs.next()){
					bn=true;
			}else{
				Connection conn1=JDBCUtil.getConn();
				String sql1="insert into Logreader values(?,?,?,?)";//创建语句
				PreparedStatement pst2=conn1.prepareStatement(sql1);
				pst2.setInt(1,r.getReaderNo());
				pst2.setString(2,r.getReaderName());				
				pst2.setInt(3,r.getReaderJF());
				pst2.setInt(4,r.getReaderNumber());
				pst2.executeUpdate();
				}			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return bn;
	}
	//修改读者信息
	public static boolean login2_33(Reader r1,Reader r2) throws SQLException {
		//假设修改失败
		boolean bn=false;
		Connection conn=null;
		conn=JDBCUtil.getConn();
		//创建String类型变量  声明变量 存放SQL语句  表示查询表中指定读者名
		String st="select * from Logreader where ReaderNo=? and ReaderName=?";
		//将SQL发送数据库中
		PreparedStatement pst;
		try {
			pst=conn.prepareStatement(st);
			//给占位符赋值
			pst.setInt(1,r1.getReaderNo());
			pst.setString(2,r1.getReaderName());
		//执行SQL语句 得到满足SQL语句数据 存在结果集中
		ResultSet rs=pst.executeQuery();
		//判断结果集中下一行是否有有效行 默认指向第0行 结果集中是否有记录		
		if(rs.next()){
			String sql="update Logreader set ReaderName=?,ReaderJF=?,ReaderNumber=? where ReaderNo=?";
			PreparedStatement pst1=conn.prepareStatement(sql);
			pst1.setString(1,r2.getReaderName());
			pst1.setInt(2, r2.getReaderJF());
			pst1.setInt(3, r2.getReaderNumber());
			pst1.setInt(4, r1.getReaderNo());				
			pst1.executeUpdate();
			//表示要修改的读者已经存在
			bn=true;	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
			return bn;
	}
	//删除读者信息
	public static  boolean login2_34(Reader r) throws SQLException {
		boolean bn=false;
		Connection conn=null;
		try {
			conn=JDBCUtil.getConn();
			//将自动提交事物关闭
			conn.setAutoCommit(false);
			//声明变量 存放SQL语句
			String st="select * from Logreader where ReaderNo=? and ReaderName=?";
			//将SQL发送数据库中
			PreparedStatement pst=conn.prepareStatement(st);
			pst.setInt(1, r.getReaderNo());
			pst.setString(2, r.getReaderName());
			//执行SQL语句
			ResultSet rs=pst.executeQuery();
			//判断结果集中下一行是否有有效行 默认指向第0行
			if(rs.next()){
				String sql="delete from Logreader where ReaderNo=? and ReaderName=?";
				PreparedStatement pst1=conn.prepareStatement(sql);
				pst1.setInt(1, r.getReaderNo());
				pst1.setString(2, r.getReaderName());	
				pst1.executeUpdate();
				bn=true;
			}
			//手动提交事物
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();//回滚
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			// TODO: handle exception
			e.printStackTrace();
		}
		return bn;
	}
	//书籍借阅
	public static  boolean login2_41(Borrow bo) throws SQLException {
		//假设失败
		boolean bn=false;
		Connection conn=null;
		try {
		conn=JDBCUtil.getConn();
		String sql1="select BookNo from Logbook where BookNo=?";//查询书籍表中的图书数据
		String sql2="update Logbook set BookNumber=BookNumber-? where BookNo=?";//如果借走一 本书那么就在你借的那本书上面减一
		PreparedStatement pst1=conn.prepareStatement(sql1);	
		PreparedStatement pst2=conn.prepareStatement(sql2);	
		pst1.setInt(1, bo.getBookNo());
		//执行SQL语句
		ResultSet rs=pst1.executeQuery();
		if(rs.next()){
			String sql3="select ReaderNo from Logreader where ReaderNo=?";//读者
			String sql4="update Logreader set ReaderNumber=ReaderNumber+? where ReaderNo=?";
			PreparedStatement pst3=conn.prepareStatement(sql3);
			PreparedStatement pst4=conn.prepareStatement(sql4); 
			pst3.setInt(1,bo.getReaderNo());
			ResultSet rs2=pst3.executeQuery();			
			if (rs2.next()){					
				if(bo.getBorrowNumber()<0){
				String sql5="select *from Logbook where BookNo=?";//1 査旬并判断书籍表中某本书的数量有多少
				PreparedStatement pst5=conn.prepareStatement(sql5);
				pst5.setInt(1,bo.getBookNo());
				ResultSet rs5=pst5.executeQuery();
				rs5.next();
				if(bo.getBorrowNumber()>5){
					pst4.setInt(1, bo.getBorrowNumber());
					pst4.setInt(2, bo.getReaderNo());
					pst4.executeUpdate();
					pst2.setInt(1, bo.getBorrowNumber());
					pst2.setInt(2, bo.getBookNo());
					pst2.executeUpdate();
					String sql="insert into Logborrow values(?,?,?,getdate())";
					PreparedStatement pst=conn.prepareStatement(sql);	
					pst.setInt(1, bo.getReaderNo());
					pst.setInt(2, bo.getBookNo());
					pst.setInt(3, bo.getBorrowNumber());
					pst.executeUpdate();
					bn=true;}
				else{//自定义异常
					throw new AmountLT2Exception();
				}
				}else{
					throw new AmountLT0Exception();
				}
				}else{
					throw new AmountLTException();
				}
				}else{
					throw new AmountLT1Exception();
				}				
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}					
		return bn;	
	}
	
	
	//借阅记录
	public static  boolean login2_42() throws SQLException {
		//假设失败
		Connection con = null;
		con = JDBCUtil.getConn();
		Scanner scanner = new Scanner(System.in);
		try 
		{
			String s1 = "select * from Logborrow";
			PreparedStatement x1;
			x1 = con.prepareStatement(s1);
			ResultSet rs = x1.executeQuery();
			
			ArrayList<Borrow> list=new ArrayList<Borrow>();
			while(rs.next())
			{
				Borrow bo = new Borrow();
				bo.setReaderNo(rs.getInt(1));
				bo.setBookNo(rs.getInt(2));
				bo.setBorrowNumber(rs.getInt(3));
				bo.setBorrowTime(rs.getString(4));
				list.add(bo);
			}			
			for (Borrow x : list)
			{
				System.out.println(x);
			}			
			while(true){
				System.out.println("是否继续管理书籍?(yes/no)");
				String x=scanner.next();
				if(x.equals("yes")){
					break;
				}else if(x.equals("no")){
					break;
				}else{
					System.out.println("输入有误!");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
	class AmountLT2Exception extends RuntimeException{
		public AmountLT2Exception(){
			super("所借书籍数量负数异常");	
		}
	}
	class AmountLT0Exception extends RuntimeException{
		public AmountLT0Exception(){
			super("所借书籍数量过多异常");	
		}
	}
	class AmountLTException extends RuntimeException{
		public AmountLTException(){
			super("读者编号不存在");	
		}
	}
	class AmountLT1Exception extends RuntimeException{
		public AmountLT1Exception(){
			super("书籍编号不存在");	
		}
	}

