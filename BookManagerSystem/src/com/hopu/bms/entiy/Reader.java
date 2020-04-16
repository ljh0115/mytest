package com.hopu.bms.entiy;

public class Reader {
	private int ReaderNo;//读者编号
	private String ReaderName;//读者姓名
	private int ReaderJF;//读者积分
	private int ReaderNumber;//读者借阅书籍数量
	public int getReaderNo() {
		return ReaderNo;
	}
	public void setReaderNo(int readerNo) {
		ReaderNo = readerNo;
	}
	public String getReaderName() {
		return ReaderName;
	}
	public void setReaderName(String readerName) {
		ReaderName = readerName;
	}
	public int getReaderJF() {
		return ReaderJF;
	}
	public void setReaderJF(int readerJF) {
		ReaderJF = readerJF;
	}
	public int getReaderNumber() {
		return ReaderNumber;
	}
	public void setReaderNumber(int readerNumber) {
		ReaderNumber = readerNumber;
	}
	public  Reader(){
		
	}	
	public Reader(int readerNo, String readerName, int readerJF,
			int readerNumber) {
		super();
		ReaderNo = readerNo;
		ReaderName = readerName;
		ReaderJF = readerJF;
		ReaderNumber = readerNumber;
	}
	@Override
	public String toString() {
		return "读者编号："+ReaderNo+"\t"+"读者名称："+ReaderName+"\t"+"读者积分："+"\t"+ReaderJF+"\t"+"读者借阅书籍数量："+ReaderNumber;
	}
}
