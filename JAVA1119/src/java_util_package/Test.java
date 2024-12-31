package java_util_package;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Math.random();
		
		Random ran = new Random();
		
		for(int i = 0; i < 10; i++) {
//		System.out.printf("인증번호: %04d\n", ran.nextInt(10000));
		// 4자리 수에 빈칸을 0으로 채움(padding)
		int ranNum = ran.nextInt(10000);
		
		String strNum = 
				String.format("인증번호: %04d\n", ranNum);
		
		System.out.println(strNum);
		}
		
		// ex) 6자리 인증번호(000000 ~ 999999) 생성
		System.out.println("===================================================");
		
		// 난수를 활용하여 특정 범위의 값을 발생시키기 
		// E-mail 인증코드(문자 생성)
		// 1. 인증코드에 사용될 문자를 배열로 모두 저장하기 
		char[] codeTable = {
				'A','B','C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L','M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
				'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
				'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
				'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
				'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7',
				'8', '9', '!', '@', '#', '$', '%', '^', '*'
		};
		
		String strCode = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^*";
		char[] codeTable2 = strCode.toCharArray();
		
		// 2. Random 클래스 인스턴스 생성 및 인증코드 길이 정하기 
		Random r2 = new Random();
		String code = "";
		int codeLength = 20;
		
		// 3. 원하는 코드 길이만큼 for문을 사용하여 반복문 처리 
		for(int i = 1; i <= codeLength; i++) {
			// 배열 크기를 난수의 범위로 지정하여 난수 생성 
		int index = r2.nextInt(codeTable.length);
//		System.out.println(index+": "+codeTable[index]);
		code += codeTable[index];
			
		}
		System.out.println("인증코드: " + code);
		String code_result = code.toString();
		System.out.println(code_result);
				
	}
	
}
