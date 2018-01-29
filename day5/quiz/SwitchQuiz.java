package my.day5.quiz;

import java.util.Scanner;

public class SwitchQuiz {

	public double calc(int num1, int num2, String operator) {
		
		double result = 0.0;
		
		switch (operator) {
			case "+":
				result = num1 + num2;
				break;
			
			case "-":
				result = num1 - num2;
				break;	

			case "*":
				result = num1 * num2;
				break;	
				
			case "/":
				result = Math.round( ((double)num1 / num2)*10 )/10.0;
				break;	
				
			case "%":
				result = num1 % num2;
				break;	
		}
		
		return result;
	}// end of double calc(int num1, int num2, String operator)------------------
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("첫번째 정수 입력 => ");
			int num1 = Integer.parseInt(sc.nextLine());
			
			System.out.print("두번째 정수 입력 => ");
			int num2 = Integer.parseInt(sc.nextLine());
			
			System.out.print("연산자 선택[+ - * / %] => ");
			String operator = sc.nextLine();
			
			switch (operator) {
				case "+":
				case "-":
				case "*":
				case "/":
				case "%":
					break;
	
				default:
					System.out.println(">> 연산자 선택이 틀렸습니다.\n프로그램종료!!");
					sc.close();
					return; // 프로그램 종료
			}
			
			String str = num1 + " "+operator+" " + num2 + " = ";
			
			SwitchQuiz obj = new SwitchQuiz();
			double result = obj.calc(num1, num2, operator);
			
			if("/".equals(operator)) 
				str += result;  // str = str + result;
			else
				str += (int)result;
			
			System.out.println(str);
			
			sc.close();
			
		} catch (NumberFormatException e) {
			System.out.println(">> 숫자만 입력하세요!!\n프로그램종료!!");
			sc.close();
			return; // 프로그램 종료
		}
		
		
		
		

	}

}
