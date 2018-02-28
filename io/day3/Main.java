package io.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static {
		User user1 = new User("한석규", 31, "서울시 강서구 방화동");
		User user2 = new User("두석규", 25, "경기도 광명시 철산동");
		User user3 = new User("세석규", 28, "서울시 서울역 1번출구");
		User user4 = new User("네석규", 27, "서울시 을지로입구역 2번출구"); 
		
		List<User> userList = new ArrayList<User>();
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		
		MySerializable mysr = new MySerializable();
		mysr.objectToFileSave(userList, "c:/iotestdata/userinfo.txt");  
		
	}
	
	
	public static void menu() {
		System.out.println("\n========= <메뉴> =========");
		System.out.println("1. 파일에 저장된 객체정보를 불러오기");
		System.out.println("2. 연령대 검색");
		System.out.println("3. 종료");
		System.out.println("=============================");
		System.out.print("▷ 메뉴번호 선택 => ");
	}
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MySerializable mysr = new MySerializable();
		Object obj = null;
		List<User> userList = null;
		
		String menuNo = "";
		do {
			Main.menu();
			
			menuNo = sc.nextLine();
			
			switch (menuNo) {
				case "1":
					try {
						obj = mysr.getObjectfromFile("c:/iotestdata/userinfo.txt");
						
						if(obj != null) {
							userList = (List<User>)obj;
							
							for(User user : userList) {
								System.out.println(user);
							}
						}
					} catch(Exception e) {}
					
					break;
	
				case "2":
					
				try {	
					System.out.print("▷연령대 => ");
					String strageline = sc.nextLine();
					int ageline = Integer.parseInt(strageline);
					
					obj = mysr.getObjectfromFile("c:/iotestdata/userinfo.txt");
					
					userList = (List<User>)obj;
					
					int flag = 0;
					for(User user : userList) {
						if ( user.getAge()/10 == ageline/10 ) {
							System.out.println(user);
							flag = 1;
						}
					}// end of for--------------------------
					
					if (flag == 0) {
						System.out.println(">>> 해당 연령대 회원은 없습니다.");
					}
					
				} catch(NumberFormatException e) {
					System.out.println(">>> 숫자만 입력하세요!!");
				} catch(Exception e) { }
					
					break;
				
				case "3":
					System.out.println(">>> 프로그램 종료합니다.");
					break;	
					
				default:
					break;
				} // end of switch-----------------
			
		} while (!"3".equals(menuNo));
		
		sc.close();

	}// end of main()-------------------------

}







