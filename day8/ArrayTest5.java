package my.day8;

public class ArrayTest5 {
	
	public static void main(String[] args) {
		Student[] studentArr = {new Student("kh0001","송강호",91,92,93)
							   ,new Student("kh0002","최민식",71,86,92)
							   ,new Student("kh0003","김명민",50,60,40)
							   ,new Student("kh0004","마동석",78,89,99)
							   ,new Student("kh0005","설경구",20,15,37)
							   ,new Student("kh0006","하정우",99,88,94)};
		
		Student.failStudent(studentArr);
		
		System.out.println("\n================================================\n");
		
		Student[] afterStudentArr = Student.veryGoodStudent(studentArr);
		
		for(int i=0; i<afterStudentArr.length; i++) {
			afterStudentArr[i].showInfo();
		}
		
	}// end of main()--------------------------------------------------------

}
