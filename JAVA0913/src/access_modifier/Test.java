package access_modifier;

public class Test {

	public static void main(String[] args) {
		// 은행계좌(Account) 클래스의 instance(acc) 생
		Account acc = new Account();
		
		acc.setAccountNum("123-123-1234");
		acc.setBalance(12000);
		acc.setOwnerName("홍길동");
		
		System.out.println("예금주명: " + acc.getOwnerName());
		System.out.println("계좌번호: " + acc.getAccountNum());
		System.out.println("현재잔고: " + acc.getBalance() + "원");
	}// Main

}// Class

/*
 * Account 클래스 정의 
 * - 멤버변수(private 접근제한자로 선언)
 * 	   accountNum(문자열), ownerName(문자열), balance(정수)
 * - Getter/Setter 메서드 정의 
 */

class Account{
	private String accountNum;
	private String ownerName;
	private int balance;
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
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
	
	
}