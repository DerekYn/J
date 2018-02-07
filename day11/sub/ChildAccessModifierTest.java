package my.day11.sub;

import my.day11.AccessModifierTest;

public class ChildAccessModifierTest extends AccessModifierTest {
	
	public static void main(String[] args) {
		
		ChildAccessModifierTest obj = new ChildAccessModifierTest();
		
		System.out.println("암호 : " + obj.passwd);
		// System.out.println("성명 : " + obj.name);		default : 다른 패키지는 물론 자식 패키지도 쓸수 없다.
		
	}

}
