package Super_;

public class Ex2 {
	
	public static void main(String[] args) {
		/*
		 * <상속에서 생성자>
		 * - 생성자는 상속되지 않음 
		 *   -> 생성자 이름은 자신의 클래스 이름과 동일한데 
		 *      만약, 상속받을 경우 생성자 이름이 부모 클래스 이므로 
		 *      생성자 작성 규칙에 위배됨 
		 *      
		 * - 서브클래스의 인스턴스를 생성할 때는 자동으로 슈퍼클래스의 인스턴스를
		 *   먼저 생성한 후 서브클래스의 인스턴스가 생성됨 
		 *   -> 이때 서브클래스 생성자에서 슈퍼클래스 기본 생성자를 자동 호출
		 *   -> 만약, 슈퍼클래스에 파라미터 생성자만 존재할 경우 
		 *   	서브클래스 생성자에서 컴파일 에러가 발생 
		 *   
		 * <생성자 super()>
		 * - 슈퍼클래스의 생성자를 명시적으로 호출할 때 사용 
		 * 	 -> 생성자 this() 와 사용 방법 및 목적은 동일함 
		 * - 기본 문법: super([데이터]...);
		 * - 목적1) 슈퍼클래스 생성자 중 특성 생성자를 명시적으로 호출할 경우
		 * 			ex) 슈퍼클래스에 기본 생성자 없이 파라미터 생성자만 정의 시
		 * 				서브클래스 생성자에서 슈퍼클래스 기본 생성자 호출 불가로
		 * 				컴파일 에러가 발생하는데
		 * 				이때, 슈퍼클래스의 파라미터 생성자를 명시적으로 호출하기 위해 사용
		 *   
		 * - 목적2) 슈퍼클래스 생성자에 멤버변수 초기화 코드가 존재할 경우 
		 * 		ex) 서브클래스 생성자에서 슈퍼클래스의 멤버까지 초기화하면 
		 * 			초기화 코드의 중복이 발생하게 됨.
		 * 			이때 슈퍼클래스의 멤버는 슈퍼클래스의 생성자에서,
		 * 		 	서브클래스의 멤버는 서브클래스의 생성자에서 초기화하여 
		 * 			코드 중복을 제거하기 위해 사용 
		 * 
		 * - Note: 생성자 super() 는 반드시 생성자의 첫 문장에서 실행되어야 한다 
		 * 		-> 따라서, 생성자 내에서 super() 와 this() 동시 사용 불가 
		 */
		
		Student s = new Student();
		s.showStudentInfo();
	}

}

class Person {
	String name;
	int age;

	public Person() {} // default constructor 
	// Parameter constructor
	// option + shift + O
	public Person(String name, int age) {
		super(); // Object class의 Object() 기본 생성자 호출
		this.name = name;
		this.age = age;
	}
	
	
}

class Student extends Person {
	
	boolean isStudyMode;
	
	public Student() {
		// 서브클래스의 기본 생성자에서 슈퍼클래스인 Person 클래스의 
		// 기본 생성자를 자동으로 호출하게 되는데 
		// 만약, 슈퍼클래스 생성자가 파라미터 생성자만 존재할 경우 오류 발생!
//		super(); // 암묵적으로 생성자 내에 포함
		// -> 그러므로 Person() 생서자 없이 파라미터 생서자만 있을 경우 오류!
		//    따라서, 슈퍼클래스에 기본 생성자를 별도로 정의하거나(1)
		// 	  서브클래스에서 슈퍼클래스의 파라미터 생성자를 명시적으로 호출(2)
		
//		name = "홍길동";
//		age = 20;
//		isStudyMode = true;
		this("홍길동", 20, true);
		
		// 생성자 super() 는 생서자 this() 와 마찬가지로 
		// 생성자 내에서 가장 먼저 생성 되어야 함 
	}
	
	public Student(String name, int age, boolean isStudyMode) {
//		super(name, age);
		// Student 클래스 생성자에서 모든 멤버변수를 직접 초기화할 경우
//		super();
//		this.name = name;
//		this.age = age;
//		this.isStudyMode = isStudyMode;
		
		// name과 age 멤버변수를 초기화하는 코드는 
		// 슈펔르래스인 Person 클래스의 생성자의 초기화 코드와 중복됨 
		// 따라서, 슈퍼클래스로부터 상속받은 멤버변수 초기화는 
		// 슈퍼클래스 생성자에서 수행하고, 서브클래스의 멤버만 초기화를 직접 수행 
		// -> 이때 슈퍼클래스의 파라미터 생성자를 호출하여 대신 초기화를 수행 
		super(name, age);
		this.isStudyMode = isStudyMode;
	}



	public void showStudentInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("공부 중: " + isStudyMode);
	}
}
