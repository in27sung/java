package Polymorphism;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 다형성(Polymorphism)
		 * - 하나의 데이터타입(참조변수)으로 여러 인스턴스를 참조하는 특성 
		 * - 어떤 인스턴스를 업캐스팅하여 슈퍼클래스 타입 변수로 다루면 
		 * 	 하나의 슈퍼클래스 타입으로 여러 서브클래스 타입 인스턴스를 다룰 수 있음 
		 * - 상위 클래스가 동일한 메시지로 하위 클래스를 서로 다르게 동작시키는 객체지향 이론 
		 */
		
		// Circle 인스턴스 생성 
		Circle c = new Circle();
		//Polymorphism.Circle@1c4af82c
		System.out.println(c); 
		c.draw(); 
		
		Rectangle r = new Rectangle();
		//Polymorphism.Rectangle@1175e2db
		System.out.println(r); 
		r.rdraw();
		
		Triangle t = new Triangle();
		
		System.out.println(t); 
		t.desgin();
		
		System.out.println("---------------------------------------");
		
		// 슈퍼클래스의 메서드를 상속받아 오버라이딩 하는 경우
		// 코드의 통일성이 향상됨
		c.draw(); //Polymorphism.Circle@379619aa
		r.draw(); //Polymorphism.Rectangle@36aa7bc2
		t.draw(); //Polymorphism.Triangle@182decdb
		
		System.out.println("---------------------------------------");
		
		// 코드의 통일성을 더 향상시키기 위한 방법: 업캐스팅 활용
		// -> Circle, Rectangle, Triangle의 공통 슈퍼클래스인 
		// Shape 타입의 참조변수(s)로 세 인스턴스를 컨트롤 가능 
		// Circle -> Shpae 업캐스팅
		Shape s = new Circle();
		System.out.println(s); //Polymorphism.Circle@26f0a63f
		s.draw(); //동적 바인딩에 의해 Circle 인스턴스의 draw() 메서드 호출
		
		// Rectangle -> Shape 업캐스팅
		s = new Rectangle();
		System.out.println(s); //Polymorphism.Rectangle@4361bd48
		s.draw(); // Rectangle 인스턴스의 draw() 메서드 호출
		
		// Triangle -> Shape 
		s = t;
		System.out.println(s); //Polymorphism.Triangle@182decdb
		s.draw(); // Triangle 인스턴스의 draw() 메서드 호출
		
		System.out.println("==============================================");
		
		// 다형성을 배열에 적용시키는 경우 
		// -> 슈퍼 클래스 타입으로 배열을 생성하여 
		//    배열의 각 인덱스에 각각의 서브 클래스 인스턴스를 저장 가능 
		Shape[] sArr = new Shape[3]; // Shape 타입 배열을 생성(크기가 3)
		
		// 0번 인덱스에 Circle 인스턴스 생성하여 저장 
		sArr[0] = new Circle(); // Circle -> Shape 업캐스팅 
		
		// 1번 인덱스에 Rectangel 인스턴스 생성하여 저장 
		sArr[1] = new Rectangle(); // Rectangle -> Shape 업캐스팅 
		
		// 2번 인덱스에 Triangle 인스턴스 생성하여 저장 
		sArr[2] = new Triangle(); // Triangle -> Shape 업캐스팅 
		
		Shape[] sArr2 = {new Circle(), new Rectangle(), new Triangle()};
		
		// 배열의 각 인덱스에는 인스턴스 주소가 저장되므로 
		// 참조변수와 마찬가지로 배열명[인덱스].메서드명() 형태로 호출이 가능!
		sArr[0].draw();
		sArr[1].draw();
		sArr[2].draw();
		
		for(int i = 0; i <sArr.length; i++) {
			sArr[i].draw();
		}
		
		System.out.println("---------------------------------------");
		
		// 향상된 for문 활용
		for(Shape s1 : sArr) {
			s1.draw();
		}
		
		System.out.println("=======================================");
		
		Ex2 ex = new Ex2();
		ex.polymorpismDraw(sArr);
		//-> static이 설정되지 않은 '인스턴스 메서드'를 호출하는 경우 
		// 먼저 인스턴스 생성하고 참조변수를 통해 호출할 수 있다 
		
		// 반면, static 설정이 되어 있는 '클래스(정적) 메서드'를 호출하는 경우 
		// 인스턴스를 생성하지 않아도 클래스명.메서드 형태로 호출이 가능!
		// 이때 자신의 클래스 내부에서 정의한 '클래스(정적) 메서드'라면
		// 클래스명은 생략도 가능하다!
		
		// 메서드 다형성 활용
		// 1. 이미 다형성이 적용된 배열을 메서드 파라미터로 전달 
		polymorpismDraw(sArr); //(= Ex2.polymorphismDraw)
		// -> 클래스명이 동일한 static 메서드의 호출인 경우 클래스명을 생략 가능
		
		polymorpismDraw2(new Circle());
		polymorpismDraw2(new Rectangle());
		polymorpismDraw2(new Triangle());
		
	} // main() 메서드 끝 
	
	public static void polymorpismDraw(Shape[] sArr) {
		// 반복문을 사용하여 배열 내의 모든 인스턴스 draw() 메서드 호출 
		for(int i = 0; i <sArr.length; i++) {
			sArr[i].draw();
		}
	}
	
	public static void polymorpismDraw2(Shape s) {
		// 어떤 인스턴스가 전달되더라도 draw() 메서드는 공통이므로 호출 가능!
		s.draw();
	}
	
	public static void ex2Method() {}

} //Ex2 클래스 

class A {
	void method() {
		
		//클래스명 
		Ex2.ex2Method();
	}
}

// 여러 도형의 특징을 공통적으로 포함하는 슈퍼클래스 Shape 정의 
class Shape {
	
	public void draw() {
		System.out.println("도형 그리기");
	}
	
}

class Circle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("원 그리기");
	}

	public void circlePaint() {
		System.out.println("원 그리기");
	}
}

class Rectangle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}

	public void rdraw() {
		System.out.println("사각형 그리기");
	}
}

class Triangle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("삼각형 그리기");
	}
	public void desgin() {
		System.out.println("삼각형 그리기");
	}
}