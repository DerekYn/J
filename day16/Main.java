package my.day16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student[] studentArr = new Student[3];
		
		studentArr[0] = new Student();
		studentArr[1] = new Student();
		studentArr[2] = new Student();

		studentArr[0].setStudentNum("kh0002");
		studentArr[0].setName("한석규");
		studentArr[0].setPoint(95);
		
		studentArr[1].setStudentNum("kh0002");
		studentArr[1].setName("두석규");
		studentArr[1].setPoint(76);
		
		studentArr[2].setStudentNum("kh0002");
		studentArr[2].setName("세석규");
		studentArr[2].setPoint(87);
		
		Scanner sc = new Scanner(System.in);
		
		for(Student st : studentArr) {
			st.comment(st.getStudentNum(), sc);
		}
		
		for(Student st : studentArr) {
			st.printInfo();			
		}
		
	}

}
