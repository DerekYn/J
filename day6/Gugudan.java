package my.day6;

import java.util.Scanner;

public class Gugudan {
	
	public void sum(int start, int end) {
		int sum = 0;
		for(int i=start; i<=end; i++) {
			sum += i;
		}
		System.out.println("결과 "+start+"부터 "+end+"까지의 합은 "+sum+"입니다.");
		
	}// end of sum
	
	public void gugudan(int start, int end) {
		
		for(int i=0, row=1; i<9; i++, row++) {
			for(int j=0, col=start; j<(end-start+1); j++, col++) {
				String tab = (col==end)?"\n":"\t";
				System.out.print(col+"*"+row+"="+(col*row)+tab);
			}
		}
		
	}// end of gugudan

	public static void main(String[] args) {
		for(int i=0, row=1; i<9; i++, row++) {
			for(int j=0, col=2; j<8; j++, col++) {
				String tab = (col==9)?"\n":"\t";
				System.out.print(col+"*"+row+"="+(col*row)+tab);
			}
		}
		
		/*
		 	문제 1)
		 	첫 번째 수 => 2
		 	두 번째 수 => 10
		 	결과 2부터 10까지의 합은 54입니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		Gugudan obj = new Gugudan();
		
		int num1 = 0, num2 = 0;
		
		try {
			System.out.print("첫 번째 수 => ");
			num1 = Integer.parseInt(sc.nextLine());
			System.out.print("두 번째 수 => ");
			num2 = Integer.parseInt(sc.nextLine());
			
			obj.sum(num1, num2);
			
			num1 = 0;
			num2 = 0;
			System.out.print("시작 단 => ");
			num1 = Integer.parseInt(sc.nextLine());
			System.out.print("마지막 단 => ");
			num2 = Integer.parseInt(sc.nextLine());
					
			obj.gugudan(num1, num2);
			
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요!!");
			sc.close();
			return;
			}
	
		/*
		 	
		 	문제 2)
		 	시작 단 => 5
		 	마지막 단 => 8
		 	결과 보고 싶은 단 부터 보고싶은 단 까지 보인다.
		 */
		num1 = 0;
		num2 = 0;
		System.out.print("시작 단 => ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.print("마지막 단 => ");
		num2 = Integer.parseInt(sc.nextLine());
		for(int i=0, row=1; i<9; i++, row++) {
			for(int j=num1, col=num1; j<=num2; j++, col++) {
				String tab = (col==num2)?"\n":"\t";
				System.out.print(col+"*"+row+"="+(col*row)+tab);
			}
		}
		

	}

}
