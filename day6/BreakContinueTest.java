package my.day6;

public class BreakContinueTest {

	public static void main(String[] args) {
		
		System.out.println("==1. ================");
		
		for(int i=0; i<4; i++) {
			if(i==2) break;	// 가장 가까운 반복문을 벗어난다.
			System.out.println("i = " + i);
		}
		/*
		 	i = 0
			i = 1

		 */
		
		System.out.println("\n\n==2. ================");
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				if(j==2) break; // 가장 가까운 반복문을 벗어난다.
				System.out.print("["+i+", " +j+"]");
			}
			System.out.print("\n");
		}
		/*
		 	[0, 0][0, 1]
			[1, 0][1, 1]
			[2, 0][2, 1]
		 */
		
		System.out.println("\n\n==3. ================");
		/*
		 	레이블명을 outer 라고 하겠습니다.
		 	레이블명 뒤에 : 을 붙이며 반드시 반복문 앞에 써야합니다.
		 */
		outer:
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				if(j==2) break outer; // break 레이블명; 을 하면 레이블명이 붙은 반복문을 빠져나간다.
				System.out.print("["+i+", " +j+"]");
			}
			System.out.print("\n");
		}
		System.out.println("Good bye ~");
		
		// [0, 0][0, 1]
		
		
		System.out.println("\n\n==4. ================");
		String str = "";
		
		for(int i=1; i<=10; i++) {
			str = (i<10)?", ":"";
			System.out.print(i+str);
		}
		System.out.println();
		// 1,2,3,4,5,6,7,8,9,10

		for(int i=1; i<=10; i++) {
			if(i%2 != 0) 	// 홀수라면..
				continue;	// 아래의 명령줄로 내려가지 말고 반복문의 증감식(i++)으로 올라간다.
			str = (i<10)?", ":"";
			System.out.print(i+str);
		}
		//2, 4, 6, 8, 10
		
		System.out.println("\n\n");
		
		// 1부터 10까지의 누적의 합
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum += (i+1);
		}
		System.out.println("1부터 10까지 누적의 합은 => " + sum);
		
		sum = 0;
		for(int i=0; i<10; i++) {
			if((i+1)==5 || (i+1)==7) continue;
			sum += (i+1);
		}
		System.out.println("5와 7을 제외한 1부터 10까지 누적의 합은 => " + sum);
		
		System.out.println("------------------------------------\n\n\n");
		
		for(int i=3; i>0; i--) {
			for(int j=0; j<5; j++) {
				if(j+1==4) continue;
				String tab = (j+1==5)?"\n":"\t";
				System.out.print(i+"0"+(j+1)+"호"+tab);
			}
		}
		System.out.println("\n\n");
		
		outer: // 바깥 for문에 영향을 준다.
		for(int i=5; i>0; i--) {
			for(int j=0; j<5; j++) {
				if(i==4) continue outer;
				if(j+1==4) continue;
				String tab = (j+1==5)?"\n":"\t";
				System.out.print(i+"0"+(j+1)+"호"+tab);
			}
		}
		
	}	// end of main()

}		// end of BreakContinueTest()
