package generic;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 제네릭 타입 사용 시 주의사항 1. static 멤버 내에서 제네릭 타입 파라미터 사용 불가 => 제네릭 타입은 인스턴스 생성 시점에서
		 * 실제 데이터타입으로 변환되는데 static 멤버는 인스턴스 생성 시점보다 먼저(클래스 로딩 시점) 로딩되므로 데이터타입이 지정되지 않은
		 * 상태이기때문에 사용이 불가능함! 2. new 연산자 사용 시 제네릭 타입 파라미터 사용 불가! 3. instanceof 연산자 사용 시
		 * 제네릭 타입 파라미터 사용 불가!
		 */

	}

}

class GenericClass2<T> {
	private T data;

//	private static T staticMember; // 컴파일 에러!
	// => Cannot make a static reference to the non-static type T
	// => static 멤버변수에 제네릭타입 파라미터 사용 불가
	// => 인스턴스 생성 시점보다 먼저 메모리에 로딩되므로 타입 변경 불가능!

//	T instance = new T(); // 인스턴스 생성(new) 시 제네릭타입 파라미터로 생성자 호출 불가!
	// => 컴파일 시점에서 생성자 타입이 확인 불가능하므로 사용할 수 없다!

	public void setData(T data) {
		this.data = data;
	}

//	public static void staticMethod(T data) {} 
	// => static 메서드에 제네릭 타입 파라미터 사용 불가
	// => Cannot make a static reference to the non-static type T
	// => 인스턴스 생성 시점보다 먼저 메모리에 로딩되므로 타입 변경 불가능!

	public void compare() {
		Object o = new Object();
//		if(o instanceof T) { // instanceof 연산자에 제네릭 타입 파라미터 사용 불가!
		// => 컴파일 시점에서 T의 데이터타입 확인이 불가능하므로
		// true, false 를 미리 판별할 수 없으며, 형변환 등의 수행이 불가능!
	}
}
