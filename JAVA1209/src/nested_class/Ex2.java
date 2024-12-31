package nested_class;

public class Ex2 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method();
	}

}

class Outer2 {
	private int num = 10; // 인스턴스 멤버변수 
	
	public void method() {
		System.out.println(num);
		
//		public int num2 = 20;
		// 로컬 변수에서는 접근 제한자를 사용할 수 없음 
		// 외부에서 접근이 불가능하므로 접근제한자 의미가 없기 때문 
		
		// 클래스 정의보다 아래쪽에 접근해야 함 
//		LocalInner localInner = new LocalInner(); // 컴파일 에러 
//	    System.out.println(localInner.name);
		
		// 로컬 멤버(내부)클래스 정의
		// - 메서드 내에서 정의하며, 특정 메서드에서만 사용 가능한 클래스 
		// - 로컬 변수와 마찬가지로 접근제한자 사용 불가
		
		class LocalInner {
			String name = "LocalInnerClass"; // 로컬 내부 클래스의 인스턴스 변수 
			
//			static int staticMember;
			// 로컬 멤버클래스에서는 static 변수를 사용할 수 없음
			// The field staticMember cannot be declared static in a non-static inner type, 
			// unless initialized with a constant expression
			
//			public static void staticMethod() {}
			// - 마찬가지로 로컬 멤버(내부) 클래스에서는 static 메서드를 사용할 수 없음 
			
			public LocalInner() {
				System.out.println("LocalInner() 생성자 호출됨");
			}
			
			public void print() {
				System.out.println("로컬 내부클래스의 인스턴스 멤버 메서드");
			}
			
		} // LocalInner 클래스 끝 
		
		// 로컬 내부 클래스의 인스턴스 생성(일반 클래스처럼 사용 가능)
		// -> 로컬 내부 클래스는 메서드 내에서 객체를 생성하고 사용해야 한다.
	    LocalInner localInner = new LocalInner();
	    System.out.println(localInner.name);
		
	} // method()
} // Ex2()