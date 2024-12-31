package Interface_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 인터페이스(Interface)
		 * - 목적: 다형성 과 추상화를 지원 하여 객체지향 프로그래밍을 더 유연하고 확장
		 *  	   가능하게 만드는 것. 이를 통해 다양한 클래스들이 공통의 행동을 정의하고,
		 *  		해당 행동을 서로 다른 방식으로 구현할 수수 있음
		 * - 클래스가 아니므로 선언 시 class 키워드를 사용하지 않고
		 * 	  interface 키워드를 사용하여 정의
		 * - 인터페이스는 상수와 추상메서드만 가질 수 있다.
		 *   -> 모든 멤버변수는 public static final이 붙은 상수로 취급됨 
		 *   	(public static final 생략 가능)
		 *   	(public 으로 인해 누구나 접근 가능,
		 *   	static 으로 인해 클래스명만으로 접근 가능,
		 *   	final로 인해 값 변경 불가)
		 *   -> 모든 메서드는 public abstract 가 붙은 추상메서드로 취급됨 
		 *     (public abstarct 생략 가능)
		 *     메서드 바디를 가질 수 없으며, pulbic 으로 누구나 접근 가능
		 *     
		 * - 추상클래스와 마찬가지로 추상메서드를 포함하므로 객체 생성 불가능 
		 *   -> 단, 참조변수 타입으로는 사용 가능(=다형성을 위한 업캐스팅 가능)
		 *   
		 * - 서브클래스(구현클래스)에서 인터페이스를 상속받아 구현해야 하는 경우 
		 * 	 extends 키워드 대신 implements 키워드를 사용 
		 *   -> 클래스는 상속받아 확장(extends)의 개념이 강하지만,
		 *   	인터페이스는 상속받아 추상메서드를 구현(implements)의 개념이 강함
		 * - 클래스는 서브클래스에서 다중 상속이 불가능하지만, 
		 *   인터페이스는 서브클래스에서 다중 상속(구현)이 가능
		 *   -> implements 키워드 뒤에 복수개의 인터페이스 지정 가능 
		 * - 인터페이스끼리 상속을 받을 경우 implements 키워드가 아닌 extends로 상속 
		 * 	 -> 인터페이스 안에서 추상메서드는 구현(implements) 하지 못하기 때문 
		 * 
		 * < 인터페이스 정의 기본 문법>
		 * [접근제한자] interface 인터페이스명 {
		 * 		// 상수
		 * 		// 추상메서드
		 * }
		 * 
		 * < 인터페이스를 상속받는(=구현하는) 서브클래스(구현클래스) 정의 문법>
		 * [접근제한자] class 클래스명 implements 인터페이스명 {}
		 */
		
		
	}

}

// 인터페이스 정의 
// -> class 키워드 대신 interface 키워드를 사용하여 정의 
interface MyExInterFace {
	// 인터페이스 내의 모든 멤버변수는 상수(public static final)이다
	public static final int NUM1 = 10; //상수
	int NUM2 = 20; //상수로 취급
	
	// 인터페이스는 생성자를 가질 수 없다(why??)
//	public MyExInterFace() {} //Interfaces cannot have constructors
	
	//인터페이스 내의 모든 메서드는 추상메서드(public abtract) 이다
	public abstract void method1(); 
	public void method2();
	void method3();
//	public void method3() {}
	//Abstract methods do not specify a body
	
}

// 추상클래스
abstract class MyClass {
	public static final int NUM1 = 10; //상수
	int NUM2 = 20; // default variable 
	
	public MyClass() {} //기본 생성자
	// -> 추상클래스는 생성자를 가질 수 잇음
	
	public abstract void method1(); 
//	void method2(); //This method requires a body instead of a semicolon
	
	public void method3() {} //일반 메서드 
	// -> 추상클래스는 일반메서드도 가질 수 잇다
}

class MySubClass implements MyExInterFace{

	@Override
	public void method1() {
		System.out.println("서브 클래스에 구현한 추상메서드 method1()");
	}

	@Override
	public void method2() {
		System.out.println("서브 클래스에 구현한 추상메서드 method2()");
	}

	@Override
	public void method3() {
		// 인터페이스에서
		// 오버라이딩을 통한 구현시 접근제한자는 같거나 넓은 범위
	}
	
}

