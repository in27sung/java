package if_;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 *  다중 if ~ else if ~ else 문 
		 *  - 두가지 이상의 조건식을 사용하여 세가지 이상의 경우의 수를 판별
		 *  - 모든 조건이 만족하지 않을 때 실행할 문이 있을 경우
		 *    문장의 마지막에 else 문 사용
		 *  - if문 비교는 위에서 아래로 차례대로 비교를 수행한다.
		 *    => 비교 범위가 좁은 조건부터 비교를 수행해야 한다!
		 *    
		 *    < 기본 문법>
		 *    if(조건식1) {
		 *    	//조건식 1의 결과가 true 일 때
		 *    } else if(조건식2) {
		 *    	//조건식 1의 결과가 false 일고, 조건식2의 결과가 true 일 때
		 *    }else{
		 *    	// 위의 모든 조건식 결과가 false 일 때
		 *    }
		 *    
		 */
		
		
		// 정수 num 이 양수(0보다 클 경우) 일 때 
		int num = 4;
		// If the number is bigger than 0
		if(num > 0) {
			System.out.println(num + ":양수!");
		// If the number is less than 0
		}else if(num < 0) {
			System.out.println(num + ":음수!");
		// The number is 0 
		}else {
			System.out.println(num + ": 0!");
		}
				
		num = 20;
		
		// num 이 5보다 클 경우 "5보다 크다!"
		// num이 10보다 클 경우 "10보다 크다!"
		if(num > 5) {
			System.out.println("5보다 크다!");
		}else if(num > 10) {
			// num < 5 조건식 범위 안에 num > 10 조건식이 포함되므로 
			// 아래 조건식은 실행될 수 없음
			System.out.println("10보다 크다!");
		}		
		
		
		
		
		// 정수 num2에 대해 홀수, 짝수, 0 판별
		// 변수 선언 및 초기값 선언 
		
		// if the number is 0 
		if(num == 0) {
			System.out.println("0 입니다");
		// if the numner is even
		}else if((num % 2) == 0) {
			System.out.println(num + ": 짝수");
		// the number is odd 
		}else{
			System.out.println(num + ": 홀수");
		}
	}

}
