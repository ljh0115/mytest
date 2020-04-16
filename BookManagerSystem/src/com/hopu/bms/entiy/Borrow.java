package com.hopu.bms.entiy;

public class Borrow {
	private int ReaderNo;//读者编号
	private int BookNo;//书籍编号
	private int BorrowNumber;//借阅数量
	private String BorrowTime;//借阅时间
	public int getReaderNo() {
		return ReaderNo;
	}
	public void setReaderNo(int readerNo) {
		ReaderNo = readerNo;
	}
	public int getBookNo() {
		return BookNo;
	}
	public void setBookNo(int bookNo) {
		BookNo = bookNo;
	}
	public int getBorrowNumber() {
		return BorrowNumber;
	}
	public void setBorrowNumber(int borrowNumber) {
		BorrowNumber = borrowNumber;
	}
	public String getBorrowTime() {
		return BorrowTime;
	}
	public void setBorrowTime(String borrowTime) {
		BorrowTime = borrowTime;
	}
	public Borrow(){
		
	}
	
	public Borrow(int readerNo, int bookNo, int borrowNumber) {
		super();
		ReaderNo = readerNo;
		BookNo = bookNo;
		BorrowNumber = borrowNumber;
	}
	public Borrow(int readerNo, int bookNo, int borrowNumber, String borrowTime) {
		super();
		ReaderNo = readerNo;
		BookNo = bookNo;
		BorrowNumber = borrowNumber;
		BorrowTime = borrowTime;
	}
	@Override
	public String toString() {
		return	"读者编号：\t" + ReaderNo + "\t书籍编号：" + BookNo + "\t书籍数量：\t" + BorrowNumber
				+ "\t借阅时间：\t" + BorrowTime ;
	}
	
}
