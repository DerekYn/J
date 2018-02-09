package my.day13.sub;

import my.day13.Human;

// public class Man extends Human, Parent {
// 		자바에서는 상속받을 클래스는 1개만 가능하다.
//		즉, 2개 이상의 클래스로 부터 상속은 불가하다.
//		인터페이스(Interface)에서는 가능하다.
public class Man extends Human {

	public String enlistDay; 		// 입대일

	
	public Man() { 
		// super(); 생략되어져 있을뿐 작동은한다.
	}
	
	public Man(String name, double height, int weight, String enlistDay) {
		super.name = name;
		super.height = height;
		super.setWeight(weight);
		this.enlistDay = enlistDay;
	}

	public void printEnlistDay() {
		System.out.println(">> 입대일자 : " + enlistDay);
	}
	
	
	// ===== 메소드의 오버라이딩(재정의)
	// 조건이 부모클래스에 존재하는 메소드이어야 한다.
	// 또한 부모클래스에 존재하던 메소드의 내용물을 뺀 나머지(메소드 명, 매개변수)는 똑같이야 한다. {여긴 상관 없음}
	// 단, 접근제한자는 부모클래스의 것과 동일하든지 or 부모클래스의 것 보다는 제한범위가 더 큰쪽으로 해야한다. 
	// Ex.) 부모클래스의 메소드 접근제한자가 public이면 
	// 자식클래스에 오바라이딩하는 메소드의 접근지정자는 오직 public 만 가능할 뿐 protected, default는 불가한다.
	// 반대로 부모클래스의 메소드 접근제한자가 protected이면
	// 자식클래스에 오바라이딩하는 메소드의 접근지정자는 public or protected가 가능하다.  결론 : 자식이 부모보다 같거나 더 큰 권한만 허용된다.
	@Override
	public void showInfo() {
		System.out.println("▷ 1.성 명 : " + name);
		System.out.println("▷ 2.신 장 : " + height + "cm");		
		System.out.println("▷ 3.체 중 : " + getWeight());
		System.out.println("▷4.입영일 : " + enlistDay);
	}
	
	@Override
	public void smile(int num) {

		System.out.println("남자가 " + num + "번 웃습니다.");
		for(int i=0; i<num; i++) {
			System.out.print("하하하 ");
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
		
		String result = "\n>> 1.성 명 : " + name 
						+ "\n2.신 장 : " + height + "cm"
						+ "\n3.체 중 : " + getWeight() + "kg"
						+ "\n4.입대일자 : " + enlistDay;
		
		return result;
	}


}