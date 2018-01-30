package my.day6;

import java.util.Scanner;

public class Factorial {
	
	public static int calc1(int num) {
		int result = 1;
		
		for(int i=0; i<num; num--) {
			result *= num;
		}
		
		return result;
	} // end of calc1(int num) --------------------------------------------------------
	
	public static int calc2(int num) {
		if(num == 1)
			return 1;
		else
			return num * calc2(--num);	// 재귀호출이란? 메소드 자신이 자신의 메소드를 호출하는 것을 말한다.
	} // end of calc2(int num) --------------------------------------------------------

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(; true;) {
			try {
				System.out.print("1. 알고 싶은 팩토리얼 수 입력 => ");
				int num = Integer.parseInt(sc.nextLine());
				// int result = Factorial.calc1(num);
				int result = Factorial.calc2(num);
	
				System.out.println(">> " + num + "에 대한 팩토리얼은 " + result + "입니다.");
				
				System.out.print(">> 계속할래요? (예:Y, 아니요:N) ");
				String yn = sc.nextLine();
				
				if("Y".equals(yn) || "y".equals(yn)) 
					continue;
				else break;
						
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요!!");
				continue;
			}
	
		} // end of for --------------------------------------------------------
		
		System.out.println(">> 프로그램 종료!!");
		sc.close();
		
	} // end of main --------------------------------------------------------------

}
