package anonymous;

public class Test3 {
	
	public static void main(String[] args) {
		/*
		 * CheckBox 클래스 정의 
		 * - select() 메서드가 호출되면 "배경을 변경합니다!" 출력
		 */
		
		// CheckBox 객체 생성 
		CheckBox checkBox = new CheckBox();
		
		// setOnClickListener 호출, 이때 매개변수로 익명 구현 객체를 사용 
		checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다.");
			}
		});
		
		// select
		checkBox.select();
	}

}

// CheckBox 클래스 정의 
class CheckBox {
	//정적 내부 인터페이스 OnSelectListener 정의 
	static interface OnSelectListener {
		void onSelect();
	}
	
	// OnSelectListener 타입의 인스턴스 변수 선언 
	OnSelectListener listener;
	
	// SetOnSelectListener 메서드 정의 
	public void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	// select() 메서드를 정의해서 인스턴스 변수의 오버라이딩 된 onSelect()
	// 메서드가 호출되도록 함
	public void select() {
		listener.onSelect();
	}
}
// - 정적 내부 인터페이스 OnSelectListener 정의

