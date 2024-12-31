package abstract_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 추상메서드(Abstract Method)
		 * - 메서드 바디(= 구현부, {})가 존재하지 않는 메서드
		 * 	-> 실행 코드가 없으므로 실행(호출) 될 수 없는 메서드 
		 * - 메서드 선언부 접근제한자 뒤에 abstract 키워드를 붙여서 선언 
		 * 	 -> 바디가 없으므로 메서드 마지막을 세미콜론(;)으로 마무리 
		 * - 메서드 실행코드(바디)가 없으므로 외부에서 호출되면 안되는 메서드 
		 * 
		 * < Abstraction Syntax>
		 * [접근제한자] abstract 리턴타입 메서드명 ([매개변수...]);
		 * -------------------------------------------------------------
		 * 추상 클래스(Abstract Class)
		 * - 인스턴스를 생성할 수 없는 미완성 클래스
		 *    -> 내부에 추상메서드를 가지고 있을 경우 
		 *    	 추상메서드가 호출되면 안되므로 인스턴스 생성을 못하게 차단함
		 * - class 키워드 앞에 abstract 키워드를 붙여서 정의
		 * - 추상메서드 뿐만 아니라 일반메서드, 멤버변수, 생성자를 가질 수 있음 
		 * 	 -> 추상메서드가 없는 클래스도 추상메서드로 정의 가능 
		 * - Note: 인스턴스를 생성할 수 없지만, 상속을 통한 슈퍼클래스로 사용하거나 
		 *			다형성 활용을 위한 참조변수 타입으로 사용 가능함 
		 *		-> 추상메서들르 포함하는 추상클래스를 상속 받는 서브클래스에서는 
		 *			반드시 오버라이딩을 통해 추상메서드 바디 { }를 구현해야 한다.
		 *		즉, 추상메서드 오버라이딩을 강제할 수 있다.
		 *		접근제한자, 리턴타입, 메서드명, 파라미터 전부 같아야 함 
		 *		(What에 대한 강제, how는 서브클래스에서 위임)
		 * - 추상메서드에 대한 구현을 강제함으로써 코드의 강제성 및 통일성 향상
		 *
		 *<추상 클래스 정의 기본 문법>
		 *[접근제한자] abstract class 클래스명 {
		 *		//멤버변수
		 *		//생성
		 *		// 일반 메서드 
		 *		// 추상메서드 
		 *}
		 * 
		 */
		
		// 추상클래스 AbstarctClass 인스턴스 생성 
//		AbstractClass ac = new AbstractClass(); 
		// compile error: Cannot instantiate the type AbstractClass
		
		// 추상클래스를 상속받는 서브클래스 인스턴스 생성 
		SubClass sc = new SubClass();
		sc.normalMethod();
		sc.abstractMethod();
		sc.subClassMethod();
		
		// 추상클래스를 참조변수 타입으로 활용 가능 = 업캐스팅을 통한 다형성
		AbstractClass ac = new SubClass();
		ac.normalMethod(); // 공통(상속된) 메서드
		ac.abstractMethod();
//		ac.subClassMethod();
	}

}
// Abstract class
abstract class AbstractClass {
	
	// 추상메서드(abstract Method)
	
	// Abstract method (does not have a body)
	public abstract void abstractMethod();
	//{} Abstract methods do not specify a body
	
	// Regular method
	public void normalMethod() {
		System.out.println("Regular method");
	} // 일반 메서드 
	
	public AbstractClass() {} //constructor 
	String memberl; // 멤버변수(필드)
	
}

// 추상클래스 AbstractClass를 상속받는 서브클래스 SubClass 정의 
class SubClass extends AbstractClass{

	// The type SubClass must implement 
	// the inherited abstract method AbstractClass.abstractMethod()
	// -> 추상메서드를 상속받는 서브클래스는 반드시 추상메서드 오버라이딩 필수
	// -> 바디를 갖지 않는 추상메서드의 바디를 구현(implement) 하는 작업
	
	// 파라미터 생성자의 메서드 버전 
	@Override
	public void abstractMethod() {
		System.out.println("서브클래스에서 오버라이딩(구현)된 추상메서드!");
	}
	
	public void subClassMethod() {
		System.out.println("서브클래스에서 직접 정의한 메서드");
	}
	
}