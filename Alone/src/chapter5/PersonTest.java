package chapter5;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfChildren = 3;
		
		System.out.println("이 사람의 나이 : " + person.age);
		System.out.println("이 사람의 이름 : " + person.name);
		System.out.println("이 사람의 결혼 여부 : " + person.isMarried);
		System.out.println("이 사람의 자녀 수 : " + person.numberOfChildren);
	}
}
