package my.day16;

import java.util.Scanner;

public class Student implements Inter1, Inter2, Inter3 {

	private String studentNum;
	private String name;
	private int point;
	private String grade;
	private String comment;
	
	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		if(point < 0) 
			this.point = 0;
		else 
			this.point = point;
		
		switch (this.point/10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
	}

	public String getgrade() {
		return grade;
	}

	public String getComment() {
		return comment;
	}

	
	
	@Override
	public Student search(String studentNum) {
		
		Student student = null;
		
		if(studentNum != null && studentNum.equals(this.studentNum))
			student = this;	// 자기의 객체를 넘긴다.(Student)
				
		return student;
	}

	@Override
	public void comment(String studentNum, Scanner sc) {

		Student student = search(studentNum);
		
		if(student != null) {
			System.out.println(">> 성명 : " + student.name + ", 점수 : " + student.point);
			System.out.println(">> 코멘트를 입력하세요(입력종료를 하려면 엔터 후 exit 를 입력하세요) <<");
			
			StringBuilder sb = new StringBuilder();
			String str = " ";
			
			do {
				str = sc.nextLine();
				if("exit".equals(str))
					break;
				else
					sb.append(str + "\n");				
				
			} while (true);
			
			this.comment = sb.toString();
		}
		else
			System.out.println(">> 존재하지 않는 학생입니다. 코멘트 입력을 수행할 수 없습니다.");
		
	}

	@Override
	public void printInfo() {
		
		System.out.println("1. 학번 : " + studentNum);
		System.out.println("2. 성명 : " + name);
		System.out.println("3. 점수 : " + point);
		System.out.println("4. 학점 : " + grade);
		System.out.println("5. 코멘트 => ");
		System.out.println(comment);
		
		
	}	// 상속은 다중 상속이 안되지만, 인터페이스는 다중 구현이 된다.
	
	
	

}
