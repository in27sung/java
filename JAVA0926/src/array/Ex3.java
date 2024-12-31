package array;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 배열 내의 데이터에 대한 연산 누적 
		 * 0. 연산을 누적할 변수 선언 및 초기화 
		 * 1. 배열 생성 및 데이터 저장 
		 * 2. for문을 사용하여 배열 내의 모든 인덱스에 차례대로 접근
		 * 		-> 배열의 인덱스 번호를 제어변수로 지정하여
		 * 		     해당 배열 내의 데이터를 누적 변수에 누적 
		 * 3. for문 종료 후 누적 변수 값 사용 	
		 */
		
		// 0. 연산을 누적할 변수 선언 및 초기화 
		int total = 0;
		
		// 1. 정수형 데이터 1 ~ 10까지를 저장하는 배열 arr 생성 
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 2. for문을 사용하여 배열 내의 모든 인덱스에 차례대로 접근
		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			total += arr[i]; // 배열 arr의 i번째 인덱스 데이터를 total 누적 
		}
		// 3. for문 종료 후 누적 변수 값 사용 
		System.out.println(total);
		
		System.out.println("=================================");
		
		int oddTotal = 0;
		int evenTotal = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
			evenTotal += arr[i];
			}
			else {
				oddTotal += arr[i];
			}
		}
		System.out.println("배열의 홀수의 값: " + oddTotal);
		System.out.println("배열의 짝수의 값: " + evenTotal);

		// 배열 내의 정수 중 최대값을 max에 저장 후 출력 
		int[] array = {1, 5, 3, 8, 7};
		int max = array[0];
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("최대값: " + max);
		
		System.out.println("==========================");
		
		int[] array2 = {-9, -5, -3, -8, -7};
		
		// array2 배열의 0번 인덱스 데이터를 최대값으로 지정 
		int max2 = array2[0];
		
		//주의! 0번 데이터를 이미 최대값으로 저장했기 때문 
		// 0번 인덱스를 제외한 나머지값만 비교하면 됨(1번 인덱스부터 반복)
		
		for(int i = 1; i < array2.length; i++) {
			System.out.println(array2[i] + " vs " + max2);
			if(array2[i] > max2) {
				max2 = array2[i];
			}
		}
		System.out.println("max2 = " + max2);
	}// main

}// class Ex3
