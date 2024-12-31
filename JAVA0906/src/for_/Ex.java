package for_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 반복문
		 * - 특정 조건에 따라 지정된 범위의 문장들을 반복 실행하는 문 
		 * - for문, while문으로 구분됨 
		 * 
		 * 1. for문 
		 * - 반복 횟수가 정해져 있는 경우에 주로 사용 
		 * - 초기식, 조건식, 증감식의 위치가 정해 
		 * - 초기식: 반복 횟수를 판별하기 위한 조건에 사용될 제어변수를 선언하거나 초기화 하는 문장 
		 * - 조건식: 반복 여부를 결정하기 위한 조건식
		 * 					=> if문과 마찬가지로 true 일 때 블록 내의 문장을 실행하고 
		 * 						false 일 때 for문을 종료하고 빠져나감 
		 * - 증감식: 반복을 위한 조건식에 맞춰 초기식에서 초기화한 제어변수를 증가 또는 감소시키는 문
		 * 
		 * <기본문법>
		 * 	for(초기식; 조건식; 증감식) {
		 * 		//	조건식 결과가 true일 때 반복 실행할 문장들... 
		 * }
		 * 2. while 문 
		 * 
		 * 
		 */
		
		
		// "x: Hello, world!" 문자열을 10번 반복 출력 
		for(int i = 1; i <= 3; i++) {
			System.out.println(i  + ": Hello, world!");
		}
		
		// System.out.println("for loop 종료 후 i 값: " + i);
		// i cannot be resolved to a variable
		// - 제어변수 i는 for loop에서 선언된 변수이므로 for loop {} 이 끝나면 사용 불가 (존재x)
		
		/*
		 * Debugging for loop 
		 * -------------------------------------------------------------------------------
		 * 초기식(i)					조건식(i <= 10) 			실행결과 (i + ": Hello, world!)			증감식(i++)
		 * -------------------------------------------------------------------------------
		 *      1									true									  1: Hello, world!								1 -> 2
		 *      2									true									  2: Hello, world!   							2 -> 3
		 *		... 
		 *		10								true							    	10: Hello, world!							  10 -> 11
		 *		11								false 									break																					
		 */
		System.out.println("-----------------------------------------------------");

		int i = 1;
		
		for( i = 1; i <= 3; i++) {
			System.out.println(i  + ": Hello, world!");
		}
		System.out.println("for loop 종료 후 i 값: " + i);
		
		System.out.println("-----------------------------------------------------");
		
		// 제어변수 i가 1 ~ 10까지 1씩 증가하면서 i 값 출력 
		
		for ( i = 1; i <= 10; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println();// 줄바꿈 역활 
		
		System.out.println("-----------------------------------------------------");
		
		// 제어변수 i가 1~10까지 1씩 증가하면서 i 값 출력(홀수 출력)
		for ( i = 1; i <= 10; i++) {
			if ( i % 2 != 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();// 줄바꿈 역활
		
		// 짝수 출력
		for ( i = 1; i <= 10; i++) {
			if ( i % 2 == 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();// 줄바꿈 역활
		System.out.println("-----------------------------------------------------");
		//  역순 출력 
		for( i = 10; i > 0 ; i--) {
			System.out.printf("%d ", i);
		}
		
		
		
		
		
		
		
		
		
	}
}
