package method_overriding;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Method Overriding: 메서드 재정의(덮어쓰기) - 슈퍼클래스로부터 상속받은 메서드를 서브클래스에서 재정의 하는 것 - 기본
		 * 슈퍼클래스의 메서드와 동일하게 생긴 메서드를 정의하게 되므로 서브 클래스에서는 더이상 슈퍼클래스의 메서드가 보이지 않음 -> 슈퍼클래스의
		 * 메서드를 덮어쓰기 때문에 자신의 메서드만 보이게 됨 (즉, 슈퍼클래스의 메서드는 은닉됨)
		 * 
		 * - 슈퍼클래스의 메서드에 새로운 기능을 추가하는 경우 또는, 기존에 상속된 메서드 내용을 변경하는 경우
		 * 
		 * <Overriding rule> 1. 상속 관계 필수 2. 메서드의 signature(메서드명, 리턴타입, 파라미터)가 일치해야함 ->
		 * 단, 리턴타입은 부모와 같거나 서브클래스 타입으로 변경 가능 3. 접근제한자는 같거나 넓은 범위로만 변경 가능(=좁아질 수 없다!)
		 * 
		 * < overriding shorcut>
		 * 
		 * -> 단, 이미 오버라이딩 된 메서드는 표시되지 않음
		 */

		Sub s = new Sub();
		s.Super1();
		s.Super2();
		s.Super3();

		System.out.println("======================================");

		Animal ani = new Animal();
		ani.cry();

		Dog dog = new Dog();
		dog.cry();
		
		Cat cat = new Cat();
		cat.cry();
		
	}

}

class Super {

	public void Super1() {
		System.out.println("Super class의 Super1()");
	}

	public Object Super2() {
		System.out.println("Super class의 Super2()");
		return null;
	}

	public String Super3() {
		System.out.println("Super class의 Super3()");
		return null;
	}

}

class Sub extends Super {

	public void Sub1() {
		System.out.println("Sub class의 Sub1();");
	}

	// 슈퍼클래스 Super로 부터 상속받은 Super1() 메서드 오버라이딩
	// -> 슈퍼클래스의 메서드명과 리턴타입, 파라미터가 동일한 메서드 재정의
	// -> 슈퍼클래스가 가진 Super1() 메서드는 child 인스턴스에서 보이지 않음
	public void Super1() {
		System.out.println("서브클래스에서 오버라이딩 된 Super1()");
	}

	// 오버라이딩 시 슈퍼 클래스의 접근제한자 보다 좁아질 수 없다
	// -> 부모가 public일 경우 자식은 무조건 public만 지정 가능

//	private void Super1() {}// Cannot reduce the visibility of the inherited method from Super

	// 오버라이딩 시 슈퍼클래스의 리턴타입보다 서브클래스 타입을 명시할 수 있다
	public Object Super2() {// Object -> String 변경 가능
		System.out.println("서브클래스에서 오버라이딩 된 Super2()");
		return super.Super2();
	}

	// Overrise shortcut: option + shift + v
	@Override
//	public String Super3() {
//		System.out.println("서브클래스에서 오버라이딩 된 Super3()");
//		return null;
//	}

	// 주의! @Overrise Annotation이 붙어 있을 경우에는
	// 오버로딩을 수행하거나 오버라이딩 규칙 위반 시 컴파일 에러 발생

	// 오버라이딩 시 리턴타입은 기존 리턴타입의 슈퍼클래스 타입이 올 수 없다
	public String Super3() {
		System.out.println("서브클래스에서 오버라이딩 된 Super3()");
		return super.Super3();
	}
}

// =====================================================================

	class Animal {
		String name;
		int age;

		public void cry() {
			System.out.println("동물 울음 소리");
		}
	}

	class Dog extends Animal {

		@Override
		public void cry() {
			System.out.println("멍멍");
		}
	}

	class Cat extends Animal {

		@Override
		public void cry() {
			System.out.println("냐옹!");
		}
	}