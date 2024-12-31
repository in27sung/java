package generic;

public class Person {

	String name;
	int age;
	
	// 파라미터 생성자: Alt + Shift + S -> O
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	

}
