package constructor;

public class Test {

	public static void main(String[] args) {
	
		Account acc = new Account();
		
		acc.showAccountInfo();
		
	}// main
}// class test 

// Class of Account
class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	// Define constructor 
	public Account() {
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 10000;
	}
	// Define account information method 
	public void showAccountInfo() {
		System.out.printf("%s 님 \n", ownerName);
		System.out.printf("계좌번호: %s \n", accountNo);
		System.out.printf("현재잔고: %d \n", balance);
	}
}