package anonymous;

public class Ex3 {

	public static void main(String[] args) {
		Window w = new Window();
		w.button1.touch();
		w.button2.touch();
	}

}

// 버튼의 클릭 이벤트 처리 
// button 클래스 정의 
class Button {
	static interface OnClickListener { // 중첩 인터페이스 선언 
		void onClick();
	}
	
	OnClickListener listener; // 인터페이스 타입 인스턴스 변수(필드) 선언 
	
	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick(); // 구현 객체의 onClick() 메서드 호출 
	}
}

// Button 2개를 가지고 있는 Window 클래스를 정의(가정)
class Window {
	
	// 버튼 2개 생성 
	Button button1 = new Button();
	Button button2 = new Button();
	
	// 필드 초기값을 대입 
	// -> 필드 초기값으로 익명 구현 객체를 대입 
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() { // 익명 구현 객체
			System.out.println("전화를 겁니다");
		}
		
	};
	
	//생성자 정의
	public Window() {
		button1.setOnClickListener(listener);
		button2.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다");
			}
		});
	}
}





