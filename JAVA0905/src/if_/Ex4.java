package if_;

public class Ex4 {

	public static void main(String[] args) {
		
		/*
		 * 중첩	 if문
		 * - if문(else if 또는 else	 포함) 블록 내에서
		 *   또 다른 if문을 사용하여 조건식을 판별하는 것
		 *    = if 문 블록을 여러 번 중첩시키는 것
		 *    
		 *    <기본 문법>
		 *    if(조건식1){
		 *    		if(조건식2){
		 *    		 		// 조건식1이 true이고, 조건식 2도 true 일 때 실
		 *    		}else{
		 *    				//조건이1이 false 일 때 
		 *    		}
		 *    }
		 *    
		 * 
		 * 
		 * 
		 */
	
		
		
		int score = 23;
		String grade = "";
		
		if(score >= 0 && score <= 100) { //점수의 범위가 0~100 인지 판별
			
			System.out.println("점수 입력 완료!");
			
			if(score >= 90) {
				grade = "A";
			}
			else if(score >= 80) {
				grade = "B";
			}
			else if(score >= 70) {
				grade = "C";
			}
			else if(score >= 60) {
				grade = "D";
			}else{
				grade = "F";
			}
			System.out.printf("%d점의 학점:  %s \n", score, grade);		
		}
		else {
			System.out.printf("%d: 점수 입력 오류 \n", score);	
			}

	
		System.out.println("------------------------------------");
	
	
	
	
	
	
	
	
	
	}

}
