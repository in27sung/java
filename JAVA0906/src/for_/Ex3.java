package for_;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 *  중첩 for 문
		 *  - 처음 바깥쪽 for문을 시작으로 안쪽 for문이 끝날 때 까지 반복 후 바깥쪽 for문 종료 
		 *  ex) 시계 
		 *  
		 *  < 기본 문법>
		 *  for (초기식1; 조건식1; 증감식1){
		 *  	문장 1
		 *  	for(초기식2; 조건식2; 증감식2){
		 *  		문장2
		 *  	}
		 *  }
		 */
		
		for(int i = 1; i <= 3; i++) {
			System.out.printf("i = %d\n", i);
			
			for(int j = 1; j <= 2; j++) {
				System.out.printf("----> j = %d\n", j);
			}
			System.out.println("------------안쪽 for loop 종료");
		}
	
	
	}

}
