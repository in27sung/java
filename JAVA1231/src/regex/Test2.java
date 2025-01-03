package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test2 {
	
	public static void main(String[] args) {
		/*
		 * Pattern 클래스와 macther 클래스를 활용하여 
		 * 입력된 패스워드에 대한 규칙(복잡도) 검사 
		 * 
		 * 규칙1. 패스워드 길이: 영문자, 숫자, 특수문자(!, @, #, $, %) 조합 8자리 ~ 16자리
		 * 규칙2. 영문자(대, 소문자), 숫자, 특수문자(!, @, #, $, %) 중 2가지 이상 조합 
		 * 		  -> 4가지 모두 조합 시: 안전
		 * 		  -> 3가지 조합 시: 보통
		 * 		  -> 2가지 조합 시: 미흡 
		 * 		  -> 1가지 조합 시: 사용 불가능한 패스워드 
		 */
		
		int count = 0;
		System.out.println("Password: ");
		Scanner s = new Scanner(System.in);
		String password = s.nextLine();
//		String password = "DAAAA%df123"; // 원본 문자열 
		
		// 패턴 정의
		String regexUpper = ".*[A-Z].*";   // 대문자 포함 여부
		String regexLower = ".*[a-z].*";   // 소문자 포함 여부
		String regexNumber = ".*[0-9].*";  // 숫자 포함 여부
		String regexSc = ".*[!@#$%].*";    // 특수문자 포함 여부
		String regexLength = "^.{8,16}$";  // 패스워드 길이 검사 (8~16자리)
		
		// 길이 검사
		if (!password.matches(regexLength)) {
			System.out.println("패스워드 길이가 유효하지 않습니다.");
			return;
		}
		
		// 각 조건 검사 (각각 실제로 패스워드에 존재하는지 확인)
		boolean hasUpper = Pattern.compile(regexUpper).matcher(password).find();
		boolean hasLower = Pattern.compile(regexLower).matcher(password).find();
		boolean hasNumber = Pattern.compile(regexNumber).matcher(password).find();
		boolean hasSpecial = Pattern.compile(regexSc).matcher(password).find();
		
		// 조건 충족 개수 확인
		if (hasUpper) count++;
		if (hasLower) count++;
		if (hasNumber) count++;
		if (hasSpecial) count++;
		
		// 결과 출력
		switch(count) {
			case 4:
				System.out.println(password + " - 안전"); break;
			case 3:
				System.out.println(password + " - 보통"); break;
			case 2:
				System.out.println(password + " - 미흡"); break;
			default:
				System.out.println(password + " - 사용 불가능한 패스워드");
		}
		
	}

}
