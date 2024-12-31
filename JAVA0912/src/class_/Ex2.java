package class_;

public class Ex2 {

	public static void main(String[] args) {
		Person2 p1 = new Person2(); // p1 = reference veriable 
		
		p1.name = "홍길동";
		p1.age = 20;
		System.out.println("이름: " + p1.name);
		System.out.println("나이: " + p1.age);
		p1.print();
		
		System.out.println("----------------------------------");
		
		Person2 p2 = new Person2();
		p2.name = "인성";
		p2.age = 28;
		p2.print();


	}

}

// Define Person2 class
class Person2{
	// declear MemberVariable
	String name;
	int age;
	
	// Define method
	public void print() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}

}