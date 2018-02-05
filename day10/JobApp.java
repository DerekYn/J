/*
 	=== *** 구인, 구직 관련 프로그래밍을 만들어보자 *** ===
 	
 		1. 부품(요소) --> 구직자, 구인회사
 		2. 추상화 작업
 			1) 구직자   --> 속성(멤버변수), 기능(메소드)
 			2) 구인회사 --> 속성(멤버변수), 기능(메소드)
 */

package my.day10;

import java.util.Scanner;

import my.Util.MyUtil;

public class JobApp {
	
	JobSeeker[] jobSeekerArr = new JobSeeker[10];
	static int jobSeekerCount = 0;
	
	
	public static void menu() {
		
		String menulist = "\n======= menu ========"
						+ "\n1. 구직자 등록"
						+ "\n2. 회사 정보 등록"
						+ "\n3. 구인 등록"
						+ "\n4. 모든 구직자 정보 출력"
						+ "\n5. 모든 구인 정보 출력"
						+ "\n6. 구직자 ID 검색"
						+ "\n7. 구인회사 ID 검색"
						+ "\n8. 특정 업종 구인 정보 출력"
						+ "\n9. 특정 조건 구직자 정보 출력"
						+ "\n10. 특정 구직자 삭제"
						+ "\n11. 특정 구직자 정보 변경"
						+ "\n12. 프로그램 종료"
						+ "\n===================="
						+ "\n>>메뉴 번호를 선택하세요 => ";
		
		System.out.print(menulist);
		 
	}// end of menu()-----------------------------------------------------------

	// ** 메뉴번호 1. 구직자 등록을 해주는 메소드 생성하기 *** //
	public void registerJobSeeker(Scanner sc) {
		
		JobSeeker jobSeeker = new JobSeeker();
		
		do {
			System.out.print("▷ 아이디 ==> ");
			String userid = sc.nextLine();
			
			// 구직자 ID  ==>  중복 O return false; 중복 X -> return true;
			boolean isUseidUse = userIdDuplicateCheck(userid);
			
			if(isUseidUse) { // 구직자 ID => 중복 X
				jobSeeker.userid = userid;
				break;
			}
			else { // 구직자 ID => 중복 O
				System.out.println(">>> 이미 사용중인 사용자 ID 이므로 새로운 ID 값을 입력하세요!!!");
			}
		} while (true);
		
		do {
			System.out.print("▷ 비밀번호 ==> ");
			String passwd = sc.nextLine();
			
			boolean isUsepasswd = MyUtil.passwdCheck(passwd);
			
			if(isUsepasswd) {
				jobSeeker.passwd = passwd;
				break;
			}
			else {
				System.out.println(">>> 암호는 7글자 이상의 영문자, 숫자, 특수문자로 구성됩니다.비밀번호 생성 조건을 다시 확인해주세요.");
			}
		} while (true);
		
		
		System.out.print("▷ 성명 ==> ");
		jobSeeker.name = sc.nextLine();
		
		do {
			try {
				System.out.print("▷ 나이 ==> ");
				int age = Integer.parseInt(sc.nextLine());
				if(0 < age) {
					jobSeeker.age = age;
					break;
				}
				else { //입력한 나이가 0또는 음수로 입력된 경우
					System.out.println(">> 나이는 0보다 커야합니다.");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println(">> 나이는 정수만 입력 가능합니다.!!");
			}
			
		} while (true);
				
		System.out.print("▷ 성별(1. 남자 / 2. 여자) ==> ");
		jobSeeker.gender = "1".equals(sc.nextLine())?"남":"여";
		
		System.out.print("▷ 주소 ==> ");
		jobSeeker.address= sc.nextLine();
		
		System.out.print("▷ 학위(1. 대졸 이상 / 2. 초대졸 / 3. 고졸 / 4. 고졸 미만) ==> ");
		int degree = Integer.parseInt(sc.nextLine());
		switch (degree) {
		case 1:
			jobSeeker.degree = "대졸 이상";
			break;
		case 2:
			jobSeeker.degree = "초대졸";			
			break;
		case 3:
			jobSeeker.degree = "고졸";
			break;
		case 4:
		default:
			jobSeeker.degree = "고졸 미만";
			break;
		}
		
		System.out.print("▷ 전화번호 ==> ");
		jobSeeker.mobile = sc.nextLine();
		
		System.out.print("▷ 희망 직종 ==> ");
		jobSeeker.theOccupationDesired = sc.nextLine();
		
		do {
			try {
				System.out.print("▷ 희망 연봉 ==> ");
				int theSaralyDesired = Integer.parseInt(sc.nextLine());
				if(0 < theSaralyDesired) {
					jobSeeker.theSaralyDesired = theSaralyDesired;
					break;
				}
				else { //입력한 나이가 0또는 음수로 입력된 경우
					System.out.println(">> 희망 연봉은 0보다 커야합니다.");
					continue;
				}
			} catch (NumberFormatException e) {
				System.out.println(">> 희망 연봉은 정수만 입력 가능합니다.!!");
			}
			
		} while (true);
		
		System.out.println("\n" + jobSeeker.showJobSeeker() + "\n");
		
		System.out.print("\n>> 위 정보를 등록 하시겠습니까?[1. 예 / 2. 아니오] ==> ");
		if("1".equals(sc.nextLine())) {
			// 객체 jobSeeker를 배열 JobSeeker[] jobSeekerArr에 저장시킨다.
			// 문제는 jobSeekerArr가 배열이므로 배열의 크기가 꽉차있으면
			// 저장시킬 수가 없다.
			// 그러므로 배열의 크기를 먼저 알아봐서 크기가 오바가 되어지면 "정원 마감" 이라는 메세지 출력
			saveJobSeeker(jobSeeker);
		}
		
	}// end of registerJobSeeker(Scanner sc)----------------------------------------------
	
	public void saveJobSeeker(JobSeeker jobSeeker) {
		
		if(jobSeekerCount >= jobSeekerArr.length) {
			System.out.println(">> 정원이 마감되었습니다.");
		}
		else {
			int flag = 0;
			
			if(jobSeekerCount > 0) {
				for(int i=0; i<jobSeekerCount; i++) {
					if(jobSeekerArr[i] == null) {
						jobSeekerArr[i] = jobSeeker;
						flag = 1;
						break;
					}
				}
			}
			if( flag == 0 )
				jobSeekerArr[jobSeekerCount++] = jobSeeker;
			
			System.out.println("현재 " + jobSeekerCount + "명이 등록하였습니다.[마감정원 : " + jobSeekerArr.length + "]");
		}
			
	}// end of saveJobSeeker(JobSeeker jobSeeker)-----------------------------------------
	
	public boolean userIdDuplicateCheck(String userid) {
		
		int flag = 0;
		boolean isUse = false;
		String existUserid = " ";
		
		for(int i=0; i<jobSeekerCount; i++ ) {
			if(jobSeekerArr[i] != null) {
				existUserid = jobSeekerArr[i].userid;
			}
			
			if(userid.equals(existUserid)) { // 기존에 존재하는 구직자의 userid 값과
											 // 새로이 가입하려는 userid 값이 일치하는 경우
											 // 즉, 중복된 userid 값인 경우이다.
				
				flag = 1;
				break;
			}
		}// end of for--------------------------------------------------------------------
		
		if(flag == 0) { // 새로이 가입하려는 userid 값이 기존의 userid 값과
						// 일치하는 것이 없는 경우 (고유한 userid 이라면)
			isUse = true;
		}
			
		return isUse;
		
	}// end of userIdDuplicateCheck(String userid)----------------------------------------
	
	// ** 메뉴번호4. 모든 구직자 정보를 출력해주는 메소드 생성하기 *** //
	public void showAllJobSeeker() {
				
		if(jobSeekerCount == 0) {
			System.out.println("가입된 구직자가 없으므로 조회 불가 합니다.");
		}
		else {
			for(int i=0; i<jobSeekerCount; i++) {
				if(jobSeekerArr[i] != null) {
					System.out.println(jobSeekerArr[i].showJobSeeker());
					System.out.println(" ");
				}
			}
		}
	}// end of showAllJobSeeker()--------------------------------------------------------
	
	public void showJobSeekerIdSearch(Scanner sc) {
		
		if(jobSeekerCount == 0) {
			System.out.println("가입된 구직자가 없으므로 조회 불가 합니다.");
		}
		else {
			System.out.print(">> 조회하려는 ID ==> ");
			String searchUseid = sc.nextLine();
			
			int flag = 0;
			
			for(int i=0; i<jobSeekerCount; i++) {
				String existUserid = jobSeekerArr[i].userid;
				if(existUserid.equals(searchUseid)) {
					flag = 1;
					System.out.println(jobSeekerArr[i].showJobSeeker());
					break;
				}
			}
			
			if(flag == 0) {
				System.out.println(">> 찾고자 하는 ID [ " + searchUseid + " ]는 없습니다.");
			}
		}
	}// end of showJobSeekerIdSearch(Scanner sc)-----------------------------------------
	
	public void deleteJobSeeker(Scanner sc) {
		
		System.out.print(">>> 삭제하려는 ID를 입력하세요 => ");
		
		String userid = sc.nextLine();
		
		int flag = 0;
		
		if(jobSeekerCount == 0) {
			System.out.println("가입된 구직자가 없으므로 삭제 불가 합니다.");
			
		}
		else {
			for(int i=0; i<jobSeekerCount; i++) {
				if(jobSeekerArr[i].userid.equals(userid)) {
					flag = 1;
					jobSeekerArr[i] = null;
					break;
				}
			}
			
			if(flag == 1) {
				System.out.println("입력하신 ID [ " + userid + " ] 가 삭제 되었습니다.");
			}
			else
				System.out.println("입력하신 ID [ " + userid + " ] 는 존재하지 않는 ID입니다.");
		}
		
	}// end of deleteJobSeeker(Scanner sc)-----------------------------------------------
	
			
	public static void main(String[] args) {
		
		JobApp jobapp = new JobApp();
		Scanner sc = new Scanner(System.in);
		String menuNo = " ";
		
		do {
			jobapp.menu();
			
			menuNo = sc.nextLine();
			
			switch (menuNo) {
			case "1":
				jobapp.registerJobSeeker(sc);
				
				break; // 1. 구직자 등록
			case "2":
							
				break; // 2. 회사 정보 등록
			case "3":
				
				break; // 3. 구인 등록
			case "4":
				jobapp.showAllJobSeeker();
				break; // 4. 모든 구직자 정보 출력
			case "5":
				
				break; // 5. 모든 구인 정보 출력
				
			case "6":
				jobapp.showJobSeekerIdSearch(sc);
				break; // 6. 구직자 ID 검색
			case "7":
				
				break; // 7. 구인회사 ID 검색
			case "8":
				
				break; // 8. 특정 업종 구인 정보 출력
			case "9":
				
				break; // 9. 특정 조건 구직자 정보 출력
			case "10":
				jobapp.deleteJobSeeker(sc);
				break; // 10. 특정 구직자 삭제
			case "11":
				
				break; // 11. 특정 구직자 정보 변경
			case "12":
	
				break; // 10. 프로그램 종료

			default:
				System.out.println(">> 존재하지 않는 메뉴번호 입니다. 다시 선택하세요!!\n");
				break;
			}// end of switch------------------------------------------------------
			
			
			
		} while ( !("12".equals(menuNo)) );
		
		System.out.println(">>> 이용해주셔서 감사합니다.");
		System.out.println(MyUtil.getNowTime());
		sc.close();
		
	}// end of main()------------------------------------------------------------------



}// end of JobApp-------------------------------------------------------------------
