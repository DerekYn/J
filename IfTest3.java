package my.day4;

import java.io.IOException;

public class IfTest3 {
	
	public void execute(int n) {
		if(Character.isAlphabetic(n)) {
			System.out.println("입력하신 문자 " + (char)n + "는 영문자 입니다.");
		}
		else if(Character.isDigit(n)) {
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
			
			IfTest3 obj = new IfTest3();
			obj.execute(n);

	}

}
