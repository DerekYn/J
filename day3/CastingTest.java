/*
 	=== transport date types ===
 	1. 묵시적 형변환(자동 형변환)
 		--> 크기가 작은 것에서 크기가 큰 것으로는 자동적으로 형변환이 일어난다.
 	2. 강제적 형변환(Casting)
 		--> 크기가 큰 것에서 작은 것으로는 자동적으로 형변환이 불가능하므로,
 			크기가 큰 데이터 타입을 크기가 작은 데이터 타입으로 강제적으로 타입을 변환.
 			이때 사용하는것이 () 라는 casting 연산자이다.
 			
 				=========================================================> 자동형 변환 O
 			byte  -->  short  -->  int  -->  long  -->  float  --> double
 		  (1byte)     (2byte)    (4byte)    (8byte)    (4byte)     (8byte)
 		  
 					    char
 					  (2byte)
 자동형 변환 X		<=========================================================
 */

package my.day3;

public class CastingTest {

	public static void main(String[] args) {
		byte bt1 = 10;
		int a1 = bt1;
		
		int a2 = 30;
		byte bt2 = (byte)a2;
		
		long ln1 = 9245615484L;
		float ft1 = ln1;
		
		float ft2 = 12.3F;
		long ln2 = (long)ft2;
		
		System.out.println("ln2 : " + ln2);
		
		double db1 = 123.456789;
		System.out.println("db1 : " + db1 + ", (int)db1: " + (int)db1);	// 강제형변환시 저장 공간에 4바이트? 8바이트? 뭘로 저장?
		
		
	}

}
