package switch_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 *  입력받은 월(month) 이 다음과 같을 때 월의 일수 출력 
		 *  - 1, 3, 5, 7, 8, 10, 12월의 경우: "한 달은 31일" 출력
		 *  - 4, 6, 9, 11월일 경우: "한달은 30일" 출력
		 *  - 2월일 경우: "한달은 28일" 출력 
		 *  
		 */
	
		int month = 2;
		
		switch(month) {
			case 12:
				System.out.printf("%d월은 31일 까지\n", month);
				break;
			case 11:
				System.out.printf("%d월은 30일 까지\n", month);
				break;
			case 10:
				System.out.printf("%d월은 31일 까지\n", month);
				break;
			case 9:
				System.out.printf("%d월은 30일 까지\n", month);
				break;
			case 8:
				System.out.printf("%d월은 31일 까지\n", month);
				break;
			case 7:
				System.out.printf("%d월은 31일 까지\n", month);
				break;
			case 6:
				System.out.printf("%d월은 30일 까지\n", month);
				break;
			case 5:
				System.out.printf("%d월은 31일 까지\n", month);
				break;
			case 4:
				System.out.printf("%d월은 30일 까지\n", month);
				break;
			case 3:
				System.out.printf("%d월은 31일 까지\n", month);
				break;
			case 2:
				System.out.printf("%d월은 28일 까지\n", month);
				break;
			case 1:
				System.out.printf("%d월은 31일 까지\n", month);
				break;
		}
		
		System.out.println("------------------------------------");
		
		switch(month) {
		case 1: // 결과값이 1, 3, 5, 7, 8, 10, 12 일 
		case 3:// 모든 case 문에서 "한달은 31일" 문자열을 출력하는데 
		case 5:// 각 case 문에서 모두 출력하지 않
		case 7:// 마지막 case 문에서만 출력하고 나머지를 비워두
		case 8:// break 문이 없으므로 12월까지 내려가서 출력문을 실
		case 10:
		case 12:
			System.out.printf("%d월은 31일 까지\n", month);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.printf("%d월은 30일 까지\n", month);
			break;
		case 2:
			System.out.printf("%d월은 28일 까지\n", month);
			break;
			}
		
//		switch(month) {
//			case 1: case 3: case 5: case 7: case 8: case 10:
//			case 12: System.out.printf("%d월은 31일 까지\n", month); break;
//		}
	}

}
