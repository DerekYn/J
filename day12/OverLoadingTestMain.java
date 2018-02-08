package my.day12;

public class OverLoadingTestMain {
 
	public static void main(String[] args) {

		OverLoadingTest obj = new OverLoadingTest();
		 
		obj.setUserid("leess");
		obj.setPasswd("qwer1234$");
		obj.setName("이순신");
		obj.setBirth("1992-04-30");
		obj.setPoint(10);
		
		String birth = obj.getBirth();
		
		System.out.println(obj.getName() + "의 현재 나이 " + obj.getAge(birth) + "세");
		
		System.out.println(obj.getName() + "의 연령대 " + obj.getAge(obj.getAge(birth)) + "세");
	}

}
