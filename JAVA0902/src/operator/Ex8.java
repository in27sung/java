package operator;

public class Ex8 {

	public static void main(String[] args) {
		/*
		 * 삼항연산자(조건연산자) ?:
		 * - 피연산자가 3개인 연산자
		 * - 조건식의 판별 결과가 true일 때와 false일때
		 * 	 서로 다른 위치의 값(또는 식)을 선택하는 연산자
		 * 
		 * - 조건식은 결과가 true 또는 flase가 되는 식을 사용해야 함
		 * 
		 * <기본문법>
		 * 조건식 ? 값1(ture 일 때 선택) : 값2(flase 일때 선택);
		 */
		
		int num = 0;
		
		// num이 0 이상인지 판변하는 식
		System.out.println(num >= 0); //true
		// num이 0 이상일 경우 true 가 리턴 되고 true에 해당되는 값을 선택하여 출력 
		System.out.println(num >= 0 ? "num은 양수!" : "num은 음수!");
		
		String result = num >= 0 ? "num은 양수!" : "num은 음수!";
		
		System.out.println(result);
		
		System.out.println("==============================================="); 

		result = num > 0 ? "num은 양수!" : num < 0 ? "num은 음수!" : "num은 0이다!";
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
	}

}
