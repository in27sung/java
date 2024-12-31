package wrapper_class;

public class Ex4 {
	
	public static void main(String[] args) {
		/*
		 * Wrapper 클래스의 다양한 메서드 
		 * - 기본 데이터타입을 다양하게 처리하기 위한 메서드가 제공됨 
		 * - 주로 static 메서드 형태로 호출하여 사용 
		 *   (클래스명.메서드명() 형태로 호출)
		 * - 기본 데이터타입과 Wrapper 클래스 객체 모두 활용 가능 
		 */
		
		int num1 = 10, num2 = 20;
		Integer n1 = 10, n2 = 20; 
		
		// max(): 두 정수의 초대값을 계산하는 메서드 
		System.out.println(Integer.max(num1, n1)); // 기본데이터타입과
		System.out.println(Integer.max(num2, n2)); // Wrapper 클래스 타입 모두 사용 
		
		// min(): 두 정수의 최소값을 계산하는 메서드 
		System.out.println(Integer.min(num1, n1));
		System.out.println(Integer.min(num2, n2));
		
		// 10진수 정수를 다양한 형태의 진법으로 변환할 경우 
		// Integer.toXXXString() 메서드를 호출하여 해당 진법으로 변환 가능 
		// -> XXX은 각 진법명 지정(2진법: Binary, 8진법: Octal, 16진법: Hex)
		System.out.println("정수 10을 2진수로 변환: " + Integer.toBinaryString(num1));
		System.out.println("정수 10을 8진수로 변환: " + Integer.toOctalString(num1));
		System.out.println("정수 10을 16진수로 변환: " + Integer.toHexString(num1));
		
		System.out.println("==========================================================");
		
		// Character 클래스를 활요한 문자 데이터 처리 
		// -> 주로 특정 문자에 대한 판별을 수행(Character.isXXX()) 하거나 
		//    변환(Character.toXXX())을 수행 
		
		char ch = 'R';
		System.out.println("원본 데이터: " + ch);
		
		// 입력받은 문자 ch에 대한 대문자, 소문자, 숫자 기타문자 판별 
		// -> 대문자: 문자 ch가 'A'(65) 이상이고, 문자 ch가 'Z'(92) 이하 
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + ": 대문자");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + ": 소문자");
		} else if (ch >= '0' && ch <= '9') { 
			System.out.println(ch + ": 숫자");
		} else
			System.out.println(ch + ": 기타문자");
		
		System.out.println("------------------------------------------");
		
		// Character 클래스의 isXXX() 메서드를 활용하여 각 판병르 대체하고 
		// toXXX() 메서드를 활용하여 변환을 수행 
		ch = ' ';
		
		if(Character.isUpperCase(ch)) {
			System.out.println(ch + ": 대문자");

			// 대문자 -> 소문자 변환 
			ch += 32; // ch = (char)(ch + 32);
			System.out.println("소문자로 변환한 결과: " + ch);
			System.out.println("소문자로 변환한 결과: " + Character.toLowerCase(ch));
		} else if (Character.isLowerCase(ch)) {
			System.out.println("대문자로 변환한 결과: " + Character.toUpperCase(ch));
		} else if(Character.isDigit(ch)) {
			System.out.println(ch + ": 숫자");
		} else if(Character.isWhitespace(ch)) {
			System.out.println(ch + ": 공백문자");
		}
		
		
	}
	
}
