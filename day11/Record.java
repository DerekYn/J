package my.day11;

public class Record {

	private Student student; // 학생
	private int kor = -1;	 // 국어
	private int eng = -1;	 // 영어
	private int mat = -1;	 // 수학
	private int total;		 // 총점
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		if (kor < 0 || kor > 100) {
			System.out.println(">> 점수는 0점 이상 100점 이하이어야 합니다. ");
		}
		else 
			this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		if (eng < 0 || eng > 100) {
			System.out.println(">> 점수는 0점 이상 100점 이하이어야 합니다. ");
		}
		else 
			this.eng = eng;
	}
	
	public int getMat() {
		return mat;
	}
	
	public void setMat(int mat) {
		if (mat < 0 || mat > 100) {
			System.out.println(">> 점수는 0점 이상 100점 이하이어야 합니다. ");
		}
		else 
			this.mat = mat;
	}
	
	public int getTotal() {
		return kor+eng+mat;
	}
	
	public double getAvg() {
		return Math.round( ((double)getTotal()/3) * 10)/10.0;
	}
	
	public String getGrade() {
		
		String grade = "";
		
		double avg = getAvg();
		
		int intAvg = (int)avg/10;
		
		switch (intAvg) {
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
		}// end of switch------------------
		
		return grade;
	}
	
	
}
