package final_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * final 키워드 
		 * - 대상의 변경이 불가능하도록(변경의 최종) 지정
		 * 1. 변수에 final이 붙을 경우 
		 * 	  -> 변수 값 변경 불가 = 저장되어 있는 값만 사용 가능 
		 * 		  = 상수로 취급 됨 
		 * 	  -> 일반 변수와 구별하기 위해 이름을 보통 대문자로 사용하며,
		 * 	     단어와 단어 사이의 구분은 언더스코어(_)를 사용함 
		 * 	     ex) final MAX_NUM
		 * 	  -> 반드시 초기화 필수! 
		 * 		 단, 초기화를 수행하지 않는 상수를 blank final 상수라고 하며
		 * 		 생성자를 통해 초기화하면 사용이 가능
		 * 		 -> 목적: 값이 정해지고 로직이 끝날 때 까지 유지하는데 처음 실행시 
		 * 				  값을 바꾸고 싶을 때 
		 * 2. 메서드에 final이 붙을 경우 
		 * 	  -> 메서드 변경 불가 = 오버라이딩 금지! 
		 * 	
		 * 3. 클래스에 final이 붙을 경우 
		 * 	  -> 상속 불가
		 */
		
		// final 변수의 대표적인 예: Math 클래스의 PI 상수
		System.out.println("PI 값 =" + Math.PI); // S: static F: final
		// -> Math 클래스의 PI 상수 값 변경 불가 
		System.out.println((int)Math.PI); 
		
		System.out.println("----------------------------------------");
		
		SubFinalClass sfm1 = new SubFinalClass("FINAL 상수값 변경");
		System.out.println(sfm1.MEMBER_VAR);
		sfm1.normalMethod();
		
		System.out.println("----------------------------------------");

		SubFinalClass2 sfc2 = new SubFinalClass2();
		sfc2.fc2.num = 20;
		sfc2.fc2.method();
		
		// final 클래스 
		String str = new String();
		
	}

}

// 1. 변수에 final 키워드를 사용할 경우 
class FinalMember {
	
	// final 상수는 반드시 선언과 동시에 초기화 해야함 
	final int FINAL_MEMBER = 3;
	
	// -> 초기화를 하지 않으면 아래의 오류 발생 
	// -> The blank finla filed fINAL_MEMBER may not have been initialized 
	
	// 만약, final 상수를 초기화하지 않을 경우 
	final int BLANK_FINAL_MEMBER; //컴파일 에러 발생 
	// -> 단, 생성자를 통해 초기화하는 경우 사용 가능 
	
	public FinalMember(int BLANK_FINAL_MEMBER) {
		super();
		this.BLANK_FINAL_MEMBER = BLANK_FINAL_MEMBER;
	}
	
	public void change() {
//		FINAL_MEMBER = 99; // final 키워드가 붙은 상수는 값 변경 불가
		// 컴파일 에러 
		// The final field FinalMember.FINAL_MEMBER cannot be assigned
		System.out.println("FINAL_MEMBER = " + FINAL_MEMBER);
		
		final int FINAL_LOCAL_VAR = 20; //로컬 변수에도 final 키워드 사용 가능
	}
	
	// 기존 값 변경은 불가능하지만 사용은 가능함
	public int getFinalMember() {
		return FINAL_MEMBER;
	}
}


// ---------------------------------------------------------------
// 2. 메서드에 final 키워드를 사용할 경우 
class FinalClass {
	final String MEMBER_VAR;
	
	public FinalClass(String MEMBER_VAR) {
		super();
		this.MEMBER_VAR = MEMBER_VAR;
	}
	public final void finalMethod() { // final 메서드 = 오버라이딩 불가
		System.out.println("슈퍼클래스의 finalMethod()");
	}
	public void normalMethod() {
		System.out.println("슈퍼클래스의 normalMethod()");
	}
}

// FinalClass를 상속받는 SubFinalClass 정의 

class SubFinalClass extends FinalClass {

	public SubFinalClass(String MEMBER_VAR) {
		super(MEMBER_VAR);
		System.out.println("서브클래스에서 오버라이딩 된 MEMBER_VAR");
	}
	
//	public void finalMethod() {
//		System.out.println("서브클래스에서 오버라이딩 된 finalMethod()");
//	}

	@Override
	public void normalMethod() {
		System.out.println("서브클래스에서 오버라이딩 된 normalMethod()");
		finalMethod(); //오버라이딩은 안되지만 호출은 가능 
	}
	
}

// -----------------------------------------------------------------------
// 3. 클래스에 final 키워드를 사용할 경우 
final class FinalClass2 {
	int num = 10;
	
	public void method() {
		System.out.println("슈퍼클래스의 method()");
	}
}

//class SubFinalClass2 extends FinalClass2 { 
//	//The type SubFinalClass2 cannot subclass the final class FinalClass2
//	
//}
class SubFinalClass2 {
	// 포함관계 형태로 인스턴스를 생성하여 사용 가능 
	FinalClass2 fc2 = new FinalClass2();
	
	public void print() {
		System.out.println(fc2.num);
	}
}