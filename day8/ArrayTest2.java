package my.day8;

import my.Util.MyUtil;

public class ArrayTest2 {
	

	
	public void searchFamillyName(String[] strArr, char firstname) {
		
		int flag = 0;
		
		for(int i=0; i<strArr.length; i++) {
			char ch = strArr[i].charAt(0);
			
			if(ch == firstname) {
				flag = 1;
				System.out.println(strArr[i]);
			}
		}// end of for-----------------------------------------------------------
		if(flag == 0)
			System.out.println("'" + firstname + "'" + "씨는 없습니다.");
	}// end of searchFamillyName----------------------------------------------------
	
	public void searchLastName(String[] strArr, char lastname) {
		
		int flag = 0;
		
		for(int i=0; i<strArr.length; i++) {
			char ch = strArr[i].charAt(strArr[i].length() - 1);
			
			if(ch == lastname) {
				flag = 1;
				System.out.println(strArr[i]);
			}
		}// end of for-----------------------------------------------------
		if(flag == 0) {
			System.out.println("'" + lastname + "'" + "으로 끝나는 이름은 없습니다.");
		}
	}// end of searchLastName-----------------------------------------------------
	
	public void searchName(String[] strArr, char name) {
		
		int flag = 0;
		
		for(int i=0; i<strArr.length; i++) {
			
			char[] chn = strArr[i].toCharArray();
			
			for(char letter : chn) {
				if(letter == name) {
					flag = 1;
					System.out.println(strArr[i]);
					break;
				}
			}

		}// end of for-----------------------------------------------------
		if(flag == 0)
			System.out.println("'" + name + "'" + "이 포함된 이름이 없습니다.");
	}// end of searchName------------------------------------------------------
	
	public void analyzeSring(String passwd) {
		char chrArr[] = passwd.toCharArray();
		
		int big = 0, small = 0, num = 0, special = 0;
		
		for(char ch : chrArr) {
			if('a'<=ch && ch<='z')
				small++;
			else if('A'<=ch && ch<='Z')
				big++;
			else if('0'<=ch && ch<='9')
				num++;
			else
				special++;
		}
		
		String result = "영문대문자 : " + big +
						"\n영어소문자 : " + small +
						"\n숫자 : " + num +
						"\n특수문자 : " + special;
		
		System.out.println(result);
		
	}// end of analyzeSring(String passwd)--------------------------------------------------

	public static void main(String[] args) {
		
		String myfriends[] = {"김두환", "이영", "윤찬영", "김상순", "박건영", "김민찬", "배은정", "최형준", "찬이"};

		System.out.println(myfriends[2]);
		
		System.out.println("\n");
		
		char chrArr[] = myfriends[2].toCharArray();
		
		System.out.println(chrArr[2]);
		
		System.out.println("\n");
		
		for(char ch : chrArr) {
			System.out.println(ch);
		}
		
		String passwd = "qwerA1234$";
		/*
		  영문대문자 : 1
		  영문소문자 : 4
		  숫자		: 4
		  특수문자   : 1
	    */
		
		ArrayTest2 obj = new ArrayTest2();
		
		obj.analyzeSring(passwd);
		
		System.out.println("\n===============================\n");
		
		String passwordArr[] = {"abCD123$!", "superman", "qwer1", "123456789", "asdf0070#", "qwer1234"}; 
	
		for(String pw : passwordArr) {
			if(MyUtil.passwdCheck(pw))
				System.out.println("비밀번호 생성가능!!");
			else
				System.out.println("다른 비밀번호를 입력해주세요.");
		}
		
		/*
		 	암호는 7글자 이상으로서 영문자, 숫자, 특수문자가 혼합되어져야 한다.
		 	배열 passowrdArr 에 저장되어 있는 것 중에서 암호로 사용하는 것만
		 	출력하세요.
		 */
		/*
		 	===  사용가능한 암호 ===
		 	abCD123$!
		 	asdf0070#
		 */
		
		System.out.println("\n===========================\n");
		System.out.println("== String 배열 myfriend 에 저장되어진 데이터 출력 ==");
		
		for(int i=0; i<myfriends.length; i++) {
			String comma = (i < myfriends.length - 1)?", ":"";
			System.out.print(myfriends[i] + comma);
		}
		
		System.out.println("\n===========================\n");
		
		for(int i=0; i<myfriends.length; i++) {
			String comma = (i < myfriends.length - 1)?", ":"";
			System.out.print(myfriends[i].charAt(0) + comma);
		}
		
		System.out.println("\n===========================\n");
		
		for(int i=0; i<myfriends.length; i++) {
			if(myfriends[i].charAt(0) == '김') {
				System.out.println(myfriends[i]);
			}
		}
		
		System.out.println("\n===========================\n");
		
		// 찾고자하는 성씨 출력
		
		obj.searchFamillyName(myfriends, '김');
		
		System.out.println("\n===========================\n");
		
		obj.searchFamillyName(myfriends, '망');
		
		System.out.println("\n===========================\n");
		
		// 찾고자하는 마지막 이름글자 출력
		
		obj.searchLastName(myfriends, '영');
		
		System.out.println("\n===========================\n");
		
		obj.searchLastName(myfriends, '홍');
		
		System.out.println("\n===========================\n");
		
		// 이름 중에 '김'자가 들어있는 사람 출력하기
		
		obj.searchName(myfriends, '찬');
		
		System.out.println("\n===========================\n");
		
		obj.searchName(myfriends, '학');
		
	}// end of main ----------------------------------------------------------


}// end of class ArrayTest2//////////////////////////////////////////////////////////
