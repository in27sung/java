package this_;

public class Ex {
	public static void main(String[] args) {
		/*
		 * this 키워드 - 자신의 인스턴스 주소값을 저장하는 참조변수 -> 자바에 의해 자동으로 생성됨 - 모든 인스턴스 내에는 this가
		 * 존재하며, 자신의 인스턴스 주소가 저장됨 -> 즉, 인스턴스 마다 this에 저장된 값이 다름
		 * 
		 * 1. 레퍼런스 this - 자신의 인스턴스 내의 멤버에 접근 (멤버변수 or 멤버메서드) - 주로, 로컬변수와 인스턴스 변수(멤버변수)의
		 * 이름이 같을 때 인스턴스 변수를 지정하는 용도로 사용
		 * 
		 * <레퍼런스 this 사용 기본 문법> 자신의 클래스 내의 생성자 또는 메서드 내에서 this.인스턴스 변수 또는 this.메서드() 형태로
		 * 접근
		 * 
		 */
		Person p = new Person("홍길동", 20);
		p.showPersonInfo();
		
//		p.name = "이순신" // the filed Person.name is not visible
		p.setName("이순신");
		p.setAge(30);
		p.showPersonInfo();

	} // main()

}// class Ex

class Person {
	// 멤버변수 선언
	private String name;		
	private int age;

	// 이름, 나이를 전달받아 초기화하는 파라미터 생성자 정의
	// -> option + shift + O
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// option + shift + s(getter/setter)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		// 메서드 내의 로컬변수와 클래스 내의 멤버변수 이름이 동일할 경우
		// 메서드 내에서 변수 지정 시 로컬 변수가 지정됨
		this.name = name; // 로컬 변수 name 값을 다시 로커변수 name에 저장하는 코드

		// 로컬변수와 멤버변수를 구변하기 위해서는 멤버변수 앞에
		// 레퍼런스 this를 사용하여 해당 인스턴스에 접근하는 코드로 사용해야 함
		// -> 외부에서 멤버변수 name에 접근 시 참조변수명.name 형태로 접근하고,
		// 내부에서 멤버변수 name에 접근 시 this.name 형태로 접근
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// shoPersonInfo() 메서드를 정의해서 이름과 나이를 출력
	public void showPersonInfo() {
		// 클래스 내의 메서드에서 멤버변수에 접근하기 위해 멤버변수 이름 지정
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

}