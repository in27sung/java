package collection_framework;

import java.util.Stack;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * Stack(스택)
		 * - 하나의 상자에 데이터를 아래쪽(Bottom)에서부터 차례대로 쌓는 구조 
		 * - 데이터가 한쪽(Top) 에서만 삽입과 삭제가 이루어짐 
		 * 	 -> Last in First Out (LIFO) or First In Last Out(FILO)
		 * - toString() 메서드가 오버라이딩 되어 있음 
		 * - 2개의 스택을 사용하면 웹브라우저의 뒤로/앞으로 기능이나 
		 * 	 응용프로그램 Redo/Undo 기능 구형 가능  
		 */

		Stack<String> stack = new Stack<String>();
		
		// push(): 데이터 추가 
		stack.push("1 - www.itiwillbs.co.kr");
		stack.push("2 - www.naver.com");
		stack.push("3 - www.google.com");
		System.out.println("모든 요소를 출력: " + stack);
		
		// peek(): TOP에 위치한 요소 확인(제거 X) 
		System.out.println("맨 위(TOP) 요소 확인: " + stack.peek());
		
		// pop(): TOP에 위치한 요소 확인(꺼내기 = 제거O)
		System.out.println("맨 위(TOP) 요소 확인: " + stack.pop());
		System.out.println("맨 위(TOP) 요소 확인: " + stack.pop());
		System.out.println("맨 위(TOP) 요소 확인: " + stack.pop());

		// 더 이상 꺼낼 요소가 없을 경우 예외 발생: EmptyStackException
		System.out.println("맨 위(TOP) 요소 확인: " + stack.pop());
		
	}

}
