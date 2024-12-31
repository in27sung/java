package abstract_;

public class Ex2 {

	public static void main(String[] args) {
		
	}

}

// 추상메서드 2개를 갖는 추상클래스 정의 
abstract class AbstractClass2 {
	public abstract void method1();
	public abstract void method2();	
}

// 추상메서드 2개를 갖는 추상클래스를 상속받는 서브클래스 정의 
abstract class MiddleClass extends AbstractClass2 {
	
	// 상속받은 추상메서드 2개 중 하나만 구현하는 경우
	// -> 추상메서드가 구현되지 않은 채 그대로 존재할 경우 
	// 해당 서브클래스도 추상클래스로 선언해야 한다 
	@Override
	public void method1() {
		System.out.println("MiddleClass에서 구현한 method1()");
	}

}

// 추상메서드를 모두 구현하지 않은 서브클래스(추상클래스) MiddleClass를
// 상속받는 서브클래스 SubClass2 정의 
class SubClass2 extends MiddleClass{

	@Override
	public void method2() {
		System.out.println("SubClass2에서 구현한 method2()");
	}
	
	//method1() 메서드는 MiddleClass 에서 이미 구현 되어 있으므로 강제성x
	// 여전히 강제성이 남아 있는 method2() 메서드는 반드시 구현 
	
}