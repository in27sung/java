package while_;

public class Ex {

	public static void main(String[] args) {
		
		/*
		 *  While loop
		 *  - for문과 마찬가지로 특정 조건식의 판별 결과가 true일 때 동안 반복
		 *  - for문과 달리 조건식 위치만 정해져 있고,
		 *  	초기식과 증감식의 위치는 유동적으로 변함(생략도 가능)
		 *  	(개발자가 정해야 함!)
		 *  - for문과 while문은 100% 상호 변환이 가능함!
		 *  
		 *  < 기본문법>
		 *  [초기식;]
		 *  
		 *  while(조건식) {
		 *  			[증감식;]
		 *  			// 조건식 결과가 true 일 때 반복 실행할 문장 
		 *  			[증감식;] // 증감식 위치는 반복할 문장보다 위에 올 수도 있다. 
		 *  }
		 */
	
		 //for문을 사용하여 "Hello, world!" 10번 출력 
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + ": Hello, world!");
		}
		
		int i = 0;
		while(i < 10) {
			i++;
			System.out.println(i + ": Hello, world!");
		}
		
		System.out.println("-----------------------------------------------------");
		
		i = 0;
		while( i < 10) {
			i++;
			System.out.printf("%d ", i);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------");

		i = 10;
		while( i > 0) {
			System.out.printf("%d ", i);
			i--;
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------");

		i = 0;
		while( i < 10) {
			i++;
			if(i%2 != 0 ) {
				System.out.printf("%d ", i);
			}
		}
		
		System.out.println();
		
		i = 0;
		while( i < 10) {
			i++;
			if(i%2 == 0 ) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();// 줄바꿈 역할

		// 제어변수 i가 1 ~ 10까지 1씩 증가하면서 i값 출력(역순)
		// =>출력 예시 10 9 8 7 6 ... 1
		while(i >= 1){
			System.out.print(i + " ");
			i--;
		}

		System.out.println();// 줄바꿈 역할

		System.out.println("-----------------------------------------------------");
		
		// 증감식의 위치에 따라 초기식, 조건식이 바뀔 수 있다!
		i = 1; // 초기식

		while(i < 10) { // 조건식
			i++; // 증감식
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("while문 종료 후 i값 = " + i);
	}

}
