package io.day1;

import java.io.IOException;

public class InputStreamTest3 {

	public static void main(String[] args) throws IOException {
		
		byte[] dataArr = new byte[6];
		
		int countbyte = 0;
		int inputlengthbyte = 0;
		
		while(( inputlengthbyte = System.in.read(dataArr)) != -1) {
			// 키보드로 Ctrl + C (강제종료)를 누르지 않으면 계속 실행하라.
			// 즉, 키보드로 Ctrl + C (강제종료)를 누르면 while 문을 빠져나간다.
			
			// 입력한 데이터가 "대한민국서울시강남구" + "엔터" 이라면
			// 키보드로 부터 배열 dataArr 크기(6byte)만큼 읽어들여서
			// 배열 dataArr 에 저장시키고, 이어서 읽어들인 크기를 변수 inputlengthbyte에 저장시킨다.
			// 반복문의 첫번째 일때 
			// dataArr 에는 "대한민" 이 들어가 있고, inputlengthbyte에는 6이 들어가 있다.
			
			System.out.write(dataArr, 0, 2);
			// 배열 dataArr 에 저장된 데이터에서 시작점이 0번째 index 부터(처음부터) 
			// inputlengthbyte byte 수 만큼 출력하라는 말이다.
			System.out.flush();
			
			countbyte += inputlengthbyte;	
		}
		System.out.println("총 : " + (countbyte - 2) + "bytes 입력함. ");
		System.in.close();	// 입력노드(키보드)연결 닫기
		System.out.close();	// 출력노드(모니터)연결 닫기

	}

}
