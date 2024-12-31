package pass_by;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 메서드 호출 시 값 전달 방식에 따른 차이 
		 * = 메서드 파라미터로 기본 데이터타입과 참조 데이터타입 전달 시 차이
		 * 		->메서드 호출 시 값을 전달하는 경우 값의 복사가 일어남
		 * 
		 * 1. Pass by value(값에 의한 전달)
		 * - 메서드 호출 시 기본 데이터 타입 데이터를 전달하는 경우 
		 * 		-> 실제 값(실제 데이터)을 복사해서 전달
		 * - 호출된 메서드 내에서 전달받은 값(복사한 데이터)을 변경해도
		 * 		원본 데이터에는 아무런 이상이 없음  
		 * 
		 * 2. Pass by reference(참조에 의한 전달)
		 * - 메서드 호출 시 참조 데이터타입 데이터 전달하는 경우 
		 * 		-> 실제 값이 있는 공간의 주소 값(참조 값)을 복사해서 전달
		 * - 호출된 메서드 내에서 전달받은 값(복사한 주소 값)을 접근하여
		 *	  해당 주소에 있는 데이터를 변경하는 경우
		 *		원본 데이터도 동일한 주소값을 참조하므로 변경된 결과에 영향을 받음 
		 * 
		 */
		
		Money m = new Money();
		PassByTest pbt = new PassByTest();
		
		// 1. 메서드 파라미터로 기본 데이터타입 변수 값을 전달하는 경우 
		System.out.println("changePrimitiveType() 메서드 호출 전 money = " + m. money);
	
		// Money 인스턴스의 멤버변수 money 값을 메서드에 전달
		// -> 이때 기본 데이터타입(int)이므로 실제 값을 복사해서 전달 
		pbt.changePrimitiveType(m.money); // money에 저장된 값(10000) 복사됨
		
		System.out.println("changePrimitiveType() 메서드 호출 후 money = " + m. money);

		System.out.println("---------------------------------------------");
		
		// 2. 메서드 파라미터로 참조 데이터타입 변수 값을 전달하는 경우 
		
		System.out.println("changeReferenceType() 메서드 호출 전 money = " + m. money);
		
		// Money 인스턴스의 주소가 저장된 참조변수 값을 메서드에 전달
		// -> 이때 참조 데이터 타입 
	}

}

class PassByTest {
	public void changePrimitiveType(int money) {
		// 기본 데이터타입 데이터(실제 값)을 전달 받음(복사)
		// 전달 받은 기본데이터타입 데이터를 변경 
		money -= 5000;
		System.out.println("changePrimitiveType() 메서드의 money = " + money);
	}
	
	public void changeReferenceType(Money m) {
		// 참조 데이터타입 데이터(주소 값)를 전달 받음(복사)
		// 전달 받은 주소 값에 해당하는 인스턴스에 접근하여 
		// 인스턴스 내의 멤버변수(실제 값)을 변경
		// -> 참조변수명.멤버변수명에 접근 가능 
		m.money -= 5000;
		System.out.println("changeReferenceType() 메서드의 money = " + m.money);
	}
}

class Money{
	int money = 10000;
}
