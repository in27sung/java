package static_memebr;

public class Test4 {

	public static void main(String[] args) {
		
//		Account acc2 = new Account();
		//The constructor Account() is not visible
		
		// 생성된 유일한 인스턴스 주소를 리턴 
		Account acc = Account.getInstance();
		
		// Setter() 호출하여 111-1111-111, 홍길동, 금액 입력
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("인성");
		acc.setBalance(1000000);
		
		acc.showAccountInfo();
	}

}


// Account 클래스를 싱글톤 디자인 패턴을 적용하여 설계
class Account{
	// ================ Account 클래스에 대한 싱글톤 패턴 구현 ==============
	
	// 1. 자신의 인스턴스를 생성하여 자신의 클래스 타입 변수 instance 저장 
	// -> private static 선언 
	private static Account instance = new Account();
	
	// 2. 기본생성자 정의 -> private 선언 
	private Account() {}  
	
	// 3. Getter 정의 -> public static 선언 
	public static Account getInstance(){
		System.out.println("instance 주소 호출");
		return instance;
	}
	
	// 멤버변수 : accountNo, ownerName, balance 모두 private 설정
	private String accountNo;
	private String ownerName;
	private int balance;
	
	// 멤버변수에 대한 Getter/Setter 정의
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
	
	// 메서드 : showAccountInfo()
	public void showAccountInfo() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("예금자명: " + ownerName);
		System.out.println("현재잔고: " + balance + "원");
	}
	
}