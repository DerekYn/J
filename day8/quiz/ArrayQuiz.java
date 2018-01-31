package my.day8.quiz;

import java.util.Scanner;

public class ArrayQuiz {
		
	public static void menu() {
		System.out.println("----->> 메뉴 <<-----");
	 	System.out.println("1. 성찾기");
	 	System.out.println("2. 이름검색");
	 	System.out.println("3. 종료");
	 	System.out.println("");
	 	System.out.print(">> 메뉴번호 입력 => ");
	}
	
	public void searchFirstName(String[] namesArr, String first) {
		int flag = 0;
		
		for(int i=0; i<namesArr.length; i++) {
			char[] chrnames = namesArr[i].toCharArray();
			for(char ch : chrnames) {
				if(ch == first.charAt(0)) {
					flag = 1;
					System.out.println(namesArr[i]);
					break;
				}
			}
		}
		if(flag == 0)
			System.out.println("'" + first+ "'" + "성씨가 포함된 이름이 없습니다.");
	}// end of searchFirstName(String[] namesArr, String first)---------------
	
	public void searchName(String[] namesArr, String nameLetter) {
		int flag = 0;
		
		for(int i=0; i<namesArr.length; i++) {
			
			for(int j=0; j<namesArr[i].length() - (nameLetter.length() - 1); j++){
				String word = namesArr[i].substring(j, j + nameLetter.length());
				if(word.equals(nameLetter)) {
					flag = 1;
					System.out.println(namesArr[i]);
					break;
				}
			}
		}
		if(flag == 0) 
			System.out.println("'" + nameLetter + "'" + "이라는 글자가 포함된 이름이 없습니다.");
	}// end of searchName(String[] namesArr, String nameLetter)---------------
	
	public int keepGo(String yn) {
		
		if("Y".equals(yn) || "y".equals(yn)) 
			return 1;
		else if("N".equals(yn) || "n".equals(yn))
			return 2;
		else
			return 3;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String names = "이규호,김종성,윤찬영,조원영,임규하,김규호,이종성,임규성";
		String[] namesArr = names.split(",");
		String yn = "";
		
		ArrayQuiz obj = new ArrayQuiz();
		
		String menuNum = " ";
		String first = " ";
		String nameLetter = " ";
		
		for(; true;) {
			try {
				obj.menu();
				
				menuNum = sc.nextLine();
				
				switch(menuNum) {
					case "1":
						System.out.print(">> 검색하실 성 입력 => ");
						first = sc.nextLine();
						obj.searchFirstName(namesArr, first);
						break;
						
					case "2":
						System.out.print(">> 검색하실 글자 입력 => ");
						nameLetter = sc.nextLine();
						obj.searchName(namesArr, nameLetter);
						break;
						
					case "3":
						System.out.println(">> 프로그램 종료!! 안녕히 가세요~~");
						break;
						
					default :
						System.out.println("1, 2, 3 중에서만 선택하세요!!");
						continue;
				}
				if("3".equals(menuNum))
					break;
				
				System.out.print(">> 계속 하실래요?(Y/N) => ");
				yn = sc.nextLine();
				
				int result = obj.keepGo(yn);
				if(result == 1)
					continue;
				else if(result == 2) {
					System.out.println(">> 프로그램 종료!! 안녕히 가세요~~");
					break;
				}
				else {
					System.out.println("(Y/N) 중에서만 선택하세요!!");
					System.out.print(">> 계속 하실래요?(Y/N) => ");
					yn = sc.nextLine();
					obj.keepGo(yn);
				}
								
			} catch (NumberFormatException e) {
				System.out.println("1, 2, 3 중에서만 선택하세요!!");
				continue;
			}
				
		}
		
		sc.close();
	}



}
/*
	MyUtil.searchWord(); 사용금지 !!!
 	1. String[] namesArr 을 생성합니다.
 	2. "이규호,김종성,윤찬영,조원영,임규하,김규호,이종성,임규성" 을 입력합니다.
 	
 	 프로그램을 실행하면
 	 
 	 ----->> 메뉴 <<-----
 	 1. 성찾기
 	 2. 이름검색
 	 3. 종료
 	 
 	 >> 메뉴번호 입력 => 1
 	 >> 검색하실 성 입력 => 김
 	 김종성
 	 김규호
 	 >> 계속 하실래요?(Y/N) => y
 	 
 	 ----->> 메뉴 <<-----
 	 1. 성찾기
 	 2. 이름검색
 	 3. 종료
 	
 	>> 메뉴번호 입력 => 2
 	>> 검색하실 글자 입력 => 규호
 	이규호
 	김규호
 	>> 계속 하실래요?(Y/N) => y
 	
 	----->> 메뉴 <<-----
 	 1. 성찾기
 	 2. 이름검색
 	 3. 종료
 	 
 	>> 메뉴번호 입력 => 2
 	>> 검색하실 글자 입력 => 규
 	이규호
 	임규하
 	김규호
 	임규성
 	
 	>> 계속 하실래요?(Y/N) => y
 	
 	----->> 메뉴 <<-----
 	 1. 성찾기
 	 2. 이름검색
 	 3. 종료
 	 
 	>> 메뉴번호 입력 => 3
 	>> 프로그램 종료!! 안녕히 가세요~~
*/