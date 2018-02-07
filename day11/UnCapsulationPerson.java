/*
  		===== *** 캡슐활(은닉화) *** =====
  		
  		접근지정자		자기자신 클래스 내부	동일 패키지		하위(자식)클래스		그 외의 영역
  		-----------------------------------------------------------------------------------
  		public			  O			   O			 O				O
  		protected		  O			   O			 O				X
  		default			  O			   O			 X				X
  		private			  O			   X			 X				X
 */


package my.day11;

public class UnCapsulationPerson {
	
	String name;
	int age;
	double height;
	
	// *** UnCapsulationPerson 객체의 속성 정보값을 출력해주는 메소드 생성 ***
	public void showInfoPerson() {
		System.out.println("1. 성명 : " + name);
		System.out.println("2. 나이 : " + age);
		System.out.println("3. 신장 : " + height + "cm");
	}

	public boolean chechPositiveNumber(double num) {
		
		if(num <= 0)
			return false;
		else
			return true;
	
	}
}
