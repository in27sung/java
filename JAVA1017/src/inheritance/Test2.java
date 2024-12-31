package inheritance;

public class Test2 {

	public static void main(String[] args) {

		Manager mg = new Manager("홍길동", 8000, "개발팀");
		
		System.out.println(mg.getManager());
		
	}

}

// 

class Employee { // = class Account extends Object
	String name;
	int salary;
	
	public String getEmployee() {
		String employeeInfo = name + ", " + salary;
		
		return employeeInfo;
	}
}

class Manager extends Employee{
	String depart;
	
	// option + shift + O
	public Manager(String name, int salary, String depart) {
		super();
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}


	public String getManager() {
		String managerInfo = getEmployee() + ", " + depart;
		
		return managerInfo; 
	}
}