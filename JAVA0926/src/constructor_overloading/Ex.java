package constructor_overloading;

public class Ex {

	public static void main(String[] args) {
		/*
		 *  Constructor overloading
		 *  - method overloading과 동일
		 *  - 생성자 호출 시 다양한 형태의 파라미터를 전달하여
		 * 		객체를 다양하게 초기화하는 목적
		 */
		// Define instance in reference 
		Person p = new Person("대한민국", "홍길동", "010101-1010101");
		
		p.showPersonInfo();
		
		Person p2 = new Person("홍길동", "051010-3123456");
		p2.showPersonInfo();
		
		Person p3 = new Person();
		
		
		
	}// main

}// class Ex

class Person{
	String nation;
	String name;
	String jumin;
	
	// 기본 생성자 정의
	public Person() {
		System.out.println("Person() 생성자 호출됨");
	}
	
	// Define constructor with Parameter(name, jumin) 
	public Person(String name, String jumin) {
		nation = "South Korea";
		this.name = name;
		this.jumin = jumin;
	}
	
	public Person(String nation, String name, String jumin) {
		this.nation = nation;
		this.name = name;
		this.jumin = jumin;
	}
	
	// define method that print nation, name and jumin 
	public void showPersonInfo() {
		System.out.println("Nation: " + nation);
		System.out.println("Name: " + name);
		System.out.println("jumin " + jumin);
	}
}