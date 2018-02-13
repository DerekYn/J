package my.day17;

public class MethodThrows {
	
	String studentNum;
	String name;
	String grade;
	
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
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String point) throws NumberFormatException {

		int score = Integer.parseInt(point);
		
		
		switch (score/10) {
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

}
