package my.day19.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import my.day19.Member;

public class ArrayListQuiz {

	public static void menu() {
		System.out.println("=====>> 메뉴 <<=====");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원전체 조회");
		System.out.println("3. ID로 특정회원 검색");
		System.out.println("4. 특정 회원 삭제하기");
		System.out.println("5. 종료");
		System.out.print(">>> 메뉴번호를 선택하세요 => ");
	}// end of static void menu()---------------------
	
	public void registerMember(Scanner sc, List<Member> memberList) {
		System.out.print("\n▷ID : ");
		String id = sc.nextLine();
		
		System.out.print("▷암호 : ");
		String password = sc.nextLine();
		
		System.out.print("▷성명 : ");
		String name = sc.nextLine();
		
		int age;
		
		do {
			try {
				System.out.print("▷나이 : ");
				age = Integer.parseInt(sc.nextLine());
				if(age <= 0) {
					System.out.println(">>> 나이는 0보다 커야 합니다!!"); 
					continue;
				}
				break;	
			} catch (NumberFormatException e) {
				System.out.println(">>> 숫자만 입력하세요!!");
			}	
		} while (true);
		
		System.out.print("▷주소 : ");
		String address = sc.nextLine();
		
		memberList.add(new Member(id, password, name, age, address)); 
		
		System.out.println(">>> 회원입력 성공!!\n");
		
	}// end of void registerMember(Scanner sc, List<Member> memberList) ----------------
	
	
	public void searchMember(Scanner sc, List<Member> memberList) {
		
		System.out.print("\n>>> 검색할 ID명 : ");
		String searchID = sc.nextLine();
		
		int cnt = 0;
		for(Member mem : memberList) {
			if(mem.getId().equals(searchID)) {
				System.out.println(mem.showInfo());
				cnt = 1;
			}	
		}// end of for-----------------------
		
		if (cnt == 0) {
			System.out.println(">>> 검색하시려는 사용자 ID " + searchID + "는 존재하지 않습니다."); 
		}
		
	}// end of void searchMember(Scanner sc, List<Member> memberList)---------------
	
	
/*
	  public void deleteMember(Scanner sc, List<Member> memberList) {
		
		System.out.print("\n>>> 삭제할 ID명 : ");
		String deleteID = sc.nextLine();
		
		boolean bool = false;
		
		for(Member mem : memberList) {
			if(mem.getId().equals(deleteID)) {
				bool = memberList.remove(mem);
				if (bool)
					System.out.println(">>> 삭제성공!!");
			}
		}// end of for-------------------
		
		if (!bool)
			System.out.println(">>> 삭제하시려는 사용자 ID " + deleteID + "는 존재하지 않습니다."); 
		
		
	}// end of void deleteMember(Scanner sc, List<Member> memberList)------------------

*/	
	
// 또는	
	
	public void deleteMember(Scanner sc, List<Member> memberList) {
		
		System.out.print("\n>>> 삭제할 ID명 : ");
		String deleteID = sc.nextLine();
		
		String[] idArr = new String[memberList.size()];
		int indexCount = 0;
		
		for(int i=0; i<memberList.size(); i++) {
			String existId = memberList.get(i).getId();
			
			if(existId.equals(deleteID)) {
				idArr[indexCount++] = existId; // 삭제해야할 id값을 기억
			}
		}// end of for-----------------------------------------
		
		if (indexCount > 0) { // 삭제대상이 존재하는 경우
			
			System.out.print(">>> 정말로 삭제하시겠습니까?[Y(예) / N(아니오)] => ");
			String YN = sc.nextLine();
			
			if("Y".equals(YN) || "y".equals(YN)) {
				
				for(int i=0; i<memberList.size(); i++) {
					
					String id = memberList.get(i).getId();
					
					for(int j=0; j<indexCount; j++) {
						if(id.equals(idArr[j])) {
							memberList.remove(i);
						}
					}// end of for----------------------
				}
				
				System.out.println(">>> 일괄삭제 성공!!");
				
			}
			else {
				System.out.println(">>> 삭제를 취소했습니다.");
			}
			
		}
		else { // 삭제대상이 존재하지 않는 경우
			System.out.println(">>> 삭제하시려는 사용자 ID " + deleteID + "는 존재하지 않습니다."); 
		}
		
	}// end of void deleteMember(Scanner sc, List<Member> memberList)------------------
	
	
	public static void main(String[] args) {
		
		ArrayListQuiz quizobj = new ArrayListQuiz();
		
		List<Member> memberList = new ArrayList<Member>();
		
		Scanner sc = new Scanner(System.in);
		String menuno;
		
		do {
			ArrayListQuiz.menu();	
			
			menuno = sc.nextLine();
			
			switch (menuno) {
				case "1":
					quizobj.registerMember(sc, memberList);
					break;
	
				case "2":
					for(Member mem : memberList) {
						String info = mem.showInfo();
						System.out.println("\n"+info);
					}
					System.out.println(">>> 총회원수 : " + memberList.size() + "명\n");
					break;
					
				case "3":
					quizobj.searchMember(sc, memberList);
					break;
					
				case "4":
					quizobj.deleteMember(sc, memberList);
					break;
				
				case "5":
					System.out.println(">>> 프로그램을 종료합니다.~~");
					break;	
					
				default:
					break;
			}// end of switch----------------------------
			
		} while (!("5".equals(menuno))); 

	}// end of main()-------------------------------------

}

/*
  =====>> 메뉴 <<=====
  1. 회원가입
  2. 회원전체 조회 (총회원 : 5명)
  3. ID로 특정회원 검색
  4. 특정 회원 삭제하기
  5. 종료
*/





