package my.day5;

import java.util.Scanner;

public class Student {
	
	Scanner sc = new Scanner(System.in);
	
	String studentNumber;
	String name;
	int koreanScore;
	int englishScore;
	int mathScore;
	
	public Student() { // 보통의 기본 생성자는 기본 생성자인 채로 유지한다.
		
	}
	
	public void setInfo(){
		System.out.println("== 학생정보를 입력하세요 ==");
		System.out.print("학번 : ");
		studentNumber = sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("국어 : ");
		koreanScore = Integer.parseInt(sc.nextLine());
		System.out.print("영어 : ");
		englishScore = Integer.parseInt(sc.nextLine());
		System.out.print("수학 : ");
		mathScore = Integer.parseInt(sc.nextLine());
	}
	
	public String getExecute() {
		String result = "*** " + name + "님의 성적결과 ***" +
						"\n1. 학 번 : " + studentNumber +
						"\n2. 이 름 : " + name +
						"\n3. 국 어 : " + koreanScore +
						"\n4. 영 어 : " + englishScore +
						"\n5. 수 학 : " + mathScore +
						"\n6. 총 점 : " + getTotal() +
						"\n7. 평 균 : " + getAvg() +
						"\n8. 등 급 : " + getGrade() +
						"\n9. 선 물 : " + getGift();
				
		return result;
	}
	/*
	 	switch (변수 또는 수식) { // 변수 또는 수식이 조건에 해당됨
	 						 // 변수 또는 수식의 타입은
	 						 // byte, short, char, int 형이어야한다.
	 						 // long, float, double 형은 불가한다.
	 						 // JK 1.7(= JDK 7.0) 이후 부터는 String 타입도 허용한다.
	 	case :
	 		break;
	 	default :
	 		break;
	 	}
	 */
	public char getGrade() {
		char grade = 0;
		switch ((int)getAvg()/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		return grade;
	}
	public String getGift() {
		String gift = "";
		switch (getGrade()) {
		case 'A':
			gift += "놀이공원이용권, ";
		case 'B':
			gift += "뷔페식사권, ";
		case 'C':
			gift += "치킨, ";
		case 'D':
			gift += "아이스크림";
			break;
		default:
			gift = "핵꿀밤";
			break;
		}
		return gift;
	}
	
	public double getAvg() {
		return Math.round((getTotal() / 3)*10)/10.0;
	}
	public int getTotal() {
		return  koreanScore + englishScore + mathScore;
	}

}