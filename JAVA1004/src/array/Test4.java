package array;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		// 정수를 저장하는 2차원 배열 array 생성
		int[][] arr = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		calculator(arr);
		
		System.out.println("========================");
		
		// 학생 이름을 1차원 배열(names)에 저장
		String[] names = {"홍길동", "이순신", "강감찬", "조한수", "이광현"};
		
		String[] subjects = {"    국어", "영어", "수학"};
		
		// 학생 점수를 2차언 배열(score)에 저장
		int[][] scores = {
				{80, 70, 80},
				{90, 90, 90},
				{50, 60, 77},
				{100, 100, 100},
				{80, 80, 60},
		};
		
		System.out.println("                <학생 점수표 > ");
		for(String  i : subjects) {
			System.out.print("           " + i);
		}
		System.out.println();
		for(int r = 0; r < scores.length; r++ ) {
			// 점수를 저장한 2차원 배열의 행 
			System.out.print(names[r]);
			for(int c = 0 ; c < scores[r].length; c++) {
				System.out.printf("     %3d     ", scores[r][c]);
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		
		int[] studentTotal = new int[5];
		System.out.println("<학생별 총점>");
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j <scores[i].length; j++) {
				//	학생 점수 인덱스 중 행번호에 해당하는 인덱스가
				// 학생 총점의 인덱스로 사용될 수 있다 
					studentTotal[i] += scores[i][j];
				}
			System.out.println(names[i] + ": " + studentTotal[i] + "점");
			}
		
				
		
	}// Main
	
	public static void calculator(int[][] arr) {
		int sum = 0;
		double avg = 0;
		int count = 0;
	for(int c = 0; c < arr.length; c++) {
		for(int r = 0; r < arr[c].length; r++) {
			sum += arr[c][r];
			count++;
			}
		}
	avg = (double) sum / count;
	System.out.println("모든 정수의 합:" + sum);
	System.out.println("모든 정수의 평균 값:" + avg);
	}// calculator
	
	public static void studentTotal(String[] names, String[]subjects, int[][] scores) {
		for(String r : names) {
			System.out.print(r);
			for(int[] row : scores) {
				
				for(int i : row) {
					System.out.print(i +  " ");
				}
			}
			System.out.println();
		}
	}
	
}// Class Test4
