package lambda;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		/*
		 * 문자열을 입력받ㅇ
		 * 람다식을 사용하여 구현 
		 * Hello와 world를 매개변수값으로 전달하면 
		 * "Hello, world"가 출력  
		 */
//		String s1 = "Hello";
//		String s2 = "World";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 문자열을 입력하세요: ");
		String s1 = scan.nextLine();
		
		System.out.println("두 번째 문자열을 입력하세요: ");
		String s2 = scan.nextLine();
		
		// 객체지향 프로그래밍 방식 
		StringConcatImpl sc = new StringConcatImpl();
		sc.makeString(s1, s2);
		
		// ------------------------------------------------------------
		// makeString() 메서드를 람다식으로 표현 
		
		StringConcat concat = (String s, String v) -> {System.out.println(s1 + ", " + s2);};
		concat.makeString(s1, s2);
	}

}

@FunctionalInterface
interface StringConcat {
	public void makeString(String s1, String s2);
}

class StringConcatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + ", " + s2);
	}
	
}
