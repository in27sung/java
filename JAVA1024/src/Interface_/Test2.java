package Interface_;

public class Test2 {

	public static void main(String[] args) {
		
		Robot rb = new BumbleBee();
		
		rb.fight();
		rb.transform(rb.MODE_AIRPLANE);
		rb.transform(rb.MODE_NORMAL);
		rb.transform(rb.MODE_CAR);
		rb.speak();

	}

}

interface Fightable {
	void fight();
}

interface Transformable {
	int MODE_CAR = 1;
	int MODE_AIRPLANE = 2;
	int MODE_NORMAL = 3;
	
	void transform(int mode);
}

interface Robot extends Fightable, Transformable {
	void speak();
}

class BumbleBee implements Robot {

	@Override
	public void fight() {
		System.out.println("로켓 발사");
	}

	@Override
	public void transform(int mode) {
		if(mode == Transformable.MODE_NORMAL) {
			System.out.println("기본 모드(로봇)로 변신");
		}
		if(mode == Transformable.MODE_CAR) {
			System.out.println("자동차로 변신");
		}
		if(mode == Transformable.MODE_AIRPLANE) {
			System.out.println("비행기로 변신");
		}
	}

	@Override
	public void speak() {
		System.out.println("라디오로 말하기");
	}
	
}