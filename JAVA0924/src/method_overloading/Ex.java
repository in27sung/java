package method_overloading;

public class Ex {

	public static void main(String[] args) {
		/*
		 * Method Overloading: 메서드 다중 정의 
		 *- 동일한 이름의 파라미터가 다른메서드를 여러 번 정의하는 것
		 *- 비슷한 기능을 수행하지만, 전달받은 데이터의 타입이 다른 경우 
		 * 	  메서드 이름을 가각 따로 정의하지 않고, 동일한 이름으로 
		 *   파라미터만으로 구분되는 메서드를 여러 개 정의하는 것  
		 *   - 주의사항! 메서드 시그니처(이름, 리턴타입, 파라미터, 접근제한자 ) 중 
		 *   파라미터를 제외한 나머지는 동일하게 정의함 
		 *   
		 *   -> 외부에서 메서드를 호출하는 시점에 이름이 동일한 메서드 간에 
		 *   전달되는 데이터(파라미터값 ) 만으로 각 메서드 구분되어야
		 *   
		 *   <Role(택1)>
		 *   - 메서드 파라미터의 데이터타입이 달라야 함
		 *   - 메서드 파라미터의 개수가 달라야 함 
		 */
		
		NormalMethod normalM = new NormalMethod() ;

		normalM.addInt(10, 20);
//		normalM.addInt(1.5, 3.14);
		// The method addInt(int, int) in the type Ex.NormalMethod 
		// is not applicable for the arguments (double, double)
		normalM.addDouble(1.5, 3.14);
		
	System.out.println("===========================");
		// 오버로딩이 적용된 메서드를 정의한 OverloadingMethod 인스터스 생성
		OverloadingMethod om = new OverloadingMethod();
			
		// 오버로딩 된 메서드 호출 시 파라미터를 전달하면
		// 오버로딩 메서드 중에서 파라미터가 일치하는 메서드가 자동 호출됨
		// -> 단, 메서드 호출 시점에서 각 메서드가 구분되어야 오버로딩 성립됨 
		om.add(10, 20);
		om.add(1.5, 3.14);
		om.add(1, 2, 3);
	}
}

class OverloadingMethod{
	// 오버로딩 기능을 활요하여 두 수를 전달받아 뎃섬 결과를 출력하는 메서드 정의
	// 동일한 이름의 파라미터 타입만 서로 다른 메서드를 여러 번 정의
	
	// 1. 정수 2개를 전달받아 덧셈 수행 
	public void add(int num1, int num2) {
		System.out.println("add(int, int) 호출됨");
		System.out.println(num1 + num2);
	}
	
	// 2. 실수 2개를 전달받아 덧셈 수행 
	public void add(double num1, double num2) {
		System.out.println("add(double, double) 호출됨");
		System.out.println(num1 + num2);
	}
		// 3. 정수 3개를 전달받아 덧셈 수행  
		public void add(int num1, int num2, int num3) {
			System.out.println("add(int, int, int) 호출됨");
			System.out.println(num1 + num2 + num3);
		}
			// Caution: 파라미터 의 변수명만 다를 경우 오버로딩 성립되지 않음 -> 오류 발생!
//			public void add(int a, int b) {
//				System.out.println("add(int,int)");
//				System.out.println(a + b);
//			}// Duplicate method add(int, int) in type OverloadingMethod
			
			// Caution: 리턴 타입만 다를 경우 오버로딩 성립되지 않음 -> 오류 발생!
//		public int add(int num1, int num2) {
//			System.out.println("add(int, int) 호출됨");
//			return num1 + num2;
//		}
}
class NormalMethod{
	// 두 수를 전달받아 덧셈 결과를 출력하는 메서드 정의 
	// 1. int형 정수 2개를 전달받을 경우 
	public void addInt(int num1, int num2) {		
		System.out.println(num1 + num2);
		}
		public void addDouble(double num1, double num2) {
			System.out.println(num1 + num2);
		}
		// 일반적으로 메서드명도 식별자에 해당하므로 중복이 불가능함. 
		// 따라서, addInt() 와 addDouble() 메서드는 하는 일은 같디만 
		// 서로다른 파라미터를 전달받으므로 다른 이름으로 정의 
		// => 메서드명을 달리해야하므로 호출 시 구분이 불편할 수 있음. 
		
	}
	
	
	
	
	
