/*
 	==== BufferedInputStream 와 BufferedOutputStream ====
 	
 	-- 1byte 기반 스트림.
 	-- 필터 스트림(= 보조스트림)
 	-- 필터 스트림은 단독으로 사용할 수 없고, 반드시 노드 스트림에 장착되어 사용되는 것이다.
 	      마치 수영장에서 오리발처럼 보조기구로 사용한다.
 	      이러한 필터 스트림을 노드 스트림에 장착하여 사용하면 노드 스트림 단독으로 사용할 때 보다 속도가 빨라진다.
 	      그래서 노드 스트림에 필터 스트림을 장착하여 많이 사용한다.
 	      
 	      읽어올 데이터를 매번 1 byte 마다 읽고, 쓰고 한다면 입, 출력에 너무 많은 시간이 소요된다.
 	      그래서 쓰는 작업없이 메모리 버퍼에 데이터를 한꺼번에 쭉~~~ 읽기만 하여 모아두면 
 	      그만큼 쓰는 작업이 없으므로 읽기 속도는 빨라질 것이다.
 	      그리고 나서 메모리 버퍼에 읽어서 모아두었던 내용을 한방에 쓰기를 하면 매번 1 byte 씩 쓰는 것보다 속도가 빠르다.
 	      
 	   BufferedInputStream 와 BufferedOutputStream 의 기본 버퍼 크기는 512 byte 이다.
 	   
 	[예제]
 	필터 스트림(보조 스트림)을 이용해서 키보드로 부터 입력받고,
 	입력받은 그 내용을 모니터(콘솔화면)에 출력하고,
 	또한 동시에 파일에도 출력해본다.
 	
 	>>> 데이터 소스 : 키보드(System.in --> 노드 스트림)
 				+ 필터 스트림(보조스트림) 으로 BufferedInputStream을 사용한다.

	>>> 목적지 : 모니터(System.out --> 노드스트림)
				+ 필터 스트림(보조스트림) 으로 BufferedOutputStream을 사용한다.
				
			      파일(FileOutputStream --> 노드스트림)
				+ 필터 스트림(보조스트림) 으로 BufferedOutputStream을 사용한다.
				
 */

package io.day1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamTest {

	public static void main(String[] args) throws IOException {
		
		BufferedInputStream bist = new BufferedInputStream(System.in, 1024);
		// 노드스트림인 System.in(키보드)에 필터스트림(보조스트림)을 장착함.
		// 필터스트림(보조스트림)의 용량은 1024 byte 가 된다.
		
		BufferedOutputStream bost = new BufferedOutputStream(System.out, 1024);
		// 노드스트림인 System.out(키보드)에 필터스트림(보조스트림)을 장착함.
		// 필터스트림(보조스트림)의 용량은 1024 byte 가 된다.
		
		String filename = "c:/iotestdata/seoul.txt";
		
		try {
			FileOutputStream fost = new FileOutputStream(filename, false);
			
			BufferedOutputStream bost2 = new BufferedOutputStream(fost, 1024);
			
			byte[] dataArr = new byte[64];
			
			int inputlengthbyte = 0;
			int countbyte = 0;
			
			while((inputlengthbyte = bist.read(dataArr)) != -1) {
				
				bost.write(dataArr, 0, inputlengthbyte);
				bost.flush();
				/*
				 	읽어들이는 데이터가 bist 에 1024 byte 만큼 쌓일때 까지
				 	계속 읽어들이다가 1024 byte 만틈 쌓이면 더 이상 읽어들이지 않고,
				 	모니터에 한꺼번에 출력한다.
				 */
				
				bost2.write(dataArr, 0, inputlengthbyte);
				bost2.flush();
				/*
				 	읽어들이는 데이터가 bist 에 1024 byte 만큼 쌓일때 까지
				 	계속 읽어들이다가 1024 byte 만틈 쌓이면 더 이상 읽어들이지 않고,
				 	파일에 한꺼번에 출력한다.
				 */
				
				countbyte += inputlengthbyte;			
				
			}
			
			System.out.println("------------------------------------------------------");
			System.out.println("총" + countbyte + "bytes 읽고 " + filename + " 파일에 씀");
			System.out.println("------------------------------------------------------");
			
			bost2.close();  // 필터스트림(보조스트림) 닫음.
			bost.close();   // 노드스트림 닫음.
			
			bist.close();   // 노드스트림 닫음.
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
