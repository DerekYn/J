package my.day13.sub;

import my.day13.Human;

public class Woman extends Human {
	
	public String childBrithDay;	// 출산일
	
	public Woman() {
		// super(); 생략되어져 있을뿐 작동은한다.
	}
	
	public Woman(String name, double height, int weight, String childBrithDay) {
		super(name, height, weight);
		this.childBrithDay = childBrithDay;
	}

	public void printChildBrithDay() {
		System.out.println(">> 출산 예정 일자 : " + childBrithDay);
	}
	
	@Override
	public void smile(int num) {

		System.out.println("여자가 " + num + "번 웃습니다.");
		for(int i=0; i<num; i++) {
			System.out.print("호호호 ");
		}
		 System.out.println();
	}
	
	/*
 	*** 상속(Inheritance)에 대해 알아본다. ***
 	
 	모든 클래스의 조상클래스는 Object 클래스이다.
 	Object 클래스에는 public String toString() 메소드가 있다.
 	그래서 우리가 생성하는 클래스는 그 뿌리가 Object 클래스이므로
 	toString() 메소드를 오버라이딩(재정의)를 할 수 있다.
 */
	@Override
	public String toString() {
		
		return "나는 여자입니다.";
		
		  
	}
	
	public void printInfo() {
		System.out.println("▷ 1.성 명 : " + name);
		System.out.println("▷ 2.신 장 : " + height + "cm");		
		System.out.println("▷ 3.체 중 : " + getWeight());
		System.out.println("▷ 4.출산일 : " + childBrithDay);
	}
	
	@Override
	public void showInfo() {
		System.out.println("▷ 1.성 명 : " + name);
		System.out.println("▷ 2.신 장 : " + height + "cm");		
		System.out.println("▷ 3.체 중 : " + getWeight());
		System.out.println("▷ 4.출산일 : " + childBrithDay);
	}
	
	
}
