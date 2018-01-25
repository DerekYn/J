/*
	=== *** data type *** ===
	
	※ kind of data types
	1. primitive types
	  1.1 Integer(byte, short, int, long)
	     -- byte(8bit == 1byte) : -2^7 ~ 2^7 -1
	     						  -128 ~ 127
	     						  
	     -- short(16bit == 2byte) : -2^15 ~ 2^15 -1
	     							-32,768 ~ 32,767
	     							
	     -- int(32bit == 4byte) : -2^31 ~ 2^31 -1
	     	★ basic form			  -2,147,483,648 ~ 2,147,483,647
 
 		 -- long(64bit == 8nyte) : -2^63 ~ 2^63 -1
 		 						   -9,223,372,036,854,775,808 ~ 9223372036854775807
 		 						   
 	  1.2 real number(float, double)
 	     -- float : 4byte 단정밀도. 소수점 이하 7자리까지 표현
 	     -- double : 8byte 배정밀도. 소수점 이하 15~16자리까지 표현
 	    자바에서 실수의 기본타입은 double이다.
 	    
 	  1.3 character(char)
 	  	 -- char : 자바는 유니코드 체계를 사용하므로
 	  	 		      문자형 타입인 char은 2byte이며, 범위는 0 ~ 65535이다.
 	  	 		      
 	  UNICODE 표 참조
 	  http://www.tamasoft.co.jp/en/general-info/unicode.html
 	  
 	  1.4 true or false => boolean
 	  	 -- boolean 타입은 true, false 를 가진다.
 	  	    자바의 논리형인 boolean은 1, 0으로 호환되지 않으며 형변환도 할 수 없다.
 	  
 */

package my.day3;

public class PrimitiveType {

	public static void main(String[] args) {
		byte bt1 = 10;	// byte -128 ~ 127
	//	byte bt2 = 200; // 표현 가능 범위를 초과
		
		int it1 = 50000000;
	//	int it2 = 10000000000000;
		
		long ln1 = 2000000000000000000L;
	//	long ln2 = 2000000000000000000000000000000000L;
		
		int a = 9;	// 10진수(0~9)
		System.out.println("10진수 9 => " + a);
		
		a = 011;	// 8진수 => 정수 맨앞에 접두사로 숫자 0을 붙이면 8진수
		System.out.println("8진수 011 => " + a);
		
		a = 0x11;	// 16진수 => 정수 맨앞에 접두사로 숫자 0x를 붙이면 16진수로 인식한다.
		System.out.println("16진수 0x11 => " + a);
		
		
		System.out.println("========== printf ==========");
		int b = 30;
		System.out.printf("10진수 %d, 8진수 %o, 16진수 %x", b, b, b);
		
		System.out.println("============================");
		
		a = 5;
		b = 2;
		
		System.out.println("a / b = " + (a/b));
		// 정수 / 정수 = 몫(정수)
		
		double c = 5.0;
		System.out.println("c / b = " + (c/b));
		// 정수 / 실수 = 실수
		// 실수 / 정수 = 실수
		// 실수 / 실수 = 실수
		
		System.out.println("a%b="+(a%b));
		// 정수1 % 정수2 => 나머지 값
		
		System.out.println("========== Real number ==========");
		
		float ft1 = 32.1234F;
		System.out.println("ft1 = " + ft1);
		// 자바는 실수의 기본 타입이 double이므로 float은 F를 붙여줘야 한다.
		
		double db1 = 32.43423;
		System.out.println("db1 = " + db1);
		
		System.out.println("============================");
		
		char ch = '\u0041';
		System.out.println("ch = " + ch);
		
		ch = '\u263A';
		System.out.println("ch = " + ch);
		
		ch = '\uC724';
		System.out.println("ch = " + ch);
		
		System.out.println("============================");
		
		ch = 'A';
		System.out.println("ch = " + ch);
		
		ch = '☺';
		System.out.println("ch = " + ch);
		
		ch = 65;
		System.out.println("ch = " + ch);
		
		/*
		 	=== 기억 합시다 ===
		 	int 4byte 아래의 크기인
		 	byte(1byte), short(2byte), char(2byte) 타입이
		 	사칙연산(+, -, *, /)를 만나면 자동적으로 int타입으로 자동형 변환된다.
		 */
		
		System.out.println("=========== 퀴즈 ===========");
		System.out.println("A = " + ('A' + 0));
		
		System.out.println("(char)65 = " + (char)65);
		
		System.out.println("=========== boolean ===========");
		boolean bool = false;
		System.out.println("bool = " + bool);
		
		bool = 5 > 2;
		System.out.println("bool = " + bool);
		
		bool = (2.0 == 5/2);
		System.out.println("bool = " + bool);
		
		bool = ('A' == 65);
		System.out.println("bool = " + bool);
		
		bool = ('A' == 'B'-1);
		System.out.println("bool = " + bool);
		
		bool = ('a' != 97);
		System.out.println("bool = " + bool);
	}

}
