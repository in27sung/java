package inheritance;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 상속의 장점
		 * 1. 코드 재사용성 증가 
		 * 2. 코드의 유지보수성이 용이해짐 
		 */
		
		Print3D p3 = new Print3D();
		p3.print3D();
		
	}

}

// 2차원 좌표(x, y)를 관리하는 Print2D 클래스
class Print2D {//class Print2D extends Object와 같음 
	int x = 10; //x 좌표
	int y = 20; //y 좌표
	
	// 2차원 좌표값을 출력하는 print2D() 메서드 정의 
	public void print2D() {
		System.out.print("x 좌표 = " + x + ", y 좌표 = " + y);
	}
}

// 3차원 좌표(x, y, z)를 관리하는 Print3D 클래스 
// x, y, z 좌표 관리 기능은 기본적으로 Print2D 클래스와 중복되므로 상속 
class Print3D extends Print2D {
	int z = 30; // z 좌표 
	
	public void print3D() {
		print2D();
		System.out.println(/*"x 좌표 = " + x + ", y 좌표 = " + y + */", z 좌표 = " + z);
	}
}