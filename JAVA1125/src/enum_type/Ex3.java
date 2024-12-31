package enum_type;

public class Ex3 {
	
	public static void main(String[] args) {
		Month now = Month.FEBRUARY;
		
		System.out.println(now + ", " + now.getMonthKor());
	}
}


enum Month {
	// 생성자를 사용하여 상수에 다른 값을 결합 
	JANUARY("1월"), FEBRUARY("2월");
	// -> The constructor Month(String) is undefined
	
	String monthKor;
	
	Month(String monthKor) { // 달 이름을 문자열로 전달받아 초기화 
		this.monthKor = monthKor;
		
	}

	public String getMonthKor() {
		return monthKor;
	}

	public void setMonthKor(String monthKor) {
		this.monthKor = monthKor;
	}
}