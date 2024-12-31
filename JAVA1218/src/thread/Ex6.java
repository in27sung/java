package thread;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * 멀티쓰레드 환경에서의 문제점
		 * - 복수개의 쓰레드에서 동일한 객체 데이터에 접근할 경우
		 *   각 쓰레드에서 사용되는 데이터의 일관성이 깨질 수 있다.
		 *   => A 라는 쓰레드가 사용하는 데이터를
		 *      B 라는 쓰레드가 동시에 접근하여 변경하는 경우
		 *      A 가 의도한 데이터가 아니게 될 수 있다!
		 * - 공유 데이터(객체)에 대한 일관성 문제를 해결하기 위해
		 *   데이터베이스의 Lock 개념과 유사한 동기화(Synchronize) 기능을 사용
		 *   => 메서드 또는 특정 코드 블럭에 synchronized 키워드를 지정
		 *   
		 * < 기본 문법 >
		 * [접근제한자] synchronized 리턴타입 메서드명([파라미터...]) { }  
		 */
		
		// 은행 계좌 1개 생성 - 잔고 10000원
		Account account = new Account(10000);
		
		// 출금 작업을 수행하기 위한 쓰레드 구현 객체 2개 생성
		WithdrawThread iBanking = new WithdrawThread("인터넷뱅킹",account, 3000);
		WithdrawThread mBanking = new WithdrawThread("모바일뱅킹",account, 3000);
		
		iBanking.start();
		mBanking.start();
		

	}

}

class Account {
	int balance;

	public Account(int balance) {
		super();
		this.balance = balance;
	}
	
	// 입금기능
	// => 동기화 메서드로 만들기 위해서 리턴타입 앞에 synchronized 키워드 사용
	public synchronized int deposit(int amount) {
//	public int deposit(int amount) {
		// 입금된 금액을 누적 후 잔고 리턴
		balance += amount;
		return amount;
	}
	
	// 출금 기능
	// => 동기화 메서드로 만들기 위해서 리턴타입 앞에 synchronized 키워드 사용
	public synchronized int withdraw(int amount) {
//	public int withdraw(int amount) {
		
		String threadName = Thread.currentThread().getName();
		// => 쓰레드명 저장
		
		if(balance >= amount) { // 출금 가능
			balance -= amount;
		} else {
			System.out.println(threadName + "잔액 부족으로 출금 불가!");
			amount = 0;
		}
		
		System.out.println(threadName + " - 출금된 금액 : " + amount + ", 출금 후 잔액 : " + balance);
		
		return amount;
	}
}

// 출금 기능을 전담할 쓰레드 정의
class WithdrawThread extends Thread {
	Account account; // 계좌를 저장할 변수
	int amount; // 출금할 금액을 입력받아 저장할 변수
	
	public WithdrawThread(String threadName, Account account, int amount) {
		super(threadName);
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500); // 0.5초 동안 쓰레드 일시 정지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// 전달받은 계좌(account)를 사용하여 출금 수행
			int money = account.withdraw(amount);
		}
	}
	
	
	
}
















