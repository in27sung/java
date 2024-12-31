package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		/*
		 * Set 계열 객체를 활용하여 로또 번호 생성기 작성(정렬은 선택)
		 * 1. Set 타입 객체 myLotto 생성
		 * 2. 1 ~ 45 사이의 중복되지 않는 난수(로또번호) 6개를 Set 객체에 저장
		 *    => ex) "나의 로또 번호 : 1 10 11 15 23 41 43" 출력
		 * -------------------------------------------------------------------
		 * 3. 이번주 로또 1등 당첨 번호를 Set 객체 thisWeekLotto 에 저장
		 *    => ex) "이번주 1등 당첨번호 : 7 8 11 13 15 23" 출력
		 * 4. 기존의 myLotto 에 저장된 번호와 1등 당첨번호를 비교하여
		 *    일치하는 번호 개수와 등수 출력
		 *    => ex) 번호가 3개(11, 15, 23) 일치 시
		 *           "일치하는 번호 개수 : 3개(4등)"
		 *    => 6개 일치 : 1등, 5개 일치 : 2등, 4개 : 3등, 3개 : 4등, 나머지 : 꽝
		 *    
		 */
		
		// 1. Set 타입 객체 myLotto 생성
		Set<Integer> myLotto = new TreeSet<Integer>();
		
		// 2. 1 ~ 45 사이의 중복되지 않는 난수(로또번호) 6개를 Set 객체에 저장
		Random num = new Random();
		
		
		
		// => 난수 생성은 Random 클래스 또는 Math.random() 메서드 활용
		// => for 또는 while 문을 통해 반복
		//    이 때, 6개의 번호가 만들어지지 않으면 계속 반복하도록 설정
		
		// while문 사용 
//		while(myLotto.size() < 6) {
//			myLotto.add(num.nextInt(45) + 1);
//		}
		
		// => for문 정의 시 제어변수를 통해 6개의 숫자를 만드는 경우
		//    중복이 발생하면 저장 없이 반복 횟수만 증가함
		//    따라서, 중복이 발생했을 경우 제어변수의 반복 횟수 조정이 필요(i값을 -1)
		
		// for문 사용 
		for(int i = 1; i <= 6; i++) {
			int rNum = num.nextInt(45) + 1; // 1 ~ 45의 난수 발생 
			
			if(myLotto.contains(rNum)) {
				System.out.println("중복되는 번호 발생: " + rNum);
				
				// 중복 번호가 발생했으므로 카운팅을 하디 않도록 i 값을 1 감소 
				i--;
			}
			myLotto.add(rNum);
		}
		// => 중복의 판별 여부는 contains() 메서드 사용
		
		Object[] myLottoResult = myLotto.toArray();
		System.out.print("나의 로또 번호: ");
		for(int i = 0; i < myLottoResult.length; i++) {
			System.out.print(myLottoResult[i] + " ");
		}
		System.out.println();
		// Random 클래스의 메서드를 사용하기 위해 인스턴스 생성
		
		// 3. 이번주  로또 1등 당첨 번호를 Set 객체 thisWeekLotto 에 저장
		//    => ex) "이번주 1등 당첨번호 : 7 8 11 13 15 23" 출력
		
		Set<Integer> thisWeekLotto = 
				new TreeSet<Integer>(Arrays.asList(7, 8, 11, 13, 15, 23));
		
		/* 4. 기존의 myLotto 에 저장된 번호와 1등 당첨번호를 비교하여
		 *    일차하는 번호 개수와 등수 출력
		 *    => ex) 번호가 3개(11, 15, 23) 일치 시
		 *           "일치하는 번호 개수 : 3개(4등)"
		 *    => 6개 일치 : 1등, 5개 일치 : 2등, 4개 : 3등, 3개 : 4등, 나머지 : 꽝
		 */
		
		// 일치하는 당첨번호 개수를 카운터하기 위한 변수 선언 및 초기화
		int count = 0;
		
		// 당첨번호 비교(contains() 메서드 활용)
		// 1. 향상된 for문 사용
		for(int cNum : myLotto) { // 나의 로또 번호에서 번호 1개씩 꺼내기 
			// 꺼낸 번호와 1등 당첨 번호를 비교 
			if(thisWeekLotto.contains(cNum)) {
				// 카운팅 증가 
				count++;
			}
		}
		
		// 2. Iterator 사용시 
//		Iterator<Integer> ite = myLotto.iterator();
//		// -> iterator() 메서드를 호출하여 Iterator 인터페이스를 구현한 객체를 얻음 
//		while(ite.hasNext()) { // 가져올 객체가 있으면 true, 없으면 false
//			int cNum = ite.next(); // next() 메서드를 호출하여 객체를 하나 받아옴 
//			
//			// 꺼낸 번호와 1등 당첨 번호를 비교 
//			if(thisWeekLotto.contains(num)) {
//				// 카운팅 증가 
//				count++;
//			}
//		}
		
		System.out.println("당첨된 번호가 " + count + "개 있습니다.");
		
		// 결과는 switch ~ case 문 사용
		
		switch(count) {
			case 6: System.out.println("1등"); break;
			case 5: System.out.println("2등"); break;
			case 4: System.out.println("3등"); break;
			case 3: System.out.println("4등"); break;
			default: System.out.println("꽝");
		}


		
//		ArrayList<Object> number = new ArrayList<Object>();
//		for(int i = 0; i < myLottoResult.length; i++) {
//			for(int j = 0; j < thisWeekLottoResult.length; j++) {
//				if(myLottoResult[i] == thisWeekLottoResult[j]) {
//					number = myLottoResult[i];
//				}
//			}
//		}
//		
		
	}
	
	
	
	
}
