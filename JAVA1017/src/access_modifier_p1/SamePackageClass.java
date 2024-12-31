package access_modifier_p1;

public class SamePackageClass {
	
	public void useMember() {
		// 같은 패키지 내의 다른 클래스 (ParentClass)의 멤버에 접근 
		// -> 인스턴스 생성 후 참조변수를 통해 접근 
		SuperClass pc = new SuperClass();
		pc.publicVar = 10; 
		pc.protectedVar = 20; 
		pc.defaultVar = 30; 
//		pc.privateVar = 40; //private 접근불가  
	}
}
