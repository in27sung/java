package lambda;

public class Ex3 {
	
	public static void main(String[] args) {
		
		/*
		 * 함수형 인터페이스(function Interface) 또는 타겟타입(target type)
		 * - 람다식 결과적으로 "인터페이스의 클래스를 손쉽게 구현하는 방법"
		 * - 반드시 하나의 abstract 메서드만 존재 
		 * - 만약 bastract 메서드가 
		 */
		
//		useFImethodA(new A());
		useFIMethodA(new MyFunction1() {

			@Override
			public void methodA() {
				System.out.println("익명 내부 클래스 형태");
			}
		});
		
		// 1. 파라미터와 리턴타입이 없는 경우
		// 정적 메서드 userFIMethodA의 파라미터가 MyFunc1의 인터페이스 타입이므로 
		// 람다식으로 만들어지는 익명 객체가 파라미터로 사용됨 
		
		// 표현방식1
		useFIMethodA( () -> {
				System.out.println("람다식1");
			}
		);
		
		// 표현방식2
		useFIMethodA( () -> System.out.println("람다식2"));
		
		System.out.println("----------------------------------------");
		
		//2. 파라미터가 있는 람다식
		
		// 표현방식 1
		useFIMethodB((String msg) -> {
				System.out.println("람다식1: " + msg);
			}
		);
		
		// 표현방식 2
		useFIMethodB(msg -> System.out.println("람다식2: " + msg));
		
		// 3. 파라미터도 리턴타입도 있는 람다식(파라미터: O, 리턴타입: O)
		System.out.println("파라미터: O, 리턴타입: O");
		
		// 표현방식 1 
		String result = useFIMethodC((String msg) -> {
			return "람다식1: " + msg; 
		});
		System.out.println(result);
		
		// 표현방식 2
		System.out.println(useFIMethodC(msg -> "람다식2: " + msg));
		
	}// main()
	
	// 1. 파라미터와 리턴타입이 없는 경우 (파라미터: x, 리턴타입: x)	
	public static void useFIMethodA(MyFunction1 fi) {
		fi.methodA();
	}
	// 2. 파라미터가 있는 람다식 
	public static void useFIMethodB(MyFunction2 fi) {
		fi.methodB("홍길동");
	}
	
	// 3. 파라미터도 리턴타입도 있는 람다식(파라미터: O, 리턴타입: O)
	public static String useFIMethodC(MyFunction3 fi) {
		return fi.methodC("이순신");
	}
	
}// Ex3

// 함수형 인터페이스를 사용하는 람다식 유형 
// 1. 파라미터와 리턴값이 없는 경우 (파라미터: x, 리턴타입: x)
@FunctionalInterface
interface MyFunction1 {
	// 함수형 인터페이스 어노테이션(@FunctionalInterface) 선언 시 발생!
	// -> 함수형 인터페이스는 반드시 하나의 추상메서드(abstract method)를 가져야 함 
	public void methodA();
//	public void methodb();
}

//class A implements MyFunction1 {}

// 2. 파라미터가 있는 람다식
@FunctionalInterface
interface MyFunction2 {
	public void methodB(String msg);
}

// 3. 파라미터도 리턴타입도 있는 람다식(파라미터: O, 리턴타입: O)
@FunctionalInterface
interface MyFunction3 {
	public String methodC(String msg);
}
