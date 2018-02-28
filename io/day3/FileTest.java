/*
     >>> File 클래스 <<<
     -- 자바에서 파일이라함은 2가지가 있다.
     -- 첫번째, 확장자가 없으면 폴더(디렉토리)를 말하며,
     -- 두번째, 확장자가 있으면 파일을 말한다. 
 */

package io.day3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> 탐색기에 존재하는 파일명을 입력하세요 : ");
		String fileName = sc.nextLine();
		// c:/iotestdata/이규호교수만세.txt
		
		File file = new File(fileName);
		
		System.out.println("파일명 : " + file.getName());
		// file.getName() 메소드가 파일명을 알려주는 것이다.
		
		long fileSize = file.length();
		System.out.println("파일크기 : " + fileSize + "byte");
		
		String path = file.getPath();
		System.out.println("파일 경로명 : " + path);
		
		System.out.println("\n======= 디렉토리 생성하기 =======");
		
		File dir = new File("MyDir");
		
		String result = (dir.exists())?"존재함":"존재하지 않음";
		System.out.println(dir.getName() + "은 " + result);
	
		boolean bool = false;
		
		if( !dir.exists() ) { // 해당 디렉토리가 없으면 
			bool = dir.mkdir();	// 디렉토리 MyDir 을 생성해라
			
			result = bool?"디렉토리 생성 성공!!":"디렉토리 생성 실패!!";
			
			System.out.println("MyDir " + result);
			
			if(bool) {
				System.out.println("MyDir 디렉토리의 상대경로 : " + dir.getPath()); 
				// MyDir 디렉토리의 상대경로 : MyDir
				
				System.out.println("MyDir 디렉토리의 절대경로 : " + dir.getAbsolutePath());
				// MyDir 디렉토리의 절대경로 : C:\myjava\Begin\MyDir
			}
		}
		
		System.out.println("\n======= 디렉토리 삭제하기 =======");
		// 빈폴더 일때만 삭제가 가능하지 폴더속에 서브폴더나 파일이 존재하면 디렉토리 삭제가 안된다. 
		// C:\myjava\Begin\ 아래에 TestDir 이라는 빈폴더를 하나 생성한 후 아래와 같이 한다.
		
		File dir2 = new File("TestDir");
		bool = dir2.delete();
		result = bool?"디렉토리 삭제 성공!!":"디렉토리 삭제 실패!!";
		System.out.println("TestDir " + result);
		
		System.out.println("\n\n========= 파일 생성하기 =========="); 
		File file2 = new File("테스트.txt");
		
		bool = false;
		if ( !file2.exists() ) { // 해당 파일이 존재하지 않으면 파일을 생성한다.
			
			try {
				bool = file2.createNewFile();
				
				result = bool?" 파일 생성 성공!!":" 파일 생성 실패!!";
				
				System.out.println(file2.getName() + result);
				// 테스트.txt 파일 생성 성공!!
				
				System.out.println(file2.getName() +" 의 상대경로 : " + file2.getPath()); 
				// 테스트.txt 의 상대경로 : 테스트.txt 
				
				System.out.println(file2.getName() +" 의 절대경로 : " + file2.getAbsolutePath()); 
				// 테스트.txt 의 절대경로 : C:\myjava\Begin\테스트.txt
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("\n\n========= 파일 삭제하기 ==========");
		
		bool = file2.delete();
		result = bool?" 파일 삭제 성공!!":" 파일 삭제 실패!!";
		System.out.println("테스트.txt" + result);
		
		sc.close();
	}// end of main()-----------------------------

}






