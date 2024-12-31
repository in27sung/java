package array;

public class Ex2 {
		
	public static void main(String[] args) {
		
		/*
		 * <배열 선언, 생성, 초기화 한꺼번에 수행하는 문법>
		 * 데이터타입[] 변수명 = {데이터1, 데이터2, ..., 데이터n};
		 * -> 배열 생성 문법을 별도로 명시하지 않고
		 * 		중괄호를 사용하여 초기화할 데이터를 리터럴 형태로 전달하면
		 * 		해당 데이터 개수만큼 배열 공간이 자동으로 생성됨
		 * -> n개 만큼의 공간을 생성하면서 인덱스 번호가 0 ~ n-1까지 부여되고
		 * 		자동으로 기본값으로 초기화 됨
		 * 
		 */
		
//		int[] arr = new int[5];
//		
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		
		// 위의 문장들을 하나로 결합하여 리터럴로 즉시 초기화까지 수행 
		int[] arr = {1,2,3,4,5};
		// 추가적인 데이터 저장 불가 
		
		// 배열 arr의 모든 요소 출력 
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------------------------------");
		
		// int형 배열 arr2를 먼저 선언한 후
		// 별도로 정수형 리터럴 1, 2, 3, 4, 5로 한꺼번에 초기화하는 경우 
		
		int[] arr2;
//		arr2 = {1, 2, 3, 4, 5}; 
//		Array constants can only be used in initializers
		
		arr2 = new int[] {1, 2, 3, 4, 5};
		//-> 주의! 배열 크기는 지정하지 않도록 한다 
		
		System.out.println("---------------------------------------");
		// String type 문자열 3개 ("Java", "JSP", "SPRiNG") 를 저장 
		// 배열 strArr 을 생성하고 리터럴로 즉시 초기화까지 수행 후 출력 
		String[] strArr  = {"JAVA", "JSP", "SPRING"};
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("=============================");
		
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		int[] c = {7, 8, 9};
		
		a = b; // b의 주소값을 a에 저장 
		// 기존에 a가 참조한던 1,2,3 저장 공간을 버리고 
		// b가 가리키는 4, 5, 6 저장 공간의 주소값을 전달 받아 처리하게 됨
		// 이때 기존 1, 2, 3 저장 공간은 더 이상 참조되지 않으므로 
		// 불필요한 메모리 공간이 되어 Garbage Collector에 의해 정리 대상 됨
		// -> 즉, 더 이상 필요없는 메모리 공간은 자동으로 정리(삭제) 됨
		
	
		b = c; // c의 주소값을 b에 저장
		// 기존에 b가 참조하던 4, 5, 6 저장 공간을 버리고
		// c가 가리키던 7, 8, 9 저장 곤간의 주소값을 전달받아 참조 
		// 이때, 기존 4, 5, 6 저장 공간은 여전히 a 에 의해서 참조되괴 있으므로
		// Garbage Collector에 의한 정리 대상이 아니다.
		
		
		
		
  		
 	}// main
}// class Ex2
