package array;

public class Test {

	public static void main(String[] args) {
		// int형 배열 공간 5개를 생성(arr)하고 임의의 정수 5개로 초기화 한 후 출력
		
		// 배열 선언 및 생성
		int[] arr = new int[5];
		// 배열 초기화
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		// 공식을 사용하여 모든 배열 인덱스에 접근 후 출력 
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %s \n", i , arr[i]);
		}
		
		System.out.println("==================================");
		
		// boolean 타입 데이터 3개를 대입할 배열을 생성 
		boolean[] arrB = new boolean[3];
		
		arrB[2]= true;
		
		for(int i = 0; i < arrB.length; i++) {
			System.out.printf("arrB[%d] = %s \n", i , arrB[i]);
		}
		
		System.out.println("==================================");

		//String type 배열 3개를 생성 
		String[] arrT = new String[3];
		
		arrT[0] = "홍길동";
		arrT[1] = "이순신";
		
		for(int i = 0; i < arrT.length; i++) {
			System.out.printf("arrT[%d] = %s \n", i , arrT[i]);
		}
		
		System.out.println("==================================");
		
		double[] arrD = new double[5];
		
		arrD[0] = 1.1;
		arrD[1] = 2.22;
		arrD[2] = 3.333;
		arrD[3] = 4.4444;
		
		for(int i = 0; i < arrD.length; i++) {
			System.out.printf("arrD[%d] = %f \n", i , arrD[i]);
		}
	}// main

}// class Test 
