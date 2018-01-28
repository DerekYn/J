package my.day4;

import java.util.Scanner;

public class IfTest1 {
	
	public void execute(int n) {
		String result = (oddEven(n)==0)?"It's an even number":"It's an odd number";
		System.out.println(result);
		
	}

	public int oddEven(int n) {
		if(n%2 == 0) {
			return 0;
		}
		else {
			return 1;
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 => ");
		
		int n = Integer.parseInt(sc.nextLine());
		
		IfTest1 obj = new IfTest1();
		obj.execute(n);
		// 입력하신 숫자 8은 짝수입니다.
		// 입력하신 숫자 9는 홀수입니다.
		
		sc.close();
	}
}
