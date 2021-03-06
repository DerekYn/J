/*
    === c:\iotestdata\korea.txt 파일을 읽어서 
               그내용을  모니터(콘솔화면)에 출력하는 예제 ===
               
    1. 데이터소스 : 파일로 부터 읽어들임(노드스트림 : FileInputStream)
    2. 데이터목적지 : 결과물을 모니터에 출력(노드스트림 : System.out)
    
    >>> FileInputStream
     -- Node 스트림(접속점이 파일인 입력스트림)
     -- 1byte 기반 스트림.
  
     
    >>> System.out :
               부모클래스가 추상클래스인 OutputStream(기본 출력 스트림) 타입인 것으로서
               접속점(빨대)이 콘솔화면(모니터)인 출력 스트림(PrintStream)이다.
                    
     -- Node(접속점)가 콘솔화면(모니터)인 출력스트림이다.
     -- 1byte 기반 스트림이다.
     -- 주요 메소드 : println(String str),
                   print(String str),
                   write(int b)                      
 */

package io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		System.out.print("읽을 파일의 이름(절대경로)을 입력 => ");
		
		Scanner sc = new Scanner(System.in);
		
		String filename = sc.nextLine();
		// 파일명을 입력 --> 데이터 소스가 된다.
		// C:\iotestdata\korea.txt 
		
		int input = 0;
		int countbyte = 0;
		
		try {
			FileInputStream fist = new FileInputStream(filename);
			
			while ( (input = fist.read()) != -1 ) {
				/*
				    fist.read() 메소드는 해당 파일에서 데이터를 1byte씩 읽어서 int 타입으로 리턴해준다. 
				       만약에 파일의 내용물에서 읽어들일 데이터가 없다라면 -1 값을 리턴시켜준다. 
				       즉, 파일속의 내용물이 끝이 아니라면 계속해서 while{ } 을 실행해라는 말이다. 
				 */
				System.out.write(input); // System.out 이므로 모니터(콘솔화면)에 출력
				System.out.flush();
				
				countbyte++;
			}// end of while--------------------------
			
			fist.close(); // 노드 스트림 닫기
			
			System.out.println("\r\n----------------------------");
			System.out.println("총 " + countbyte + "bytes");
			System.out.println("--------------------------------");
			
		} catch (FileNotFoundException e) {
			System.out.println(filename + " 파일은 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();

	}// end of main()-----------------------------

}



