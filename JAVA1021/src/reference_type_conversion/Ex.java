package reference_type_conversion;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 레퍼런스(Reference data type) 형변환
		 * - 어떤 객체(인스턴스)를 다른 타입으로 변환 
		 * - 참조형 데이터타입간의 형변환 
		 * - Note: 반드시 상속관계가 전제되어야함 
		 * 	(상속 관계가 아닌 타입끼리의 형변환X)
		 * - 슈퍼클래스 타입 <-> 서브클래스 타입 
		 * - 묵시적 형변환(Up Casting)
		 * - 명시적 형변황(Down Casting) 
		 * 
		 * 1. 업캐스팅(Up Casting)
		 * - 슈퍼클래스 타입 레퍼런스로 서브클래스 인스턴스를 참조
		 *   (= 서브클래스의 인스턴스를 슈퍼클래스 타입으로 변환)
		 * - 컴파일러에 의해 자동 형변환 일어남(=묵시적 형변환)
		 * - 참조 가능 영역이 축소
		 * 	(슈퍼클래스로부터 상속된 멤버만 접근이 가능해짐)
		 * - 서브클래스 인스턴스 멤버 중 공통 항목을 제외한 나머지에 대한 
		 * 	 포기 선언을 하는 것 
		 * 	-> 대신 하나의 슈퍼클래스 타입으로 여러 서브클래스의 인스턴스 참조 가능
		 * 
		 */
		
		Super super1 = new Super();
		Sub sub1 = new Sub();
		
		super1.superMethod();
//		super1.subMethod();
//		The method subMethod() is undefined for the type Super
		System.out.println("---------------------------------------------");
		sub1.subMethod();
		sub1.superMethod();
		
		System.out.println("---------------------------------------------");
		// Up Casting (Sub type -> Super type)
		super1 = sub1; // Automatically 
		// 서브클래스 Child 타입 인스턴스 -> 슈퍼클래스 Parent 타입으로 형변환
		// -> 슈퍼클래스 타입 변수(p)가 서브클래스 인스턴스(c)를 참조함(가리킴)
		super1.superMethod(); // 상속된 메서드(접근가능)
		// 서브클래스에서 직접 정의한 메서드(접근 불가)
		// -> 슈퍼클래스 타입으로 업캐스팅 후에는 상속된(공통) 메서드만 호출 가능 
		//	 즉, 슈퍼클래스 타입으로 서브클래스 인스턴스를 참조하게 되면 
		// 	 참조 영역에 대한 축소로 서브클래스 메서드가 보이지 않게 됨. 
		System.out.println(super1.test);
		
		System.out.println("=================================================");
		
		/*
		 * 2. 다운캐스팅(Down Casting)
		 * - 서브클래스의 레퍼너스가 슈퍼클래스의 인스턴스를 참조하는 것 
		 * 	 (슈퍼 클래스의 인스턴스를 서브클래스 타입으로 형변환하는 것)
		 * - 참조 가능한 영역이 확대됨 
		 * - 자동 형 변환이 일어나지 않음 = 명시적(강제) 형변환 필요 
		 * - 강제 형변환을 통해 구문 오류가 해결되더라도 
		 * 	 실제 실행 시점에서 오류(실행 오류)가 발생하게 됨 
		 * 	-> 존재하지 않는 영역의 참조 위험성 때문
		 *============================================================
		 * - 다운 캐스팅 후에도 실행 시 오류가 발생할 수 있으므로 
		 * 	 인스턴스의 클래스 타입과 참조하는 레퍼런스 변수의 
		 * 	 상속 관계를 고려하여 다운캐스팅을 수행해야 한다 
		 * 
		 *  -> 결론!
		 *  	이전에 이미 업캐스팅 된 인스턴스(레퍼런스)를 
		 *  	다시 다운캐스팅하는 경우에만 안전하다!
		 *  	( 그 외 다운캐스팅은 인정하지 않음!)
		 *
		 */

		// 슈퍼클래스 Super 타입 인스턴스(s2) 생성
		Super super2 = new Super();
		
		Sub sub2 = new Sub();
		
//		sub2 = (Sub)super2;
		// 문법적 오류가 해결되더라도 실행 시점에서 논리적 오류 발생 
		// java.lang.ClassCastException
		
		sub2.subMethod();
		sub2.superMethod(); // 실제 Super() 인스턴스에 존재하지 않는 메서드 
		// -> 즉, 존재하지 않는 영역에 대한 참조 위험성 때문에 
		// 	 다운캐스팅이 기본적으로 불가능함
		//	 메서드 호출 시점이 아닌 다운캐스팅 시점에서 오류가 발생함
		
		System.out.println("=============================================");
		
		// 다운캐스팅이 가능한 경우 
		// Child 타입 인스턴스를 Super 타입 변수 p3에 전달 = 업캐스팅 
		
		Super super3 = new Sub();// Up Casting 
		
		// 업캐스팅으로 인해 참조 영억이 취소 됨 
		super3.superMethod();
//		super3.subMethod();
		
		System.out.println("=============================================");

		Sub sub3 = (Sub)super3;// Down Casting(Manually)
		 
		sub3.superMethod(); // 상속된(공통) 메서드
		
		sub3.subMethod(); //상속되지 않은(서브클래스에서 직접 정의한) 메서드 
		
		

		
		
		
	} // main()

}// class Ex()

class Super {
	String test = "슈퍼";
	
	public void superMethod() {
		System.out.println("superMethod");
	}
	
}

class Sub extends Super{
	String test = "서브";
	String subStr = "서브";
	
	public void subMethod() {
		System.out.println("subMethod");
	}
	
}