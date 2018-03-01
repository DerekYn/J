package my.util;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Random;

public class MyUtil {

	// ---  현재시각을 나타내기 --- //
	public static String getNowTime() {
		Date now = new Date();
		String today = String.format("%tF %tT", now, now);
        return today;
	}
	
	// -- 숫자를 입력받아서 세자리 마다 콤마(,)를 찍어서 리턴시켜주는 메소드 생성하기
	public static String getCommaNumber(long num) {
		
		DecimalFormat df = new DecimalFormat("#,###");
		// 숫자로 되어진 데이터를 세자리 마다 콤마(,)를 찍어주는 객체 생성함.
		
		String strnum = df.format(num);
		
		return strnum;
		
	}// end of String getCommaNumber()-------------------
	
	
	// 2개의 숫자를 입력받아서 
	// 그 두개 숫자 사이의 랜덤한 정수를 발생시켜서 돌려주는 메소드 생성하기
	public static int random(int start, int end) {
		
	//  랜덤한 정수 = (int)(Math.random()*구간범위) + 시작값;  
	//	return (int)(Math.random()*(end-start+1)) + start;
		
		Random rnd = new Random();
		return rnd.nextInt(end - start + 1) + start;
		
	}// end of random(int start, int end)-----------------
	
	
	// 암호는 7글자 이상으로서 영문자,숫자,특수문자가 혼합되어져야 한다.
	// 위의 조건에 맞은면 TRUE 를 리턴, 조건에 틀리면 FALSE 를 리턴 시켜주는 
	// 메소드 생성하기
	public static boolean passwdCheck(String passwd) {
		
		boolean result = false;
		
		int len = passwd.length();   // 문자열의 길이를 알려주는 것
		
		if(len >= 7) {
			
			char[] chrArr = passwd.toCharArray();
			
			boolean flagAlphabet = false;
			boolean flagNumber = false;
			boolean flagSpecial = false;
			
			for(char ch : chrArr) {
				
				if('A' <= ch && ch <= 'Z' ||
				   'a' <= ch && ch <= 'z')
					flagAlphabet = true;
				
				else if('0' <= ch && ch <= '9')
					flagNumber = true;
				
				else
					flagSpecial = true;
				
				if(flagAlphabet && flagNumber && flagSpecial)
					break;
				
			}// end of for-----------------------------------
			
			result = flagAlphabet && flagNumber && flagSpecial;
			
		}// end of if(len >= 7) ---------------------
			
		return result;
	}// end of boolean passwdCheck(String passwd)-------------
	
	
	// === 문자열 배열에서 특정 문자열 검색해주는 메소드 생성하기
	// KH정보교육원,
	
	// KH정보교육원,서울교육대학교,훈련교육대,
	// KH정보교육원,서울교육대학교,훈련교육대
	public static String searchWord(String[] strArr, String searchWord) {
		String result = "";
		
		int flag = 0;
		
		for(int i=0; i<strArr.length; i++) {
			
			for(int j=0; j<strArr[i].length()-(searchWord.length()-1); j++) {
				String word = strArr[i].substring(j, j+searchWord.length()); 
				if (searchWord.equals(word)) {
					flag = 1;
					result += strArr[i]+",";
					break;
				}
			}// end of 내부 for-------------------
			
		}// end of 바깥 for------------------------
		
		if (flag == 0) {
			result = "검색하신 \'"+searchWord+"\'는 없습니다.";
		}
		else {
			result = result.substring(0, result.length()-1);	
		}
		
		return result;
	}// end of String searchWord(String[] strArr, String searchWord)------------
	
	
	
	
	
	
	
}
