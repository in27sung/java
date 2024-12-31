package interface_;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 인터페이스의 필요성 
		 * 1. 구현의 강제로 코드의 통일성 향상(= 표준화)
		 * 2. 인터페이스를 통한 간접적인 클래스 사용으로 모듈 교체가 용이 
		 * 	  -> 특정 클래스를 직접 다루는 대신 부모 인터페이스 타입으로 
		 * 	 	클래스를 다루게 되면 실제 인스턴스가 바뀌더라도 기존 코드를
		 * 		수정할 필요가 없어짐 
		 * 3. 서로 상속 관계가 없는 클래스간의 인터페이스를 통한 산속 관계 부여 
		 * 	 -> 다형성 확장 
		 * 4. 모듈간 독립적 프로그래밍으로 인한 개발 기간 단축 
		 */
		
		// 2. 인터페이스 사용 시 손쉬운 모듈 교체를 지원한다. 
		
		LaserPrinter lp = new LaserPrinter();
		lp.print("a.txt");
		
		InkjetPrinter ip = new InkjetPrinter();
		ip.print("b.txt");
		
		DotPrinter dp = new DotPrinter();
		dp.print("c.txt");
		
		Printable p = lp; // Up Casting(Printable p = new LaserPrinter();)
		p.print("d.txt");
		
		System.out.println("====================================================");
		
		PrintClient pc = new PrintClient();
		
		// PrintClient 인스턴스의 setPrinter() 메서드를 호출하여 
		// 각 프린터기 인스턴스를 파라미터로 전달하면 업캐스팅 일어남 
		
		pc.setPrinter(new LaserPrinter()); // LaserPRinter -> Printer 업캐스팅 
		// -> setPrinter(Printer prineter)로 정의되어 있으므로 
		// 	  Printer printer = new LaserPrinter();가 됨 
		//	 좌변의 타입이 부모클래스 타입이고, 오른쪽의 인스턴스 생성이 자식 
		//   묵시적 형변환(업 캐스팅)
		
		pc.print("Hello.java");
		// 인스턴스 내의 Printer 타입 변수에 저장된 인스턴스 print() 호출됨 
		// -> 결국 실제 저장된 LaserPrinter 인스턴스의 print() 메서드가 호출 
		
		// 현재 LaserPrinter를 InkjetPrinter로 교체시 
		// setPrinter( new InkjetPrinter) 인스턴스만 전달하면 
		// 자동으로 출력 대상이 변경됨 
		pc.setPrinter(ip);
		pc.print("hi.java");
		
		
	}

}

// 각 프린터를 직접 다루지 않고 상위 타입인 Printer 인터페이스를 다루는
// PrintClient 클래스 정의 
class PrintClient {
	// 각각의 프린터 클래스를 다루기 위한 슈퍼클래스 타입에 해당하는 
	// Printer 인터페이스르 타입 변수 선언 
	private Printable printer;

	// Setter 메서드를 통한 Printer 타입 변수 선언
	public void setPrinter(Printable printer) {
		this.printer = printer;
	}
	
	// 외부로부터 출력할 파일을 전달받아 실제 프린터에 해당하는 각 인스턴스의 
	// print() 메서드를 호출한 뒤 파일을 전달하여 출력 작업을 수행 
	public void print(String fileName) {
		// Printable 타입 변수에 저잔된 각 프린터의 인스턴스를 통해
		// print() 메서드를 호출하면 해당 프린트의 출력 기능을 사용 가능함 
		printer.print(fileName);
	}
	
}

/*
 * 문서 등을 프린터로 출력하기 위한 각 프린터 클래스 정의
 * -> 각 프린터의 출력 기능을 갖는 Printer 인터페이스를 정의하고 
 * 	  각 프린터 클래스에서 상속받아 구현  
 */

interface Printable {
	// 프린터기의 공통 기능인 출력(print()) 기능을 추상메서드 정의 
	public abstract void print(String fileName);
}

class LaserPrinter implements Printable {

	// 파일(String 타입 fileName)을 전달받아 출력 작업을 수행하는 print() 메서드 
	// -> Printer 인터페이스에서 상속받아 구현 
	@Override
	public void print(String fileName) {
		System.out.println("LaserPrinter로 " + fileName + " 출력하기!");
	}
}

class InkjetPrinter implements Printable {

	// 파일(String 타입 fileName)을 전달받아 출력 작업을 수행하는 print() 메서드 
	// -> Printer 인터페이스에서 상속받아 구현 
	@Override
	public void print(String fileName) {
		System.out.println("InkjetPrinter로 " + fileName + " 출력하기!");
	}
}

class DotPrinter implements Printable {

	// 파일(String 타입 fileName)을 전달받아 출력 작업을 수행하는 print() 메서드 
	// -> Printer 인터페이스에서 상속받아 구현 
	@Override
	public void print(String fileName) {
		System.out.println("DotPrinter로 " + fileName + " 출력하기!");
	}
}


