package method;

public class Test {

	public static void main(String[] args) {

		// Call a method 
		printHello();
		System.out.println("-----------------------------------------------------");

		// Call a method2
		gugudan();
		System.out.println("-----------------------------------------------------");

		// Call a method3
		System.out.println("1 ~ 10까지 정수의 합: " + sum());
		System.out.println("-----------------------------------------------------");
		
		// Call a method4
		String weather = getWeather();
		System.out.printf("오늘의 날씨: %s", weather);
	}// main method 
	// 1. Parameter(x), return(x)
	
	// Define a method
	public static void printHello() {
		for(int i = 1; i <= 10; i++) {
		System.out.println(i + ": Hello, world");
		}
	}
	// -------------------------------------------------------------
	public static void gugudan() {
		for(int i = 2; i <= 9; i++) {
			System.out.printf("  <%d단> \n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d \n", i, j, (i * j));
			}
			System.out.println(); // line break
		}
	}
	// -------------------------------------------------------------
	public static int sum() {
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			total += i;		
		}
		return total;
	}
	// -------------------------------------------------------------
	public static String getWeather() {
		String Sunny = "맑음";
		String cloudy = "흐림";		
		String rainny = "비";
		String snowy = "눈";
		return rainny;
	}
}// class 
