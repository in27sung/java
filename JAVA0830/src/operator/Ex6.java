package operator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * 논리 연산자(&&, ||, !, ^) Logical Operators
		 * - 두 피연산자의 논리적인 판별을 수행하는 연산자
		 * - 피연산자 모두 boolean 타입 데이터(true, false)만 사용 가능하며
		 * 	결과값도 boolean 타입으로 return
		 * 
		 * &&(ampersand) And 연산자
		 * - Returns true if both sataements are true 
		 * 
		 * ||(vertical bar) Logical or
		 * - Returns true if one of the statements is true 
		 * 
		 * !(exclamation mark)  Logical not
		 * - Reverse the result, returns false if the result is ture 
		 * 
		 * ^(caret) XOR 연산자
		 * - 두 피연산자가 서로 다를 경우 결과값이 true이고,
		 * 서로 같은 경우 결과값이 false 
		 * 
		 * - F XOR F = F, F XOR T = T, T XOR F = T, F XOR F = F
		 * 
		 */
		
		boolean a = true;
		boolean b = false;
		
		System.out.println("And(&&) 연산 진리표");
		System.out.println("a(ture) && a(ture) = " + (a && a));
		System.out.println("a(ture) && b(false) = " + (a && b));
		System.out.println("b(false) && a(ture) = " + (b && a));
		System.out.println("b(false) && b(false) = " + (b && b));
		
		System.out.println();
		System.out.println("b(false) && a(ture) = " + (b && a));
		// => '&&' 이면 앞의 boolean 값이 false 이면 뒤의 값 판단을 생략
		// => '&' 이면 앞의 boolean 값이 false 일지라도 뒤의 값을 판단
		
		
		System.out.println("-----------------------------------------------"); 
		
		System.out.println("OR(||) 연산 진리표");
		System.out.println("a(ture) || a(ture) = " + (a || a));
		System.out.println("a(ture) || b(false) = " + (a || b));
		System.out.println("b(false) || a(ture) = " + (b || a));
		System.out.println("b(false) || b(false) = " + (b || b));
		
		System.out.println("-----------------------------------------------"); 
		System.out.println("NOT(!) 연산 진리표");
		System.out.println("!a(ture) = " + (!a));
		System.out.println("!b(false) = " + (!b));
		
		
		System.out.println("-----------------------------------------------"); 
		
		System.out.println("XOR(^) 연산 진리표");
		System.out.println("a(ture) ^ a(ture) = " + (a ^ a));
		System.out.println("a(ture) ^ b(false) = " + (a ^ b));
		System.out.println("b(false) ^ a(ture) = " + (b ^ a));
		System.out.println("b(false) ^ b(false) = " + (b ^ b));
		
		System.out.println("==============================================="); 

		// 관계(비교) 연산자와 결합하여 대소 관계에 대한 논리적인 판별 확인 가능
		
		int num = 1;
		// 두 가지 관계 연산을 각각 적용할 경우
		// => 각 연산자에 대한 결과만 판별함
		System.out.println(num > 5);
		System.out.println(num < 10);
		// ex) num이 5보다 크고, 10보다 작은가?
		System.out.println((num > 5) && (num < 10));
		
		// ex) num이 5보다 작거나, 100보다 큰가?
		
		System.out.println((num < 5) || (num > 100));
		
		num = 150;
		
		// NOT 연산자(!)는 현재 조건을 만족하지 않는가를 판별
		// ex) num이 0보다 작거나 100보다 큰 수가 아닌가?
		
		System.out.println(!(num < 0 || num > 100));
		//                        ||
		System.out.println((num >= 0) && (num <= 100));
		
		
		int age = 20;
		
	
		System.out.println((age >= 20) && (age <= 29));
		
		System.out.println((age < 5) || (age >= 65));
		
		
		
		
	}

}
