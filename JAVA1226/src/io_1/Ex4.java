package io_1;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 키보드로부터 데이터를 입력받아 처리하는 방법
		 * 4. InputStreamReader 객체를 사용하여 char 단위로 읽어온 데이터를
		 *    배열을 사용하여 한 번에 여러 문자로 모아서 처리하는 방법
		 */
		
		System.out.println("데이터를 입력하세요 : ");
		
		try(InputStreamReader reader = new InputStreamReader(System.in)) {
			// 여러 개의 char 단위 데이터를 저장할 char[] 배열 생성
			char[] chArr = new char[10];
			
			int n = reader.read(chArr);
			System.out.println("입력데이터(문자열) : " + new String(chArr));
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
