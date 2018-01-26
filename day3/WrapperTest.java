/*
 	=== Wrapper class ===
 	
 	--------------------------------------------------
 			기본자료형(원시형)			클래스형
 	--------------------------------------------------
 				byte				Byte
 				short				Short
 				char				Charater
 				int					Integer
 				long				Long
 				float				Float
 				double				Double
 				boolean				Boolean
 	--------------------------------------------------
 	 기본자료형(원시형)은 데이터 저장 및 단순히 4칙 연산에만 사용하는 것이고,
 	 클래스형은 데이터 저장 및 4칙연산 뿐 아니라,
 	 아주 다양한 기능의 메소드가 있어 다양한 방법으로 사용된다.			

 		=== !!! 반드시 꼭 기억합시다. !!! ===
 		웹사이트에서 입력되어지는 모든 데이터는 그 타입이 무조건!!!!!
 		   String(문자열) 타입이다.
 		로그인시 아이디 입력란 : superman ==> String(문자열)
 		회원 가입 시 나이 입력란 : 25		  ==> String(문자열)	
 		배송일자 입력란 : 2018-01-25	  ==> String(문자열)
 		
 		그런데 웹사이트에서 숫자 모양을 표현하는 문자열을 받아서 4칙연산을 하고자 할때
 		예)	25 + 1 = 26		"25" + 1 = 251
 			25 - 1 = 24		"25" - 1 = error
 			
 		해결책) 문자여로 되어진 "25"을 숫자로(int) 형태로 바꾸어 주어야 한다.
 */

package my.day3;

public class WrapperTest {

	public static void main(String[] args) {
		
		char ch = 'a';
		System.out.println("ch : " + ch + "\n");
		
		Character chr = 'a';
		System.out.println("ch : " + chr + "\n");
		
		if(Character.isLowerCase(ch)) {
			System.out.println("소문자");
		}
		else if(Character.isUpperCase(ch)) {
			System.out.println("대문자");
		}
		else if(Character.isDigit(ch)) {
			System.out.println("숫자");
		}
		else {
			System.out.println("특수문자");
		}
		
		System.out.println("======================");
		
		String age = "25";
		int n = 1;
		
		System.out.println("age + n => " + (age + n));
		// 문자열 결합	age + n => 251
		
		System.out.println("age + n => " + (Integer.parseInt(age) + n));
		
		System.out.println("age + n => " + (Byte.parseByte(age) + n));
		
		System.out.println("age + n => " + (Short.parseShort(age) + n));
		
		System.out.println("age + n => " + (Long.parseLong(age) + n));
		
		String su = "367.564564";
		System.out.println("age + n => " + Math.round((Double.parseDouble(su) + 10)*10)/10.0);
		
		// === 숫자(정수)로 되어진 데이터를 문자열로 변경해 봅시다. ===
		int score = 98;
		String str_score = Integer.toString(score);
		System.out.println("str_score + 1 => " + (str_score + 1));
		
		str_score = String.valueOf(score);
		System.out.println("str_score + 1 => " + (str_score + 1));

	}

}
