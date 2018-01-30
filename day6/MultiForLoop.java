package my.day6;

public class MultiForLoop {

	public static void main(String[] args) {
		
		/*
		 	1 2 3 4 5
		 	6 7 8 9 10
		 	11 12 13 14 15
		 	16 17 18 19 20
		 */
		
		for(int i=0; i<20; i++) {
			System.out.print((i+1) + " ");
		}
		System.out.println("\n\n");

		for(int i=0; i<20; i++) {
			String str = ((i+1)%5==0)?"\n":" ";
			System.out.print((i+1) + str);
		}
		System.out.println("\n\n");
		
		
		
		/*
			행, 열 => 행이 바깥 for문, 열이 안쪽 for문
		 	5열		 	
	    4 행  1 2 3 4 5
			6 7 8 9 10
			11 12 13 14 15
			16 17 18 19 20
		 */
		int k1 = 0;
		for(int i=0; i<4; i++) {		// 행
			for(int j=0; j<5; j++) {	// 열
				System.out.print(++k1 + " ");
			}
			System.out.println();
		}
		for(int i=0; i<12; i++) {		// 행
				String str1 = ((i+1)%3==0)?"\n":"";
				System.out.print("#" + str1);
		}
		
		System.out.println("\n\n");
		
		/*
		 	20 19 18 17 16
		 	15 14 13 12 11
		 	10 9 8 7 6
		 	5 4 3 2 1
		 */
		
		int k2 = 20;
		for(int i=0; i<4; i++) {		// 행
			for(int j=0; j<5; j++) {	// 열
				System.out.print(k2-- + " ");
			}
			System.out.println();
		}
		
		/*
	 	1 3 5 7 9
	 	11 13 15 17 19
	 	21 23 25 27 29
		*/
		System.out.println("\n\n");
		
		for(int i=0, m=1; i<15; i++, m+=2) {
			String str2 = ((i+1)%5==0)?"\n":" ";
			System.out.print(m + str2);
		}
		
		int b = 1;
		for(int q=0; q<3; q++) {
			for(int p=0; p<5; p++) {
				System.out.print(b + " ");
				b+=2;
			}
			System.out.println();
		}
					
	}

}
