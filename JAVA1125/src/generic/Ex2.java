package generic;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		// Person 클래스 인스턴스 2개 생성 및 참조변수 출력
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("이순신", 44);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("==========================================");
		
		// Person 객체 여러개를 하나의 객체에 저장하여 관리하는 경우
		// 1. Object[] 배열(또는 Person[] 배열)을 통해 관리
		// => 생성된 배열의 크기가 불변이므로 추가되는 객체 저장 불가
		// => Object 타입으로 업캐스팅 된 객체는 다시 다운캐스팅이 필요함
		//    (또한, 다운캐스팅 전 타입 체크도 필요함)
		
		
		// Object[] 배열에 p1, p2 대입
		Object[] objArr = {p1, p2}; // Person -> Object 업캐스팅 되어 관리됨
		
		// for문을 통해 배열 객체 내의 객체를 꺼내서 Person  타입 변수에 저장 및 출력
		// ex) 출력 형태 : 홍길동, 20
		// instanceof 연산자 활용
		for(int i = 0; i < objArr.length; i++) {
			// Object[] 배열에 저장된 객체를 직접 다룰 경우 참조영역이 축소됨
//			System.out.println(objArr[i].name); // Person 타입 변수 접근 불가!
			
			// 배열 내의 객체를 꺼내서 Person 타입 변수 저장
//			Person p = objArr[i]; // 다운캐스팅 필요!
			
			// 다운캐스팅 수행 전 타입 체크 필요!
			if(objArr[i] instanceof Person) {
				Person p = (Person)objArr[i];
				System.out.println(p.name + ", " + p.age);
			} 
			
		}
		
		Person[] pArr = {p1, p2};
		for(int i = 0; i < pArr.length; i++) {
			Person person = pArr[i];
			System.out.println(person.name + ", " + person.age);
		}

		System.out.println("==========================================");
		
		/*
		 * 2. Collection API(ex. ArrayList)를 활용하여
		 *    Person 객체 여러개를 관리하는 경우
		 *    => 배열의 단점인 크기 불변을 해결하게 되므로 객체 추가가 자유로움
		 * 1) 제네릭을 사용하지 않을 경우
		 *  - 파라미터 또는 리턴타입의 데이터타입이 Object 타입이 되어
		 *    다양한 객체를 저장 가능하게 됨
		 *  - 저장 시점에서 타입 판별이 이루어지지 않으므로 편리하지만
		 *    대신, 데이터를 꺼내는 시점에서 타입 불일치에 따른 오류 발생 가능
		 *  - 데이터를 꺼내기 전 instanceof 연산자를 통한 타입 판별 후
		 *    Object 타입을 실제 데이터타입으로 다운캐스팅 해야 한다!
		 */
		
		// 제네릭을 사용하지 않은 ArrayList 객체 생성
		List list = new ArrayList();
		
		// p1, p2 객체 추가
		list.add(p1);
		list.add(p2);
		
		// 강감찬, 30의 파라미터를 갖는 Person 객체 추가
		list.add(new Person("강감찬", 30));
		
		// 문자열 "조한수" 추가
		list.add("조한수"); // Object 타입이므로 Person 이 아닌 타입도 추가 가능
		// => Person 객체 형태로 꺼내서 사용하는 시점에서 문제가 발생할 수 있다!
		
		// 일반 for문을 통한 객체 출력
//		for(int i = 0; i < list.size(); i++) {
////			Person p = list.get(i);
//			// => 제네릭타입을 지정하지 않아 list는 Object 로 되어 있음.
//			// => Object 타입을 Person 타입으로 대입하려고 하면 컴파일 에러 발생!
//			//    다운캐스팅이 필요함을 알 수 있다!
////			Person p = (Person)list.get(i);
////			System.out.println(p);
//			// => 실행을 시키면 87번 라인에서 에러가 발생한다!
//			// => java.lang.ClassCastException: 
//			//    class java.lang.String cannot be cast to class gnenric.Person
//			// => "조한수"의 String 형태는 Person 객체로 변경할 수 없음을 알 수 있다.
//			// => 위의 코드 중 list.add("조한수"); 을 주석처리하면 오류가 없어짐!
//			
//			// Person 타입으로 가져오기 전 타입 판별 후 형변환 수행
//			if(list.get(i) instanceof Person) {
//				Person p = (Person)list.get(i);
//				System.out.println(p);
//				System.out.println(p.name + ", " + p.age);
//			}
//		}
		
		// 향상된 for문 사용 시
		// 우변의 list에서 꺼낸 객체를 저장할 변수를 좌변에 선언(Object)
		for(Object o : list) {
			if(o instanceof Person) {
				Person p = (Person)o;
				System.out.println(p.name + ", " + p.age);
			}
		}
		
		System.out.println("--------------------------------------");
		
		/*
		 * 제네릭 타입을 사용할 경우
		 * - 저장할 객체의 타입이 Person 타입이므로 제네릭 타입 <Person> 지정
		 * - 객체 저장 시점에서 Person 타입 객체만 저장 가능하도록 자동 판별
		 *   즉, 잘못된 객체(또는 데이터)가 저장될 우려가 없다!
		 * - 또한, 제네릭 타입 Person 타입으로 고정되므로
		 *   Object 타입으로 업캐스팅이 일어나지 않음
		 *   => 데이터를 꺼내는 시점에도 Person 타입 그대로 사용 가능
		 *      (별도의 타입 체크 또는 다운캐스팅 작업 불필요!)
		 */
		
		
		// <Person> 제네릭을 사용하는 list2 ArrayList 생성
		List<Person> list2 = new ArrayList<Person>();
		
		list2.add(p1);
		list2.add(p2);
		list2.add(new Person("강감찬", 30));
		
		// Person 타입이 아닌 객체(데이터) 추가 시
		// 데이터 판별 과정에서 오류(컴파일에러)가 발생하게 된다!
//		list2.add("허민");
		// => The method add(Person) in the type List<Person> 
		//    is not applicable for the arguments (String)
		
		// 반복문을 통해 List 객체의 모든 요소 꺼내기
		for(int i = 0; i < list2.size(); i++) {
			// get() 메서드 리턴타입이 Person 타입이므로 형변환 불필요!
			Person p = list2.get(i);
			System.out.println(p.name + ", " + p.age);
		}
		
		for(Person p : list2) {
			System.out.println(p.name + ", " + p.age);
		}
		

	}

}







