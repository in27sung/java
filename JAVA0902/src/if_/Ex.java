package if_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * Conditional Statement(조건문)
		 * - 조건식 결과에 따라 실행하 문자잉 달라지는 statement
		 * - if문과 switch문으로 구분됨
		 * 
		 * [ if statements]
		 *  1. 단일 if 문
		 *  - 조건식 판별 결과가 true일 때 특정 문장(블록)을 추가로 실행
		 *  
		 *  <기본 문법>
		 *  문장 1;
		 *  
		 *  if(조건식) {
		 *  	//조건식 판별 결과가 true 일때 실행
		 *  }
		 *  문장 3;
		 *  
		 *  => 조건식 판별 결과 true : 문장1 -> 조건식(true) -> 문장2 -> 문장3
		 *  
		 */
		
		System.out.println("프로그램 시작!"); //문장1
		
		int num = 10;
		
		// 정수 num 이 5보다 작은가?
		
		if(num < 5) {
			System.out.println("num이 5보다 작다!"); // 문장2
		}
		
		// if문이 종료된 후 실행할 문장(조건식과 무관)
		System.out.println("프로그램 종료!"); // 문장3
		
		System.out.println("==============================================="); 
		
		// 정수 num2의 modulus(절대값)을 계산하여 출력
		
		int num2 = -5; // 문장1
		
		if (num2 < 0) {
			// 조건식 결과가 true(음수일 때) 
			// 변수 num2에 음수 부호(-)를 붙여서 다시 변수 num2에 저장
			num2 = -num2;
			
		}
		System.out.println("num2의 절대값 : " + num2);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
