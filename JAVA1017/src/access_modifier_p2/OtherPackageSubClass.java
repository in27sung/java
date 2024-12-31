package access_modifier_p2;

import access_modifier_p1.SuperClass;

public class OtherPackageSubClass extends SuperClass {
	
	public void useMember() {
		// 다른 패키지 상속 관계인 슈퍼클래스의 멤버에 접근 
		// -> 슈퍼클래스의 멤버에 접근할 때 참조변수 없이 접근 
		//	  또는, 레퍼런스 this 사용
				
		this.publicVar = 10; 
		protectedVar = 20;
		// 다른 패키지이지만, 상속 관계에 있으므로 접근 가능
//		defaultVar = 30; //default 접근불가
//		privateVar = 40; //private 접근불가  
		
		// -----------------------------------------------------------------
		// 서브클래스에서 슈퍼클래스의 인스턴스 생성 후 참조변수를 통해 접근 시
		// is-a 관계가 아닌 has-a 관계로 취급되어 protected도 접근 불가능 
		
		SuperClass sp = new SuperClass();
		
		sp.publicVar = 10;
//		sp.protectedVar = 20;
		// The field SuperClass.protectedVar is not visible
	}
}
