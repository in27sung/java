package io_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class test {

	public static void main(String[] args) {
		/*
		 * 데이터를 입력하면 입력된 데이터를 출력하는 프로그램을 만들어보자.
		 * 입력 스트림을 데이터(문자열)을 읽어서 출력 스트림을 통해 데이터를 출력한다.
		 * ex) 입력 문자열: 아이티윌
		 *     화면에 출력되는 형태: 입력한 데이터는 아이티윌 입니다.
		 * 참고) try ~ with resources 구문에서 자동반환되는 객체가 여러개 라면 세미콜론(;)
		 *       으로 구분하여 전달 가능
		 */
		
		// BufferReader 를 사용하여 입력받은 문자열을 OutputStream 을 사용해서 출력 
		
//		System.out.println("문자를 입력해주세요:");
		// 1. 기본 입력스트림 객체(InputStream) 생성 = byte 단위 처리 
//		InputStream is = System.in;
		
		// 2. 입력스트림을 연결하는 보조스트림 InputStreamReader 객체 생성 = char 단위 처리
//		InputStreamRedaer reader = new InputStreamReader(is);

		// 3. 향상된 입력 보조스트림 BufferReader 객체 생성 = String 단위 처리 
//		BufferedReader buffer = new BufferedReader(reader);
		
		// ----------------- 위의 세 문장을 하나의 문자으로 결합 -------------------
		try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
				OutputStream os = System.out) {
			System.out.println("데이터를 입력하세요: ");
			// 입력스트림에서 한 줄의 데이터(문자열) 읽어오기
			String str = buffer.readLine();
			System.out.print("입력한 데이터는 ");
//			while(str != null) { // 입력 데이터가 존재할 동안 반복
//				System.out.println("입력한 데이터는 " + str + " 입니다.");
//				str = buffer.readLine(); // 다음 한 줄 다시 읽어오기
//			}
			
			// 출력 스트림을 통해 입력 데이터를 출력 
			os.write(str.getBytes());
			
			System.out.println("입니다.");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("입력 종료!");
	}
}
