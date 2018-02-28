package io.day3;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	
	public static void menu() {
		System.out.println("\n========= <메뉴> =========");
		System.out.println("1. 회원추가하기[파일에저장]");
		System.out.println("2. 파일에 저장된 객체정보를 불러오기");
		System.out.println("3. 연령대 검색");
		System.out.println("4. 종료");
		System.out.println("=============================");
		System.out.print("▷ 메뉴번호 선택 => ");
	}
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		MySerializable mysr = new MySerializable();
		
		Object obj = null;
		try {
			obj = mysr.getObjectfromFile("c:/iotestdata/userinfo2.txt"); 
			
		} catch (EOFException e) {
			
			mysr.objectToFileSave(new ArrayList<User>(), "c:/iotestdata/userinfo2.txt");  
			
			try {
				obj = mysr.getObjectfromFile("c:/iotestdata/userinfo2.txt");
			} catch(Exception e1) { }
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		List<User> userList = (List<User>)obj;
		
		Scanner sc = new Scanner(System.in);
		
		String menuNo = "";
		
		do {
			Main2.menu();
			
			menuNo = sc.nextLine();
			
			String name = null;
			int age = 0;
			String address = null;
			
			switch (menuNo) {
				
				case "1":
				
					do {
						System.out.print("\n▷성명 : ");
						name = sc.nextLine();
						
						do {
							System.out.print("▷나이 : ");
							String strage = sc.nextLine();
							
							try {
								age = Integer.parseInt(strage);
								
								if(age < 1) {
									System.out.println(">>> 나이는 0보다 커야 합니다."); 
									continue;
								}
								else break;
							} catch(NumberFormatException e) {
								System.out.println(">>> 숫자로만 입력하세요!!");
							}
							
						} while (true);
						
						System.out.print("▷주소 : ");
						address = sc.nextLine();
						
						User user = new User(name, age, address);
						userList.add(user);
						
						System.out.print(">>> 회원을 또 추가하시겠습니까?(1.예 / 2.아니오)=> "); 
						String yn = sc.nextLine();
						
						if(!"1".equals(yn)) break;
						
					} while (true);
					
					mysr.objectToFileSave(userList, "c:/iotestdata/userinfo2.txt"); 
					
					break;
			
				case "2":
					
					try {
						obj = mysr.getObjectfromFile("c:/iotestdata/userinfo2.txt");  
						
						if(obj != null) {
							userList = (List<User>)obj;
							
							for(User user : userList) {
								System.out.println(user);
							}
						}
					} catch(Exception e) { }
					
					break;
	
				case "3":
					
				try {	
					System.out.print("▷연령대 => ");
					String strageline = sc.nextLine();
					int ageline = Integer.parseInt(strageline);
					
					obj = mysr.getObjectfromFile("c:/iotestdata/userinfo2.txt");
					
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
				
				case "4":
					System.out.println(">>> 프로그램 종료합니다.");
					break;	
					
				default:
					break;
				} // end of switch-----------------
			
		} while (!"4".equals(menuNo));
		
		sc.close();

	}// end of main()-------------------------

}







