package io_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 키보드로부터 데이터를 입력받아 처리하는 방법
		 * 5. BufferedReader 객체를 사용하여 String 단위로 입력 데이터를 처리하는 방법
		 * - InputStream 객체를 파라미터로 갖는 InputStreamReader 객체 생성 후
		 *   다시 InputStreamReader 객체를 파라미터로 갖는 BufferedReader 객체를 생성
		 *   => 보조스티림을 사용하는 스트림 체이닝(Stream Chaining) 방식 문법 구성
		 *   => 이처럼 기본스트림을 꾸며주는 역할을 하는 보조스트림을 적용하여
		 *      입출력을 처리하는 방식을 데코레이션 패턴(Decoration Pattern)이라고 함
		 * - read() 메서드가 아닌 readLine() 메서드를 활용하여 String 단위로 처리
		 *   => 즉, 데이터를 한 문장(라인 = 엔터키 기준) 단위로 읽어들여 처리
		 * - 키보드를 통해 입력되는 데이터를 처리하는 최종적인 방법(가장 효율적)
		 */

		// 스트림 체이닝을 통한 데코레이션 패턴 구현
		// 1. 기본 입력스트림 객체(InputStream) 생성 = byte 단위 처리
//		InputStream is = System.in;
		
		// 2. 입력스트림을 연결하는 보조스트림 InputStreamReader 객체 생성 = char 단위 처리
//		InputStreamReader reader = new InputStreamReader(is);
		
		// 3. 향상된 입력 보조스트림 BufferedReader 객체 생성 = String 단위 처리
//		BufferedReader buffer = new BufferedReader(reader);
		
		// ------------------- 위 세 문장을 하나의 문장으로 결합 ---------------------
//		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("데이터를 입력하세요 : ");
//		
//		try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))) {
//			// 입력스트림에서 한 줄의 데이터(문자열) 읽어오기
//			String str = buffer.readLine();
//			System.out.println("입력데이터 : " + str);
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
		
		// =====================================================================
		// 반복문을 사용하여 Ctrl + Z 입력 시 까지의 모든 문자열을 출력
		// => 주의! Ctrl + Z 입력 데이터가 정수일 때는 -1, 문자열일 때는 null 값 리턴
		System.out.println("데이터를 입력하세요 : ");
		
		try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))) {
			// 입력스트림에서 한 줄의 데이터(문자열) 읽어오기
			String str = buffer.readLine();
			
			while(str != null) { // 입력 데이터가 존재할 동안 반복
				System.out.println("입력데이터 : " + str);
				str = buffer.readLine(); // 다음 한 줄 다시 읽어오기
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("입력 종료!");
		
	}

}









