package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 2. java.util 
		 */
		
		String src = "Java and JavaScript has no relation."; // 원본 문자열 
		String regex = "Java"; // 정규 표현식 
		
		// 1. Pattern 클래스의 compile() 메서드를 호출하여 Pattern 객체 생성 
		// -> Parameter: 정규표현식 문자열 
		Pattern pattern = Pattern.compile(regex);
		
		// 2. 생성된 PAttern 객체의 matcher() 메서드를 호출하여 matcher 객체 생성
		// -> 파라미터: 검증할 원본 문자열 
		Matcher matcher = pattern.matcher(src);
		
		// 3. 각종 메서드를 호출하여 검증 수행
		// 3-1. matches() 메서들: 정규표현식에 완전히 일치하는지 검사 
		System.out.println("문자열이 정규표현식에 완전히 부합하는가?: " + matcher.matches());
		
		// 3-2. lookingAt() 메서드: 정규표현식으로 시작하는지 검사 
		System.out.println("문자열이 정규표현식으로 시작하는가?: " + matcher.lookingAt());
		
		// 3-3. find() 메서드: 정규표현식을 포함하는지 검사 
		System.out.println("문자열이 정규표현식을 포함하는가?: " + matcher.find());
	}
}
