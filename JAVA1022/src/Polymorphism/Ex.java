package Polymorphism;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 동적 바인딩 
		 * - 상속 관계에서 업캐스팅 후 메서드를 호출할 때	
		 * 	 컴파일(번역) 단계에서의 실행 대상과, 실제 실행 단계에서의
		 * 	 실행 대상이 달라진 것 
		 * - 참조 변수의 타입과 무관하게 실제 인스턴스의 메서드를 실행하게 됨  
		 * 
		 */
		
		// 슈퍼클래스 타입 인스턴스 생성 
		Parent p = new Parent();
		p.parentPrn();
		System.out.println(p);
		// 서브클래스 타입 인스턴스 생성 
		Child ch = new Child();
		ch.parentPrn(); // 슈퍼클래스로부터 상속받은 메서드 
		ch.childPrn(); // 서브에서 직접 정의한 메서드 
		System.out.println("--------------------------------------------");
		
		// 서브클래스 타입 인스턴스 -> 슈퍼클래스 타입으로 업캐스팅
		
		p = ch;
		System.out.println(p);
		p.parentPrn(); // 동적 바인딩: 부모 클래스로 인식되지만 자식 클래스의 메서드를 출력
		// Child 인스턴스의 오버라이딩 된 메서드가 호출 
		// 메서드 호출 코드를 작성하는 시점(컴파일 시점)에서는 
		// 참조변수 타입인 Parent 클래스의 parentPrn() 메서드를 호출하는 코드지만 
		// 실제 호출되는 메서드는 Child 타입의 오버라이딩 된 메서드가 호출됨!
		// -> 즉, 컴파일 단계에서의 실행 대상과 
		// 	실행 단계에서의 실행 대상이 다를 수 있다. 
		System.out.println(ch);
		
		System.out.println("=======================================");
		
		Car c = new Car();
		System.out.println(c);
		c.drive();
		
		Desel d = new Desel();
		System.out.println(d);
		d.drive();
		
		Elec e = new Elec();
		e.drive();
		
		System.out.println("------------------------------------------");
		
		c = d; // Up Casting, 자동차 car = new Desel();
		System.out.println(c);
		c.drive();
		
		c = e; // Up Casting, 자동차 car = new Elec();
		System.out.println(c);
		c.drive();
		
	}

}

class Car { 
	public void drive() {
		System.out.println("자동차 운전");
	}
}

class Desel extends Car {

	@Override
	public void drive() {
		System.out.println("디젤차를 운전하다");
	}
	
}
class Elec extends Car {
	
	@Override
	public void drive() {
		System.out.println("전기차를 운전하다");
	}
	
}

class Parent {
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
}

class Child extends Parent {
	public void childPrn() {
		System.out.println("서브클래스의 childPrn()");
	}

	// option + shift + V (Overriding)
	@Override
	public void parentPrn() {
		System.out.println("서브클래스에서 오버라이딩 된 parentPrn()");
	}
	
}
