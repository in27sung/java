package abstract_;

public class Test2 {
	public static void main(String[] args) {
		
		Vehicle ec = new ElectricCar();
		
		ec.addFuel();
		ec.curX = 3;
		ec.curY = 5;
		ec.reportPistion();
		
		Vehicle dc = new DiselCar();
		dc.addFuel();
		dc.reportPistion();
		
		
	}
}// class Test2

abstract class Vehicle{
	int curX;
	int curY;
	
	public void reportPistion() {
		System.out.printf("현재위 위치: %d, %d\n", curX, curY);
	}
	
	abstract void addFuel();
}

class ElectricCar extends Vehicle{

	@Override
	void addFuel() {
		System.out.println("전기차 충전소에서 배터리 충전");
	}
	
}

class DiselCar extends Vehicle{

	@Override
	void addFuel() {
		System.out.println("주유소에서 디젤 연료 공급");
	}
	
}