package method;

public class Ex {

	public static void main(String[] args) {

		/*
		 * Method - 동작(작업)의 최소 단위(= 작업을 수행하는 코드들의 모음) - method 호출 되어야 실행 가능 => 호출하는 메서드:
		 * caller, 호출 당하는 메서드: worker - 메서드 호출 시 메서드에 전달하는 값을 전달인자(argument)라고 하며, 이것을
		 * 전달받아 저장하는 변수를 parameter라고 함 => parameter 생략 가능 -method가 호출되면 작업을 수행한 후에 반드시
		 * 호출한 위치로 돌아감 => 이때, 호출한 곳으로 전달하는 값을 return value라고 함
		 * 
		 * < Method 정의 기본 문법> [접근제한자] returnType methodName([declear parameter]){ //
		 * method 호출 시 수행할 코드 [ return;] }
		 * 
		 * < method 호출 기본 문법> 
		 * 1. 리턴값이 없는 경우 methodname([ argument variable]); 
		 * 	
		 * 2. 리턴값이 있는 경우
		 * 		1) 데이터타입 변수명 = 메서드명([데이터..]);
		 *  		=> 리턴되는 데이터를 변수에 저장할 경
		 *  
		 *  	2) System.out.println(mthodName([argument])
		 *  
		 * < Method 형태 > 
		 * 1. parameter x, return x 
		 * 2. parameter x, return o 
		 * 3. parameter o, return x 
		 * 4. parameter o, return o
		 */

		System.out.println("동생아! 불좀 꺼줄래?");
		
		// Call a method
		Ex.sister_1(); //Ex. 생략가능(같은 클래스 안에 있는 메인 메서드 한정)
		
		System.out.println("불이 꺼짐");
		// void result = sister_1();
		// void is an invalid type for the variable result
		System.out.println("-----------------------------------------------------");
		
		// Call a method2
		System.out.println("동생아 물좀 줄래?");
		//sister_2();
		//String result = sister_2();
		System.out.println("동생이 가져다 준 것: " + sister_2());
		
//		Ex.method();
		Ex ex = new Ex(); // static이 없는 method는 new 키워드를 사용해야함 
		ex.method();
		
		//Test.method();
		TestClass.sister_3(); // 다른 클래스를 생성자 생성 없이 실행 

	}// main() method
	
	public void method() {}
	// Create Method
	// 1. parameter x, return x method
	// => 리턴값이 없으므로 리턴타입 부분에 특수한 데이터 타입 void 타입을 명시
//			(void = return statement x)
	// signature //method name
	public static void sister_1() {
		// method body
		System.out.println("동생: 불을 껐다!");
	}

	// 2. parameter(x), return(o) method
	// return type
	public static String sister_2() {
		// => This method must return a result of type String
		System.out.println("동생: 물을 떠다 주었다.");
		return "물";
	}
} // class Ex()

class TestClass{
	public static void sister_3() {
		System.out.println("다른 클래스 호출 완료");
	}
}
