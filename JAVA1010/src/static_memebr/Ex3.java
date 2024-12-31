package static_memebr;

public class Ex3 {
	/*
	 * static 멤버와 인스턴스 멤버의 메모리 할당 순서 (JAVA Run-tim Data Area)
	 * <Method Area>
	 * 0. Ex3 클래스가 메모리에 로딩됨 
	 * 1. static 키워드가 선언된 모든 멤버가 메모리에 로딩됨 
	 * 2. static 메서드 check() 호출 = static 멤버변수 로딩 
	 * 
	 * 3. main() 메서드가 자동으로 호출됨 
	 * 	  -> "main() 메서드 호출!" 출력 
	 * 4. main() 메서드 내에서 Ex3 인스턴스 생성됨 
	 * 5. Ex3 인스턴스 생성 시 인스턴스 변수 b 가 메모리에 로딩되며 
	 *    인스턴스 변수 b가 로딩될 때 check() 메서드 호출 
	 *     
	 * 
	 */
	
	int b = check("인스턴스 변수 b!");
	static int a = check("static 변수 a");
	
	public static int check(String str) {
		System.out.println("check() 호출: " + str);
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println("main() 메서드 호출");
		
		Ex3 ex = new Ex3();
		System.out.println("Ex3 인스턴스 생성 완료");
		
		
		
	} //main()

	static int c = check("static 변수 c");
	
} //Class Ex3 
