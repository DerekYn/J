package my.day3.quiz;

public class StudentMain {

	public static void main(String[] args) {
		Student st1 = new Student("Kor21151071", "윤찬영", 100, 90, 300);
		Student st2 = new Student("Can21584893", "Derek", 20, 400, 150);
		
		System.out.println(st1.getExecute());
		System.out.println("");
		System.out.println(st2.getExecute());
	}

}
