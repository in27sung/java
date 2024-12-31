package operator;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 대입연산자(=)
		 * - 우변의 데이터를 좌변의 변수에 대입
		 *   => 연산의 방향이 우 -> 좌 로 진행됨
		 *      ex) x = y = 3의 경우 y에 3을 대입하고, x에 y를 대입
		 *      
		 * - 모든 연산자 중에서 운선순위가 가장 낮다.
		 *   즉, 다른 모든 작업을 수행한 후 대입연산을 수행
		 * 
		 * 확장(복합) 대입연산자(+=, -=, *=, /=, %=)
		 * - 대입연산자와 산술연산자를 조합한 연산자
		 * - 좌변과 우변의 데이터끼리 산술연산을 머저 수행하고
		 *   그 결과값을 다시 좌변의 변수에 대입 
		 */

		int a = 10; // 우변의 데이터 10을 좌변의 변수 a에 대입 
		int b;
		
		b = a;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("==============================================="); 

		b += a; // b = b + a
		System.out.println(b);
		
		b -= a; // b = b - a
		System.out.println(b);
		
		b *= a; // b = b * a
		System.out.println(b);
		
		b /= a; // b = b / a
		System.out.println(b);
		
		b %= a; // b = b % a
		System.out.println(b);
		
		System.out.println("==============================================="); 
		
		byte b1 = 100;
		// b1과 정수 10을 더한 값을 다시 b1에 저장
		
//		b1 = b1 + 10;     // byte + int = int + int = int Type mismatch
		
		b1 = (byte)(b1 + 10);
		System.out.println(b1);
		
		// 확장 대입연산자 사용하여 b1 + 10의 값을 10에 저장
		
		b1 += 10;  // Question: b1은 byte? 데이터가 초과 하면 자동으로 int?
		System.out.println(b1);
		
		System.out.println("==============================================="); 
		
		// char 타입 변수 값을 변화시킬 때 확장 대입연산자를 많이 사용함 
		char ch = 'A';
//		ch = ch + 3; //Error 
		
		ch = (char)(ch + 3);
		System.out.println(ch);
		ch += 3;
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
		
	}

}
