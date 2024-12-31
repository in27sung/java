package string;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		String jumin = "111111-111111";
		Scanner sc;
//		do {
//			sc = new Scanner(System.in);
//			System.out.println("주민등록번호를 입력하세요: example(XXXXXX-XXXXXXX)");
//			jumin = sc.next();
//		} while (jumin.length() != 14 );
		
		
		if(jumin.charAt(7) == '1' || jumin.charAt(7) == '3') {
			System.out.println("남성");
		} else if (jumin.charAt(7) == '2' || jumin.charAt(7) == '4') {
			System.out.println("여성");
		} else if (jumin.charAt(7) == '5' || jumin.charAt(7) == '6') {
			System.out.println("외국인");
		} else {
			System.out.println("확인불가");
		}
		
		// switch~case 문 사용 
		switch(jumin.charAt(7) ) {
			case '1':
			case '3': System.out.println("남성"); break;

			case '2':
			case '4': System.out.println("여성"); break;

			case '5':
			case '6': System.out.println("외국인"); break;
			default: System.out.println("확인불가");
			
		}
		
		String address = "Address: 부산광역시 부산진구 동천로 109 삼한골든게이트";
		
		System.out.println(address.substring(9));
		System.out.println(address.substring(9, 14));
		
		String address2 = "Address: 부산광역시 부산진구 동천로,Floor: 7층,Tel: 051-803-0909";
		String[] strArr = address2.split(",");
		
		
//		for (String s: strArr) {
//			System.out.println(s);
//		}
		
		
		
		System.out.println("---------------------------------------------------");
		
		for(int i = 0; i < strArr.length; i++) {
//				String[] strArr2 = strArr[i].split(": ");
//				System.out.print(strArr2[1] + " ");
				System.out.print(strArr[i].split(": ")[1] + " ");
		}
		System.out.println();
		
//		for(int i = 0; i < strArr.length; i++) {
//			System.out.println(strArr[i].substring(strArr[i].indexOf(": ") + 2));
//		}
		
		String str = "Hello";
		char[] charArr = str.toCharArray();
		
		String encryptResult = encrypt(charArr, 3);
		
		System.out.println(charArr);
		System.out.println(encryptResult);
		
		
		
	}
	
	public static String encrypt(char[] letter, int num) {
		
		char[] encryptedArr = new char[letter.length];
		
		for(int i = 0; i < letter.length; i++) {
			encryptedArr[i] = (char) (letter[i] + num);
		}
		
		// 출력 형태를 문자열 형태로 출력하고 싶다면?
		// 1. String 생성자 활용 
//		String str = new String(encryptedArr);
//		return str;
		
		// 2. String.valueOf() 메서드 활용 
//		return String.valueOf(encryptedArr);
		
		
		// 3. StringBuilder 활용 
		StringBuilder buffer = new StringBuilder();
		for(char ch : encryptedArr) {
			buffer.append(ch);
		}
		
		String enCryptedStr = buffer.toString();
		return enCryptedStr;
		
//		return Arrays.toString(encryptedArr);
	}

}
