package method;

public class Ex2 {

	public static void main(String[] args) {
		 /* < Method 형태 > 
		 * 1. parameter x, return x 
		 * 2. parameter x, return o 
		 * 3. parameter o, return x 
		 * 4. parameter o, return o
		 */
		
		System.out.println("오빠: 동생아! 돈을 줄테니 필요할 때 써");
		sister_3(1000); // Argument 
		System.out.println("-----------------------------------------------------");
		System.out.println("오빠: 동생아! 만원을 줄테니 내 새우깡도 사줘!");
		String snack = sister_4(10000);
		System.out.println("동생이 사다준 것: " + snack);
	}//main method
	// 3. parameter(o), return(x)
	public static void sister_3(int money) { // Parameter 
		System.out.printf("동생: 오빠가 준 돈은 %d원이다. \n", money);
		int snack = 1000;
		money -= snack;
		if(money <= 0) {
			System.out.println("남은돈 없음");
			return;
		}
		System.out.printf("동생: 과자를 사먹고 %d원이 남았다. \n", money);
	}
	// 4. parameter(o), return(o)
	public static String sister_4(int money) {
		String snack = "새우깡";
		System.out.printf("동생: 오빠가 준 돈은 %d원이다. \n", money);
		money -= 1000;
		System.out.printf("동생: %s 사고 %d원이 남았다. \n", snack, money);
		return snack;
	}

}//class
