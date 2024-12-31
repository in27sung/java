package constructor;

public class Test2 {
	
	public static void main(String[] args) {
		
		
		
		String accNum = "111-1111-111";
		String name="황인성";
		long money = 1000000000000L;
		
		// Create class Account2 instance 
		Account2 acc1 = new Account2(accNum, name, money);
		acc1.showAccountInfo();
		
		System.out.println("----------------------------------------");
		
		Account2 acc2 = new Account2("999-9999-999");
		
		acc2.showAccountInfo();
		
		System.out.println("----------------------------------------");
		
		Account2 acc3 = new Account2("999-9999-999", "이순신");
		
		acc3.showAccountInfo();
		
		System.out.println("----------------------------------------");

		Account2 acc4 = new Account2("999-9999-999", "이순신", money);
		
		acc3.showAccountInfo();

	}// main

}// class Test2

//Define class Account2
class Account2{
	String accNo;
	String accName;
	long balance;
	
	// Default constructor 
	public Account2() {
		super();
		accNo = "111-1111-111";
		accName = "홍길동";
		balance = 100000000000L;
	}
	
	// parameterised contructor Account2(String)
	public Account2(String accNo) {
		super();
		this.accNo = accNo;
		accName = "홍길동";
		balance = 100000000000L;
	}
	
	


	public Account2(String accNo, String accName) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		balance = 100000000000L;
	}

	//Define parameterised constructor (String, String, long)
	public Account2(String accNo, String accName, long balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	
	// Define Method
	public void showAccountInfo() {
		System.out.println("계좌번호: " + accNo);
		System.out.println("예금주명: " + accName + "님");
		System.out.println("현재잔고: " + balance + "원");
	}
}

