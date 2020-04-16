package Demo1;

public class Account {
	//属性
	long id;
	int password;//密码
	String name;
	long personId;//身份证号码
	String email;
	double balance;//余额
	double money;//存取的金额
	//行为
	public void deposit(){//存款方法
		balance=balance+money;
	}
	public void withdraw(){//取款方法
		balance=balance-money;
	}
	//无参构造器
	public Account(){

	}
	//有参构造器
	public Account(int password,double balance,double money){
		this.password=password;
		this.balance=balance;
		this.money=money;
		
	}
}

