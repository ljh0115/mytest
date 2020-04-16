package com.hopu.bms;

import java.sql.SQLException;

import com.hopu.bms.ui.BookMUI;

public class BookStsart {
	public static void main(String[] args) throws SQLException {
	System.out.println("欢迎进入三毛书屋图书管理系统");
	//调用方法进入主界面
	BookMUI.bookMUI();
	}
}
