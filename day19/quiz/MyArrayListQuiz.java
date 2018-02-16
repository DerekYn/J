package my.day19.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import my.day19.Member;

public class MyArrayListQuiz {
	
	static Scanner sc = new Scanner(System.in);
	
	static List<Member> memberList = new ArrayList<Member>();
	
	public static void main(String[] args) {
		
		MyArrayListQuiz quiz = new MyArrayListQuiz();
		int flag = 0;
		
		do {
			
			quiz.menu();
			
			try {
				
				switch (sc.nextLine()) {
				case "1":
					quiz.signUp();
					break;
				case "2":
					quiz.showAll();
					break;
				case "3":
					quiz.showSomeInfo();
					break;
				case "4":
					quiz.someDelete();
					quiz.showAll();
					break;
				case "5":
					System.out.println("프로그램을 종료합니다.");
					flag = 1;
					break;

				default:
					System.out.println("1 ~ 5의 정수만 입력하세요.");
				}
				
			} catch (Exception e) {
				System.out.println("1 ~ 5의 정수만 입력하세요.");
			}
			
		} while (flag == 0);
	
		sc.close();
	}
	
	public void menu() {
		System.out.println("======>> 메뉴 <<======");
		System.out.println("1. 회원 가입");
		System.out.println("2. 회원전체 조회");
		System.out.println("3. ID로 특정회원 검색");
		System.out.println("4. 특정 회원 삭제");
		System.out.println("5. 종료");
		System.out.print("원하시는 메뉴를 선택하세요 : ");
	}
	
	public void signUp() {
		System.out.print("Id를 입력하세요 : ");
		String id = sc.nextLine();
		System.out.print("Pw를 입력하세요 : ");
		String password = sc.nextLine();
		System.out.print("Name를 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("Age를 입력하세요 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("Add를 입력하세요 : ");
		String address = sc.nextLine();
		
		memberList.add(new Member(id, password, name, age, address));
	}
	
	public void showAll() {
		for(Member mem : memberList) {
			System.out.println(mem.showInfo());
			System.out.println();
		}
	}
	
	public void showSomeInfo() {
		System.out.print("검색하고 싶은 ID를 입력하세요 : ");
		String str = sc.nextLine();
		
		for(Member mem : memberList) {
			if(mem.getId().equals(str)) {
				System.out.println(mem.showInfo());
				break;
			}
		}
	}
	
	public void someDelete() {
		System.out.print("삭제하고 싶은 ID를 입력하세요 : ");
		String str = sc.nextLine();
		int flag = 0;
		
		for(Member mem : memberList) {
			if(mem.getId().equals(str)) {
				flag = 1;
				memberList.remove(mem);
				System.out.println(str + "이 삭제 되었습니다.");
				break;
			}
		}
		if(flag == 0) {
			System.out.println("삭제하고자 하는 ID가 없습니다.");
		}
				
		/*for(int i=0; i<memberList.size(); i++) {
			if(str.equals(memberList.get(i).getId())){
				memberList.remove(i);
				System.out.println(str + "이 삭제 되었습니다.");
				break;
			}
		}*/

	}

}