package for_;

public class Test2 {

	public static void main(String[] args) {
		
		// 정수 1 ~ 100까지의 합을 누적변수 total에 누적 후 출력 
		int total = 0;
		
		for(int i = 1; i <= 100; i++) {
			total += i;
		}
		System.out.printf("1 ~ 100까지의 합: %d", total);
		
		System.out.println();
		System.out.println("=====================================");
		
		// 1 ~ 10까지 1씩 증가하면서, 정수 중 짝수의 합만 계산 
		int evenTotal = 0;
		int oddTotal = 0;
	
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				evenTotal += i;
			}else {
				oddTotal += i;
			}
		}
		System.out.printf("1 ~ 10까지의 짝수 합: %d  \n", evenTotal);
		System.out.printf("1 ~ 10까지의 홀수 합: %d", oddTotal);

		
		
		
		
	}

}
