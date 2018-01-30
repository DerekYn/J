package my.day7;

/*
 	=== while 문 형식 ===
 	
 	변수의 초기화;
 	
 	while(조건식) {
 		조건식이 참(true)이라면 반복해서 실행할 명령문 계속해서 실행하고,
 		조건식이 거짓(false)이라면 {  } 이 부분을 빠져나간다.
 		
 		반복해서 실행할 명령문;
 		증감식;
 	}
*/

public class WhileTest {

	public static void main(String[] args) {
		
		int i = 0;
		while(i < 5) {
			System.out.println((i + 1) + ". Hello~~");
			i++;
		}
		
		System.out.println("");
		
		i = 0;
		while(i++ < 5) {
			System.out.println(i + ". Hola~~");
		}
		
		System.out.println("\n === 3단 ===");
		
		i = 0;
		while(i++<9) {
			System.out.println("3 * " + i + " = " + 3 * i);
		}
		
		System.out.println("\n\n");
		
		i = 0;
		while(i++<9) {
			if(i%2 != 0) continue;
			System.out.println("3 * " + i + " = " + 3 * i);		
		}
		
		System.out.println("\n\n");
		
		i = 0;
		while(i++<9) {
			if(i==6) break;
			System.out.println("3 * " + i + " = " + 3 * i);	
		}
		
		System.out.println("\n === 구구단 ===");
		// 구구단은 9행 8열이다.
		int row = 1, col = 2;
		while(row <= 9) {
			while(col <= 9) {
				String tab = (col==9)?"\n":"\t";
				System.out.print(col +"*"+row +"="+(col*row)+tab);
				col++;
			}
			col=2;
			row++;
		}
		
		System.out.println("\n === 구구단(3단과 7단 제외) ===");
		
		row = 1;
		col = 2;
		while(row <= 9) {
			while(col <= 9) {
				
				if(col != 3 && col != 7) {
					String tab = (col==9)?"\n":"\t";
					System.out.print(col +"*"+row +"="+(col*row)+tab);
				}
				col++;
			}
			col=2;
			row++;
		}
		
		System.out.println("\n\n");
		
		int floor = 5, no = 1;
		
		while(!(floor<1)) {
			while(!(no>5)) {
				String tab = (no==5)?"\n":"\t";
				if(floor!=4 && no!=4)
					System.out.print(floor+"0"+no+"호"+tab);
				no++;
			}		
			no=1;
			floor--;
		}
		
		
	} // end of main ---------------------------------------------------------------

} // end of WhileTest --------------------------------------------------------------