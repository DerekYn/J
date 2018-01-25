package my.day3.quiz;

public class Student {
	
	String studentNumber;
	String name;
	int koreanScore;
	int englishScore;
	int mathScore;
	
	public Student() {}
	public Student(String studentNumber, String name, int koreanScore,
					int englishScore, int mathScore) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public String getExecute() {
		String result = "*** " + name + "님의 성적결과 ***" +
						"\n1. 학 번 : " + studentNumber +
						"\n2. 이 름 : " + name +
						"\n3. 국 어 : " + koreanScore +
						"\n4. 영 어 : " + englishScore +
						"\n5. 수 학 : " + mathScore +
						"\n6. 총 점 : " + total(koreanScore, englishScore, mathScore) +
						"\n7. 평 균 : " + avg(koreanScore, englishScore, mathScore);
				
		return result;
	}
	/*
	public double avg() {
		return (double)total() / 3;
	}
	public int total() {
		return  koreanScore + englishScore + mathScore;
	}
	*/
	public double avg(int a, int b, int c) {
		return (double)total(a,b,c)/3;
	}
	public double total(int a, int b, int c) {
		return a + b + c;
	}
	
}