/*
 	1	2	3	4	5	6	....	43	44	45
 	
   | 5 | 10 | 	
 	 --  --   --  --  --  --
 	
 	첫 번째 공 : 5
 	두 번째 공 : 
 	세 번째 공 : 
 	네 번째 공 : 
 	다섯 번째 공 : 
 	여섯 번째 공 : 
 	
 	
 */

package my.day8;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] ball = new int[45];
		int idx = 0;
		int[] temp = new int[5];	// 총 6개를 뽑으므로 총 5번을 비교해주면 된다. 5번을 비교해주는 값을 담을 변수
		String comma = "";
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = i + 1;	// 초기치로 1번공 ~ 45번 공까지 준비함.
		}
		
		for(int i=0; i<temp.length; i++) {
			temp[i] = -1;
			// 공을 꺼내오면 꺼내온 공의 방번호( idx 번호 )를 담아두는 곳으로 사용
			// 꺼내온 공의 방번호( idx 번호 )가 0값이 들어올수 있으므로
			// 초기치는 방번호( idx 번호 )로 사용하지 않는 -1로 모두(5개) 초기화함.
		}
		
		outer:
		for(int i=0; i<6; i++) { // 공을 꺼내는 작업을 6번 반복.
			// int rndnum = rnd.nextInt((max - min + 1) + min);
			idx = rnd.nextInt(44 - 0 + 1) + 0;	// 0 ~ 44 까지의 난수를 발생.
			
			for(int j=0; j<temp.length; j++) {
				if( temp[j] == idx ) { 	// 이미 뽑은 방 번호를 또 뽀았다면
					i--;				// 다시한번 방 번호를 뽑을 기회를
					continue outer;		// 부여한다.
				}
			}//end of 내부 for -------------------------------------------
			comma = (i<5)?", ":"\n";
			System.out.print(ball[idx] + comma);
			
			if(i<5) {
				temp[i] = idx;
				// temp[0] <==  0 (방 번호)
				// temp[1] <==  3 (방 번호)
				// temp[2] <== 10 (방 번호)
				// temp[3] <== 22 (방 번호)
				// temp[4] <==  5 (방 번호)
				
				// 출력은 		1, 4, 11, 23, 6, 7
			}		
		}// end of 외부 for -----------------------------------------------
		System.out.println(">>> 1등 로또 당첨번호 입니다.");
	}

}
