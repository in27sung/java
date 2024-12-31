package method_overriding;

public class Ex {

	public static void main(String[] args) {
		// 상속의 기본 개념
		Student s1 = new Student();
		
		s1.name = "황인성";
		s1.age = 18;
		
		System.out.println("----------------------------------");
		
		Student s2 = new Student("황인성", 12, false, true);
		s2.eat("점심"); //Person 클래스로부터 상속받은 메서드 
		s2.sleep();
		s2.study();
	}

}

/*
 * Define Person class
 * - name(문자열), age(정수), isHungry(boolean) 멤버변수 
 * - eat() 메서드: 매개변수 O, return x
 * 	 -> parameter 값을 받아 "XXX 먹기" 출력, is hungry 값을 false 
 * - sleepr() 메서드: 매개변수 x, reutrn x 
 * 	 -> 잠자기 출력, ishungry 값을 true 
 */ 

class Person {
	String name;
	int age;
	boolean isHungry;
	
	public Person() {
		System.out.println("Person() 생성자 호출");
	}
	
	public void eat(String str) {
		System.out.println(str + "먹기");
		isHungry = false;
	}
	
	public void sleep() {
		System.out.println("잠자기");
		isHungry = true;
	}
}

class Student extends Person{
	boolean isStudyMode;
	
	

	public Student() {
		super();
		System.out.println("Student() constructor 호출");
	}

	public Student(String name, int age, boolean isHungry,boolean isStudyMode) {
		super();
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
		this.isStudyMode = isStudyMode;
	}
	
	public void study() {
		System.out.println("공부하기");
	}
	
	
}





