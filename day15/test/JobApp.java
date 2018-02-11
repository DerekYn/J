/*
     === *** 구인, 구직 관련 프로그래밍을 만들어보자 *** ===
     
       1. 부품(요소) --> 구직자, 구인회사
       2. 추상화작업
          1) 구직자    --> 속성(멤버변수), 기능(메소드)
          2) 구인회사 --> 속성(멤버변수), 기능(메소드)
          
 */

package my.day15.test;

import java.util.Scanner;

import my.Util.MyUtil;

public class JobApp {

	AbstractCommon[] AbstractCommonArr = new AbstractCommon[20];
	static int AbstractCommonCount = 0;
	
	Recruit[] recruitArr = new Recruit[50];
	static int recruitCount = 0;
	
	
	public static void menu() {
		
		System.out.println("========= Menu ==========");
		System.out.println("1. 구직자등록");
		System.out.println("2. 회사정보등록");
		System.out.println("3. 구인등록");
		System.out.println("4. 모든 구직자정보 출력");
		System.out.println("5. 모든 구인정보 출력");
		System.out.println("6. 구직자 ID 검색");
		System.out.println("7. 구인회사 ID 검색");
		System.out.println("8. 특정 업종 구인정보 출력");
		System.out.println("9. 특정 조건 구직자정보 출력");
		System.out.println("10. 특정 구직자 삭제하기");
		System.out.println("11. 특정 구직자 데이터변경하기");
		System.out.println("12. 종료");
		System.out.println("===========================");
		System.out.print("메뉴번호를 선택하세요 => ");
		
	}// end of menu()-----------------------------------
	
	
	// *** 메뉴번호 1. 구직자 등록을 해주는 메소드 생성하기 *** //
	public void registerJobSeeker(Scanner sc) {
		
		JobSeeker jobseeker = new JobSeeker();
		
		do {
			System.out.print("▷아이디 => ");
			String userid = sc.nextLine();
			
			// 구직자아이디가 중복된 것이라면 false 리턴해주고,
			// 구직자아이디가 중복된 것이 아니라면 true 리턴해주는 메소드호출
			boolean isUseridUse = userIdDuplicateCheck(userid);
			
			if(isUseridUse) {  // 구직자아이디가 중복된 것이 아니라면
				jobseeker.setId(userid);
				break;
			}
			else { // 구직자아이디가 중복된 것이라면
				System.out.println(">>> 이미 사용중인 사용자 ID 이므로 새로운 ID값을 입력하세요!!");
			}
			
		} while (true);
		
		
		do {
			System.out.print("▷암호 => ");
			String passwd = sc.nextLine();
			
			if( MyUtil.passwdCheck(passwd) ) {
				jobseeker.passwd = passwd;
				break;
			}
			else {
				System.out.println(">> 암호는 7글자 이상의 영문자,숫자,특수문자가 혼합되어져야만 합니다.!!"); 
			}
			
		} while (true);
		
		
		System.out.print("▷성명 => ");
		jobseeker.name = sc.nextLine();
		
		do {
			try {
				System.out.print("▷나이 => ");
				int age = Integer.parseInt(sc.nextLine());
				if(age > 0) {
					jobseeker.setAge(age);
					break;
				}
				else {  // 입력한 나이가 0 또는 음수로 입력한 경우이라면
					System.out.println(">> 나이는 0보다 커야 합니다.");
					continue;
				}
				
			} catch (NumberFormatException e) {
				System.out.println(">> 나이는 정수만 입력가능합니다.!!");
			}
				
		} while (true);
		
		
		System.out.print("▷성별(1.남 / 2.여) => ");
		jobseeker.setGender("1".equals(sc.nextLine())?"남":"여");
				
		System.out.print("▷주소 : ");
		jobseeker.addr = sc.nextLine();		// protected 니까 됨..
		
		System.out.print("▷학력(1.대졸이상 / 2.초대졸 / 3.고졸 / 4.고졸미만 ) => "); 
		
		switch (sc.nextLine()) {
			case "1":
				jobseeker.setDegree("대졸이상");
				break;
	
			case "2":
				jobseeker.setDegree("초대졸");
				break;
				
			case "3":
				jobseeker.setDegree("고졸");
				break;
				
			case "4":
			default:
				jobseeker.setDegree("고졸미만");
				break;
		}// end of switch-------------------------
		
		System.out.print("▷휴대폰번호 : ");
		jobseeker.number = sc.nextLine();
		
		System.out.print("▷희망직종 : ");
		jobseeker.setTheOccupationDesired(sc.nextLine());
		
		do {
			try {
				System.out.print("▷희망급여 => ");
				int theSaralyDesired = Integer.parseInt(sc.nextLine());
				if(theSaralyDesired > 0) {
					jobseeker.setTheSaralyDesired(theSaralyDesired);
					break;
				}
				else {  // 희망급여를  0 또는 음수로 입력한 경우이라면
					System.out.println(">> 희망급여는 0보다 커야 합니다.");
					continue;
				}
				
			} catch (NumberFormatException e) {
				System.out.println(">> 희망급여는 정수만 입력가능합니다.!!");
			}
				
		} while (true);
		
		System.out.println("\n" + jobseeker.showJobSeeker()+"\n");
		
		System.out.print("\n>> 위 정보를 등록하시겠습니까?[1.예 / 2.아니오] => "); 
		if("1".equals(sc.nextLine())) {
			// 객체 jobSeeker 을  JobSeeker[] gujikjaArr 에 저장시킨다.
			// 문제는 gujikjaArr 이 배열이므로 배열의 크기가 꽉차있으면
			// 저장시킬 수가 없다.
			// 그러므로 배열의 크기를 먼저 알아봐서 크기가 오버가 되어지면
			// "정원마감" 이라는 메시지를 띄우도록 하자.
			saveJobSeeker(jobseeker);
		}
		
	}// end of void registerGujikja(Scanner sc)---------------
	
	public void saveJobSeeker(JobSeeker jobSeeker) {
		
		if(AbstractCommonCount >= AbstractCommonArr.length) {
			System.out.println(">>> 정원이 마감되었습니다.");
		}
		else {
			
			int flag = 0;
			
			if (AbstractCommonCount > 0) {
				for(int i=0; i<AbstractCommonCount; i++) {
					if ( AbstractCommonArr[i] == null ) { // 배열에서 삭제된 것이 있는 경우   
						AbstractCommonArr[i] = jobSeeker;   // 그 배열의 삭제된 방번호에 새로운 구직자를 저장시켜준다.
						flag = 1;
						break;
					}
				}// end of for--------------------------
			}
			
			if(flag == 0) {
				AbstractCommonArr[AbstractCommonCount++] = jobSeeker;	
			}
			
			System.out.println(AbstractCommonCount + "명 등록[마감정원: " + AbstractCommonArr.length + "명]");
			System.out.println("");
		}
		
	}// end of void  saveGujikja(Gujikja gujikja)------------------
	
	public boolean userIdDuplicateCheck(String userid) {
		
		int flag = 0;
		boolean isUse = false;
		
		for (int i=0; i<AbstractCommonCount; i++) {
			
			if (AbstractCommonArr[i] == null) continue;
			
			String existUserid = AbstractCommonArr[i].getId();
			
			if(AbstractCommonArr[i] instanceof JobSeeker && userid.equals(existUserid)) { 
											  // 기존에 존재하는 구직자의 userid 값과 
				                              // 새로이 가입하려는 userid 값이 일치하는 경우
				                              // 즉, 중복된 userid 값인 경우이다.
				flag = 1;
				break;
			}
			
		}// end of for---------------------
		
		if (flag == 0) {  // 새로이 가입하려는 userid 값이 기존의 userid 값과
			              // 일치하는 것이 없는 경우 (고유한 userid 이라면)
			
			isUse = true;
		}
		
		return isUse;
		
	}// end of userIdDuplicateCheck(String userid)---------------
	
	
	// *** 메뉴번호 2. 회사정보등록 해주는 메소드 생성하기 *** //
	public void registerCompany(Scanner sc) {
		
		Company company = new Company();
		
		do {
			System.out.print("▷회사아이디 => ");
			String comid = sc.nextLine();
			
			// 회사아이디가 중복된 것이라면 false 리턴해주고,
			// 회사아이디가 중복된 것이 아니라면 true 리턴해주는 메소드호출
			boolean isComidUse = comIdDuplicateCheck(comid);
			
			if(isComidUse) {  // 회사아이디가 중복된 것이 아니라면
				company.setId(comid);
				break;
			}
			else { // 회사아이디가 중복된 것이라면
				System.out.println(">>> 이미 사용중인 회사 ID 이므로 새로운 ID값을 입력하세요!!");
			}
			
		} while (true);
		
		
		do {
			System.out.print("▷암호 => ");
			String passwd = sc.nextLine();
			
			if( MyUtil.passwdCheck(passwd) ) {
				company.passwd = passwd;
				break;
			}
			else {
				System.out.println(">> 암호는 7글자 이상의 영문자,숫자,특수문자가 혼합되어져야만 합니다.!!"); 
			}
			
		} while (true);
		
		
		System.out.print("▷회사명 => ");
		company.setName(sc.nextLine());
		
		System.out.print("▷대표자명 => ");
		company.setCeo(sc.nextLine());
		
		do {
			try {
				System.out.print("▷자본금 => ");
				long seedmoney = Long.parseLong(sc.nextLine());
				if(seedmoney > 0) {
					company.setSeedmoney(seedmoney);
					break;
				}
				else {  // 입력한 자본금이 0 또는 음수로 입력한 경우이라면
					System.out.println(">> 자본금은 0보다 커야 합니다.");
					continue;
				}
				
			} catch (NumberFormatException e) {
				System.out.println(">> 자본금은 정수만 입력가능합니다.!!");
			}
				
		} while (true);
		
		System.out.print("▷업종[1.제조 / 2.IT / 3.서비스 / 4.기타] => "); 
		
		switch (sc.nextLine()) {
			case "1":
				company.setJobtype("제조");
				break;
	
			case "2":
				company.setJobtype("IT");
				break;
				
			case "3":
				company.setJobtype("서비스");
				break;
				
			case "4":
			default:
				company.setJobtype("기타");
				break;
		}// end of switch-------------------------
				
		System.out.print("▷회사주소 : ");
		company.addr = sc.nextLine();
		
		System.out.print("▷회사전화번호 : ");
		company.number = sc.nextLine();
		
		System.out.println("\n"+company.showCompany()+"\n");
		
		System.out.print("\n>> 위 정보를 등록하시겠습니까?[1.예 / 2.아니오] => "); 
		if("1".equals(sc.nextLine())) {
			// 객체 company 을  Company[] companyArr 에 저장시킨다.
			// 문제는 companyArr 이 배열이므로 배열의 크기가 꽉차있으면
			// 저장시킬 수가 없다.
			// 그러므로 배열의 크기를 먼저 알아봐서 크기가 오버가 되어지면
			// "정원마감" 이라는 메시지를 띄우도록 하자.
			saveCompany(company);
		}		
		
	}// end of registerCompany(Scanner sc)--------------------
	

	public boolean comIdDuplicateCheck(String comid) {
		
		int flag = 0;
		boolean isUse = false;
		
		for (int i=0; i<AbstractCommonCount; i++) {
			
			if (AbstractCommonArr[i] == null) continue;
			
			String existComid = AbstractCommonArr[i].getId();
			
			if(AbstractCommonArr[i] instanceof Company && comid.equals(existComid)) {  // 기존에 존재하는 회사의 comid 값과 
				                            // 새로이 가입하려는 comid 값이 일치하는 경우
				                            // 즉, 중복된 comid 값인 경우이다.
				flag = 1;
				break;
			}
			
		}// end of for---------------------
		
		if (flag == 0) {  // 새로이 가입하려는 comid 값이 기존의 comid 값과
			              // 일치하는 것이 없는 경우 (고유한 comid 이라면)
			
			isUse = true;
		}
		
		return isUse;
		
	}// end of comIdDuplicateCheck(String comid)---------------	
	
	
	public void saveCompany(Company company) {
		
		if(AbstractCommonCount >= AbstractCommonArr.length) {
			System.out.println(">>> 정원이 마감되었습니다.");
		}
		else {
			
			int flag = 0;
			
			if (AbstractCommonCount > 0) {
				for(int i=0; i<AbstractCommonCount; i++) {
					if ( AbstractCommonArr[i] == null ) { // 배열에서 삭제된 것이 있는 경우   
						AbstractCommonArr[i] = company;   // 그 배열의 삭제된 방번호에 새로운 회사를 저장시켜준다.
						flag = 1;
						break;
					}
				}// end of for--------------------------
			}
			
			if(flag == 0) {
				AbstractCommonArr[AbstractCommonCount++] = company;	
			}
			
			System.out.println(AbstractCommonCount + "회사 등록[마감정원: " + AbstractCommonArr.length + "회사]");
			System.out.println("");
		}
		
	}// end of void saveCompany(Company company)------------------
	
	
	// *** 메뉴번호 3. 구인등록 해주는 메소드 생성하기 *** //
	public void registerRecruit(Scanner sc) {
		
		// == 구인회사 아이디 입력하기 ==
		System.out.print(">> 구인회사 ID 입력 => ");
		String comid = sc.nextLine();
		
		Company company = searchCompany(comid);
		
		if (company == null) {
			// 회사회원으로 존재하지 않는 회사이라면
			// 회사등록을 하도록 하겠다.
			System.out.println(">> 기업회원으로 존재하지 않으므로 채용공고가 불가합니다."); 
			System.out.println(">> 기업회원 가입으로 이동합니다.\n");
			registerCompany(sc);
		}
		else {
			// 기업회원으로 존재하는 경우이라면 채용공고가 되도록 한다.
			Recruit recruit = new Recruit();
			
			recruit.setCompany(company);
			
			System.out.print("채용성별[1.남 / 2.여 / 3.성별무관] => ");
			switch (sc.nextLine()) {
				case "1":
					recruit.setGender("남");
					break;
					
				case "2":
					recruit.setGender("여");
					break;
				
				case "3":
				default:
					recruit.setGender("성별무관");
					break;
			}// end of switch-------------------
			
			do {
				try {
					System.out.print(">> 최소나이 => ");
					int agemin = Integer.parseInt(sc.nextLine());
					
					System.out.print(">> 최대나이 => ");
					int agemax = Integer.parseInt(sc.nextLine());
					
					if (agemin*agemax == 0 || 
						agemin < 0 || agemax < 0 ) {
						System.out.println(">> 나이는 0보다 커야합니다.!!");
					}
					else {
						recruit.setAgemin(agemin);
						recruit.setAgemax(agemax);
						break;
					}
					
				} catch (NumberFormatException e) {
					System.out.println(">> 나이는 숫자만 가능합니다.!!");
				}
					
			} while (true);
			
			
			System.out.print("채용학력[1.대졸이상 / 2.초대졸 / 3.고졸 / 4.학력무관] => "); 
			switch (sc.nextLine()) {
				case "1":
					recruit.setDegree("대졸이상");
					break;
					
				case "2":
					recruit.setDegree("초대졸");
					break;
				
				case "3":
					recruit.setDegree("고졸");
					break;
					
				case "4":	
				default:
					recruit.setDegree("학력무관");
					break;
			}// end of switch-------------------			
			
			System.out.println("\n"+recruit.showRecruit());
			
			System.out.print(">>\n위의 채용공고를 등록하시겠습니까?[1.예 / 2.아니오] => "); 
			
			if ("1".equals(sc.nextLine())) 
				saveRecruit(recruit);
			else
				System.out.println(">> 채용공고 등록을 취소하셨습니다."); 
			
		}// end of if ~ else----------------------
		
	}// end of registerRecruit(Scanner sc)-------------------
	
	
	public Company searchCompany(String comid) {
		
		Company result = null;
		
		for(int i=0; i<AbstractCommonCount; i++) {
			if(AbstractCommonArr[i] == null) continue;
			String existComid = AbstractCommonArr[i].getId();
			
			if(AbstractCommonArr[i] instanceof Company && existComid.equals(comid)) {
				result = (Company)AbstractCommonArr[i];
				break;
			}
		}// end of for--------------------
		
		return result;
	}// end of Company getCompany(String comid)--------------
	
	
	public void saveRecruit(Recruit recruit) {
		
		if (recruit != null) {
			
			if(recruitCount >= recruitArr.length) {
				System.out.println(">>> 채용공고 가능한 횟수 50개가 마감되었습니다.");
			}
			else {
				recruitArr[recruitCount++] = recruit;
				System.out.println(recruitCount + "개 채용공고 등록[마감정원: " + recruitArr.length + "건]");  
			}
			
		}
		
	}// end of saveRecruit(Recruit recruit)------------------
	
	
	// *** 메뉴번호 4. 모든 구직자정보 출력 해주는 메소드 생성하기 *** //
	public void showAllGujikja() {
		
		if(AbstractCommonCount == 0) {
			System.out.println(">>> 가입된 구직자가 없으므로 조회불가합니다.");
		}
		else {
			for(int i=0; i<AbstractCommonCount; i++) {
				if(AbstractCommonArr[i] != null && AbstractCommonArr[i] instanceof JobSeeker) {
					System.out.println(((JobSeeker)AbstractCommonArr[i]).showJobSeeker());
					System.out.println("\n");
				}
			} // end of for--------------------
		}
		
	}// end of void showAllGujikja()-----------------------
	
	
	// *** 메뉴번호 5. 모든 구인정보 출력 해주는 메소드 생성하기 *** //
	public void showAllRecruit() {
		
		for (int i=0; i<recruitCount; i++) {
			System.out.println(recruitArr[i].showRecruit()+"\n");
		}
		
	}// end of showAllRecruit()---------------------------
		
	
	// *** 메뉴번호 6. 구직자 ID 검색 해주는 메소드 생성하기 *** //
	public void showGujikaIdSearch(Scanner sc) {
		
		if (AbstractCommonCount == 0) {
			System.out.println(">>> 가입된 구직자가 없으므로 조회불가합니다.");
		}
		else {
			System.out.print(">> 조회하려는 아이디명 ==> ");
			String searchUserid = sc.nextLine();
			
			int flag = 0;
			
			for (int i=0; i<AbstractCommonCount; i++) {
				if(AbstractCommonArr[i] == null) continue;
				String existUserid = AbstractCommonArr[i].getId();
				 
				 if (existUserid.equals(searchUserid)) {
					 flag = 1;
					 System.out.println(((JobSeeker)AbstractCommonArr[i]).showJobSeeker());
					 break;
				 }
			}// end of for-------------------------
			
			if (flag == 0) {
				System.out.println(">>> 검색하려는 사용자 ID " + searchUserid + "은 존재하지 않습니다.");
			}
			
		}
		
	}// end of showGujikaIdSearch(Scanner sc)-------------------
	
	
	// *** 메뉴번호 7. 구인회사 ID 검색해주는 메소드 생성하기 *** //
	public void showCompanyIdSearch(Scanner sc) {
		
		if (AbstractCommonCount == 0) {
			System.out.println(">>> 가입된 회사가 없으므로 조회불가합니다.");
		}
		else {
			System.out.print(">> 조회하려는 아이디명 ==> ");
			String searchComid = sc.nextLine();
			
			int flag = 0;
			
			for (int i=0; i<AbstractCommonCount; i++) {
				if(AbstractCommonArr[i] == null) continue;
				String existComid = AbstractCommonArr[i].getId();
				 
				 if (existComid.equals(searchComid)) {
					 flag = 1;
					 System.out.println(((Company)AbstractCommonArr[i]).showCompany());
					 break;
				 }
			}// end of for-------------------------
			
			if (flag == 0) {
				System.out.println(">>> 검색하려는 회사 ID " + searchComid + "은 존재하지 않습니다.");
			}
			
		}		
		
	}// end of showCompanyIdSearch(Scanner sc)--------------------
	
	
	// *** 메뉴번호 8. 특정 업종 구인정보 출력 해주는 메소드 생성하기 *** //
	public void showSpecialJobtypeRecruit(Scanner sc) {
		
		System.out.println(">> 업종[1.제조 / 2.IT / 3.서비스 / 4.기타]");
		System.out.print(">> 조회할 업종선택 => ");
		
		String jobTypeNo = sc.nextLine();
		String searchJobtype = "";
		
		switch (jobTypeNo) {
			case "1":
				searchJobtype = "제조";
				break;
			
			case "2":
				searchJobtype = "IT";			
				break;
			
			case "3":
				searchJobtype = "서비스";
				break;
			
			case "4":
			default:
				searchJobtype = "기타";
				break;
		}// end of switch----------------------------
		
		for(int i=0; i<recruitCount; i++) {
			
			String jobtype = recruitArr[i].getCompany().getJobtype();
			
			if(jobtype.equals(searchJobtype)) 
				System.out.println(recruitArr[i].showRecruit()+"\n"); 
			
		}// end of for----------------------------
		
	}// end of showSpecialJobtypeRecruit(Scanner sc)---------------
	
	
	// *** 메뉴번호 9. 특정 조건 구직자정보 출력 해주는 메소드 생성하기 *** //
	public void showSearchJobSeeker(Scanner sc) {
		
		int agemin=0, agemax=0, hopemoneymin=0, hopemoneymax=0;
		String gender = "", degree = "";
		
		try {
			
			do {
				System.out.print("▷최소나이 => ");
				agemin = Integer.parseInt(sc.nextLine());
				
				System.out.print("▷최대나이 => ");
				agemax = Integer.parseInt(sc.nextLine());
			
				if (agemin <= 0 || agemax <= 0) {
					System.out.println(">> 나이는 0보다 커야 합니다.");
					continue;
				}
				else break;
					
			} while (true);
			
			
			System.out.print("▷성별[1.남 / 2.여 / 3.성별무관] => ");
			
			switch (sc.nextLine()) {
				case "1":
					gender = "남";
					break;
					
				case "2":
					gender = "여";
					break;	
				
				case "3":	
				default:
					gender = "성별무관";
					break;
			}// end of switch------------------
			
			 
			System.out.print("▷학력(1.대졸이상 / 2.초대졸 / 3.고졸 / 4.고졸미만 / 5.학력무관 )=> ");
			
			switch (sc.nextLine()) {
				case "1":
					degree = "대졸이상";
					break;
					
				case "2":
					degree = "초대졸";
					break;	
				
				case "3":
					degree = "고졸";
					break;
					
				case "4":
					degree = "고졸미만";
					break;	
					
				case "5":	
				default:
					degree = "학력무관";
					break;
			}// end of switch------------------
			
			do {
				System.out.print("▷최소희망급여 => ");
				hopemoneymin = Integer.parseInt(sc.nextLine());
				
				System.out.print("▷최대희망급여 => ");
				hopemoneymax = Integer.parseInt(sc.nextLine());
			
				if (hopemoneymin <= 0 || hopemoneymax <= 0) {
					System.out.println(">> 희망급여는 0보다 커야 합니다.");
					continue;
				}
				else if (hopemoneymin > hopemoneymax) {
					System.out.println(">> 최대희망급여는 최소희망급여 보다 같거나 커야 합니다.");
					continue;
				}
				else break;
					
			} while (true);
			
			
			// ==== 나이 검색 ====
			JobSeeker[] ageJobSeekerArr = new JobSeeker[AbstractCommonArr.length];
			int ageIndex = 0;
			
			for(int i=0; i<AbstractCommonCount; i++) {
				 if(AbstractCommonArr[i] == null) continue;
				 
				 if( AbstractCommonArr[i] instanceof JobSeeker && agemin <= ((JobSeeker)AbstractCommonArr[i]).getAge() 
						 								&&	((JobSeeker)AbstractCommonArr[i]).getAge() <= agemax )
					 ageJobSeekerArr[ageIndex++] = (JobSeeker)AbstractCommonArr[i];
			}// end of for------------------
			
			if (ageIndex == 0) {
				System.out.println(">> 검색조건에 맞는 연령대의 구직자는 없습니다.!!");
				return; // -------- 메소드 종료하기 -----------
			}
			
			
			// ==== 희망급여 검색 =====
			JobSeeker[] hopemoneyJobSeekerArr = null;
			int hopemoneyIndex = 0;
			
			if( ageIndex > 0 ) {
			
				hopemoneyJobSeekerArr = new JobSeeker[ageIndex];
				
				for(int i=0; i<ageIndex; i++) {
					 if( hopemoneymin <= ageJobSeekerArr[i].getTheSaralyDesired()
							 				&& ageJobSeekerArr[i].getTheSaralyDesired() <= hopemoneymax )  
						 ageJobSeekerArr[hopemoneyIndex++] = ageJobSeekerArr[i];
				}// end of for------------------
				
				if (hopemoneyIndex == 0) {
					System.out.println(">> 검색조건에 맞는 희망급여의 구직자는 없습니다.!!");
					return; // -------- 메소드 종료하기 -----------
				}	
			}
						
			// ==== 성별 및 학력 검색 =====
			// 경우1 : 성별무관 이며 학력도 무관일 경우
			// 경우2 : 성별은 있으면서 학력이 무관일 경우
			// 경우3 : 성별은 무관이면서 학력이 있을 경우
			// 경우4 : 성별도 있고 학력도 있을 경우
			
			// System.out.println("확인용 hopemoneyIndex : " + hopemoneyIndex);
			
			if (hopemoneyIndex > 0) {

				JobSeeker[] finalJobSeekerArr = new JobSeeker[hopemoneyIndex];
				int finalIndex = 0;
				
				// === 경우1 : 성별무관 이며 학력도 무관일 경우 ===
				if ("성별무관".equals(gender) && "학력무관".equals(degree)) {
					
					for(int i=0; i<hopemoneyIndex; i++) {
						finalJobSeekerArr[finalIndex++] = hopemoneyJobSeekerArr[i];
					}// end of for------------------------
					
				}
				
				// === 조건2 : 성별은 있으면서 학력이 무관일 경우 ===
				else if (!"성별무관".equals(gender) && "학력무관".equals(degree)) {
					
					for(int i=0; i<hopemoneyIndex; i++) {
						String existGender = hopemoneyJobSeekerArr[i].getGender();
						
						if(existGender.equals(gender))
							finalJobSeekerArr[finalIndex++] = hopemoneyJobSeekerArr[i];
					}// end of for------------------------
					
					if(finalIndex == 0) {
						System.out.println(">> 검색조건에 맞는 성별과 학력의 구직자는 없습니다.!!");
						return; // -------- 메소드 종료하기 -----------
					}
					
				}
				
				// === 조건3 : 성별은 무관이면서 학력이 있을 경우 ===
				else if ("성별무관".equals(gender) && !"학력무관".equals(degree)) {
				
					for(int i=0; i<hopemoneyIndex; i++) {
						String existSchool = hopemoneyJobSeekerArr[i].getDegree();
						
						if(existSchool.equals(degree))
							finalJobSeekerArr[finalIndex++] = hopemoneyJobSeekerArr[i];
					}// end of for------------------------
					
					if(finalIndex == 0) {
						System.out.println(">> 검색조건에 맞는 성별과 학력의 구직자는 없습니다.!!");
						return; // -------- 메소드 종료하기 -----------
					}	
					
				}
				
				// === 조건4 : 성별도 있고 학력도 있을 경우 ===
				else if (!"성별무관".equals(gender) && !"학력무관".equals(degree)) {
					for(int i=0; i<hopemoneyIndex; i++) {
						String existGender = hopemoneyJobSeekerArr[i].getGender();
						String existSchool = hopemoneyJobSeekerArr[i].getGender();
						
						if(existGender.equals(gender) && existSchool.equals(degree))
							finalJobSeekerArr[finalIndex++] = hopemoneyJobSeekerArr[i];
						
					}// end of for------------------------
					
					if(finalIndex == 0) {
						System.out.println(">> 검색조건에 맞는 성별과 학력의 구직자는 없습니다.!!");
						return; // -------- 메소드 종료하기 -----------
					}	
				}
				
				System.out.println(">> === 최종검색결과 === <<");
				
				if (finalJobSeekerArr != null && finalJobSeekerArr.length > 0) {
					for (JobSeeker jobseeker : finalJobSeekerArr) {
						System.out.println(jobseeker.showJobSeeker()+"\n");
					}	
				}
				
			}
			
		} catch (NumberFormatException e) {
			System.out.println(">> 입력값은 숫자만 가능합니다.");
		}
		
	}// end of showSearchGujikja(Scanner sc)----------------------
	
	
	// *** 메뉴번호 10. 특정 구직자 삭제해주는 메소드 생성하기 *** //
	public void deleteJobSeeker(Scanner sc) {
		
		System.out.print(">>> 삭제하려는 사용자 ID => ");
		String userid = sc.nextLine();
		
		if (AbstractCommonCount== 0) {
			System.out.println(">>> 가입된 구직자가 없으므로 삭제불가합니다."); 
		}
		else {
			int flag = 0;
			
			for (int i=0; i<AbstractCommonCount; i++) {
				if(AbstractCommonArr[i] == null) continue;
				if(AbstractCommonArr[i] instanceof JobSeeker && AbstractCommonArr[i].getId().equals(userid)) {
					flag = 1; 
					AbstractCommonArr[i] = null; // 삭제하기
					// gujikjaArr[0] ==> "한석규"
					// gujikjaArr[1] ==> null
					// gujikjaArr[2] ==> "세석규"
					
					// gujikjaArr[3] ==> "네석규" 와 같이 하지 말고
					// gujikjaArr[1] ==> "네석규" 와 같이 하자는 말이다.
					
					break;
				 }
			}// end of for-------------------------
			
			if (flag == 1) {
				System.out.println(">>> 사용자 ID " + userid + "은 삭제 성공하였습니다."); 
			}
			else {
				System.out.println(">>> 사용자 ID " + userid + "은 존재하지 않으므로 삭제하지 못했습니다."); 
			}
		}
		
	}// end of deleteGujikja(Scanner sc)-----------------------
	
	
	// *** 메뉴번호 11. 특정 구직자 데이터변경해주는 메소드 생성하기 *** //
	public void updateJobSeeker(Scanner sc) {
		
		JobSeeker updatejobseeker = null;
		
		System.out.print(">> 변경하려는 구직자 ID : => ");
		String userid = sc.nextLine(); 
		
		int i=0, flag=0;
		
		for (; i<AbstractCommonCount; i++) {
			if ( AbstractCommonArr[i] == null ) 
				continue;
			else {
				if ( AbstractCommonArr[i] instanceof JobSeeker && AbstractCommonArr[i].getId().equals(userid) ) {
					 flag = 1;
					 break;
				}
			}
		}// end of for----------------------
		
		if (flag == 0) {
			System.out.println(">> 변경하려는 사용자 ID " + userid + "은 등록되지 않은 ID 입니다.");
		}
		else {
			((JobSeeker)AbstractCommonArr[i]).showJobSeeker(); // 변경대상의 기존정보를 보여준다.
			
			String passwd="", name="", gender="", address="", school="", mobile="", hopejob="";
			int age=0, hopemoney=0;
			
		    System.out.println("\n==== <변경내용 입력란 시작> ====");
		
			do {
				System.out.print("▷암호 => ");
				passwd = sc.nextLine();
				
				if( MyUtil.passwdCheck(passwd) ) {
					break;
				}
				else {
					System.out.println(">> 암호는 7글자 이상의 영문자,숫자,특수문자가 혼합되어져야만 합니다.!!"); 
				}
				
			} while (true);
		
		
			System.out.print("▷성명 => ");
			name = sc.nextLine();
		
			do {
				try {
					System.out.print("▷나이 => ");
					age = Integer.parseInt(sc.nextLine());
					if(age > 0) {
						break;
					}
					else {  // 입력한 나이가 0 또는 음수로 입력한 경우이라면
						System.out.println(">> 나이는 0보다 커야 합니다.");
						continue;
					}
					
				} catch (NumberFormatException e) {
					System.out.println(">> 나이는 정수만 입력가능합니다.!!");
				}
					
			} while (true);
		
		
		System.out.print("▷성별(1.남 / 2.여) => ");
		gender = "1".equals(sc.nextLine())?"남":"여";
				
		System.out.print("▷주소 : ");
		address = sc.nextLine();
		
		System.out.print("▷학력(1.대졸이상 / 2.초대졸 / 3.고졸 / 4.고졸미만 ) => "); 
		
		switch (sc.nextLine()) {
			case "1":
				school = "대졸이상";
				break;
	
			case "2":
				school = "초대졸";
				break;
				
			case "3":
				school = "고졸";
				break;
				
			case "4":
			default:
				school = "고졸미만";
				break;
		}// end of switch-------------------------
		
		System.out.print("▷휴대폰번호 : ");
		mobile = sc.nextLine();
		
		System.out.print("▷희망직종 : ");
		hopejob = sc.nextLine();
		
		do {
			try {
				System.out.print("▷희망급여 => ");
				hopemoney = Integer.parseInt(sc.nextLine());
				if(hopemoney > 0) {
					break;
				}
				else {  // 희망급여를  0 또는 음수로 입력한 경우이라면
					System.out.println(">> 희망급여는 0보다 커야 합니다.");
					continue;
				}
				
			} catch (NumberFormatException e) {
				System.out.println(">> 희망급여는 정수만 입력가능합니다.!!");
			}
				
		} while (true);
		
		System.out.println("\n==== <변경내용 입력란 끝> ====");
		
		System.out.print("\n>> 위 정보로 변경하시겠습니까?[1.예 / 2.아니오] => "); 

		String yn = sc.nextLine();
		
		if("1".equals(yn)) {
			updatejobseeker = new JobSeeker(userid, passwd, name, age, gender, address, school, mobile, hopejob, hopemoney);
			AbstractCommonArr[i] = updatejobseeker;
			System.out.println(">> 구직자 내용변경 성공!!");
		}
		else {
			System.out.println(">> 구직자 내용변경 취소함!!");
		}
		
	  }// end of if~else-----------------------------	
		
	}// end of updateGujikja(Scanner sc)-----------------------
	
	
	public static void main(String[] args) {
		
		JobApp jobapp = new JobApp();
		Scanner sc = new Scanner(System.in);
		String menuNo = "";
		
		do {
			JobApp.menu();
			
			menuNo = sc.nextLine();
			
			switch (menuNo) {
				case "1":  // 구직자등록 
					jobapp.registerJobSeeker(sc);
					break;
					
				case "2":  // 회사정보등록
					jobapp.registerCompany(sc);
					break;
				
				case "3":  // 구인등록
					jobapp.registerRecruit(sc);
					break;
	
				case "4":  // 모든 구직자정보 출력 
					jobapp.showAllGujikja();
					break;
				
				case "5":  // 모든 구인정보 출력
					jobapp.showAllRecruit();
					break;
	
				case "6":  // 구직자 ID 검색
					jobapp.showGujikaIdSearch(sc);
					break;
				
				case "7":  // 구인회사 ID 검색
					jobapp.showCompanyIdSearch(sc);
					break;
	
				case "8":  // 특정 업종 구인정보 출력 
					jobapp.showSpecialJobtypeRecruit(sc);
					break;
				
				case "9":  // 특정 조건 구직자정보 출력
					jobapp.showSearchJobSeeker(sc);
					break;	
					
				case "10":  // 특정 구직자 삭제하기
					jobapp.deleteJobSeeker(sc);
					break;
					
				case "11":  // 특정 구직자 데이터변경하기
					jobapp.updateJobSeeker(sc);
					break;		
				
				case "12": // 종료
					break;
					
				default:
					System.out.println(">> 존재하지 않는 메뉴번호 입니다. 다시선택하세요!!\n"); 
					break;
			}// end of switch---------------------
			
			
		} while (!("12".equals(menuNo) ));
		
		System.out.println(">>> 안녕히 가세요~~~");
		System.out.println("종료시각 : " + MyUtil.getNowTime());
        sc.close();
        
	}// end of main()----------------------------------

}
