package io_2;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 모니터로 데이터를 출력하는 방법 
		 * 2. OutputStreamWriter 사용(char 단위로 처리)
		 * - write() 메서드를 호출하여 char[] 배열 또는 String 객체를 전달하여 
		 *   문자 데이터 출력 가능 
		 *   -> String 클래스는 내부적으로 char[] 배열로 관리되므로 writer 계열에서 처리 가능 
		 * - FileOutputStream 
		 *   -> 파일에 바이트 단위 자료를 출력하기 위해 사용하는 스트림 
		 * - 데코레이션 패턴을 활용하기 위해 BufferedOutputStream 객체 사용 가능 
		 *   -> 바이트 단위로 출력하는 시스템에 버퍼링 기능을 제공 
		 * - BufferedWriter 는 문자 단위로 출력하는 스트림에 버퍼링 기능 제공 
		 *   -> OutputStreamWriter 보다 BufferedWriter의 처리속도가 빠르다.
		 */
		
		// OutputStream os = System.out;
//		OutputStreamWriter writer = new OutputStreamWriter(System.out);
		
//		try(OutputStreamWriter writer = new OutputStreamWriter(System.out)) {
//			String str = "Hello, Java";
//			writer.write(str);
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
		
		// ==========================================================================
		// File에 출력하기 준비 단계 
		// temp 폴더를 생성 -> Get Info -> everyone -> Read & Write
		
		// 출력 내용을 파일에 저장 
		
		try(FileOutputStream fos = new FileOutputStream("/Users/Insung/Documents/temp/data.txt")) {
			fos.write(65); // 파라미터로 숫자를 쓰면 해당 아스키코드 값으로 변환됨
			fos.write(66);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
		
		// =========================================================================
		// 파일에 저장 위치가 같으면 기존의 데이터는 사라지고 새로운 데이터로 대체됨
//		try(FileOutputStream fos = new FileOutputStream("/Users/Insung/Documents/temp/data.txt")) {
//			fos.write(67);
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("출력이 완료되었습니다.");
		
		// 만약, 기존 자료에 이어서 출력하고 싶다면 생성자의 두 번째 매개변수에 
		// true를 입력
		try(FileOutputStream fos = new FileOutputStream("/Users/Insung/Documents/temp/data.txt", true)) {
			fos.write(67);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
		
		// ===============================================================================
		// 파일에 바이트 배열로 출력하기
		try(FileOutputStream fos = new FileOutputStream("/Users/Insung/Documents/temp/data2.txt")) {
			byte[] bArr = new byte[26];
			byte data = 65; // 'A'의 아스키 값 
			for(int i = 0; i < bArr.length; i++) {
				bArr[i] = data;
				data++;
			}
			
//			fos.write(bArr);
			// -> 배열을 한꺼번에 파일(data2.txt)에 출력
			
			fos.write(bArr, 2, 10);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
		
		// ========================================================================
		// bufferedOutputStream 활용 
		
		// FileOutputStream 
//		FileOutputStream fos = new FileOutputStream("/Users/Insung/Documents/temp/data3.txt");
		
		// BufferedOutputStream의 버퍼 크기를 5로 설정 
//		BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/Insung/Documents/temp/data3.txt"))) {
			// 파일 data3.txt에 1부터 9까지 출력 
			for (int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}
		} catch (Exception e) {
		}
		System.out.println("출력이 완료되었습니다.");
		
		// ========================================================================
		// BufferedWriter 활용 
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/Insung/Documents/temp/data4.txt"), 5)) {
			// BufferedWriter는 한글, 한자 등의 문자(char)도 출력 가능 
			for (int i = '가'; i <= '나'; i++) {
				bw.write(i);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
