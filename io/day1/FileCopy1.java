/*
 	=== 파일(c:\iotestdata\Swissland.txt)을 읽어다가
 	 	파일(c:\iotestdata\Swissland.txt)에 기록(출력)하기로 한다. ===
 	
 	1. 데이터 소스 : 키보드로 부터 입력받음[노드 스트림 : FileInputStream]
 	2. 데이터 목적지 : 결과를 특정 파일에 출력함[노드 스트림 : FileOutputStream]
 	
 */

package io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class FileCopy1 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("복사할 원본파일명(절대경로) 입력 => ");
		String sourceFileName = sc.nextLine();
		
		System.out.print("목적 파일명(절대경로) 입력 => ");
		String targetFileName = sc.nextLine();
		
		System.out.println("소스 파일 : " + sourceFileName);
		System.out.println("목적 파일 : " + targetFileName);
		
		try {
			FileInputStream fist = new FileInputStream(sourceFileName);
			/*
		 		FileInputStream 생성 : 접속점이 파일인 것으로 특정 파일에 빨대를 꽂아
		 						  파일의 내용물을 1byte기반으로 빨아들이도록 해주는 입력노드 스트림이다.
			 */
		
			FileOutputStream fost = new FileOutputStream(targetFileName);
			/*
	 			FileInputStream 생성 : 접속점이 파일인 것으로 특정 파일에 빨대를 꽂아
	 						  	  파일의 내용물을 1byte기반으로 빨아들이도록 해주는 출력노드 스트림이다.
			 */
			
			int input = 0;
			int countbyte = 0;
			
			while((input = fist.read()) != -1) {
				
				fost.write(input);
				fost.flush();
				
				countbyte++;
				System.out.println("\n" + countbyte + "bytes 복사중...");
				
			}
			
			System.out.println("\n 복사완료!! 총 " + countbyte + "byte 복사됨.");
			fost.close();
			fist.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
