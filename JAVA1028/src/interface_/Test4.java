package interface_;

public class Test4 {

	public static void main(String[] args) {
	
		Circle cir = new Circle();
		cir.setRadius(15);
		cir.draw();
		
		
		Photoshop ps = new Photoshop();
		
		ps.draw(new Circle());
		
		ps.draw(new Rectangle());

	}

}

interface Shape {
	
	public abstract void draw();
}

class Circle implements Shape {
	
	private double radius = 3.0;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("원 그리기 반지름: " + radius);
	}
}

class Rectangle implements Shape {

	private double width = 2.0;
	private double height = 1.5;

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("사각형 그리기");
		System.out.println("가로: " + width + "높이: " + height);
	}
}

class Photoshop {

//	Shape[] shapeArr = {new Circle(), new Rectangle()};
//	
//	for(int i = 0; i < shapleArr.length; i++) {
//		shapeArr[i].draw();
//	}
	
	public void draw(Shape shape){ // Circle & Rectangle -> Up casting 
		// Shape 타입 변수의 draw() 메서드 호출 시 실제 인스턴스의 draw() 호출됨
		shape.draw();
	}
}

