package access_modifier;

public class Person {
	// declear member variable 
	private String name;
	private int age;
//	// 멤버변수에 대신 접근하도록 Getter/ Setter 메서드 정의(public 접근제한자 사용)
//	// 1. Getter 메서드 정의
//	// -> parameter x, return(o)
//	// String type memebrVariable nam에  대한 Getter 메서드 정의 
//	public String getName() {
//		// 멤버변수 name 값을 외부로 리턴
//		return name;
//	}
//	// int 타입 멤버변수 age에 대한 Getter 메서드 정의
//	public int getAge() {
//		// 멤버변수 age 값을 외부로 리턴 
//	}
//	
//	// 2. Setter 메서드 정의
//	// -> parameter(o), return(x)
//	// String 타입 멤버변수 name에 대한 Setter 메서드 정의
//	public void setName(String newName) {
//		//외부로부터 전달받은 name값(로컬변수 newName)을 멤버변수 name에 저장 
//		name = newName;
//	}
//	public void setAge(int age) {
//		
//	}
//	


// =========================================
// Getter / Setter 단축키를 통한 정의
// -> option + shift + s
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; // 멤버변수와 parameter가 같은면 this. 를 사용하여 구분  
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}


