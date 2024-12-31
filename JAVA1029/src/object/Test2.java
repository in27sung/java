package object;

import java.util.Objects;

public class Test2 {
	
	public static void main(String[] args) {
		
		Account acc = new Account("1234-123-1234", "황인성", 12341234);
		System.out.println(acc.hashCode());
		Account acc1 = new Account("1234-123-1234", "황인성", 12341234);
		System.out.println(acc1.hashCode());

		
		
		if (acc.equals(acc1)) {
			System.out.println("두 객체의 내용(멤버변수 값)이 같다");
		} else {
			System.out.println("두 객체의 내용(멤버변수 값)이 다르다");
		}
		
		acc1.ownerName = "이순신";
		System.out.println(acc1.hashCode());
		acc1.ownerName = "황인성";
		
		if (acc.equals(acc1)) {
			System.out.println("두 객체의 내용(멤버변수 값)이 같다");
		} else {
			System.out.println("두 객체의 내용(멤버변수 값)이 다르다");
		}
	}


}


class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNo, balance, ownerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountNo, other.accountNo) && balance == other.balance
				&& Objects.equals(ownerName, other.ownerName);
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
}
	
	
