package for_;

public class Ex2 {

	public static void main(String[] args) {
		
		/*
		 *  반복문을 사용한 연산의 누적(ex. 합계 계산 등)
		 *  1. 연산을 누적할 누적 변수 선언 및 초기화(반복문보다 먼저 수행)
		 *  2. 반복문을 사용하여 특정 횟수 반복
		 *  3. 반복문 내에서 특정 연산(데이터)를 누적 변수에 누적
		 *  4. 반복문 종료 후 누적 변수 값 사용 (출력)
		 */
		
		// 1 ~ 10까지 합을 계산해서 변수에 저장 후 출력 
		int num;
		int total = 0;
		
		for(num = 1; num <= 10; num++) {
			total += num;
		}
		System.out.printf("1 ~ 10까지 정수의 합: %d \n", total);
		
		
		
		
		
		
		
	}

}
