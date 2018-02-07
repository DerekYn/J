package my.day11;

import java.util.Scanner;

public class CapsulationPersonMain {

	public static void main(String[] args) {
		
		CapsulationPerson person = new CapsulationPerson();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 => ");
		person.setName(sc.nextLine());
		
		do {
			try {
				System.out.print("나이 => ");
				int age = Integer.parseInt(sc.nextLine());
				
				person.setAge(age);
				
				if( person.getAge() == 0 ) // 기본값이 0이므로 person.getAge()이 0이면 입력을 하지 않았다는 뜻. 고로 다시 입력 받기 위해 continue를 이용
					continue;
				else
					break;
				
			} catch (NumberFormatException e) {
				System.out.println(">> 숫자만 가능합니다.");
			}
		} while (true);
		
		do {
			try {
				System.out.print("신장 => ");
				double height = Double.parseDouble(sc.nextLine());
				
				person.setHeight(height);
				
				if( person.getHeight() == 0.0 )
					continue;
				else
					break;
				
			} catch (NumberFormatException e) {
				System.out.println(">> 숫자만 가능합니다.");
			}
		} while (true);
			
		
		sc.close();
		
		System.out.println("\n===== person 객체 정보 =====");
		person.showInfoPerson();
		
		System.out.println("\n=========================");
		
		System.out.println("\n===== 변경된 person 객체 정보 =====");
		person.showInfoPerson();

	}

}
