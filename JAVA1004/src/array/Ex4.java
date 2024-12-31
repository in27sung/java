package array;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 2차원 배열 
		 * - 1차원 배열 여러개의 묶음음을 관리하는 배열 
		 * - 행과 열로 이루어진 테이블(표) 구조와 유사한 구조의 배열 
		 * 		=> 행과 열의 인덱스는 1차원 배열과 동일(0부터 시작)
		 * 
		 * < 2차원 배열 선언 및 생성 기본 문법>
		 * 데이터타입[][] 변수명 = new 데이터타입[행크기][열크기];
		 * 
		 * <2차원 배열 접근 기본 문법>
		 * 변수명[행인덱스][열인덱스];
		 * 
		 * <2차원 배열 선언, 생성, 초기화를 한꺼번에 수행하는 문법>
		 * 데이터타입[][] 변수명 = {
		 * 		{값1, 값2, ... , 값n}, // 0행(0열, 1열, ... , n열)
		 * 		{값1, 값2, ... , 값n}, // 1행(0열, 1열, ... , n열)
		 *		...
		 * 		{값1, 값2, ... , 값n}, // n행(0열, 1열, ... , n열)
		 * };
		 * 
		 * <2차원 배열 크기>
		 * 1. 행의 크기: 변수명.length 
		 * 2.열의 크기: 변수명[행번호].length 
		 * 
		 * < 2차원 배열의 모든 요소에 차례대로 접근하는 문법>
		 * for(int i = 0; i < 변수명.length; i++) { // 행 반복 
		 * 			
		 * 			for(int j = 0; j <변수명[i].length; j++){ // 열 반복
		 * 				//변수명 [i][j] 로 배열 각 요소에 접근 
		 * 		}
		 * }
		 */
		
		//int형 2차원 배열 arr 생성 (3행 2열 크기)
//		int[][] arr;
//		arr = new int[3][2]; //3행 2열 
		
		// 위의 두 문장을 한 문장으로 결합
		int[][] arr = new int[3][2];
		/*
		 * 			   				0열 						1열 
		 * 			------------------------------------
		 *1행  |				[0][0]			|			[0][1]					|
		 *		   |------------------------------------|							
		 *2행  |			[1][0]			|			[1][1]					|
		 *		   |------------------------------------|
		 *3행  |			[2][0]			|			[2][1]					|
		 *			------------------------------------
		 */
		  int[][] arr2 = {
		 			//	 전체 블록 내의 중괄호(블록) 개수 = 행의 개수 
		 		// 내부 중괄호(블록) 내의 데이터 개수 = 열의 개수 
		 		{1, 2},  // 0행
		 		{3, 4}, // 1행
		 		{5, 6}, // 2행
		 };
		
		
		arr[0][0] = 1; arr[0][1] = 2;
		arr[1][0] = 3; arr[1][1] = 4;
		arr[2][0] = 5; arr[2][1] = 6;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		
		System.out.println("행" + arr.length);
		System.out.println("열" + arr[0].length);
		
		// 반복문을 사용하여 2차원 배열의 모든 요소에 차례대로 접근하기 
		// 1. 바깥쪽 for문을 사용하여 행 크기 만큼 반복(1차원 배열 접근과 동일)
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%d ",arr2[i][j]);
			}
			System.out.println();
		}
		
		/*
		 * 이름을 저장하는 배열 names 생성하고 다음과 같이 초기화 
		 * ----------------------------------------------------------
		 * 0행: 김상형	박예진 	이광현
		 * 1행:  장용석	정경수		조한수	
		 * 2행:  허  민 	황인성		강진석
		 * ----------------------------------------------------------
		 */
		
		String[][] nameArr = new String[3][3];
		
		String[][] nameArr2 = {
				{"김상형", "박예진", "이광현"},
				{"장용석", "정경수", "조한수"},
				{"허    민", "황인성", "강진석"}
		};
		for(int i = 0; i < nameArr2.length; i++) {
			for(int j = 0; j < nameArr2[i].length; j++) {
				System.out.printf("%s  ",nameArr2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("================================");
		
		// 2차원 배열은 행을 먼저 생성한 후 별도로 열을 각각 생성 가능하다!
		// 데이터타입[][] 배열명 = new 데이터타입 [행크기][];
		int[][] arr3 = new int[3][]; // 3행의 공간이 먼저 생성됨 
		
		// 각 행에 접근하여 열을 생성하는 코드 작성 
		
//		arr3[0] = new int[3];
//		// -> 정수형 데이터 3개를 저장하는 공간을 생성하는 후 0번 행에 주소 저장 
//		
//		arr3[1] = new int[2];
//		// -> 정수형 데이터 2개를 저장하는 공간을 생성한 후 1번 행에 주소 저장
//		
//		arr3[2] = new int[4];
//		// -> 정수형 데이터 4개를 저장하는 공간을 생성한 후 2번 행에 주소 저장 
//		
//		arr3[0][0] = 1; arr3[0][1] = 2; arr3[0][2] = 3;
//		arr3[1][0] = 1; arr3[1][1] = 2;
//		arr3[2][0] = 1; arr3[2][1] = 2; arr3[2][2] = 3; arr3[2][3] = 4;
		//===========================================
		
		//각 행의 공간에 열 공간을 생성하면서 데이터 초기화까지 수행
		arr3[0] = new int[] {1, 2, 3};
		arr3[1] = new int[] {1, 2};
		arr3[2] = new int[] {1, 2, 3, 4};
		//===========================================
		
		int[][] arr4 = {
				{1, 2, 3},
				{1, 2},
				{1, 2, 3, 4}
		};
		
		// 중첩 for문을 사용하여 2차원 배열 차례대로 접근 
		for(int r = 0; r < arr3.length; r++){
			for(int c = 0; c < arr3[r].length; c++) {
				System.out.print(arr3[r][c] + " ");
			}
			System.out.println();
		}
		
/**
 *  <Syntax>
 *  for (type variableName : arrayName){
 *  	// code block to be executed 
 *  }
 */	
		for(int[] row : arr4) {
			for(int i : row) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}// Main
}// Calss Ex4
