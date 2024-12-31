package enum_type;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * enum(EnumWeek2) 와 switch ~ case 문을 활용하여 
		 * 평일이면(월~목) 이면 "즐거운 평일"
		 * 금요일이면 "불금입니다."
		 * 주말이면 "주말입니다"를 출력하는 코드를 작성해봅시다.
		 */
		
		EnumWeek2 today = EnumWeek2.FRIDAY;
		
		if(today.ordinal() < 4) {
			System.out.println("즐거운 평일 입니다.");			
		} else if(today.ordinal() == 4) {
			System.out.println("금요일 입니다.");
		} else {
			System.out.println("주말 입니다.");
		}
	
	}

}

enum EnumWeek2 {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}


