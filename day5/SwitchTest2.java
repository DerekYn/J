package my.day5;

import java.util.Scanner;

import my.Util.MyUtil;

public class SwitchTest2 {

	public static void menu() {
		System.out.println("-------- Menu --------");
		System.out.println("1. 가정용(liter 당 50원)");
		System.out.println("2. 상업용(liter 당 45원)");
		System.out.println("3. 공업용(liter 당 30원)");
		System.out.println("----------------------");
		System.out.print(">> 메뉴번호를 선택하세요 => ");
		
	//	System.exit(0);  // 숫자 0은 정상적인 프로그램 종료
	//	System.exit(3);  // 숫자 0을 제외한 나머지 숫자는 비정상적인 프로그램 종료
	
	} // end of void menu()-------------------------------
	
	
	public void execute(int menuno, int useLiter) {
		
		int usePrice = 0;
		String title = "";
		
		switch (menuno) {
			case 1:
				title = "=== 가정용 고지서 ===";
				usePrice = useLiter * 50;
				break;
				
			case 2:
				title = "=== 상업용 고지서 ===";
				usePrice = useLiter * 45;
				break;	
				
			case 3:
				title = "=== 공업용 고지서 ===";
				usePrice = useLiter * 30;
				break;	
		}
		
        int tax = (int)(usePrice * 0.05);  // 세금
        
        System.out.println("\n"+title);
        System.out.println("사용량: " + MyUtil.getCommaNumber(useLiter) +"리터");
        System.out.println("사용요금: " + MyUtil.getCommaNumber(usePrice) +"원");
        System.out.println("수도세금: " + MyUtil.getCommaNumber(tax) +"원");
        System.out.println("총수도요금: " + MyUtil.getCommaNumber((usePrice+tax)) +"원");
		
	}// end of void execute()-----------------------------
	
	
	public static void main(String[] args) {
		
		SwitchTest2.menu();
		
		Scanner sc = new Scanner(System.in);
		
		int menuno = 0;
		
		try {
			 menuno = Integer.parseInt(sc.nextLine()); 
		} catch (NumberFormatException e) {
			System.out.println(">> 숫자만 입력하세요!!\n프로그램 종료~~");
			sc.close();
			return; // main()메소드 내에서 return; 은 프로그램 종료이다.
		}
		
		String str = "";
	/*	
		if ( 1 <= menuno && menuno <= 3 ) {
			str = "선택하신 메뉴번호는 " + menuno + "번 입니다.";
		}
		else {
			str = "메뉴번호는 1,2,3 만 가능합니다.";
		}
	*/
	
		switch (menuno) {
			case 1:
			case 2:
			case 3:
				str = "선택하신 메뉴번호는 " + menuno + "번 입니다.";
				break;
	
			default:
				str = "메뉴번호는 1,2,3 만 가능합니다.";
				System.out.println(str);
				return;  // main()메소드 내에서 return; 은 프로그램 종료이다.
		}
		
	//	str = (1 <= menuno && menuno <= 3)?"선택하신 메뉴번호는 " + menuno + "번 입니다.":"메뉴번호는 1,2,3 만 가능합니다."; 
		
		System.out.println(str); 
		
		try {
			System.out.print("물사용량을 입력하세요 => ");
			int useLiter = Integer.parseInt(sc.nextLine());
			
			SwitchTest2 obj = new SwitchTest2();
			obj.execute(menuno, useLiter);
			
		} catch (NumberFormatException e) {
			System.out.println(">> 물사용량은 숫자만 가능합니다.");
		}
	 	
		sc.close();
		
	}

}
