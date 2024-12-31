package inheritance;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 상속에서의 생성자 
		 * - constructor: 클래스명 이름과 같고 리턴타입이 없는 메서드의 일종 
		 * - 생성자는 상속되지 않음
		 * 	 -> 상속을 받을 경우 자신의 클래스 이름과 생성자 이름이 다르기 떄문에
		 * 		생성자 정의 규칙을 위반하게 됨 
		 * - 상속 관계에서 인스턴스를 생성할 때 
		 * 	 서브클래스의 인스턴스가 생성되기 전 슈퍼클래스의 인스턴스를 
		 * 	 먼저 생성한 후 서브클래스의 인스턴스를 생성함. 
		 * 	 -> 서브 클래스의 생성자가 호출되면 가장 먼저 
		 * 		슈퍼클래스의 생성자를 호출(super();)하여 슈퍼클래스의 인스턴스를 
		 * 		생성하고 그 후에 서브클래스의 인스턴스가 생성되어 생성자 코드가 실행 
		 */
		
		Manager4 m = new Manager4();
		
		/*
		 * Manager4 인스턴스를 생성하는 과정 
		 * -> 서브클래스의 인스턴스를 생성하는 과정에서 
		 * 	  서브클래스 생성자에서 인스턴스 생성 전 슈퍼클래스의 생성자 호출 
		 * 1) new Manager4() 코드에 의해 Manager4() 생성자로 이동 
		 * 2) Manager4() 생성자에서 슈퍼클래스 Employee4의 생성자 Employee4() 호출 
		 * 	  -> super();
		 * 3) Employee4() 생성자에서 슈퍼클래스 Object의 생성자 Object() 호출 
		 * 	  -> super();
		 * 4) Object 인스턴스가 생성되고, Object() 생성자 내의 코드가 실행됨 
		 * 5) Employee4 인스턴스가 생성되고, Employee4() 생성자 내의 코드가 실행됨 
		 * 6) Manager4 인스턴스가 생성되고, Manager4() 생성자 내의 코드가 실행됨 
		 */
	}

}

class Employee4 { // class Employee4 extends Object
	String name;
	int salary;
	
	public Employee4() {
		super(); // Object 클래스 기본 생성자 호출
		System.out.println("Employee4() 생성자 호출됨");
	}
	// 만약, 파라미터 생성자를 정의했을 때 기본 생성자가 자동으로 정의되지 않으므로
	// 서브클래스의 생성자에서 기본적으로 호출되는 슈퍼클래스의 기본 생성자가 존재하지 않음 
	
	// 이름, 연봉을 전달받아 초기화하는 파라미터 생성자 정의 
	public Employee4(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}

// Employee4 클래스를 상속받는 서브클래스 Manager4 정의 
class Manager4 extends Employee4 {
// Implicit super constructor Employee4() is undefined for default constructor. 
// Must define an explicit constructor
	
	String depart;

public Manager4() {
	super(); // The constructor Employee4() is undefined
	// 서브클래스의 생성자를 호출하게 되면 
	// 내부적으로 가장 먼저 슈퍼클래스의 기본생성자를 자동으로 호출
	// -> 슈퍼클래스 생성자 작업이 종료된 후 서브클래스의 생성자의 작업 수행 
	System.out.println("Manager4() 생성자 호출됨");
	
	
	}

public Manager4(String name, int salary, String depart) {
	super();
	System.out.println("Manager4(String, int, String) 생성자 호출됨");
	this.depart = depart;
	this.salary = salary;
	this.depart = depart;
	}
}
