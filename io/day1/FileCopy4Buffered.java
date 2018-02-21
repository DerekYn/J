/*
     === 파일(c:\iotestdata\Tulips.jpg)을 읽어다가 
                 파일(c:\iotestdata2\Tulips3.jpg)에 기록(출력)하기로 한다. ===  
     
     1. 데이터 소스 : 파일로 부터 입력받음[노드스트림 : FileInputStream]
     2. 데이터 목적지 : 결과를 특정 파일에 출력함[노드스트림 : FileOutputStream] 
*/

package io.day1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy4Buffered {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("복사할 원본파일명(절대경로) 입력 => ");
		String sourceFileName = sc.nextLine();
		
		System.out.print("목적 파일명(절대경로) 입력 => ");
		String targetFileName = sc.nextLine();
		
		System.out.println("소스 파일 : " + sourceFileName);
		System.out.println("목적 파일 : " + targetFileName);
		
		File sourceFile = new File(sourceFileName);
		// String 타입인 sourceFileName(파일경로명)이 실제 File 클래스의 객체로 되어진다.
		
		long fileSize = sourceFile.length(); // 파일의 크기를 알려준다.
		
		System.out.println("원본 파일 크기 : " + fileSize + "bytes");
		
		int arraySize = 0;
		
		if (fileSize < 1024) {
			arraySize = 10;
		}
		else if (1024 <= fileSize && fileSize < 1048576) {
			arraySize = 1024;
		}
		else {
			arraySize = 1048576;
		}
		
		File targetFile = new File(targetFileName);
		// String 타입인 targetFileName(파일경로명)이 실제 File 클래스의 객체로 되어진다.
		
		
		try {
			
		//  FileInputStream fist = new FileInputStream(sourceFileName);
		//  또는 아래처럼	
			FileInputStream fist = new FileInputStream(sourceFile);
		    /*	FileInputStream 생성 : 접속점이 파일인 것으로 특정 파일에 빨대를 꽂아 
		                                                       파일의 내용물을 1byte기반으로 빨아들이도록 해주는 입력노드 스트림이다. 
			*/ 
			
			BufferedInputStream bist = new BufferedInputStream(fist, 1024);
	        // 노드스트림인 fist(파일)에 필터스트림(보조스트림)을 장착함.
			// 필터스트림(보조스트림)의 용량은 1024 byte 가 된다.
		
			
			FileOutputStream fost = new FileOutputStream(targetFile); 
		    /*    FileOutputStream 생성 : 접속점이 파일인 것으로 특정 파일에 빨대를 꽂아 
		                                                         파일의 내용물을 1byte기반으로 기록해주는(써주는) 출력노드 스트림이다. 
		     */
			
			BufferedOutputStream bost = new BufferedOutputStream(fost, 1024);
	        // 노드스트림인 fost(파일)에 필터스트림(보조스트림)을 장착함.
			// 필터스트림(보조스트림)의 용량은 1024 byte 가 된다.
			
			byte[] dataArr = new byte[arraySize];
			int inputlengthbyte = 0;
			int countbyte = 0;
			
			while ( (inputlengthbyte = bist.read(dataArr)) != -1 ) {
				
				bost.write(dataArr, 0, inputlengthbyte); // 파일에 쓰기
				bost.flush();
				
				countbyte += inputlengthbyte;
				
				double percent = ((double)countbyte/fileSize)*100;
				
				System.out.println("\n"+(int)percent+"% 복사중..."); 
				
			}// end of while------------------------------
			
			System.out.println("\n 복사완료!!  총 " + countbyte + "byte 복사됨.");
			
			bost.close();  // 필터(보조)스트림 닫기
			bist.close();  // 필터(보조)스트림 닫기
			
			fost.close();  // 출력노드 스트림 닫기
			fist.close();  // 입력노드 스트림 닫기
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		sc.close();

	}// end of main()--------------------

}






