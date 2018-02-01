/*
 	=== 2차원 배열 ===
 	
 	
 */

package my.day8;

public class ArrayTest4 {

	public static void main(String[] args) {

		int[][] score = new int[4][3]; // 입력 값 없을 시 0으로 자동 초기화
		
		score[0][0] = 10;
		score[0][1] = 20;
		score[0][2]	= 30;
		
		score[1][0] = 40;
		score[1][1] = 50;
		// score[1][2]	= 60; // 입력 값 없을 시 0으로 자동 초기화

		score[2][0] = 70;
		score[2][1] = 80;
		score[2][2]	= 90;
		
		score[3][0] = 100;
		score[3][1] = 110;
		score[3][2]	= 120;

		System.out.println("score.length => " + score.length); // 행의 수 출력

		System.out.println("score[0].length => " + + score[0].length); // 열의 수 출력
		
		System.out.println("score[1].length => " + + score[1].length); // 열의 수 출력
		
		System.out.println("\n-------------------------------------------\n");
		
		for(int j=0; j<score[0].length; j++) {
			String comma = (j<score[0].length-1)?", ":"\n";
			System.out.print(score[0][j] + comma);
		}
		
		for(int j=0; j<score[1].length; j++) {
			String comma = (j<score[1].length-1)?", ":"\n";
			System.out.print(score[1][j] + comma);
		}
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				String comma = (j<score[i].length-1)?", ":"\n";
				System.out.print(score[i][j] + comma);
			}
		}
		
		System.out.println("\n==========================================\n");
		
		int[][] val = new int[4][];
		
	/*
		val[0][0] = 10;
		val[0][1] = 20;
		val[0][2] = 30;
		
		val[1][0] = 40;
		val[1][1] = 50;
		// val[1][2] = 60;

		val[2][0] = 70;
		val[2][1] = 80;
		val[2][2] = 90;
		
		val[3][0] = 100;
		val[3][1] = 110;
		val[3][2] = 120;
		
	  열에 대한 배열의 크기를 설정하지 않았으므로
	 java.lang.NullPointerException 이 발생한다.
	  아래와 같이 열에 대한 크기를 설정해주어야만 데이터 값(점수)을 입력할 수 있다.

		System.out.println("va.length ==> " + val.length);
		
		Exception in thread "main" java.lang.NullPointerException
	*/		
		val[0] = new int[3];
		val[1] = new int[2];
		val[2] = new int[3];
		val[3] = new int[3];
		
		val[0][0] = 10;
		val[0][1] = 20;
		val[0][2] = 30;
		
		val[1][0] = 40;
		val[1][1] = 50;
		// val[1][2] = 60;	<== 입력이 불가함!!

		val[2][0] = 70;
		val[2][1] = 80;
		val[2][2] = 90;
		
		val[3][0] = 100;
		val[3][1] = 110;
		val[3][2] = 120;
		
		//System.out.println("va.length ==> " + val.length);
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
		
		System.out.println("val.length ==> " + val.length);
		// val.length ==> 4
		
		System.out.println("val[0].length ==>" + val[0].length);
		// val[0].length ==> 3
		
		System.out.println("val[1].length ==>" + val[1].length);
		// val[0].length ==> 2
		
		for(int i=0; i<val.length; i++) {
			for(int j=0; j<val[i].length; j++) {
				String comma = (j<val[i].length-1)?", ":"\n";
				System.out.print(val[i][j] + comma);
			}
		}
		
		System.out.println("\n==========================================\n");
		
		int[][] jumsu = {{10,20,30}
						,{40,50}
						,{60,70,90}
						,{100,110,120}};
		
		System.out.println("jumsu.length ==> " + jumsu.length);
		// val.length ==> 4
		
		System.out.println("jumsu[0].length ==>" + jumsu[0].length);
		// val[0].length ==> 3
		
		System.out.println("jumsu[1].length ==>" + jumsu[1].length);
		// val[0].length ==> 2
		
		System.out.println("\n==========================================\n");
		
		for(int i=0; i<jumsu.length; i++) {
			for(int j=0; j<jumsu[i].length; j++) {
				String comma = (j<jumsu[i].length-1)?", ":"\n";
				System.out.print(jumsu[i][j] + comma);
			}
		}
		
		System.out.println("\n==========================================\n");
		
		String[] strArr = {"윤찬영", "최형준", "정동우", "조성수"};
		
		Student[] studentArr = {new Student("kh0001","송강호",91,92,93)
							   ,new Student("kh0002","최민식",71,86,92)
							   ,new Student("kh0003","설경구",67,88,62)
							   ,new Student("kh0004","하정우",99,88,94)};
		
		for(int i=0; i<studentArr.length; i++) {
			studentArr[i].showInfo();
		}
		
		System.out.println("\n==========================================\n\n");
		
		// Student 배열 studentArr에 저장된 데이터 중 학점이 "A" 인 학생만
		// 아래와 같이 나오도록 하세요.
		/*
		   =================
			 성명	평균 점수	학점
			 송강호    92.0  A
		   =================
		 */
		System.out.println("====================");
		System.out.println("성명\t" + "평균 점수\t" + "학점");
		System.out.println("====================");
		int flag = 0;
		for(int i=0; i<studentArr.length; i++) {
			if("D".equals(studentArr[i].getHakjum())){
				flag = 1;
				System.out.println(studentArr[i].name + "\t" + 
								   studentArr[i].getAvg()  + "\t" + 
								   studentArr[i].getHakjum());
			}// end of if------------------------------------------
		
		}// end of for-------------------------------------------
		if(flag == 0)
			System.out.println("데이터가 없습니다.");
		
		System.out.println("\n==========================================\n");		
		
		
		/*
		 	==== >>> 배열의 복사 <<< ====
		 	
		 	배열은 한번 생성하면 그 크기를 변경할 수 없기 떄문에
		 	더 많은 저장공간이 필요하다면 현재 사용중인 배열보다 더 큰 배열을 새로 만들고
		 	이전 배열로 부터 내용을 복사해야 한다.
		 	배열간의 내용을 복사하려면 for문을 사용하거나, 
		 	System 클래스의 arraycopy() 메소드를 사용하면 된다.
		 	
		 	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
		 	배열의 인덱스 4에서 초과했다는라는 오류메세지 (여유 공간 부족)
		 */
		
		Student[] newstudentArr = new Student[studentArr.length+2];
		
		for(int i=0; i<studentArr.length; i++) {
			newstudentArr[i] = studentArr[i];
		}
		
		newstudentArr[4] = new Student("kh0005","정우성",79,84,97);
		newstudentArr[5] = new Student("kh0006","이병헌",87,73,81);
		
		for(int i=0; i<studentArr.length; i++)
			newstudentArr[i].showInfo();
		
		System.out.println("\n==========================================");
		
		Student[] newstudentArr2 = new Student[10];
		newstudentArr2[0] = new Student("ss001", "전지현", 10,20,30);
		newstudentArr2[1] = new Student("ss002", "김태희", 100,100,100);
		
		int cnt = 0;		
		for(int i=0; i<newstudentArr2.length; i++) {
			if(newstudentArr2[i] != null)
				cnt++;
		}
		System.out.println("cnt ==> " + cnt);
		
		for(int i=0; i<newstudentArr.length; i++) {
			newstudentArr2[cnt+i] = newstudentArr[i];
		}
		
		for(int i=0; i<newstudentArr2.length; i++) {
			if(newstudentArr2[i] != null)
				System.out.println(newstudentArr2[i].name);
		}
		System.out.println("\n==========================================");
		
		System.arraycopy(newstudentArr, 0, newstudentArr2, 0, newstudentArr.length);
		
		for(int i=0; i<newstudentArr2.length; i++) {
			if(newstudentArr2[i] != null)
				System.out.println(newstudentArr2[i].name);
		}
		
		/*
		 	System.arraycopy(src, srcPos, dest, destPos, length);
		 	
		 	==> 배열 src의 내용을 새배열 dest 로 복사하는데,
		 	        복사할 내용은 배열 src의 인덱스 srcPos의 위치부터 시작해서
		 	    length 만큼을 새 배열 dest 의 인덱스 destPos 인 위치에 복사한다.
		 	        이때 복사되어지는 새 배열 dest 의 위치가 적절하지 못하여
		 	        복사하려는 내용(src)보다 여유공간이 적으면
		 	    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException 이 발생
		 	        
		 */
			
	}// end of main-------------------------------------------------------

}// end of ArrayTest4-----------------------------------------------------
