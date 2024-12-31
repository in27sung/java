package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 제네릭(Generic, 일반화)
		 * - 클래스 정의 시 사용되어질 데이터타입을 미리 명시하지 않고
		 *   객체 사용 전 사용할 타입을 객체 생성 시 명시하여 사용하는 기법
		 * - 주로, Collection API의 클래스들이 제네릭이 적용되어 있으므로
		 *   인스턴스 생성 시 제네릭 타입으로 사용할 데이터타입을 지정
		 *   = 지정된 데이터타입이 클래스 내의 임시 데이터타입을 대체하게 됨
		 */
		NormalIntegerClass nic = new NormalIntegerClass();
		nic.data = 10; // 정수 저장 가능
//		nic.data = 3.14; // 실수 저장 불가
//		nic.data = "홍길동"; // 문자열 저장 불가
		// => 여러 데이터타입 데이터를 모두 저장하려면 최소한 Object 타입 변수 선언해야 함
		
		NormalObjectClass nc = new NormalObjectClass();
		// NormalObjectClass 인스턴스의 멤버변수 data는 Object 타입이므로
		// 어떤 데이터타입의 데이터도 모두 저장이 가능함
		// => 단, 객체 내의 데이터를 꺼내서 사용할 때 타입 판별이 필수!
		nc.setData(1); // 정수형 데이터 int -> Integer -> Object
//		nc.setData(3.14); // 실수형 데이터 double -> Double -> Object
//		nc.setData("홍길동"); // 문자열 데이터 String -> Object
		
		// Object 타입을 사용하여 관리하는 데이터는 Object 타입으로 저장 가능
		Object o = nc.getData();
		
		// 만약, Object 타입을 실제 데이터타입으로 변환하는 경우
		// 잘못된 타입 변화(다운캐스팅)으로 인해 ClassCastException 발생 가능
//		String name = (String)o; // 다운캐스팅
//		System.out.println("이름 : " + name);
		// => String 타입이 아닌 다른 타입 데이터가 저장된 경우 예외 발생하므로
		//    변환 전 반드시 instanceof 연산자를 통한 타입 체크 필수!
		// => java.lang.ClassCastException: class java.lang.Integer 
		//    cannot be cast to class java.lang.String
		
		System.out.println("================================================");

		// 제네릭을 사용한 클래스의 인스턴스 생성
		// => 클래스명 뒤에 제네릭 타입을 참조 데이터타입으로 명시함
		//    (int 대신 Integer, char 대신 Character 사용)
		// 1. 제네릭 타입 T를 Integer 타입으로 지정
		GenericClass<Integer> gc = new GenericClass<Integer>();
		// -> GenericClass 내의 타입 T가 모두 Integer 타입으로 대체됨 
		gc.setMember(1); // 정수형 데이터 전달 가능하지만 
//		gc.setMember("홍길동"); //정수 타입 외에 모두 컴파일 에러 발생!
		// -> The method setMember(Integer) in the type GenericCalss<Integer>
		// 	  is not applicable for the arguments (String)
		
		int num = gc.getMember(); // 오토 언박싱 적용 
		
		// 2. 제네릭 타입 T를 Double 타입으로 지정 
		GenericClass<Double> gc2 = new GenericClass<Double>();
		// -> 타입 T가 모두 Double 타입으로 지정 
		gc2.setMember(3.14);
//		gc2.setMember("홍길동");
		
		// 3. 제네릭 타입 T를 String 타입으로 지정 
		GenericClass<String> gc3 = new GenericClass<String>();
		// -> 타입 T가 모두 Double 타입으로 지정 
//		gc3.setMember(3.14);
		gc3.setMember("홍길동");
		
		// 4. 제네릭 타입 T를 Person 타입으로 지정 
		Person p = new Person("홍길동", 20);
		
		GenericClass<Person> gc4 = new GenericClass<Person>();
		// -> 타입 T가 모두 Person 타입으로 대체됨 
		
		gc4.setMember(p); // gc4.setMember(new Person("홍길동", 20)) 와 같음 
		System.out.println(gc4.getMember());
		
		Person person = gc4.getMember();
		System.out.println(person);
		
		// ---------------------------------------------------------------
		// 5. 제네릭 타입을 지정하지 않을 경우 
		GenericClass gc5 = new GenericClass();
		// -> 타입 T가 모두 object 타입으로 대체됨 
		// 	  즉, 다시 모든 데이터를 다룰 수 있게 됨 
		
		gc5.setMember(1);
		gc5.setMember(3.14);
		gc5.setMember("홍길동");
		gc5.setMember(new Person("이순신", 44));
		// -> Object 타입 미지정과 지정의 기능상의 차이는 없으나 
		//	  제네릭 타입 자체를 생략할 경우 경고메시지가 표시되므로 제네릭 
		GenericClass<Object> gc6 = new GenericClass<Object>(); //경고메시지 미표시됨
		
		// ==================================================================
		// 실제 제네릭을 적용하여 정의된 Collection API 예시 
		List<String> list = new ArrayList<String>();
		// -> 컬렉션 요소로 사용되는 데이터가 STring 타입으로 고정됨 
		// -> List는 길이의 제한이 없어 게시판 리스트 정보를 받아올때 유용함 
		
		Set<Integer> set = new HashSet<Integer>();
		// -> 컬렉션 요소로 사용되는 데이터가 Integer 타입으로 고정됨 
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		// -> 컬렉션 요소 중 키는 Integer, 값은 String 타입으로 고정됨 
	}

}

/*
 * 제네릭을 사용한 클래스 정의
 * - 클래스 정의 시점에서 클래스명 뒤에 <> 기호를 사용해서 "가상의 자료형" 명시
 *   => 가상의 자료형은 보통 1글자 영문 대문자 사용(주로 E 또는 T 사용)
 * - 가상의 자료형은 클래스 정의 시점에서 정확한 자료형을 명시하지 않지만
 *   클래스 생성 시점에서 데이터타입 대신 사용 가능함
 * - 해당 클래스의 인스턴스 생성 시점에서 가상의 자료형을 대신할
 *   실제 자료형을 지정하면 클래스 내의 가상의 자료형이 실제 자료형으로 대체됨
 *   => 즉, 인스턴스 생성 시점에서 어떤 자료형으로도 변형 가능함!
 */
class GenericClass<T> {
	// 클래스 내에서 데이터타입 대신 제네릭 타입 T를 타입으로 지정 가능
	T member; // 멤버변수 member의 데이터타입이 T로 지정됨(실제 데이터타입X)

	public T getMember() {
		return member;
	}

	public void setMember(T member) {
		this.member = member;
	}
	
}


// 제네릭을 적용하지 않는 클래스 정의
// 1) 사용할 데이터타입을 특정 타입으로 관리하는 일반 클래스
class NormalIntegerClass {
	int data; // data 변수에는 정수형 데이터만 저장이 가능함

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}

// 2) 클래스 내에서 사용되어질 데이터 대한 타입을 Object 타입으로 관리하는 경우
class NormalObjectClass {
	// 멤버변수의 데이터타입을 Object 타입으로 선언할 경우
	// 자바에서 사용되는 모든 데이터들을 저장할 수 있다!
	// => 이때 각 데이터들은 Object 타입으로 업캐스팅 되어 저장됨
	Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}














