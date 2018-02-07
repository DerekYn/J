package my.day11.sub;

import my.day11.AccessModifierTest;

public class AccessModifierTestMain2 {
	
	public static void main(String[] args) {
		
		AccessModifierTest obj = new AccessModifierTest();
		
		System.out.println("사용자 ID : " + obj.userid);
		// System.out.println("암호 : " + obj.passwd);	protected : 다른 패키지의 것은 쓸 수 없다.

	}

}
