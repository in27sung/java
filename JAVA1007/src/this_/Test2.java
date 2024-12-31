package this_;

public class Test2 {

	public static void main(String[] args) {
		
		Account2 acc = new Account2();
		
		acc.showAccountInfo();
		
		Account2 acc2 = new Account2("222-2222-222");
		
		acc2.showAccountInfo();
		
	}// main()

}// class Test2 

/*
 * Account2 클래스 생성 
 * - 멤버변수: accountNo, ownerName, balance 선언 
 * 
*/
class Account2{
	String accountNo;
	String ownerName;
	int balance;
	static int age;
	
	public Account2() {
		this("111-1111-111", "홍길동", 0);
	}

	public Account2(String accountNo) {
		this(accountNo,"홍길동", 0);
		//this.accountNo = accountNo;
	}

	public Account2(String accountNo, String ownerName) {
		this(accountNo, ownerName, 0);
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
	}

	public Account2(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("예금주명: " + ownerName);
		System.out.println("현재잔고: " + balance);
	}
}
