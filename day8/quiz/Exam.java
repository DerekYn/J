package my.day8.quiz;

public class Exam {

	public static void main(String[] args) {
		int[][] array = {{98,78,67,84}, 
						 {88,67,58,93},
						 {83,77,68,92},
						 {90,61,48,88}};
		
		int total = 0;
		double avg = 0.0;
		
		for(int i=0; i<array.length; i++) {			
			for(int j=0; j<array[i].length; j++)
				total += array[i][j];
		}
		avg = (double)total / (array.length * array[0].length);
		
		System.out.println("합계는 : " + total);
		System.out.println("평균은 : " + (Math.round(avg*1000)/1000.0));

	}

}
