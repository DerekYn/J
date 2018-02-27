package io.day2.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("▷ 읽어들일 파일명(절대경로) 입력하세요 => ");
		
		String fileName = sc.nextLine();
		
		MyFileReader myfr = new MyFileReader();
		
	//	myfr.fileOpen(fileName);
		
		myfr.fileOpen2(fileName);
		
		sc.close();
		
	}

}
