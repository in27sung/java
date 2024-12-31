package if_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * if ~ else statement
		 * - 조건식 판별 결과가 true 일 때와 false일 때 서로 다른 블록을 수행
		 *
		 *  <기본문법>
		 *  문장1;
		 *  
		 *  if(조건식){
		 *  	문장2; //조건식 결과가 true 일 때 
		 *  }else{
		 * 		문장3; // 조건식 결과가 false 일 때
		 *  }
		 *  
		 *  
		 */
		
		
		// 정수 num에 대한 절대값 계산 
		
		int num = -5; // 문장1 
		
		if(num < 0) { //조건식
			System.out.println("음수이므로 양수로 변환!"); // 문장2
			num = -num;
		} else {
			System.out.println("양수이므로 변환 생략!"); // 문장3
		}
		System.out.println("num의 절대값: " + num);// 문장4
		
		System.out.println("==============================================="); 
		
		// 정수 num2에 대해 홀수, 짝수, 0 판별
		// 변수 선언 및 초기값 선언 
		int num2 = 9;
		
		// if the number is 0 
		if(num2 == 0) {
			System.out.println("0 입니다");
		// if the numner is even
		}else if((num2 % 2) == 0) {
			System.out.println(num2 + ": 짝수");
		// the number is odd 
		}else{
			System.out.println(num2 + ": 홀수");
		}
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
