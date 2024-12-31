package scanner;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		int a = 1;
		/*
		 * Scanner
		 * - 화면, 파일, 문자열과 같은 입력소스로부터 문자데이터를 
		 *   읽어오는데 사용되는 클래스 
		 * - 여러 형태의 생성자를 오버로딩하여 지원하므로 다양한 
		 * 	 입력소스로부터 데이터를 읽을 수 있음. (기본 생성자x)
		 *   (ex. scanner(String source), scanner(file source) 등)
		 * - 정규표현식(Refular Expression)을 이용한 라인단위의 검색을 지원 
		 * - nextXXX() 메서드를 통해 입력받은 문자를 다시 변환하는 수고를 덜어줌 
		 * 	 (ex. nextInt(): int, nextLine(): String)
		 * -scanner를 사용하기 위해서는 java.util.Scanner import 필요 
		 * 
		 * <Scanner 기본 문법>
		 * Scanner 변수 = new Scanner(); // 입력을 받을 시 System.in 활용 
		 * 변수.nextXXX() 메서드를 호출하여 입력 받음 
		 */
		
		Scanner scan = new Scanner(System.in); // System.in: 키보드 입력 
		
		String input = new String();
		String input2 = new String();
		
		if(input == input2) {
			System.out.println("주소값: True");
		}else {
			System.out.println("주소값: False");
		}
		
		if(input.equals(input2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		String input3 = "";
		
		do {
			System.out.println("원하는 값을 입력하세요.\n"
					+ "프로그램을 종료하려면 'Q'를 입력하세요:");
			// 입력한 값을 라인 단위로 읽어옴 
//			input3 = scan.next(); // -> 공백을 허용하지 않을 때 사용
			// 공백을 구분자(delimiter)로 생각함 
			
			input3 = scan.nextLine();
			// 라인 전체를 문자열로 인식 
			
			System.out.println("입력하신 값은 " + input3 + " 입니다");
		} while(!input3.equals("Q"));
		System.out.println("프로그램 종료");
		
		System.out.println("=================================================");
		
		// nextInt(): 정수만 입력 받음 
		
		try {
			System.out.println("정수만 입력하세요: ");
			int num = scan.nextInt();
			System.out.println(num);
		} catch (Exception e) {
			// 오류 발생 시
			System.out.println("프로그램을 종료합니다");
//			e.printStackTrace();
		}
		
		System.out.println("=================================================");
		
		// nextDouble() : 실수만 입력받음 
		try {
			System.out.println("실수만 입력하세요: ");
			Double Dnum = scan.nextDouble();
			System.out.println(Dnum);
		} catch (Exception e) {
			// 오류 발생 시
			System.out.println("프로그램을 종료합니다");
//			e.printStackTrace();
		}
		
		System.out.println("=================================================");
		
		// nextBoolean() : 실수만 입력받음 
		try {
			System.out.println("ture 또는 false 만 입력하세요: ");
			boolean tf = scan.nextBoolean();
			System.out.println(tf);
		} catch (Exception e) {
			// 오류 발생 시
			System.out.println("프로그램을 종료합니다");
//			e.printStackTrace();
		}
	}

}
