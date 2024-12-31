package scanner;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 사용자의 이름을 입력 받음 
		String inputName = "";
		

		do {
			System.out.println("이름을 입력해주세요:");
			inputName = scan.nextLine();
		} while(inputName.equals(""));
		
		System.out.println(inputName + " 님 환영합니다");
	}

}
