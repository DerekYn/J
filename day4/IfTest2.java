package my.day4;

import java.io.IOException;
import java.util.Scanner;

public class IfTest2 {
	
	public void execute(int n) {
		if((65<=n && n<=90) || (97<=n && n<=122)) {
			System.out.println("입력하신 문자 " + (char)n + "는 영문자 입니다.");
		}
		else if(48<=n && n<=57) {
			System.out.println("입력하신 문자 " + (char)n + "는 숫자 입니다.");
		}
		else {
			System.out.println("입력하신 문자 " + (char)n + "는 특수문자 입니다.");
		}
			
	}

	public static void main(String[] args) throws IOException {
		
		System.out.print("글자 1개를 입력하세요 : ");
		int n = System.in.read();
		//System.out.println(n);
		
		IfTest2 obj = new IfTest2();
		obj.execute(n);
		
		// 입력하신 문자 a는 영문자 입니다.
		
	}

}
