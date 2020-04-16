package com.hopu.bms.ui;


import java.sql.SQLException;
import java.util.Scanner;


import com.hopu.bms.Logininfo;
import com.hopu.bms.entiy.Book;
import com.hopu.bms.entiy.Borrow;
import com.hopu.bms.entiy.Login;
import com.hopu.bms.entiy.Reader;

public class LoginUI {
	//注册界面
	public static void loginUI1() throws SQLException{
		System.out.println("欢迎进入注册界面");
		Scanner s=new Scanner(System.in);
		System.out.println("请输入账号");
		String user=s.next();
		System.out.println("请输入密码");
		String pwd=s.next();
		//创建Login对象 存放前台接收数据
		Login lo=new Login();
		lo.setUserName(user);
		lo.setPwd(pwd);
		//将前台的数据封装对象后 传给后台处理
		boolean bn=Logininfo.login(lo);
		//调用方法 判断是否有该账号
		//添加新用户到数据库
		if(bn==true){
			System.out.println("注册失败,该用户已存在,请重新注册");
		}else{
			System.out.println("注册成功");
		}
		}
	//登录界面
	public static void loginUI() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入账号");
		String user=s.next();
		System.out.println("请输入密码");
		String pwd=s.next();
		//创建Login对象 存放前台接收数据
		Login lo=new Login();
		lo.setUserName(user);
		lo.setPwd(pwd);
		//将前台的数据封装对象后 传给后台处理
		boolean bn=Logininfo.login(lo);
		//调用方法 判断是否有该账号
		if(bn==true){
			System.out.println("登录成功");
			//调用方法 进入主菜单
			BookMUI.bookMUI1();
		}else{
			System.out.println("登录失败,返回上一步");
			BookMUI.bookMUI();
		}
	}
	public static void loginUI2() throws SQLException {
		//调用方法 判断是否登录成功
		if(Logininfo.login2()){
			System.out.println("登陆失败");
			//调用方法 进入主菜单
		}else{
			System.out.println("登录成功");
		}
	}
	public static void loginUI2_1() throws SQLException {
		//调用方法 判断是否登录成功
		if(Logininfo.login2_1()){
			System.out.println("登陆失败");
			//调用方法 进入书籍管理
		}else{
			System.out.println("登录成功");
		}
	}
	public static void loginUI2_2() throws SQLException {
		//调用方法 判断是否登录成功
		if(Logininfo.login2_2()){
			System.out.println("登陆失败");
			//调用方法 进入读者管理
		}else{
			System.out.println("登录成功");
		}
	}
	public static void loginUI2_3() throws SQLException {
		//调用方法 判断是否登录成功
		if(Logininfo.login2_3()){
			System.out.println("登陆失败");
			//调用方法 进入书籍借阅
		}else{
			System.out.println("登录成功");
		}
	}	
	//新增书籍信息
	public static void loginUI2_22() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入书籍编号：");
		int bookNo=s.nextInt();
		System.out.println("请输入书籍名称：");
		String bookName=s.next();
		System.out.println("请输入书籍价格：");
		int bookJG=s.nextInt();
		System.out.println("请输入书籍积分：");
		int bookJF=s.nextInt();
		System.out.println("请输入书籍数量：");
		int bookNumber=s.nextInt();
		//创建Book对象 存放前台接收数据
		Book b=new Book(bookNo, bookName, bookJG, bookJF, bookNumber);
		//将前台的数据封装对象后 传给后台处理			
		//添加新书籍到数据库
		if(Logininfo.login2_22(b)){
			System.out.println("书籍已存在,数量增加");
		}else{
			System.out.println("增加书籍信息成功");
		}
		while(true){
			System.out.println("是否选择继续管理读者？"+"请选择(yes/no)");
			Scanner x=new Scanner(System.in);
			if(x.equals("yes")){
				break;
			}else if(x.equals("no")){
				break;
			}else{
				System.out.println("输入有误!");
			}
		}
	}
	//修改书籍信息
	public static void loginUI2_23() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入原书籍编号：");
		int bookNo1=s.nextInt();
		System.out.println("请输入原书籍名称：");
		String bookName1=s.next();
		System.out.println("请输入新书籍编号：");
		int bookNo=s.nextInt();
		System.out.println("请输入新书籍名称：");
		String bookName=s.next();
		System.out.println("请输入新数据价格：");
		int bookJG=s.nextInt();
		System.out.println("请输入新书籍积分：");
		int bookJF=s.nextInt();
		System.out.println("请输入新书籍数量：");
		int bookNumber=s.nextInt();
		//将前台输入的书籍信息 构建成一个对象 
		//创建Book对象 存放前台接收数据
		//要修改的书籍信息
		Book b1=new Book();
		b1.setBookNo(bookNo1);
		b1.setBookName(bookName1);
		//修改后的书籍信息
		Book b2=new Book(bookNo, bookName, bookJG, bookJF, bookNumber);		
		//将存有书籍信息对象传到后台进行处理
		boolean bn=Logininfo.login2_23(b1,b2);
		//判断添加书籍成功还是失败
		if(bn==true){
			System.out.println("修改书籍信息成功");				
		}else{
			System.out.println("修改书籍信息失败,该书籍不存在");
		}
		while(true){
			System.out.println("是否选择继续管理读者？"+"请选择(yes/no)");
			Scanner x=new Scanner(System.in);
			if(x.equals("yes")){
				break;
			}else if(x.equals("no")){
				break;
			}else{
				System.out.println("输入有误!");
			}
		}
	}
	//修删除书籍信息
	public static void loginUI2_24() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入要删除的书籍编号：");
		int bookNo=s.nextInt();
		System.out.println("请输入要删除的书籍名称：");
		String bookName=s.next();
		//创建Book对象 存放前台接收数据
		Book b=new Book();
		b.setBookNo(bookNo);
		b.setBookName(bookName);
		//将前台的数据封装对象后 传给后台处理	
		boolean bn=Logininfo.login2_24(b);
		if(bn==true){
			System.out.println("删除书籍信息成功");
		}else{
			System.out.println("删除书籍信息失败 ,该书籍不存在");
		}
		while(true){
			System.out.println("是否选择继续管理读者？"+"请选择(yes/no)");
			Scanner x=new Scanner(System.in);
			if(x.equals("yes")){
				break;
			}else if(x.equals("no")){
				break;
			}else{
				System.out.println("输入有误!");
			}
		}
	}
	//新增读者信息
	public static void loginUI2_32() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入读者编号：");
		int ReaderNo=s.nextInt();
		System.out.println("请输入读者名称：");
		String ReaderName=s.next();
		System.out.println("请输入读者积分：");
		int ReaderJF=s.nextInt();
		System.out.println("请输入读者借阅书籍数量：");
		int ReaderNumber=s.nextInt();
		//创建Reader对象 存放前台接收数据
		Reader r=new Reader(ReaderNo,ReaderName , ReaderJF, ReaderNumber);
		//将前台的数据封装对象后 传给后台处理			
		//添加新书籍到数据库
		if(Logininfo.login2_32(r)){
			System.out.println("添加失败，读者已存在");
		}else{
			System.out.println("增加读者信息成功");
		}
		while(true){
			System.out.println("是否选择继续管理读者？"+"请选择(yes/no)");
			Scanner x=new Scanner(System.in);
			if(x.equals("yes")){
				break;
			}else if(x.equals("no")){
				break;
			}else{
				System.out.println("输入有误!");
			}
		}
	}
	//修改读者信息
	public static void loginUI2_33() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入原读者编号：");
		int readerNo1=s.nextInt();
		System.out.println("请输入原读者名称：");
		String readerName1=s.next();
		System.out.println("请输入新读者编号：");
		int readerNo=s.nextInt();
		System.out.println("请输入新读者名称：");
		String readerName=s.next();		
		System.out.println("请输入新读者积分：");
		int readerJF=s.nextInt();
		System.out.println("请输入新读者借阅书籍数量：");
		int readerNumber=s.nextInt();
		//将前台输入的书籍信息 构建成一个对象 
		//创建Reader对象 存放前台接收数据
		//要修改的书籍信息
		Reader r1=new Reader();
		r1.setReaderNo(readerNo1);
		r1.setReaderName(readerName1);
		//修改后的书籍信息
		Reader r2=new Reader(readerNo, readerName, readerJF, readerNumber);		
		//将存有书籍信息对象传到后台进行处理
		boolean bn=Logininfo.login2_33(r1,r2);
		//判断添加书籍成功还是失败
		if(bn==true){
			System.out.println("修改读者信息成功");				
		}else{
			System.out.println("修改读者信息失败,该读者不存在");
		}
		while(true){
			System.out.println("是否选择继续管理读者？"+"请选择(yes/no)");
			Scanner x=new Scanner(System.in);
			if(x.equals("yes")){
				break;
			}else if(x.equals("no")){
				break;
			}else{
				System.out.println("输入有误!");
			}
		}
	}
	//修删除读者信息
	public static void loginUI2_34() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入要删除的读者编号：");
		int ReaderNo=s.nextInt();
		System.out.println("请输入要删除的读者名称：");
		String ReaderName=s.next();
		//创建Reader对象 存放前台接收数据
		Reader r=new Reader();
		r.setReaderNo(ReaderNo);
		r.setReaderName(ReaderName);
		//将前台的数据封装对象后 传给后台处理	
		boolean bn=Logininfo.login2_34(r);
		if(bn==true){
			System.out.println("删除读者信息成功");
		}else{
			System.out.println("删除读者信息失败 ,该书籍不存在");
		}
		while(true){
		System.out.println("是否选择继续管理读者？"+"请选择(yes/no)");
		Scanner x=new Scanner(System.in);
		if(x.equals("yes")){
			break;
		}else if(x.equals("no")){
			break;
		}else{
			System.out.println("输入有误!");
		}
		}
	}
	public static void loginUI2_41() throws SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("请输入读者编号：");
		int ReaderNo=s.nextInt();
		System.out.println("请输入该读者的书籍编号：");
		int BookNo=s.nextInt();
		System.out.println("请输入要借阅的书籍数量：");
		int BookNumber=s.nextInt();
		//创建对象 存放前台接收数据
//		Reader r=new Reader();
//		r.setReaderNo(ReaderNo);
//		Book b=new Book();
//		b.setBookNumber(BookNumber);
//		b.setBookNo(BookNo);
		Borrow bo=new Borrow(ReaderNo, BookNo,BookNumber);
		
		//将存有借阅信息对象传到后台进行处理
		boolean bn=Logininfo.login2_41(bo);
		if(bn==true){
			System.out.println("修改成功");
		}else{
			System.out.println("修改失败");
		}
	}
	public static void loginUI2_42() throws SQLException{
		System.out.println("查看书籍借阅信息");
		Logininfo.login2_42();		
	}
}
