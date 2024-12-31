package class_;

public class Test2 {

	public static void main(String[] args) {
		// Define reference variable(constructor)
		Account person1 = new Account();
		
		person1.accountNum = "111-1111-111";
		person1.ownerName = "홍길동";
		person1.balance = 10000;
		
		person1.showAccountInfo();
		person1.deposit(3000000);
		person1.withdraw(50000);
		person1.withdraw(30000000);
		person1.withdraw(2960000);
	}

}
// Define class
class Account{
	// Declear member variable 
	String accountNum;
	String ownerName;
	int balance;
	
	//Method
	void showAccountInfo() {
		System.out.printf("계좌번호: %s \n", accountNum);
		System.out.printf("예금주명: %s \n", ownerName);
		System.out.printf("현재잔고: %d원 \n", balance);
	}
	void deposit(int amount) {
		System.out.printf("입금하신 금액: %d원 \n", amount);
		balance += amount;
		System.out.printf("입금 후 현재잔고: %d원 \n", balance);
	}
	int withdraw(int amount) {
		if( balance >= amount) {
		System.out.printf("출금 할 금액: %d원 \n", amount);
		balance -= amount;
		System.out.printf("출금 후 현재잔고: %d원 \n", balance);
		}
		else {
			System.out.println("잔고가 부족하여 출금이 불가능합니다.");
			System.out.printf("출금할 금액: %d원, 현재잔고: %d원 \n", amount, balance);
			amount = 0;
		}
		// the amount that withdrawed in the balance
		return amount;
	}
}