package Polymorphism;

public class Ex3 {
	
	public static void main(String[] args) {
		Employee emp = new Employee("인성사원", 4000);
		System.out.println("Employee 정보: " + emp.getEmployee());
		emp.salaryCalculation();
		
		System.out.println("---------------------------------------");
		
		Manager man = new Manager("인성매니저", 5000, "개발팀", 3);
		System.out.println("Manager 정보: " + man.getManager());
		man.salaryCalculation();
		
		System.out.println("---------------------------------------");
		
		Engineer eng = new Engineer("인성Eng", 6000, 5);
		System.out.println("Engineer 정보: " + eng.getEngineer());
		eng.salaryCalculation();
		
		System.out.println("========================================");
		emp.salaryCalculationAll(emp);
		emp.salaryCalculationAll(man);
		//emp.salaryCalculationAll(new Manager("인성매니저", 5000, "개발팀", 3);
		emp.salaryCalculationAll(eng);
	}
}

// 직원(Employee) 클래스 정의 
class Employee { // =class Employee extends Object 
	String name; // 사원명 
	int salary; //연봉 
	
	//기본 생성자
//	public Employee() {}
	
	// option + shift + O
	public Employee(String name, int salary) {
		super(); //Object 클래스의 Object() 기본 생성자 호출
		this.name = name;
		this.salary = salary;
	}
	
	public String getEmployee() {
		
		return name + ", " + salary;
	}
	
	// 일반 직원의 연봉 계산(기본 연봉을 그대로 적용)
	public void salaryCalculation() {
		System.out.println("연봉: " + salary);
	}
	
	// ======================================================
	// 전 직원의 연봉을 슈퍼클래스인 Employee 클래스에서 계산 
	// -> 다형성 필요(Employee, Manager, Engineer 인스턴스 모두 처리)
	// 따라서 메서드 파라미터로 다형성을 적용한 Employee 타입 필요 
	public void salaryCalculationAll(Employee emp) { // 업캐스팅 적용 (참조영역 축소)
		int salaryResult = 0; //연봉 계산 결과를 저장할 변수 
		
		// 참조영역의 축소로 인해 각 서브클래스 타입 멤버변수 보이지 않음 
		// Employee를 제외한 Manager, Engineer의 경우 
		// 다시 다운 캐스팅을 통해 각 클래스에서 정의한 멤버에 접근해야 됨 
		// 단, 무작정 다운캐스팅을 수행할 경우 오류가 발생할 수 있으므로
		//	 반드시 instanceof 연산자를 통해 타입 판별 후 다운캐스팅 필요 
		// -> 주의! 반드시 하위타입부터 판별을 수행해야 한다
		
		// 업캐스팅으로 축소됐떤 참조영역이 다운캐스팅으로 확대 되어
		// 다운캐스팅 된 Manager 타입 인스턴스를 통해 모든 멤버변수 접근 가능 
		// 기본 연봉과 관리 인원 수에 따른 인센티브를 더해서 계산 

		if(emp instanceof Engineer) {
			Engineer en = (Engineer)emp; //명시적 형변환
			salaryResult = en.salary + (en.numOfCertificate * 20);
			en.salaryCalculation();
		} else if(emp instanceof Manager) {
			//Down Casting
			Manager mg = (Manager)emp;
			salaryResult = mg.salary + (mg.manageEmployeeCount * 10);
			mg.salaryCalculation();
		}else if(emp instanceof Employee) {
			salaryResult = salary;
			emp.salaryCalculation();
		}

		
		// 각 지원의 계산된 연봉 출력
		System.out.println("연봉: " + salaryResult + "만원 입니다.");
		
		
	}
	
}

class Manager extends Employee{
	String depart; //부서명
	int manageEmployeeCount; //관리하는 직원 수 
	
	// 슈퍼클래스 기본생성자가 없으므로 파라미터 생서자를 호출하는 생성자 정의 
	public Manager(String name, int salary, String depart, int manageEmployeeCount) {
		super(name, salary);
		this.depart = depart;
		this.manageEmployeeCount = manageEmployeeCount;
	}
	
	public String getManager() {
//		return name + ", " + salary + ", " + depart + ", " + manageEmployeeCount;
		return getEmployee() + ", " + depart + ", " + manageEmployeeCount;
	}
	// Employee의 연봉 계싼 메서드를 오버라이딩 
	// -> 매니저 연봉은 기본 연봉 + (관리직원수 * 10만원)
	@Override
	public void salaryCalculation() {
		int salaryResult = salary + (manageEmployeeCount * 10);
		System.out.println("연봉: " + salaryResult);
	}
	
}

// 엔지니어(Engineer) 클래스 정의 - Employee 상속
class Engineer extends Employee {
	int numOfCertificate; //자격증 개수

	public Engineer(String name, int salary, int numOfCertificate) {
		super(name, salary);
		this.numOfCertificate = numOfCertificate;
	}
	
	public String getEngineer() {
		return getEmployee() + ", " + numOfCertificate + "개";
	}

	// 엔지니어 연봉은 기본 연봉 + (자격증 수 * 20만원)
	@Override
	public void salaryCalculation() {
		int salaryResult = salary + (numOfCertificate * 20);
		System.out.println("연봉: " + salaryResult);
	}
	
}