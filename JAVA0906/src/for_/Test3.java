package for_;

public class Test3 {

	public static void main(String[] args) {
		// 1 ~ 10 까지 반복 
		for( int i = 1; i <= 10; i++) {
			System.out.printf("i값: %d \n", i);
			// 1 ~ 5 까지 반복 
			for(int j = 1; j <= 5; j++) {
				System.out.printf("------>j값: %d \n", j);
			}
			System.out.println("-------------안쪽 for loop 종료");
		}
		// 분
		for(int i = 0; i < 60; i++) {
			// 초
			for(int j = 0; j < 60; j++) {
			System.out.printf("%d분 %02d초 \n", i, j);	
			}
		}
		
		// 구구단
		int dan = 9;
		for ( int i = 2; i <= dan; i++) {
			System.out.printf("  <%d 단> \n",i);
			for( int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();  // 줄바
		}
		
		int dice1;
		int dice2;
		System.out.println( "<2개의 주사위 눈의 합이 6인 경우의 수>");
		for( dice1 = 1; dice1 <= 6; dice1++) {
				for( dice2 = 1; dice2 <= 6; dice2++) {
					if ((dice1 + dice2) == 6) {
						System.out.printf("                  %d + %d = %d \n", dice1, dice2, (dice1 + dice2));
					}
				}			
		}
		
		int answer = 60;
		
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				int sum = (4 * x) + (5 * y);
				if(sum == answer) {
					System.out.printf("x = %d, y = %d일 때, 4x + 5y = %d \n", x, y, answer);
				}
			}
		}
		
			
		
		
		
		
	}

}
