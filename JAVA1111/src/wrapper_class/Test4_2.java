package wrapper_class;

import java.util.Scanner;

public class Test4_2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("패스워드를 입력하세요: ");
        String attempt = scanner.nextLine(); // Read the entire line as a string
        
        char[] charArray = attempt.toCharArray(); // Convert the string to a char array
        int safeScore = 0;
        String safety = null;
        
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasExclation = false;
        
        // Display each character
        for (char ch : charArray) {
			if(Character.isUpperCase(ch) && !hasUppercase) {
				System.out.printf("%c는 대문자\n", ch);
				hasUppercase = true;
				safeScore++;
			} else if(Character.isLowerCase(ch) && !hasLowercase) {
				System.out.printf("%c는 소문자\n", ch);
				hasLowercase = true;
				safeScore++;
			} else if(Character.isDigit(ch) && !hasDigit) {
				System.out.printf("%c는 숫자\n", ch);
				hasDigit = true;
				safeScore++;
			} else if(ch == '!' && !hasExclation) {
				System.out.printf("%c 입력\n", ch);
				hasExclation = true;
				safeScore++;
			}
        }
        
        switch(safeScore) {
        case 4: safety = "안전"; break;
        case 3: safety = "보통"; break;
        case 2: safety = "위험"; break;
        default: safety = "사용 불가";
        }
        
        System.out.printf("패스워드 안전도 점수(%d): %s", safeScore, safety);
	}

}
