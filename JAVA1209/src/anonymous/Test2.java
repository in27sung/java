package anonymous;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * run() 메서드를 가지는 인터페이스 Vehicle를 정의하고 
		 * 익명 구현 객체를 이용하여 필드, 로컬변수의 초기값과
		 * 메서드의 매개값으로 사용. 아래 내용을 출력 
		 */
		
		AnonyInterfaceClass aic = new AnonyInterfaceClass();
		
		aic.bike.run();
		aic.method();
		aic.method2(new Vehicle() {

			@Override
			public void run() {
				System.out.println("트럭이 달립니다");
			}
			
		});
	}

}

interface Vehicle {
	public abstract void run();
}



class AnonyInterfaceClass {
	Vehicle bike = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	
	public void method() {
		Vehicle car = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차 달립니다.");
			}
		};
		car.run();
	}

	void method2(Vehicle truck) {
		truck.run();
	}
}
