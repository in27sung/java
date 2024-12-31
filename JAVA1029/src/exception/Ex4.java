package exception;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 사용자에 의한 예외 발생(throw)
		 * - 자바 기준으로 예외가 아닌 상황에서도
		 *   개발자(사용자)의 의도대로 예외를 직접 발생시키는 것
		 * - throw 키워드를 사용하여 발생시킬 예외 클래스 객체를 지정
		 *   => 예외 클래스의 인스턴스를 생성하여 강제로 해당 예외 발생시킴
		 * - 예외 클래스 인스턴스를 변수에 저장하여 발생시켜도 되지만
		 *   주로 일회성으로 예외를 발생시키고 재사용할 일이 없으므로
		 *   별도의 변수 없이 임시 객체 형태로 사용하는 경우가 많음
		 *   (new 예외클래스명() 형태로 객체를 생성하여 전달)
		 *   
		 * < 기본 문법 >
		 * 예외를 발생시킬 코드 위치에서
		 * throw 예외객체;  
		 * -------------------------------------------------------------
		 * 사용자 정의 예외 클래스
		 * - 기존의 예외클래스가 발생시킨 예외와 일치하지 않을 경우
		 *   Exception 클래스로 예외 처리 시 발생한 예외를 파악하기 힘들다.
		 * - 사용자가 직접 예외 클래스를 작성하여 발생시킬 예외에 맞는
		 *   객체를 만들어서 전달하면 예외 파악이 쉬워진다.
		 * - 사용자 정의 예외 클래스 정의 시 예외 클래스를 상속 받아 정의
		 *   (ex. Exception 클래스를 상속받는 서브클래스 정의)
		 * - 보통, 생성자를 정의하여 슈퍼클래스에 예외메시지만 초기화
		 */
		
		try {
			printScore(150);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("-------------------------");
		
		try {
			userExceptionMethod(150);
		} catch (InvaildScoreException e) {
			e.printStackTrace();
		}
		

	} // main() 메서드 끝
	
	public static void printScore(int score) throws Exception {
		/*
		 * 점수를 입력받아 학점을 계산 후 출력하는 메서드
		 * 단, 점수 범위를 0 ~ 100 사이의 정수로 한정
		 * 만약, 0 ~ 100 사이가 아닐 경우 비정상적인 점수이므로 오류 발생 필요함!
		 * 그러나, int형 범위를 벗어나지 않으므로 자바 기준으로 예외가 아님!
		 */
		if(score < 0 || score > 100) {
//			System.out.println(score + "점 : 점수 입력 오류!");
			// throw 키워드를 사용하여 해당 예외 클래스 객체 생성
			// => 단, 점수 입력 오류에 대한 별도의 예외 클래스가 없으므로
			//    기존의 클래스 활용(일치하는 클래스가 없으면 Exception 클래스 사용)
//			Exception e = new Exception("점수 입력 오류 - " + score + "점!");
			// => 예외 발생 시 표시할 예외 메시지를 생성자 파라미터로 전달
			
			// throw 키워드 뒤에 예외 객체를 지정하여 해당 예외를 발생시킴
//			throw e;
			
			// 위의 방법은 Exception 객체의 변수 e 를 한 번만 사용함
			// 별도의 변수 없이 바로 객체를 생성하여 예외 발생 가능 = 임시 객체
			throw new Exception("점수 입력 오류 - " + score + "점!");
		}
	} // printScore() 메서드 끝

	public static void userExceptionMethod(int score) throws InvaildScoreException {
		if(score < 0 || score > 100) {
			// Exception 클래스 대신 사용자 정의 예외클래스인
			// InvaildScoreException 클래스를 사용하여 예외 발생시킬 수 있음
			throw new InvaildScoreException("점수 입력 오류 - " + score + "점!");
		}
	}
	
} // Ex4 클래스 끝

// 사용자 정의 예외 클래스 작성
// - 원하는 이름의 서브클래스 정의 후 예외클래스를 상속 받음
// - 주로 Exception 클래스를 상속받아 정의함
class InvaildScoreException extends Exception {
	
	// 생성자를 정의하여 예외 메시지를 슈퍼클래스의 생성자에 전달
	public InvaildScoreException(String message) {
		super(message);
	}
}




