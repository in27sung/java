package inheritance;

public class Test {

	public static void main(String[] args) {

		ItwillBank itBank = new ItwillBank();
		
		itBank.accountNo = "111-1111-111";
		itBank.ownerName = "황인성";
		itBank.balance = 10000;
		itBank.insureName = "DB손해";
		
		itBank.deposit(10000);
		itBank.deposit(10000);
		itBank.deposit(10000);
		
		itBank.withdraw(1000000);
		itBank.withdraw(500);
		
		itBank.showAccountInfo();
		
		itBank.contract();
		
	}

}

// 

class Account { // = class Account extends Object
	String accountNo;
	String ownerName;
	int balance;
	
	public void deposit(int money) {
		this.balance += money;
		System.out.println("입금금액: " + money);
	}
	public void withdraw(int money) {
		if(balance >= money) {
		this.balance -= money;
		System.out.println("출금액: " + money);
		} else {
			System.out.println("현재잔고가 부족합니다.("+money+"원 출금실패)");
		}
	}
	public void showAccountInfo() {
		System.out.println("입금자명: " + ownerName);
		System.out.println("계좌번호: " + accountNo);
		System.out.println("현재잔고: " + balance);
	}
}

class ItwillBank extends Account{
	String insureName;
	
	public void contract() {
		System.out.println(insureName + " 보험 계약 완료");
	}
}