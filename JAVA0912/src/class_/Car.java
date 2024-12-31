package class_;
/*
 * 자동차 클래스(=설계도) 정의
 * 1. 구성요소(속성) - 멤버변수
 * 		1) 제조사(company, String)
 * 		2) 모델명(modelName, String)
 * 		3) 배기량(cc, int)
 * 
 * 2. 동작(기능) - method
 * 		1) 속력증가(speedUp()) = "자동차 속력 증가!" 출력
 * 		2) 속력감소(speedDown()) = "car speed down" 출력 
 */
public class Car {

	String company;
	String modelName;
	int cc;
	
	public void speedUp() {
		System.out.println("Speed up" );
	}
	public void speedDown() {
		System.out.println("Speed down" );	
	}
	
	
	
}
