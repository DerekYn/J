package my.day4.quiz;

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
						"\n8. 등 급 : " + getGrade();
				
		return result;
	}
	public char getGrade() {
		if(90<=getAvg()) {
			return 'A';
		}
		else if(80<=getAvg()) {
			return 'B';
		}
		else if(70<=getAvg()) {
			return 'B';
		}
		else
			return 'c';	
	}
	public double getAvg() {
		//Math.round(a*10)/10.0		첫 째자리 까지 소수 출력
		return Math.round(((double)getTotal() / 3)*10)/10.0;
	}
	public int getTotal() {
		return  koreanScore + englishScore + mathScore;
	}

}