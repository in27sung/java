package if_;

public class Test3 {

	public static void main(String[] args) {
		// 문자 ch에 대해 대문자, 소문자, 숫자 판별
		// => 위의 모든 조건이 false일 때 "기타 문자" 출력
		
		char ch = 'a';
		
		if(ch >= 'A' && ch <= 'Z' ) {
			System.out.println(ch + ": 대문자 입니다.");
		}
		else if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch + ": 소문자 입니다.");
		}
		else if(ch >= '0' && ch <= '9') {
		}
		else {
			System.out.println(ch + ": 기타문자 입니다");
		}
		
		System.out.println("------------------------------------");
		
		
		// 문자 ch 가 대문자일 때 소문자로 변환하고, 소문자일 때 대문자로 변환
		// => 대문자, 소문자가 아닐 경우 "변환 불가!" 출력
		
		ch = 'b';
		
		if(ch >= 'A' && ch <= 'Z' ) {
			System.out.println(ch + ": 대문자 입니다.");
			ch += 32;
			System.out.println(ch);
		}
		else if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch + ": 소문자 입니다.");
			ch -= 32;
			System.out.println(ch);
		}
		else if(ch >= '0' && ch <= '9') {
		}
		else {
			System.out.println(ch + ": 기타문자 입니다");
			System.out.println("변환불가!");
		}
		
		System.out.println("------------------------------------");
		
		/*
		 *  학생의 점수를 입력받아 학점 계산 후 출력
		 *  - 점수(정수형)를 저장할 변수 score를 선언하고 임의의 점수 저장
		 *  - 학점(문자열)을 저장할 변수 grade를 선언하고 널스트링("") 저장
		 * 
		 * if문을 사용하여 다음 주고너에 맞는 학점을 계산하고
		 * 계산 결과에 따른 학점을 문자열로 gradde 변수에 저장
		 * 학점 "A": 점수가 90 ~ 100
		 * 학점 "B": 점수가 80 ~ 89
		 * 학점 "C": 점수가 70 ~ 79
		 * 학점 "D": 점수가 60 ~ 69
		 * 학점 "F": 점수가 0 ~ 59
		 * 
		 * 
		 * 
		 */
		
		int score = 74;
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
			System.out.printf("%d점의 학점:  %s", score, grade);
		}
		else if(score >= 80 && score < 90 ) {
			grade = "B";
			System.out.println(score + "점의 학점: " + grade);
		}
		else if(score >= 70 && score < 80 ) {
			grade = "C";
			System.out.println(score + "점의 학점: " + grade);
		}
		else if(score >= 60 && score < 70 ) {
			grade = "D";
			System.out.println(score + "점의 학점: " + grade);
		}else if(score >= 0 && score < 60) {
			grade = "F";
			System.out.println(score + "점의 학점: " + grade);			
		}
		
		
		
	}

}
