package method;

public class Ex3 {

	public static void main(String[] args) {

		//5. 파라미터가 2개 이상인 Method 호출 
		String snack = "새우깡";
		int myMoney = 1000;
		System.out.println("오빠: 동생아! 새우깡이랑 1000원 줄테니 쿠크다스로 바꿔와줘~");
		String newSnack = sister_5("새우깡", 1000);
		System.out.println("동생이 바꿔다 준 것: " + newSnack);
	}
	
	public static String sister_5(String snackName, int money) {
		System.out.printf("동생: %s 과자와 %d원을 받았다. \n", snackName, money);
		
		System.out.printf("동생: %s을 쿠크다스로 교환했다. \n", snackName);
		String newSnack = "쿠크다스";
		return newSnack;
	}

}
