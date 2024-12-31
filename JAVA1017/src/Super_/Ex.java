package Super_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 메서드 오버라이딩 및 멤버변수에 대한 오버라이딩 시 
		 * 슈퍼클래스의 메버변수와 메서드는 은닉되어 보이지 않게 된다.
		 * -> 즉, 서브클래스의 인스턴스를 통해 슈퍼클래스의 멤버에 접근 불가능
		 * 
		 * <referance super>
		 * - 슈퍼클래스의 멤버에 접근하기 위한 키워드(= reference variable)
		 * - 레퍼런스 this 와 만찬가지로 서브클래스 인스턴스를 생성할 때 생성되며
		 * 	 이때 자동으로 생성되는 슈퍼클래스의 인스턴스 주소를 저장하는 변수 
		 * - 주로, 오버라이딩에 의해 은닉된 멤버변수 또는 메서드 접근 시 사용 
		 * 
		 * <syntax>
		 * super.varName 
		 * super.methodName
		 */
		
		// Child 클래스의 인스턴스(c) 생성
		Child c = new Child();
		System.out.println("우리집 TV: " + c.TV);
		c.watchTV();
		
		System.out.println("-----------------------------------");
		
		c.watchParentTV();
		
		System.out.println("-----------------------------------");

		Parent p = new Parent();
		p.watchTV();
		
		System.out.println("-----------------------------------");
		
		ChildClass cc = new ChildClass();
		
		cc.method();
		
	}

}



class Parent {
	String TV = "부모님이 구입한 TV";
	
	public void watchTV() {
		System.out.println("부모님 집에서 " + TV + "보기");
	}
}

// Parent 클래스를 상속받는 Child 클래스 정의 
class Child extends Parent {
	// 슈퍼클래스로부터 상속받은 멤버변수와 동일한 이름의 변수를 선언하면 
	// 슈퍼클래스의 멤버변수는 은닉됨
	String TV = "내가 구입한 TV";
	
	@Override
	public void watchTV() {
		System.out.println("서브클래스에서 오버라이딩 된 watchTV()");
		System.out.println("독립한 나의 집에서 " + TV + " 보기");
	}
	
	public void watchParentTV() {	
		// 현재 클래스 내에서 오버라이딩으로 인해 은닉된 슈퍼클래스의 멤버는 
		// 레퍼런스 super를 통해 접근하면 사용이 가능하다!
		// -> 레퍼런스 this 와 사용 방법이 동일함 
		// 1. 슈퍼클래스의 은닉된 멤버변수에 접근할 때
		System.out.println("부모님댁 TV: " + super.TV);
		System.out.println("우리집 TV: " + this.TV);
	}
	
}// class Child 

// ==========================================================
/*
 * 슈퍼클래스와 서브클래스 존재 시
 * 서브클래스의 메서드 내에서 동일한 이름의 변수가 존재할 때 탐색 과정 
 * - 메서드 내에서 접근할 변수 종류: 로컬, 자신의 멤버, 부모의 멤버 변수 
 * - 메서드 내에서 접근 순서 
 *   로컬변수 -> 서브클래스 멤버변수 -> 슈퍼클래스 멤버변수 
 * - 최종적으로 Object 클래스까지 거슬러 올라가면서 탐색하여 없으면 오류 발생!
 */

class ParentClass {
	String x = "Parent"; // 슈퍼클래스의 멤버변수
}

class ChildClass extends ParentClass{
	String x = "Child"; //서브클래스의 멤버변수(오버라이딩)
	
	public void method() {
		String x = "method"; //서브클래스의 메서드 내의 로컬변수
		
		System.out.println("x = " + x); //로컬변수 
		// -> 만약 로컬변수를 선언하지 않으면 this.x와 동일
		
		System.out.println("this.x = " + this.x); // 서브클래스 멤버변수 
		// 만약, Child 클래스 멤버변수를 선언하지 않을 경우 super.x 와 동일 
		
		System.out.println("super.x = " + super.x); // 슈퍼클래스 멤버변수 
		// 슈퍼클래스에서 멤버변수 선언하지 않았을 경우 오류 발생
		// 로컬변수 -> 서브클래스 멤버변수 -> 슈퍼클래스 멤버변수 순서로
		// 차례대로 접근하면서 값이 존재하는지 확인함 
	}
}
