package Demo1;


public class Account1 {
	public static void main(String[] args) {
		Account a=new Account(123456,12500.00,1000.00);
		  a.deposit();
		System.out.println(a.balance);
		a.withdraw();
		System.out.println(a.balance);
	
	}
}
