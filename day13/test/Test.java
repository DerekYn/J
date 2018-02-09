package my.day13.test;

public class Test {

	public static void main(String[] args) {

		String str = "KH정보교육원 서울교육대학교 신병교육대 ";
		System.out.println(str);
		
		String result = " ";
		
		result = str.replaceAll("교육", "education");
		System.out.println(result);
		
		result = str.replaceFirst("교육", "education");
		System.out.println(result);
		
			
	}

}
