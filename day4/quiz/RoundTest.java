package my.day4.quiz;

public class RoundTest {

	public static void main(String[] args) {

		// 반올림에 대해서 알아본다.
		double db1 = 93.45678, db2 = 86.8463;
		System.out.println("db1 = " + db1 + "\ndb2 = " + db2);
		System.out.println("\n === after rounding ===\n");
		System.out.println("db1 = " + Math.round(db1) + "\ndb2 = " + Math.round(db2));
		System.out.println("\n === after rounding at the particular point ===\n");
		System.out.println("db1 = " + Math.round(db1*10)/10.0 + "\ndb2 = " + Math.round(db2*10)/10.0);
		// *10을 해준 뒤 10.0을 해서 .0 자리를 반올림 처리 해준다.
		
		
	}

}
