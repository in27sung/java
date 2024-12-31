package io_1;

import java.io.IOException;
import java.io.InputStream;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 자바 I/O(Input/Output)
		 * - java.io 패키지에 있는 클래스들의 모음
		 * - 자바에서 각종 입출력을 담당
		 * - Node(노드) : 자바에서 입출력을 수행하는 대상
		 *   => 입력 노드 : 키보드, 마우스, 파일, 네트워크, 데이터베이스 등
		 *   => 출력 노드 : 모니터, 스피커, 파일, 네트워크, 데이터베이스 등
		 *   
		 * - Stream(스트림) : 입력 또는 출력 데이터가 한 방향으로 끊임없이 전송되는 것
		 *   => 출발지 노드 -> 도착지 노드
		 * - 자바는 다양한 입출력 장치와 무관하고 일관성 있게 프로그램을 구현할 수 있도록
		 *   일종의 가상 통로인 스트림을 제공
		 *   
		 * [ 입력 스트림과 출력 스트림 ]
		 * 1. 입력 스트림
		 * => 자바에서 데이터가 입력될 때 처리하는 스트림
		 * => 예를 들어 어떤 동영상을 재생하기 위해 동영상 파일에서 자료를 읽을 때
		 * => FileInputStream, FileReader, BufferedInputStream, BufferedReader 등
		 * 
		 * 2. 출력 스트림
		 * => 자바에서 데이터가 출력될 때 처리하는 스트림
		 * => 예를 들어 편집 화면에서 사용자가 쓴 글을 파일에 저장할 때
		 * => FileOuptStream, FileWriter, BufferedOutputStream, BufferedWriter 등
		 * 
		 * [ 바이트 단위 스트림과 문자 단위 스트림 ]
		 * 1. byte 기반(단위) 스트림
		 * => 그림, 사진, 영상 등 바이너리(Binary) 데이터를 입출력
		 * => InputStream, OutputStream 을 최상위 클래스로 두고
		 *    XXXInputStream, XXXOutputStream 클래스가 하위클래스로 존재함
		 *    
		 * 2. char 기반(단위) 스트림
		 * => 문자 데이터(텍스트)를 입출력
		 * => Reader, Writer 를 최상위 클래스로 두고
		 *    XXXReader, XXXWriter 클래스가 하위클래스로 존재함.
		 *    
		 * [ 기반 스트림과 보조 스트림 ]
		 * 1. 기반 스트림
		 * => 읽어 들일 곳(소스)이나 써야할 곳(대상)에서 직접 읽고 쓸 수 있으며
		 *    입출력 대상에 직접 연결되어 생성되는 스트림
		 * => FileInputStream, FileOutputStream, FileReader, FileWriter 등
		 * 
		 * 2. 보조 스트림
		 * => 직접 읽고 쓰는 기능은 없고, 항상 다른 스트림을 포함하여 생성됨
		 * => InputStreamReader, OutputStreamWriter,
		 *    BufferedInputStream, BufferedOutputStream 등
		 *    
		 * - 표준 입출력 : 컴퓨터에서 기본적으로 사용하는 입출력
		 *   => 프로그램이 시작될 때 생성되므로 따로 만들 필요가 없음
		 *   => 표준 입력 장치 : 키보드
		 *   => 표준 출력 장치 : 모니터
		 *   
		 * - 표준 입출력을 담당하는 클래스 : System
		 *   => System.in : 표준 입력을 담당(키보드에서 입력받기 가능)
		 *   => System.out : 표준 출력을 담당(모니터로 출력 가능)
		 *   => System.err : 모니터에 에러 정보 출력(잘 사용하지 않음)
		 */
		
		/*
		 * 바이트 단위 스트림(InputStream)
		 * - 키보드로부터 데이터를 입력 받아 처리하는 방법
		 * - 1Byte 단위로 입력데이터를 처리
		 * - read() 메서드를 사용하여 1Byte 만큼의 데이터를 가져올 수 있음
		 * - 아무리 많은 데이터가 입력되어도 read() 메서드는 한 번에 1Byte만
		 *   처리할 수 있으므로 더 많은 데이터나 더 큰 단위 처리가 불가능
		 *   => 영문 또는 숫자 등의 데이터 1글자만 처리 가능
		 *   => 한글이나 한자 등 2Byte(char 단위) 문자들은 처리 불가능
		 *   => 읽어온 데이터가 int형 이므로 문자로 변환 등의 후속 작업 필요
		 * - 가장 저수준의 입력 방법
		 */
		
		// finally 블록에서도 사용하기 위해 try문 위쪽에 선언
//		InputStream is = null;
//		
//		try {
//			System.out.println("데이터를 입력하세요 : ");
//			is = System.in;
//			// => System.in 코드에 의해 키보드로부터 데이터 입력이 가능하며
//			//    입력스트림 객체를 InputStream 타입 변수에 저장(연결)
//			int n = is.read();
//			// => read() 메서드는 try~catch 문을 사용하여 예외 처리가 필수!
//			// => 입력스트림 데이터 중 1Byte 만큼의 데이터를 읽어서 변수에 저장
//			System.out.println("입력 데이터 : " + n); // 읽어온 1Byte 만큼의 데이터 출력
//			System.out.println("입력 데이터를 문자로 변환 : " + (char)n);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if(is != null) {
//				try {
//					is.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
		
		// ==================================================================
		/*
		 * try ~ with resources 구문을 사용하여 자원 반환(close())을 자동으로 수행
		 * - 기본적으로 자원을 사용하는 객체(Connection, InputStream 등)는 사용 후
		 *   close() 메서드 호출을 통해 사용중인 자원을 반환해야 하며
		 *   자원이 반환되지 않으면 반복적인 자원 요청으로 인해 자원이 고갈되어
		 *   더 이상 다른 사용자의 작업 요청을 수행할 수 없게 된다!
		 *   => 예외 발생 여부와 관계없이 finally 블록 내에서 자원 반환 코드 기술
		 * - try ~ witch resources 구문은 try 문에서 반환할 자원을 갖는 객체를 생성하고
		 *   try ~ catch 블록이 끝나면 자동으로 자원을 반환해 주도록 함
		 *   
		 * < 기본 문법 >
		 * try(자원을 반환할 객체 생성 및 변수에 저장) {
		 * 		// 작업 수행
		 * } catch(...) {    
		 * 		// 예외 처리 작업 수행
		 * }
		 *  
		 */
		
//		try(InputStream is = System.in) {
//			System.out.println("데이터를 입력하세요 : ");
//			int n = is.read();
//			System.out.println("입력 데이터 : " + n); // 읽어온 1Byte 만큼의 데이터 출력
//			System.out.println("입력 데이터를 문자로 변환 : " + (char)n);
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
		// => 별도의 close() 메서드를 호출하지 않아도 자동으로 자원이 반환됨
		
		// ===================================================================
		// 반복문을 사용하여 1Byte씩 여러번 반복하여 입력 처리
		
		System.out.println("데이터를 입력하세요 : (취소 시 Ctrl + Z)");
		
		try(InputStream is = System.in) {
			int n = is.read();
			
			// 반복문을 사용하여 더 이상 읽어 올 데이터가 없을 때(-1)까지 입력을 처리
			while(n != -1) {
				// 읽어들인 1Byte 데이터(n)을 화면에 출력(문자로 변환)
				System.out.println("입력 데이터 : " + n + ", 문자로 변환 : " + (char)n);
				
				// 다음 입력데이터 1Byte 가져오기
				n = is.read();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("입력 작업 종료!");

	}

}







