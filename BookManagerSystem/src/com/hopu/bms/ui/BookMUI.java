package com.hopu.bms.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.hopu.bms.Logininfo;
	
public class BookMUI {
	//图书管理系统主界面
	public static void bookMUI() throws SQLException {
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("****************三毛书屋图书管理系统******************");
			System.out.println("1.注册");
			System.out.println("2.登录");
			System.out.println("3.退出系统");
			int i=s.nextInt();
			if(i==1){
				//进入注册界面
			LoginUI.loginUI1();	
			}else if(i==2){
				//进入登录界面
			LoginUI.loginUI();
			LoginUI.loginUI2();
			}else if(i==3){
				//退出系统
				System.out.println("拜拜了您嘞");
				break;
			}else{
				System.out.println("操作有误，请重新操作");
			}
		}
	}	
		public static void bookMUI1() throws SQLException {
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("****************欢迎进入主菜单******************");
			System.out.println("1.书籍管理");
			System.out.println("2.读者管理");
			System.out.println("3.书籍借阅");
			System.out.println("4.退出系统");
			int i=s.nextInt();
			if(i==1){
				//进入书籍管理界面
			LoginUI.loginUI2_1();	
			}else if(i==2){
				//进入读者管理界面
			LoginUI.loginUI2_2();
			}else if(i==3){
				//进入书籍借阅界面
			LoginUI.loginUI2_3();
			}
			else if(i==4){
				//退出系统
				System.out.println("拜拜了您嘞");
				break;
			}else{
				System.out.println("操作有误，请重新操作");
			}
		}	
	}
	public static void bookMUI2() throws SQLException {
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("****************欢迎进入书籍管理*****************");
			System.out.println("1.查看书籍信息");
			System.out.println("2.新增书籍信息");
			System.out.println("3.修改书籍信息");
			System.out.println("4.删除书籍信息");
			System.out.println("5.返回主菜单");
			int i=s.nextInt();
			if(i==1){
				//进入查看书籍信息 
			Logininfo.login2_21();	
			}else if(i==2){
				//进入 新增书籍信息
			LoginUI.loginUI2_22();
			}else if(i==3){
				//进入 修改书籍信息
			LoginUI.loginUI2_23();
			}else if(i==4){
				//进入 修改书籍信息
			LoginUI.loginUI2_24();
			}else if(i==5){
				//返回主菜单
				System.out.println("返回主菜单");
				break;
			}else{
				System.out.println("操作有误，请重新操作");
			}
		}	
	}
	public static void bookMUI3() throws SQLException {
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("****************欢迎进入读者管理*****************");
			System.out.println("1.查看读者信息");
			System.out.println("2.新增读者信息");
			System.out.println("3.修改读者信息");
			System.out.println("4.删除读者信息");
			System.out.println("5.返回主菜单");
			int i=s.nextInt();
			if(i==1){
				//进入查看读者信息 
			Logininfo.login2_31();
			}else if(i==2){
				//进入 新增读者信息
			LoginUI.loginUI2_32();	
			}else if(i==3){
				//进入 修改读者信息
			LoginUI.loginUI2_33();
			}else if(i==4){
				//进入 修改读者信息
			LoginUI.loginUI2_34();
			}else if(i==5){
				//返回主菜单
				System.out.println("返回主菜单");
				break;
			}else{
				System.out.println("操作有误，请重新操作");
			}
		}	
	}
	public static void bookMUI4() throws SQLException {
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.println("****************欢迎进入书籍借阅*****************");
			System.out.println("1.书籍借阅");
			System.out.println("2.查询书籍借阅记录");
			System.out.println("3.返回主菜单");
			int i=s.nextInt();
			if(i==1){
				//进入书籍借阅功能
			LoginUI.loginUI2_41();
			}else if(i==2){
				//进入查询书籍借阅记录
			LoginUI.loginUI2_42();
			}else if(i==5){
				//返回主菜单
				System.out.println("返回主菜单");
				break;
			}else{
				System.out.println("操作有误，请重新操作");
			}
		}	
	}
}
