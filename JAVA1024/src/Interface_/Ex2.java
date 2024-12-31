package Interface_;

public class Ex2 {

	public static void main(String[] args) {
		
	}

}

// 고래와 상어의 특징을 추상화하여 동물 인터페이스 정의 
interface Animal {
	// 인터페이스 내의 모든 메서드는 추상메서드 
	public abstract void propagation();
}

// 헤엄칠 수 있는 특징을 갖는 인터페이스 '헤엄칠수있는' 정의
interface Swimmable {
	public abstract void livingWater();
}

// 동물 인터페이스를 상속 받는 서브인터페이스 고래, 상어 정의 
// -> 인터페이스 끼리 상속은 Implements 키워드가 아닌 extends 사용 
// -> 인터페이스 끼리 상속은 다중 상속도 가능

interface Whale extends Animal, Swimmable {}
interface Shark extends Animal, Swimmable {}

abstract class Animal2 {}

class WhaleShark implements Shark, Whale  {

	// 인터페이스 내에서는 슈퍼클래스(인터페이스) 모든 메서드가 추상메서드이므로 
	// 중복되는 메서드에 대한 구별없이 직접 구현하면 되기 때문에 
	// 중복된 메서드로 인한 혼란이 없음 
	
	@Override
	public void propagation() {
		System.out.println("알을 낳아 번식");
	}
	
	@Override
	public void livingWater() {
		// TODO Auto-generated method stub
		
	}
	
}

// ===================다이아몬드 상속에서의 문제점====================
// propagation() 메서드를 갖는 슈퍼클래스 동물 클래스를 정의하고 
// 고래와 상어 클래스에서 동물클래스를 상속받기 

//class Shark2 extends Animal2 {
//
//	@Override
//	public void propagation() {
//		System.out.println("알을 낳아 번식");
//	}
//	
//}
//
//class Whale2 extends Animal2 {
//
//	@Override
//	public void propagation() {
//		System.out.println("새끼를 낳아 번식");
//	}
//}
// 만약, 다중 상속을 허용할 경우 발생하는 문제점 
// -> 고래와 상어 클래스를 동시에 상속받는 고래상어 클래스 정의시 

//class WhaleShark extends Whale2 , Shark2{
//	// 외부 또는 내부에서 Whale 과 Shark클래스가 공통적으로 갖는 
//	// propagation() 메서드를 호출하게 되면 어느 객체의 번식() 메서드를 호출하는지 
//	// 분명하지 않기 때문에 자바에서 다중 상속이 금지 됨!
//	propagation();
//	
//}