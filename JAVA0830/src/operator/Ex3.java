package operator;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 문자열에 대한 덧셈연산자(+) = 연결(결합) 연산자
		 * - 어떤 데이터를 문자열과 덧셈연산자로 연산할 경우
		 * 	 산술연산의 덧셈이 아닌 단순 문자열 겨합(연결)으로 사용된
		 *  이때, 어떤 데이터를 문자열 타입으로 변환하여 두 문자열을 연결
		 *  Ex) "문자열" + "문자열" = 문자열
		 *       int    + "문자열" = int + 문자열 = int문자열
		 *       
		 *       
		 *       
		 * 
		 * 
		 * 
		 */
		
		
		 int a = 10, b = 20;
		 System.out.println(a + b); // 일반 산술연산
		 
		 System.out.println("a = " + a); // "문자열" + 정수 = "문자열정수"
		 
		 String str = "a = " + a;
		 System.out.println(str);
		 
		 System.out.println(b + " = b");
		 
		 int c = a + b;
		 
		 System.out.println(a + " + " + b + " = " + c);
		 // 1. a + " + " 를 수행하여 "10 + " 문자열 생성
		 // 2. "10 + " 문자열과 + b 를 수행하여 "10 + 20" 문자열 생성
		 
		 System.out.println("덧셈 결과: " + c);
		 
		System.out.println("==============================================="); 

		System.out.println(10 + 20); //30
		System.out.println(10 + "20"); // 1020
		System.out.println("10" + 20); // 1020
		
		System.out.println(10 + "20" + 30); // 102030
		
		System.out.println(10 + 20 + "30"); // 1020
		
		System.out.println("==============================================="); 
		
		// String 타입 변수 name에 자신의 이름을 저장
		// int타입 변수 age에 자신의 나이를 저장
		
		String name = "황인성";
		int age = 20;
		
		// 주민번호 표현 시 
//		int identifyNumber = 101010-1234567; // Error: 뺄셈으로 취급
//		int identifyNumber = 1010101234567; // Error
		
//		long identifyNumber = 1010101234567; // long
		String identifyNumber = "101010-1234567"; //문자열
		
		// 이름 : 
		// 나이 :
		// 주민번호 
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주민등록번호: " + identifyNumber);
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
