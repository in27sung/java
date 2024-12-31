package lambda;

public class Ex {
	
	public static void main(String[] args) {
		/*
		 * 람다식(Lambda Expressions)
		 * - 자바 8에 추가된 가장 큰 특징 
		 * - '함수형' 프로그래밍 형태를 받아들인 결과 
		 * 
		 * 함수형 프로그램이란?
		 * - 함수형: 1950년대, 객체지향: 1990년대 (역사가 더 오래되었음)
		 * - 기능 위주의 프로그래밍 기법
		 * - 매개변수만을 사용하여 만드는 함수(순수 함수, pure function)를 
		 *   구현하고 호출함으로써 외부 자료에 부수적인 영향을 주지 않도록 구현하는 방식 
		 * - 객체 지향: 객체를 기반으로 구현, 클래스에 속성과 기능을 정의 
		 *   함수형: 함수를 기반으로 자료를 입력받아 구현, 기능 즉 함수가 따로 존재 
		 *   
		 * - 함수 이름이 없는 익명 함수를 만드는 것 
		 *   메서드의 이름과 리턴타입을 빼고 '->' 를 활용하여 람다식을 구현 
		 *   
		 * public int add(int x, int y) {
		 * 		return x + y;
		 * }
		 * 의 메서드를 람다식으로 표현하면 
		 * (int x, int y) -> {retrun x + y}
		 * 
		 * 
		 * <람다식의 기본 문법>
		 * (데이터 타입 매개변수, ...) -> {실행문, ...}
		 * 
		 * 1. 기본형 
		 * (int x) -> {System.out.println(x);}
		 * 
		 * 2. 매개변수의 타입을 추론할 수 있는 경우에는 타입 생략 가능 
		 * (x) -> {System.out.println(x);}
		 * 
		 * 3. 매개변수나 실행문이 하나라면 소괄호() 와 중괄호{} 를 생략할 수 있음 
		 *    (이때, 세미콜론(;)은 생략)
		 * x -> System.out.println(x)
		 * - 매개변수가 2개 이상인 경우 소괄호()를 생략할 수 없다. 
		 * 
		 * 4. 매개변수가 없을 경우 소괄호()를 사용한다. -생략불가 
		 * () -> System.out.println("안녕")
		 * 
		 * 5. return이 필요한 경우 return 키워드를 사용 
		 * (x, y) -> {return x + y;}
		 * - return 문은 중괄호를 생략할 수 없다. 
		 * 
		 * 6. 실행문이 단순히 return 문 하나로 표현되는 경우 
		 *    표현식만 사용할 수 있으며, 이때 리턴 값은 표현식의 결과값이 됨 
		 *    - 세미콜론은 붙이지 않는다. 
		 * (x, y) -> x + y
		 * 
		 */
		// MaxPrintNumber 클래스 활용 
		MaxPrintNumber mpn = new MaxPrintNumber();
		System.out.println(mpn.maxNum(10, 20));
		
		// 구현클래스를 활요한 getMax 메서드 활용 
		MyNumber max = new MyNumberClass(); //업캐스트 적용 			
		System.out.println(max.getMax(10, 20));
		
		System.out.println("-------------------------------------------");
		
//		MyNumber max2 = (num1, num2) -> {(num1 >= num2) ? num1 : num2;};
		MyNumber max2 = (int num1, int num2) -> {
			if(num1 >= num2) {
				return num1;
			} else {
				return num2;
			}
		};
		MyNumber max3 = (num1, num2) -> (num1 >= num2)? num1: num2;
		// -> 람다식을 인터페이스형 max2 변수에 대입 
		System.out.println(max.getMax(10, 20)); // 인터페이스형 변수로 메서드 호출
	}

}

// ================================================================
// 두 수를 입력받아 큰 수를 출력하는 메서드를 가진 클래스 정의 
class MaxPrintNumber {
	public int maxNum(int num1, int num2) {
		if(num1 >= num2) {
			return num1;
		} else {
			return num2;
		}
	}
}
//================================================================
// MyNumber 인터페이스를 구현한 MyNumberClass 정의 
//interface MyNumber {
//	int getMax(int num1, int num2); // 추상 메서드 선언 
//}

class MyNumberClass implements MyNumber {
	
	// 두 수를 입력받아 둘 중 큰 숫자를 리턴하는 getMax() 메서드 정의 
	@Override
	public int getMax(int num1, int num2) {
		if(num1 >= num2) {
			return num1;
		} else {
			return num2;
		}
	}
}

// 위의 getMax() 메서드를 람다식으로 표현하기 위해
// 함수형 인터페이스 선언이 필요 
// 자바에서는 참조 변수 없이 메서드를 호출할 수 없음.
// - 람다식을 구현하기 위해 함수형 인터페이스를 만들고,
// 	 인터페이스에 람다식으로 구현할 메서드를 선언하는 형태로 사용 
// - 람다식은 하나의 메서드를 구현하여 인터페이스형 변수에 대입하므로 
//   인터페이스가 두 개 이상의 메서드를 가지면 안된다. 

@FunctionalInterface // 함수형 인터페이스 용도로 사용됨을 알림 
interface MyNumber {
	int getMax(int num1, int num2); // 오직 1개의 추상 메서드 
//	int add(int num1, int num2);
//	Invalid '@FunctionalInterface' annotation; MyNumber is not a functional interface
}


