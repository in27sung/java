package method_overloading;

public class Test {

	public static void main(String[] args) {
		//PrintOverloading Class instance 생성
		PrintOverloading po = new PrintOverloading();
	
		// 객체의 print() method를 호출하여 정수, 실수, 문자열 전달
	po.print(1);
	po.print(3.14);
	po.print("홍길동");
	po.print();
	
	System.out.println("=============================");
	
	Calculator cal = new Calculator();
	cal.add(1 , 2);
	cal.add(1 , 2, 3);
	cal.add(1 , 2, 3, 4);
	
	Calculator c = new Calculator();
	c.cal('+', 10, 20);
	c.cal('+', 10, 20, 30);
	c.cal('+', 10, 20, 30, 40);
	
	c.cal('-', 100, 10);
	c.cal('-', 100, 10, 20);
	c.cal('-', 100, 10, 20, 30);

	
	}// main
	
}// class Test

// Calculator class define
class Calculator{ //정수를 전달받아 덧셈만 수행하는 add() method define
	// 정수 2개를 전달받아 덧셈 결과 출력 
	public void add(int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
	}
	// 정수 3개를 전달받아 덧셈 결과 출력
	public void add(int num1, int num2, int num3) {
		System.out.println(num1 + " + " + num2 + " + " + num3 +" = " + (num1 + num2 + num3) );
	}
	// 정수 4개를 전달받아 덧셈 결과 출력
	public void add(int num1, int num2, int num3, int num4) {
		System.out.println(num1 + " + " + num2 + " + " + num3 +" + " + num4 +" = " + (num1 + num2 + num3+ num4));
	}
	public void cal(char op, int num1, int num2) {
		if(op == '+') {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
		}
		else if(op == '-') {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
		}
	}
	public void cal(char op, int num1, int num2 ,int num3) {
		if(op == '+') {
			System.out.println(num1 + " + " + num2 + " + " + num3 +" = " + (num1 + num2 + num3) );
		}
		else if(op == '-') {
			System.out.println(num1 + " - " + num2 + " - " + num3 +" = " + (num1 - num2 - num3) );
		}
	}
	public void cal(char op, int num1, int num2, int num3, int num4) {
		if(op == '+') {
			System.out.println(num1 + " + " + num2 + " + " + num3 + " + " + num4 +" = " + (num1 + num2 + num3 + num4) );
		}
		else if(op == '-') {
			System.out.println(num1 + " - " + num2 + " - " + num3 +" - " + num4 + " = " + (num1 - num2 - num3 - num4) );
		}
	}
	
}// class Calculator
// 정수, 실수, 문자열 데이터 1개를 전달받아 출력하는 print() method overloading
// parameter가 없는 print() method까지 정의(-> 줄바꿈)

class PrintOverloading{
	
//	public void print(int i, double d, String s) {
//		System.out.println("정수: " + i );
//		System.out.println("실수: " +  d);
//		System.out.println("문자열: " + s);
//	}
	
	public void print() {//파라미터가 없는 메서드도 오버로딩에 해당 
		System.out.println( );
	}
	public void print(int i) {
		System.out.println("정수: " + i );
	}
	public void print(double d) {
		System.out.println("실수: " +  d);
	}
	public void print(String s) { 
		System.out.println("문자열: " + s);
	}
	
}// class PrintOverloading