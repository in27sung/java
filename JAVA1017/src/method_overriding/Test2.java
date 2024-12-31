package method_overriding;

public class Test2 {

	public static void main(String[] args) {
		
		ElectricCar ec = new ElectricCar();
		ec.speedUp();
		ec.speedDown();
		ec.addFuel();
		
		DieselCar dc = new DieselCar();
		dc.speed = 0;
		dc.maxSpeed = 260;
		dc.cc = 3000;
		
		// DieselCar 클래스에서 오버라이딩 한 메서드 호출 
		dc.speedUp();
		dc.speedDown();
		dc.addFuel();
		
	}// main

}// class Test2

class Car {
	int speed;
	int maxSpeed;
	
	public void speedUp() {
		System.out.println("자동차 속력 증가!");
	}
	public void speedDown() {
		System.out.println("자동차 속력 감소!");
	}
	public void addFuel() {
		System.out.println("자동차 연료 주입!");
	}
}// class Car

class ElectricCar extends Car{
	int batteryCapacity;

	@Override
	public void speedUp() {
		System.out.println("ElectricCar 전기모터의 힘으로 속력 증가");
	}

	@Override
	public void speedDown() {
		System.out.println("ElectricCar 속력 감소하면서 전기배터리 충전");
	}

	@Override
	public void addFuel() {
		System.out.println("전기차 충전소에서 배터리 충전");
	}
		
} //class ElectricCar()

class DieselCar extends Car{
	int cc;

	@Override
	public void speedUp() {
		System.out.println("디젤 업");
	}

	@Override
	public void speedDown() {
		System.out.println("디젤 다운");
	}

	@Override
	public void addFuel() {
		System.out.println("디젤 충전");
	}
	
}