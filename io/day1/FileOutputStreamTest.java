/*
 	=== 키보드로 부터 입력받은 것을 파일(c:\iotestdata\result.txt)에 기록(출력) ===
 	
 	1. 데이터 소스 : 키보드로 부터 입력받음[노드 스트림 : System.in]
 	2. 데이터 목적지 : 결과를 특정 파일에 출력함[노드 스트림 : FileOutputStream]
 	
 */


package io.day1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) throws IOException {
			
		System.out.println("내용을 입력하세요[입력하신 내용은 c:\\iotestdata\\result.txt 파일에 저장됨]");
		
		int input = 0;
		String filename = "c:/iotestdata/result.txt";
		boolean append = false;
		int countbyte = 0;
		
		try {
			FileOutputStream fost = new FileOutputStream(filename, append);
			/*
			 	만약에 탐색기에서 c:/iotestdata/result.txt 파일이 없다면
			 	파일을 자동으로 생성해준다. 단, 탐색기에서 c:/iotestdata 폴더는 존재해야 한다.
			 	
			 	두번째 파라미터인 append 가 true 인 경우
			 	첫번째 파라미터인 해당파일에 이미 내용물이 적혀 있는 경우
			 	기존 내용물은 그대로 두고 기존 내용 뒤에 새로운 내용을 추가한다.
			 	
			 	두번째 파라미터인 append 가 false 인 경우
			 	첫번째 파라미터인 해당파일에 이미 내용물이 적혀 있는 경우
			 	기존 내용물은 삭제하고 새로운 내용을 추가한다.
			 	
			 	그런데 만약에 두번째 파라미터를 생략하면
			 	즉, FileOutputStream fost = new FileOutputStream(filename); 이라면
			 	자동적으로 false로 인식한다.
			 */
			
			while((input = System.in.read()) != -1) {
				fost.write(input);
				fost.flush();
				
				countbyte++;
			}

			System.out.println(filename + "에 쓰기 완료!! " + countbyte + "bytes 씀.");
			fost.close();		// 출력노드 스트림 닫기
			System.in.close();	// 입력노드 스트림 닫기
			System.out.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(filename + "파일이 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
