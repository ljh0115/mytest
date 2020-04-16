--管理员登录账号密码
create table Logininfo(
	uesrname varchar(20),
	pwd varchar(20)
)
--书籍表
create table Logbook(
	BookNo int,
	BookName varchar(20),
	BookJG int,
	BookJF int,
	BookNumber int
)
--读者表
create table Logreader(
	ReaderNo int,
	ReaderName varchar(20),
	ReaderJF int,
	ReaderNumber int
)
--借阅表
create table Logborrow(
	ReaderNo int,
	BookNo int,
	BorrowNumber int,
	BorrowTime varchar(20)
)