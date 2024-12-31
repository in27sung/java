package operator;

public class Ex5 {
	
	public static void main(String[] args) {		/*
		 *  비교 연산자(관계 연산자): >(right angle bracket), >=, <=, <, ==, != 
		 *  - 두 피연산자 간의 대소관계 등을 비교하여 true or flase 값을 return
		 *  - 서로 다른 데이터타입끼리의 비교 시 산술연사과 마찬가지로 동일한
		 *    타입으로 이ㄹ치시킨 후 비교 연산을 수행
		 *    
		 * 
		 */

		int a = 10, b = 5; 
		System.out.println("a > b:" + (a > b));
		System.out.println("a < b:" + (a < b));
		System.out.println("a >= b:" + (a >= b));
		System.out.println("a <= b:" + (a <= b));
		System.out.println("a == b:" + (a == b));
		System.out.println("a != b:" + (a != b));
		
		boolean result = a > b;
//		int result = a > b; //Error
		
		System.out.println("==============================================="); 
		
		// char 타입끼리 비교 시 int 타입으로 변환 후 비교(compare UNICODE)
		System.out.println('A' > 'B'); // 65 > 66 
		System.out.println('A' == 65); // 65 == 65
		
		// Caution: double 과 float 타입 비교
		System.out.println(0.1 == 0.1f); // false
		System.out.println((float)0.1 == 0.1f); // true
		
		byte c = 65;
		System.out.println(65 == a); //false
		
		// 다른 연산과 관계 연산자를 경합하여 선산 겨로가의 대소 관계 판별 가능
		System.out.println(a + b > a - b);
		System.out.println(('A' > 'B') != ('A' == 65)); 
		
		
		
		
		
		
		
		
		
	}
	
}
