package variable;

public class Ex {

	public static void main(String[] args) {
		/*
		 * - variable: 변환이 가능한 데이터를 저장하는 메모리 공간
		 * - Constant: 항상 같은 값을 갖는 데이터 
		 * => 자바에서 사용하는 실제 데이터를 리터럴(Literal) 이라고 함 
		 * 데이터 종류
		 * 1. 수치 데이터(number) - integer, float  
		 * 2. 논리 데이터(boolean) - Ture, False 
		 * 3. 문자열 데이터(string) - Hello
		 */
		
		//Constant
		System.out.println(1); // Integer literal 
		System.out.println(3.14); // Float literal 
		System.out.println('A'); // Char literal
		System.out.println(true); // Boolean literal
		System.out.println(false); // Boolean literal
		
		System.out.println(5L); // Integer literal => suffix L
		System.out.println(1.5f); // Float literal => suffix f
		
		System.out.println("Hello, world"); // String literal		
		
	}

}
