package inheritance;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * has-a 관계(포함) vs is-a 관계(상속)
		 * 1. has-a 관계(포함)
		 * - B has a A 는 A ⊂ B 로 표현 
		 * - 특정 클래스 내에서 다른 클래스의 인스턴스를 생성하여 
		 *   해당 인스턴스를 다루는 관계 
		 * - 예) 자동차 - 엔진, 스마트폰 - 카메라 
		 * 
		 *  2. is-a 관계(상속)
		 *  - A is a B 는 A = B이다 로 표현 가능 
		 *  - 특정 클래스가 다른 클래스를 상속 받아 
		 *    해당 클래스의 멤버를 선언없이 다루는 관계 
		 *    
		 *  
		 */
	}

}

class Engine {
	int cc = 3000; // 배기량 
}

// 자동차(Car)와 엔진(Engine)의 관계는? has-a(포함) 관계

class Car{
	// 포함관계일 경우 해당 클래스의 인스턴스를 통해 접근 가능한 관계
	Engine engine = new Engine();
	
	String modelName = "Porshe";
	
	public void showCarInfo() {
		// 자신의 멤버변수에 접근 시 모델명만으로 접근 가능 
		System.out.println("모델명: " + modelName);
		
		// 포함관계에 있는 클래스의 멤버에 접근 시 참조변수를 통해 접근 가능 
		System.out.println("배기량: " + engine.cc);
	}
	
}

// 소방차와 자동차의 관계? is-a 관계(상속)

class FireEngine extends Car {
	int supplyLimit = 10000; //급수량 
	
	public void showFireEngineInfo() {
		// 자신의 멤버에 접근 
		System.out.println("급수량: " + supplyLimit);
		
		// 부모의 멤버에 접근 
		System.out.println("모델명: " + modelName);
	}
}