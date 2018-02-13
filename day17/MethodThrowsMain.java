package my.day17;

public class MethodThrowsMain {

	public static void main(String[] args) {
		
		MethodThrows student = new MethodThrows();
		
		student.setStudentNum("kh0002");
		student.setName("한석규");
		
		try {
			student.setGrade("83");
		} catch (NumberFormatException e) {
			System.out.println(">> 숫자로 되어진 문자열만 입력이 가능합니다.");
		}
		
		System.out.println("1. 학번 : " + student.getStudentNum());
		System.out.println("2. 성명 : " + student.getName());
		System.out.println("3. 학점 : " + student.getGrade());
		
	}

}
