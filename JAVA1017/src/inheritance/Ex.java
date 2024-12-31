package inheritance;

public class Ex {

	public static void main(String[] args) {
		/*
		 * inheritance(상속)
		 * - is-a 관계가 성립하는 객체간의 관계 
		 * - super class(부모)의 모든 멤버를 sub class(자식)에서 물려받아
		 * 	 선언 없이 사용 하는 것 
		 * - Super Class = parent Class = 상위클래스 = 조상클래스 
		 * 	 Sub Class = child Class = 하위클래스 = 자손클래스
		 * - private 접근제한자가 지정된 멤버는 상속 대상에서 제외됨. 
		 * - 생성자는 상속 대상에서 제외됨 
		 *   -> 생성자의 이름은 자신의 클래스 이름과 같음 
		 *   	상속받은 생성자는 부모의 클래스 이름이므로 규칙에 위배되기 때문 
		 * - 자바는 단일 상속만 지원 
		 * 	 -> 두 개 이상의 슈퍼클래스(부모)를 지정할 수 없음 
		 * - 별도로 상속 대상을 지정하지 않을 경우 (extends 생략할 경우)
		 *   java.lang.Object 클래스를 자동으로 상속 받음 
		 *   -> java.lang.Object 클래스를 자바의 최상위 클래스라고 함 
		 *   
		 *  <inheritance syntax>
		 *  class 서브 클래스명 extands 슈퍼클래스명 {}
		 */
		
		// 서브 클래스 child 인스턴스 생성 
		Child c = new Child();
		c.childPrn(); // 서브클래스에서 직접 정의한 메서드 
		
		// Child 클래스는 자신의 클래스 내의 멤버뿐 아니라 
		// 슈퍼클래스인 Parent 클래스의 멤버도 아무런 선언없이 사용 가능 
		c.num = 10; // 슈퍼클래스 Parent로 부터 상속받은 멤버변수 
		c.parentPrn();// 슈퍼클래스 Parent로 부터 상속받은 메서드 
		
		c.showNum();
		
		System.out.println("--------------------------------------------");
		
		// 나 클래스의 인스턴스 생성 
		Son me = new Son();
		
		// Son 클래스 자신의 멤버변수 
		System.out.println("My phone: " + me.phone);
		me.programming();
		
		// 아버지 클래스로부터 상속받은 멤버 
		System.out.println("My car: " + me.car);
		me.sing();
		
		// 할아버지 클래스로부터 상속받은 멤버 
		System.out.println("My house: " + me.house);
		me.drawPciture();
		
	}// main()

}// class Ex()

// Super Class
class Parent {
	int num; // 슈퍼클래스의 멤버변수 
	
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
}

// 슈퍼클래스를 상속받는 서브클래스 
class Child extends Parent {
	// Parent 클래스를 상속받게 되면 
	// Child 클래스에서 선언하지 않은 멤버(=Parent의 멤버)도 사용 가능해짐 
	public void childPrn() {
		System.out.println("서브클래스의 childPrn()");
	}
	
	public void showNum() {
		// 슈퍼클래스의 멤버변수 num에 접근 가능 
		System.out.println("부모로부터 상속받은 멤버변수 nume = " + num);
	}
}

// ==================================================================
class GrandPrn{
	String house = "고층 아파트";
	String tvName = "최신형 티비";
	
	public void drawPciture() {
		System.out.println("그림을 잘 그린다");
	}
}

//할아버지 클래스를 상속받는 아버지 클래스 정의 

class Father extends GrandPrn{
	String car = "Sprots car";
	
	public void sing() {
		System.out.println("노래를 잘한다");
	}
}

class Son extends Father{
	String phone = "iPhone";
	
	public void programming() {
		System.out.println("프로그래밍을 잘한다");
	}
	
}
