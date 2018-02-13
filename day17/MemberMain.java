package my.day17;

public class MemberMain {

	public static void main(String[] args) {
		
		Member member1 = new Member();
		
		try {
			member1.setId("superman");
			member1.setPw("abcd1234");
		} catch (UserExceptionIDFail e) {
			e.printStackTrace();
		} catch (UserExceptionPWFail e) {
			e.printStackTrace();
		}
		
		System.out.println("member1 의 정보 => ID : " + member1.getId() + ", PW : " + member1.getPw());
		
		System.out.println("===========================================================================\n");
		
		Member member2 = new Member();
		
		try {
			member2.setId("administrator");
			member2.setPw("abcd1234");
		} catch (UserExceptionIDFail e) {
			String errmsg = e.getMessage();
			System.out.println(errmsg);
		} catch (UserExceptionPWFail e) {
			String errmsg = e.getMessage();
			System.out.println(errmsg);
		}
		
		System.out.println("member2 의 정보 => ID : " + member2.getId() + ", PW : " + member2.getPw());
		
		System.out.println("===========================================================================\n");
		
		Member member3 = new Member();
		
		try {
			member3.setId("batman");
			member3.setPw("abcd");
		} catch (UserExceptionIDFail e) {
			String errmsg = e.getMessage();
			System.out.println(errmsg);
		} catch (UserExceptionPWFail e) {
			e.printStackTrace();
		}
		
		System.out.println("member3 의 정보 => ID : " + member3.getId() + ", PW : " + member3.getPw());
		

	}

}
