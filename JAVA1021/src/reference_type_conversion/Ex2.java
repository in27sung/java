package reference_type_conversion;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Instanceof 연산자 
		 * - 좌변의 객체(참조변수)가 우변 클래스의 타입인지 판별하는 연산자 
		 * - 참조변수가 부모 객체를 참조하는지 자식 객체를 참조하는지 판별 가능
		 * - 판별 결과가 true 이면 형변환이 가능한 관계(업캐스팅 or 다운캐스팅)
		 *   판별 결과가 false 이면 절대로 형변환 불가능 
		 * - 우변의 클래스 타입과 같거나 우변 클래스 타입의 자식 타입 모두 가능 
		 * - A is a B = A instanceof B
		 * - 판별 결과를 Boolean 타입 변수에 저장하거나 
		 *   if문에 판별하는 문장을 직접 사용 가능 
		 * - 서브 클래스 타입 크기가 서브클래스 인스턴스를 가리킬때만 True 
		 * - 사이즈가 같아야 함 
		 *   
		 * <기본 문법>
		 * if(A instanceof B) { //A는 참조변수(객체), B는 클래스명(타입)
		 * 		//형변환이 가능한 관계이므로 변환 수행
		 * } else {
		 * 		// 절대로 형변환이 불가능한 관계이므로 변환 수행x
		 * }
		 *   
		 */
		
		
		SmartPhone2 sp = new SmartPhone2("iPhone15", "010-1212-3434", "iOS");
		
		// 호출 가능한 메서드 3개
		sp.call();
		sp.sms();
		sp.kakaoTalk();
		
		if(sp instanceof SmartPhone2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		System.out.println("------------------------------------------");
		
		// 업캐스팅 가능 대상 확인
		if(sp instanceof HandPhone) {
			System.out.println("YES(SmartPhone을 HandPhone으로 형변환 가능)");
			
			HandPhone hp = sp;
			hp.call();
			hp.sms();
			
		} else {
			System.out.println("NO");
		}
		
		// 다운 캐스팅 가능 확인 
		// 슈퍼 클래스 타입 인스턴스 생성 
		HandPhone hp = new HandPhone("anycall", "010-0000-0000");
		
		if(hp instanceof SmartPhone2) {
			System.out.println("hp는 SmartPhone");
		} else {
			System.out.println("hp는 SmartPhone x");
		}
		
		System.out.println("------------------------------------------");

		// 다운캐스팅 가능 대상 확인(가능한 경우)
		// SmartPhone -> HandPhone 
		
		HandPhone hp2 = new SmartPhone2("갤럭시", "010-1234-5123", "android");
		
		hp2.call();
		hp2.sms();
		
		
		
		if(hp2 instanceof SmartPhone2) {
			System.out.println("hp2는 SmartPhone");
			System.out.println("hp2는 SmartPhone으로 형변환 가능");
			SmartPhone2 sp2 = (SmartPhone2)hp2;
			
			sp2.call();
			sp2.sms();
			sp2.kakaoTalk();
		} else {
			System.out.println("hp2는 SmartPhone가 아니다");
		}
		
		System.out.println("------------------------------------------");

		Sub sb = new Sub();
		
		
//		sb = (Sub)new Super();
		if(sb instanceof Super) {
			System.out.println("sb는 Super 이다.");
			
			// 형변환 수행
			Super sp2 = sb; //자동 형변환
			sp2.superMethod();
		} else {
			System.out.println("sb는 Super가 아니다");
		}
		
		System.out.println("---------------------------------");
		
		Super p2 = new Super();
		
		if(p2 instanceof Sub) {
			System.out.println("p2 는 Sub이다");
			
			// 형 변환 수행
			Sub c2 = (Sub)p2; // Down Casting
			c2.superMethod();
			c2.subMethod();
		} else {
			System.out.println("p2는 Sub가 아니다");
		}
		
 	}
	
}

class HandPhone {
	String modelName;
	String phoneNumber;
	
	public HandPhone(String modelName, String phoneNumber) {
		super(); // object constructor
		this.modelName = modelName;
		this.phoneNumber = phoneNumber;
	}
	
	public void call() {
		System.out.println("전화 기능");
	}
	
	public void sms() {
		System.out.println("문자 기능");
	}
}

class SmartPhone2 extends HandPhone {
	String osName;
	// 모델명, 전화번호, 운영체제명을 전달받아 파라미터 생성자 정의 
	// -> 모델명과 전화번호는 슈퍼클래스의 생성자를 통해 대신 초기화 수행 
	public SmartPhone2(String modelName, String phoneNumber, String osName) {
		super(modelName, phoneNumber);
		this.osName = osName;
	}
	
	public void kakaoTalk() {
		System.out.println("카톡 기능");
	}
}
