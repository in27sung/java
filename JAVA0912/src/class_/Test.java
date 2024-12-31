package class_;

public class Test {

	public static void main(String[] args) {

		// Call the constructor, Person class instance 생성 
		Person p1 = new Person();
		
		p1.name = "인성";
		p1.age = 28;
		p1.isHungry = true;
		
		p1.showPersonInfo();
		p1.eat("햄버거");
		p1.talk();
		p1.showPersonInfo();
	
	}

}

// Person 클래스 정의
// [ 멤버변수(인스턴스 변수) 선언]
// - name String
// - age int 
// - isHungry boolean 

//[Define method]
class Person{
	// declear memberVeriable // Create a class attribute 
	String name;
	int age;
	boolean isHungry; // true: hungry flase: not hungry 
	
	// - name, age, ishungry print all showPersonInfo() method
	void showPersonInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		if(isHungry){ 
			System.out.println("배고픕니다.");
		}
		else if(!isHungry){
			System.out.println("배고프지 않습니다.");
		}
	}
	// - 밥먹는 기능을 수행하는 eat() method
	void eat(String foodName) {
		System.out.println(foodName + " 먹기");
		isHungry = false;
		System.out.println("식사 후 배고픔: " + isHungry);
	}
	
	void talk() {
		System.out.println("말하기");
		isHungry = true;
	}
}


//   (parameter x, return x)
//    (매개변수: 이름(foodName, 문자열), 리턴값 없음
//   => "xxx 먹기!" 출력
// - 