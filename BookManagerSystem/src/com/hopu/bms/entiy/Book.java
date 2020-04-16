package com.hopu.bms.entiy;

public class Book {
	private int BookNo;//书籍编号
	private String BookName;//书籍名称
	private int BookJG;//书籍价格
	private int BookJF;//书籍积分
	private int BookNumber;//书籍数量
	public int getBookNo() {
		return BookNo;
	}
	public void setBookNo(int bookNo) {
		BookNo = bookNo;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getBookJG() {
		return BookJG;
	}
	public void setBookJG(int bookJG) {
		BookJG = bookJG;
	}
	public int getBookJF() {
		return BookJF;
	}
	public void setBookJF(int bookJF) {
		BookJF = bookJF;
	}
	public int getBookNumber() {
		return BookNumber;
	}
	public void setBookNumber(int bookNumber) {
		BookNumber = bookNumber;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int bookNo, String bookName, int bookJG, int bookJF,
			int bookNumber) {
		super();
		BookNo = bookNo;
		BookName = bookName;
		BookJG = bookJG;
		BookJF = bookJF;
		BookNumber = bookNumber;
	}

	@Override
	public String toString() {
		return "书籍编号："+BookNo+"\t"+" 书籍名称："+BookName+"\t"+" 书籍价格："+BookJG+"\t"+"书籍积分："+"\t"+BookJF+"\t"+" 书籍数量："+BookNumber;
	}
}
