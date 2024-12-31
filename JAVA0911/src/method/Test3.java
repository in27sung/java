package method;

public class Test3 {

	public static void main(String[] args) {
		// 5. parameter more than 2
		int result = calculator(10, 20);
		System.out.println(result);
		System.out.println("-----------------------------------------------------");
		int result2 = calculator2(10,  '-', 20);
		System.out.println(result2);

	}
	public static int calculator(int x, int y) {
		int result = x + y;
		System.out.printf("%d + %d = ",x, y);
		return result;
	}
	public static int calculator2(int x, char operator,  int y) {
		if (operator == '+') {
			System.out.printf("%d + %d = ",x, y);
			return  x + y;
		}
		else if(operator == '-') {
			System.out.printf("%d - %d = ",x, y);
			return  x - y;
		}else {
			System.out.println("Error");
			return 0;
		}
	}
	
	
}
