package lambda;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 익명 객체를 생성하기 람다식 
		 * - 자바는 객체 지향 언어로 객체 없이 메서드를 호출할 수 없다.
		 * - 람다식은 객체 없이 인터페이스의 구현만으로 메섣르르 호출할 수 있는데 
		 *   그 이유는 익명 내부 클래스에 있다. 
		 * - 익명 내부 클래스는 클래스 이름 없이 인터페이스 자료형 변수에 
		 *   바로 메서드 구현부를 생성하여 대입할 수 있음 
		 * - 즉, 람다식으로 메서드를 구현해서 호출하면 컴퓨터 내부에서는 
		 *   익명클래스가 생성되고, 이를 통해 익명 객체가 생성되는 것 
		 */
		
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		// -> 내부적으로 익명 구현 객체가 생성되어 메서드를 호출할 수 있게 됨 
		
		concat2.makeString("Hello", "world");
		StringConcat concat3 = (s, v) -> {System.out.println(s + " ," + v);};

		System.out.println("-----------------------------------------------");
		
		/*
		 * 람다식에서 사용하는 지역 변수(로컬 변수)
		 * - 람다식 코드에서는 외부 메서드의 지역 변수를 수정할 수 없음 
		 *   그 이유는 지역 변수는 메서드 호출이 끝나면 메모리에서 사라지기 때문에 
		 *   익명 내부 클래스에서 사용하는 경우에는 지역 변수가 상수로 변하기 때문 
		 */
		
		int i = 100; // main() 메서드의 지역변수 
		
		StringConcat concat4 = (String s, String v) -> {
//			i = 200; // main() 메서드의 지역변수 i는 상수(final) 이므로 값 변경 불가능 
			//Local variable i defined in an enclosing scope must be final or effectively final
			System.out.println(i);
			System.out.println(s + ", " + v);
		};
		
		concat4.makeString("itwill", "busan");
		
	}

}


