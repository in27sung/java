package access_modifier_p2;

import access_modifier_p1.SuperClass;

public class OtherPackageClass {
	
	public void useMember() {
		// 다른 패키지 상속 관계가 아닌 다른 클래스의 멤버에 접근 
		// -> 인스턴스 생성 후 참조변수를 통해 접근
		// -> 같은 패키지이므로 import 문이 필요!
		SuperClass pc = new SuperClass();
		
		pc.publicVar = 10; 
//		pc.protectedVar = 20;  //protected 접근불가
							  // 패키지가 다르고, 상속관계도 아니므로 접근 불가
//		pc.defaultVar = 30; //default 접근불가
//		pc.privateVar = 40; //private 접근불가  
	}
}
