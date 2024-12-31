package enum_type;

public class Ex {
	
	public static void main(String[] args) {
		/*
		 * 상수를 사용하여 한정된 데이터를 관리하는 경우 
		 * 간편한 선언을 통해 관리할 수 있다는 장점이 있으나 
		 * 해당 값의 범위를 벗어나는 값을 사용할 경우 
		 * 컴파일 시점에서 오류 발견이 불가능! 
		 * 추가적인 작업을 통해 범위 내의 값인지 판별하는 작업이 별도로 필요함 
		 * -> 이를 해결하기 위해 열거형(enum type) 필요 
		 * 
		 * 열거형(Enumeration Type)
		 * - 상수를 좀 더 확실한 형태로 다루기 위한 객체의 일종 
		 * - 데이터타입이 일치하면 다른 데이터라도 사용 가능한 상수의 단점을 해결 
		 * - enum 타입은 내부적으로 jave.lang.Enum 클래스를 상속받음 
		 * 
		 * < 열거타입 정의 방법 >
		 * [접근제한자] enum 열거타입명 {
		 * 	// 열거타입에 사용할 값(상수)을 차례대로 나열 
		 *	   상수1, 상수2, ... 상수n 
		 * }
		 * 
		 * - 기본적으로 클래스, 인터페이스 정의 문법과 유사함 
		 * 	 단, 열거타입 중괄호 내에는 상수로 사용될 이름만 지정 
		 * 
		 * <열거 타입 사용 방법>
		 * 1. 열거타입 변수 선언 방법(클래스, 인터페이스와 동일)
		 * 	  열거타입명 변수명 
		 * 	  ex) Month month, EnumWeek today 
		 * 
		 * 2. 열거타입 비교 방법 
		 * - if문 사용 시 동등비교 연산자 사용(==)
		 * - switch문 사용 가능(단, case 문에서 열거타입명 없이 상수만 지정 필수!)
		 * - switch(열거타입변수) {
		 * 		case 열거타입상수1: 수행할 작업들...;
		 * 		case 열거타입상수2: 수행할 작업들...;
		 * 		...
		 * 		case 열거타입상수n: 수행할 작업들...;
		 * }
		 * 
		 */
		
		Week week = new Week();
		
		// Setter 메서드를 호출하여 파라미터로 요일 전달 시 정확한 정수값을 몰라도 
		// 상수 호출만으로 해당 정수 사용 및 전달이 가능 
		week.setMyWeek(Week.WEEK_MONDAY); // 월요일(0) 설정 
		
		if(week.getMyWeek() == week.WEEK_MONDAY) {
			System.out.println("오늘은 월요일입니다.");
		}
		
		// 요일 정보를 상수로 관리하는 경우의 문제점 
		// -> 상수 데이터들이 정수일 경우 해당 정수를 전달받는 메서드(setter) 호출 시 
		//	  상수 범위 값이 아닌 다른 값을 전달해도 컴파일에러(문법적 오류)가 발생하지 않음 
		week.setMyWeek(10); // 10이라는 정수값을 갖는 요일은 없으나,
		// int 타입 파라미너이므로 컴파일 시점에서는 아무런 문제가 발생하지 않는다.
		// 그러나, 해당 데이터를 사용하기 위한 시점에서는 문제가 발생할 수 있다.
		// -> 따라서, 별도로 해당 범위 내의 데이터인지 판별하는 추가적인 작업을 수행해야함. 
		
		System.out.println("===============================================");
		
		// 열거타입 변수 today 선언 및 초기화 후 출력 
		EnumWeek today = EnumWeek.MONDAY;
		System.out.println(today); // toString() 메서드 생략(오버라이딩 되어 있음)
		
		// 열거타입을 활용하는 클래스 사용 
		MyCalendar mc = new MyCalendar();
		mc.setMyWeek(today);
		System.out.println("오늘의 요일: " + mc.getMyWeek());

		mc.setMyWeek(EnumWeek.MONDAY);
		System.out.println("오늘의 요일: " + mc.getMyWeek());
		
		// 열거타입 사용 시 장점
		// -> 정의 시 지정된 상수 외의 다른값은 절대 전달 불가능!! 
//		mc.setMyWeek(10);
		// -> The method setMyWeek(EnumWeek) in the type MyCalendar
		// 	  is not applicable for the arguments (int)
		
//		mc.setMyWeek("MONDAY");
//		mc.setMyWeek(MONDAY);
		// -> 반드시 열거타입명.상수명으로 지정된 값만 전달해야 한다. 
		mc.setMyWeek(EnumWeek.MONDAY);
		
		
	}
}

// 열거타입 정의
enum EnumWeek {
	// 열거형 정의 시 중괄호 내부에는 값을 갖는 상수 이름만 나열함 
	// (별도의 값을 지정하지 않는다.)
	MONDAY, TUSEDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY 
}

// 열거타입을 사용하는 클래스 정의 
class MyCalendar { 
	private EnumWeek myWeek;
	// -> 클래스 내에서 열거타입 변수 선언 가능(로컬변수도 가능)
	
	public EnumWeek getMyWeek() {
		return myWeek;
	}

	public void setMyWeek(EnumWeek myWeek) {
		this.myWeek = myWeek;
	}
	
}

// 요일 정보를 관리하는 클래스 정의 
// 열거타입을 사용하지 않고, 상수만 사용하는 경우 
// (요일은 7가지로 정해져 잇으므로 상수로 처리 가능)
class Week{
	// 요일 정보를 상수로 관리 
	// -> 외부에서 실제 데이터를 정확하게 알지 못해도 상수명(변수명)
	//	  만으로 값을 사용 가능 
	// -> 클래스명만으로 사용이 가능하며 접근이 쉬움 
	// 	  또한, 값 변경이 불가능하여 안전함. 
	public static final int WEEK_MONDAY = 0;
	public static final int WEEK_TUESDAY = 1;
	public static final int WEEK_WEDNESDAY = 2;
	public static final int WEEK_THURSDAY = 3;
	public static final int WEEK_FRIDAY = 4;
	public static final int WEEK_SATURDAY = 5;
	public static final int WEEK_SUNDAY = 6;
	
	private int myWeek;

	public int getMyWeek() {
		return myWeek;
	}

	public void setMyWeek(int myWeek) {
//		this.myWeek = myWeek;
		
		// 요일에 대한 정상 범위 판별 없이 저장작업을 수행하는 경우 
		// 실제 저장된 요일을 꺼내서 사용하는 시점에서 문제가 발생할 수 있다.
		// 따라서, 조건문 등을 사용해서 전달받는 파라미터 값에 대한 검증이 추가적으로 필요 
		if(myWeek >= WEEK_MONDAY && myWeek <= WEEK_SUNDAY) {
			this.myWeek = myWeek;
		} else {
			System.out.println("요일 입력 에러!");
		}
		
	}
	
}


