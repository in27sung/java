package operator;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 산술 연산 시 자동 형변환
		 * - 연산 수행시 피연산자(항)끼리의 데이터타입을 일치시킨 후 영ㄴ산을 수행
		 * <규칙1>
		 * - int 타입보자 작은 타입(byte, short, char)끼리의 연산은
		 * 모두 int 타입으로 변환 후 연산을 수행
		 * => 즉, 결과값이 무조건 int 타입이 됨 
		 * e.g. byte + byte = (int)byte + int(byte) = int 
		 *      char + int  = (int)char + int = int 
		 * 
		 * <규칙2> int 타입보다 큰 타입과의 연산 시 큰 타입으로 변환 후 수행
		 *   	   => 즉, 결과값이 무조건 큰 타입이 됨 
		 * 			e.g. int + long = (long)int + long = long 
		 * 				 long + float = (float)long + float = float 정수 -> 실수 
		 * 
		 * 
		 */
		
		
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3;
		
//		b3 = b1 + b2; //Error: Type mismatch: cannot convert from int to byte
		// => 저장하려는 변수 데이터 타입이 byte 라서 문제가 발생!type name = new type();
		// => int 타입을 btye 타입으로 저장하려면 강제 형변환(byte) 필요!
		
//		byte b4;
//		b4 = (byte)b1 + (byte)b2 // 다시 각각 int로 변환되므로 오류 발생!
		// 연산 결과에 형변환 연산자를 적용하여 byte 타입으로 변환 
		b3 = (byte)(b1 + b2);// (int)b1 + int(b2) = int
					  		 // (byte)int -> byte 
		
		System.out.println(b3);
		
//		short s = b1 + b2 // Error: byte + byte = int + int = int 이므로 
				          //		short 타입 변수 s에 저장 (자동 현변환) 불가!
				
		short s = (short)(b1 + b2);
		
		System.out.println(s);
		
		System.out.println("==============================================="); 

		// char 타입 변수 ch2에 ch 값에 2를 더한 결과를 저장
		
		char ch = 'A';
		
//		char ch2 = ch + 2; // Error: char + int = int(char) + int = int
		                   // 결과값이 int가 되어 char 타입 변수에 저장 불가!
		
		
		char ch2 = (char)(ch + 2);
		
		System.out.println(ch2); // C
		
		System.out.println(ch + 2); // 67
		
		System.out.println((char)(ch + 2)); // C
		
		System.out.println("==============================================="); 
		
		int i = 100;
		long l = 200L;
		
		// int형 변수 i2에 i + l 결과값을 저장
		// int i2 = i + l // int + long = long 이므로 int 타입 변수에 저장 불가!
		
		int i2 = (int)(i + 1);
		System.out.println(i2);
		
//		float f = 3.14f;
//			         ||
		float f = (float)3.14;
		
		System.out.println(f);
		
//		long l2 = l + f; //Error: Type mismatch: cannot convert from float to long
		
		long l2 = (long)(l + f); // long + float = float 이므로 long으로 변환
		
		System.out.println(l2); // 203
		

		System.out.println("==============================================="); 
		// 정수에서 실수 
		System.out.println(3 / 2);
		// 나눗셈 연산은 몫을 계산하여 int / int = int 가 되어 
		// 3 / 2의 연산 결과는 정수 1이 출력
		// 정수가 아닌 실수 형태의 나눗셈 연산으로 연산을 수행해야 함
		// 따라서, 최소한 피연산자 중 하나를 실수로 변환한 후 연산을 수행
		//=> 규칙2에 의해서 int형 보다 더 정밀한 자료형으로 변환
		
		
		System.out.println((double)3 / 2); // double / int = double
		
		System.out.println(3 / 2.0); // int / double = double 
		// => 주로, 수치 데이터 .0을 붙여서 실수로 변환
		
		
		
		System.out.println("==============================================="); 
		// 실수끼리의 연산
		
		float f1 = 0.1f;
		double d1 = 0.1;
		
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(f1 + d1);
//		=> float -> double로 변환 하여 double + float = double 이 된다.
		// 근사치 표현법 double 16~18 float 6~8
		// 근사치 표현법에 의해 잘못된 결과가 발생할 수 있다.
		
		System.out.println(f1 + (float)d1);
		System.out.println(((int)(f1*10) + (int)(d1 * 10)) / 10.0); // 1.0
		
		System.out.println("==============================================="); 
		// 리터럴끼리 연산시에는 자동 형변환이 발생하지 않는다.
		byte b4 = 10 + 20; // byte 타입 범위 내의 정수는 btye 타입 그대로 연산
		System.out.println(b4);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
