package io_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test5_2 {

	public static void main(String[] args) {
		/*
		 * temp 폴더에 저장된 source.txt 파일을 읽어들여 
		 * 각 라인에 라인번호를 추가하여 콘솔(화면)에 출력 
		 * - FileReader, BufferedReader 사용 
		 * 	 (키보드로 입력받는 InputStreamReadere 대신 File로 부터 
		 * 	  입력받는 FileReader 사용)
		 */
		
		File  f = new File("/Users/Insung/Documents/temp/source.txt");
		try(BufferedReader buffer = new BufferedReader(new FileReader(f))) {
			int count = 1;
			String str = buffer.readLine();
			
			while(str != null) {
				System.out.println(count + " " + str); // 라인번호 붙여 출력 
				str = buffer.readLine(); // 새로운 한 줄 읽어오기
				count++;; // 라인번호 증가 
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
