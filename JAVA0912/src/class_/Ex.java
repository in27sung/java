package class_;

public class Ex {
	// main(): the starting point of Java program
	// Call a method from main method
	// 단, main() method에서만 가능한 것은 아니고 호출하는 다른 method도 사용 가능 
	public static void main(String[] args) {
		/*
		 * 정의한 클래스는 설계도에 해당하므로 실제 사용을 하기 위해서는 
		 * 반드시 실체(객체)를 생성해야 한다 
		 * => 클래스를 사용하여 메모리에 생성된 객체(실체)를 만들게 되고,
		 *		이를 인스턴스(instance)라고 함
		 *
		 * 	<클래스에 대한 인스턴스 생성 기본 문법>
		 * 클래스 변수명 = new 클래스명();
		 * 
		 * 
		 */
		
		// Animal 클래스의 인스턴스 생성 
		// 1. Animal 클래스 타입의 변수 선언  // Declear instance variable 
		Animal dog; //stack에 저장 
		
		// 2.Animal 클래스의 instance 생성 및 주소값 저장 
		dog = new Animal(); // Heap에 저장 (dog = 참조변수)

		// 위의 두 문장을 한 문장으로 결합 
		//Animal dog = new Animal(); 
		//                |						|
		//			stack				Heap (접근불가)
		// Animal 인스턴스에 접근하여 멤버변수 사용 메서드 호출
		// => 인스턴스 접근을 하기 위해서는 반드시 인스턴스 주소가 필요하며,
		//		인스턴스 주소를 담고 있는 참조변수(dog)를 통해 접근가능;
		// 	1.	Animal 인스터스의 멤버변수 name과 age에 값을 저장
		//name = "구름이"; //name cannot be resolved to a variable
		//=> referenceVariable.memberVariable 
		dog.name = "구름이"; // dog 인스턴스의 멤버변수 name에 "구름이" 저장 
		System.out.println(dog);// class_.Animal@1c4af82c
//																|				|					|
//														package    class 			adressValue
		System.out.println("이름: " + dog.name);
		dog.bark(); 
		
		dog.age = 3;
		System.out.println("나이: " + dog.age);
		
		// 2. Animal 인스턴스의 메서드 bark() 호출
		// => 리턴값이 없는 메서드이므로 메서드만 호출
		// => 매개변수가 없는 메서드이므로 소괄호()안에 아무것도 명시하지 않음 
		dog.bark(); 
		
		System.out.println("-----------------------------------------");

		// Animal 클래스이ㅡ 두 번째 인스턴스(cat) 생성
		// => 멤버변수 초기화 - 이름: 나용이, 나이: 2
		Animal  cat = new Animal();
		cat.name = "냐옹이"; // 참조변수명.method
		cat.age = 2;
		
		System.out.println("이름: " + cat.name);
		System.out.println("나이: " + cat.age);
		
		// -----------------------------------------
		// 위의 두 instance(dog, cat) 구조 
		// -----------------------------------------
		// new
		// Animal class =>    instance1			instance2
		// name 							"멍멍이"					"냐옹이"
		// age      							3								2
		
		System.out.println("===========================");
		
		
		// Call the constructor - Heap 공간에 생성된 인스턴스 주소가 참조변수 car에 저장 
		Car tesla = new Car();
		Car porsche = new Car();
		//Car ferrari = new Car();
		
		tesla.modelName = "Model X";
		tesla.company = "Tesla";
		tesla.cc = 0;
		
		System.out.println("모델명: " + tesla.modelName );
		System.out.println("회사명: " + tesla.company );
		System.out.println("배기량: " + tesla.cc + "cc");
		tesla.speedUp();
		tesla.speedDown();
		
		porsche.modelName = "911";
		porsche.company = "Porsche";
		porsche.cc  = 5000;
		System.out.println("모델명: " + porsche.modelName );
		System.out.println("회사명: " + porsche.company );
		System.out.println("배기량: " + porsche.cc + "cc");
		
		System.out.println("============================");
		
		Student person1 = new Student();
		Student person2 = new Student();
		
		person1.name = "인성";
		person1.id = 27;
		person1.className = "AI(Python) Backend(Java, Spring) developer";
		
		System.out.println("학생이름: " + person1.name );
		System.out.println("학번: " + person1.id );
		System.out.println("과정명: " + person1.className );
		
		person1.study("Java");
		person1.rest();
		
		System.out.println("-----------------------------------------");
		
		person2.name = "이순신";
		person2.id = 2;
		person2.className = "AI(Python) Backend(Java, Spring) developer";
		
		System.out.println("학생이름: " + person2.name );
		System.out.println("학번: " + person2.id );
		System.out.println("과정명: " + person2.className );
		
		person1.study("Python");
		person1.rest();
		
	}// main() method

}// Ex class 

// 하나의 java file 안에 여러가지 class를 define 할 수 있음!
// => 단, 파일명과 동일한 이름의 클래스 외에는 public 키워드를 붙일 수 없다!
// Student class define
// attribute: name String, id int, className String
// Method: study() - return x, parameter - subjectname string 
//									=> "xxx 과목 공부"
//					rest() = return x, parameter x	
//									=> "휴식!" 출력

class Student {
	String name;
	int id;
	String className;
	
	void study(String subjectName) {
		System.out.printf("%s 과목 공부 중 \n", subjectName);
	}
	void rest() {
		System.out.printf("휴식 중 \n");
	}
	
}
