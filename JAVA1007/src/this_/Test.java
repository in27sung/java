package this_;

public class Test {

	public static void main(String[] args) {
		
		Account acc = new Account("0101010-01-010101", "황인성", 10000000);
		acc.showAccountInfo();
	}
}

/*
 * Account 클래스 생성
 * - 멤버면수: accountNo, ownerName, balance 선언 (private 접근제한자 사용)
 * 
 * 
*/
class Account{
	// Dlclear member variable 
	private String accountNo;
	private String ownerName;
	private int balance;
	
	// Define constructor 
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}


	// option + shift + s (Generate getter and setter)
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호: " + this.accountNo + "\n" + this.ownerName + "님의 현재 잔고는 " + balance + "입니다." );
		
		
	}
	
}