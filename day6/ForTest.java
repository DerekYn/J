package my.day6;

import java.util.Scanner;

/*
 	*** 반복문(loop) ==> for 문 ***
 	
 	
 	※  for 문의 형식
 	
 		for (초기화; 조건식; 증감식) {
 			반복해서 실행할 문장;
 		}
 		
 		▣ 순서
 		1) 초기화;
 		2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 }을 못빠져나간다.
 				    조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
 				   } 을 빠져나간다.)
 		3) 증감식;
 		4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 }을 못빠져나간다.
 				    조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
 				   } 을 빠져나간다.)
 		5) 3) 증감식;
 		6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 }을 못빠져나간다.
 				    조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
 				   } 을 빠져나간다.)
 		7) 반  복..		   
 				   
 */

public class ForTest {

	public static void main(String[] args) {
	
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + ".Hello ~");
		}
		System.out.println("--------------------------------");
		for(int i=0, j=1; i<5; i++, j+=2) {
			System.out.println(j + ".Hello ~");
		}
		System.out.println("--------------------------------");
		for(int i=10; i>0; i--) {
			System.out.println(i + ".Gracias ~");
		}
		System.out.println("--------------------------------");
		for(int i=0, j=10; i<5; i++, j-=2) {
			System.out.println(j + ".Hello ~");
		}
		System.out.println("--------------------------------");
		for(int i=5, j=10; i>0; i--,j-=2) {
			System.out.println(j + ".Hello ~");
		}
		
		System.out.println("=================================");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 => ");
		String str = sc.nextLine();	// 자바 개발자
		
		int i = 0;
		
		try {
			System.out.print("반복할 횟수를 입력하세요 => ");
			int n = Integer.parseInt(sc.nextLine());
			
			for(; i<n; i++) {
				System.out.println((i+1) + "." + str);
			}
		} catch (NumberFormatException e) {
			System.out.println(">> 반복횟수는 숫자만 입력가능합니다.");
			return;
		}
		
		System.out.println("반복 뒤, i의 값 => " + i);
		
		for(; i>0; i--) {	
			System.out.println(i + "." + str);
		}
		
		System.out.println("\n\n\n");
		
		int j = 0;
		
		System.out.print(">>특수문자 한개를 입력하세요 => ");
		str = sc.nextLine();
		try {
			System.out.print(">> 반복횟수를 입력하세요 => ");
			int n = Integer.parseInt(sc.nextLine());
			for(; j<n; j++) {
				System.out.println((j+1) + "." + str);
			}
			
		} catch (NumberFormatException e) {
			System.out.println(">> 반복횟수는 숫자만 입력가능합니다.");
			return;
		}
		
		for(; j>0; j--) {
			System.out.println(j + "." + str);
		}
		
		
		
	
	}

}
