package java_util_package;

import java.util.Date;

public class EX2 {

	public static void main(String[] args) {
		/*
		 * [날짜 및 시각 관련 클래스]
		 * 1. Date 클래스 
		 * - 날짜 및 시각 관련 기능을 제공하는 클래스 
		 * - 대부분의 생성자 및 메서드가 deprecate 처리되어 있음 
		 *  -> 다양한 API들이 여전히 Date 타입을 사용하는 경우가 많음
		 * - toString() 메서드가 오버라이딩 되어 있음 
		 *  -> 날짜 및 시각 정보를 쉽게 출력 가능 
		 */
		
		
		Date d1 = new Date();
		System.out.println(d1);
		
		// 생성자에 long 타입 값을 전달 시 해당 값에 맞는 Date 객체 생성됨 
//		Date d2 = new Date(0); // 1970년 1월 1일 09시 기준 설정 
		Date d2 = new Date(1111);// 밀리초 단위 long 타입 값을 전달 
		
		// -> 기준 시간으로부터 지정된 밀리초만큼 지난 시간으로 설정 
		System.out.println(d2);
		
		// Date 객체의 getTime() 메서드를 호출하면 
		// 해당 객체의 날짜 정보가 long 타입으로 리턴 
		// -> 두 Date 객체의 getTime() 결과를 연산하면 두 날짜간의 차이 계산 가능 
		// -> 목표날짜 - 현재날짜 > 0 일 경우 결과값은 남은 일 수 (미래)이고,
		// 	  목표날짜 - 현재날짜 < 0 일 경우 결과값은 지난 일 수 (과거)이다. 
		long differentDate = d2.getTime() - d1.getTime();
		System.out.println(differentDate);
		
		// -> 사용하기 편하도록 특정 단위로 변환 작업이 필요함 
		// 	ex) 밀리초 -> 초 -> 분 -> 시 -> 일 순서로 변환 
		System.out.println(differentDate / 1000 / 60 / 60 / 24 + "일");
		
		if(differentDate > 0) {
			System.out.println(differentDate / 1000 / 60 / 60 / 24 + "일 남았습니다.");
		} else if(differentDate < 0) {
			System.out.println(differentDate / 1000 / 60 / 60 / 24 + "일 지났습니다.");

		} else {
			System.out.println("오늘입니다.");
		}
		
		
		
	}

}
