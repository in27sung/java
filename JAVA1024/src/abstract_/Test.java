package abstract_;

public class Test {
	
	public static void main(String[] args) {
		
		Superman sm = new Superman();
		sm.takeOff();
		sm.fly();
		sm.land();
		
		Bird bird = new Bird();

		bird.takeOff();
		bird.fly();
		bird.land();
		
		Flyer f = new Superman();
		f.takeOff();
		f.fly();
		f.land();
		
		f = new Bird();
		f.takeOff();
		f.fly();
		f.land();
		
		
	}

}

abstract class Flyer {
	String name;
	
	abstract void takeOff();
	abstract void fly();
	abstract void land();
}

class Superman extends Flyer {
	String name = "슈퍼맨";
	@Override
	void takeOff() {
		System.out.println("슈퍼맨 이륙");
	}

	@Override
	void fly() {
		System.out.println("슈퍼맨 비행");		
	}

	@Override
	void land() {
		System.out.println("슈퍼맨 착륙");		
	}
	
}

class Bird extends Flyer {

	@Override
	void takeOff() {
		System.out.println("새 이륙");
	}

	@Override
	void fly() {
		System.out.println("새 비행");
		
	}

	@Override
	void land() {
		System.out.println("새 착륙");		
	}
	
}

class airPlane extends Flyer {

	@Override
	void takeOff() {
		System.out.println("비행기 이륙");
		
	}

	@Override
	void fly() {
		System.out.println("비행기 비행");
		
	}

	@Override
	void land() {
		System.out.println("비행기 착륙");
		
	}
	
}