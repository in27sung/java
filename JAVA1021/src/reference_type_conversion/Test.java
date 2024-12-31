package reference_type_conversion;

public class Test {

	public static void main(String[] args) {
		
		// 레퍼런스 형변환 연습 
		// 서브클래스 타입(SmartPhone) 인스턴스 생성 
		SmartPhone myPhone = new SmartPhone();
		
		// 서브클래스 타입으로 참조 가능한 메서드: 3개
		myPhone.Phone();
		myPhone.text();
		myPhone.kakao();
		
		System.out.println("-------------------------------------");

		// 슈퍼클래스 타입(mobile) 인스턴스 생성 
		Mobile ParPhone = new Mobile();
		
		ParPhone.Phone();
		ParPhone.text();
		
		System.out.println("-------------------------------------");
		// Up Casting 
		// 내가 쓰던 스마트폰을 어머니께 드릴 경우 
		// 스마트폰(Sub) -> Moblie(super) 타입으로 변환하는 경우
		ParPhone = myPhone;
		
		// 부모님이 사용가능한 기능: 2개
		ParPhone.Phone();
		ParPhone.text();
		
		// -> 스마트폰을 핸드폰 타입으로 참조할 경우 기능 축소 
		
		// 또 다른 SmartPhone을 어머니께 드릴 경우 
		System.out.println("-------------------------------------");

		SmartPhone bro = new SmartPhone();
		
		ParPhone = bro;
		
		ParPhone.Phone();
		ParPhone.text();
		
		System.out.println("-------------------------------------");
		
		// Up Casting 
		ParPhone = new SmartPhone();
		
		ParPhone.Phone();
		ParPhone.text();
		
		// Down Casting
		myPhone = (SmartPhone)ParPhone;
		
		myPhone.Phone();
		myPhone.text();
		myPhone.kakao();
		
		ParPhone = new Mobile();
		
		myPhone = (SmartPhone)ParPhone; // class reference_type_conversion.Mobile cannot be cast
		
		myPhone.Phone();
		
	}

}

class Phone {
	public void Phone() {
		System.out.println("전화 걸기!");
	}
}

class Mobile extends Phone {
	public void text() {
		System.out.println("문자 전송");
	}
}

class SmartPhone extends Mobile {
	public void kakao() {
		System.out.println("카톡");
	}
}