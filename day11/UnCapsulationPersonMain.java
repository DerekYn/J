package my.day11;

import java.util.Scanner;

public class UnCapsulationPersonMain {

	public static void main(String[] args) {
		
		UnCapsulationPerson person = new UnCapsulationPerson();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 => ");
		person.name = sc.nextLine();
		
		
		do {
			try {
				System.out.print("나이 => ");
				int age = Integer.parseInt(sc.nextLine());
				
				if(!person.chechPositiveNumber(age)) {
					System.out.println(">> 나이는 0보다 커야 합니다.");
					continue;
				}
				else {
					person.age = age;
					break;
				}
					
					
				
			} catch (NumberFormatException e) {
				System.out.println(">> 숫자만 가능합니다.");
			}
		} while (true);
		
		do {
			try {
				System.out.print("신장 => ");
				double height = Double.parseDouble(sc.nextLine());
				
				if(!person.chechPositiveNumber(height)) {
					System.out.println(">> 신장는 0보다 커야 합니다.");
					continue;
				}
				else {
					person.height = height;
					break;
				}
				
			} catch (NumberFormatException e) {
				System.out.println(">> 숫자만 가능합니다.");
			}
		} while (true);
		
		sc.close();
		
		System.out.println("\n===== person 객체 정보 =====");
		person.showInfoPerson();
		
		System.out.println("\n=========================");
		
		person.age = 0;
		person.height = -234;
		
		System.out.println("\n===== 변경된 person 객체 정보 =====");
		person.showInfoPerson();
		
		

	}

}
