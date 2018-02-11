/*
  	=== 인터페이스(interface)란 ? ===
  	
  	모든 메소드는 추상메소드(미완성 메소드)로 되어있고,
  	모든 멤버변수(속성)들은 상수변수(final 변수)로 되어있는 것.
  	즉, 멤버변수는 상수 값이고, 메소드는 추상 메소드(미완성 메소드)로 구성된다.
  	
  	클래스의 상속은 다중 상속은 불가하지만 인터페이스는 다중 구현은 가능하다.
 
 */

package my.day15;

public interface InterAnimal {
	
	float pi = 3.14159F;
	// 인터페이스에서 선언되어진 변수는 항상 [ public final static ] 이 생략된 변수이다.
	// public final static float pi = 3.14159F; 와 같다.
	
	
	// 동물이 되려면 어떻게 우는지를 구현해야 한다.
	void crySound(); // 미완성메소드(== 추상메서드)
	// 인터페이스에서 메소드를 선언할때는 접근제한자를 생략한다.
	// 접근제한자를 자동적으로 abstract public 이 붙어져 있다.
	// abstract public void crySound(); 와 같다.
	
	// 동물이 되려면 어떤 모습으로 자는지를 구현해 한다.
	void sleep();
	
	// 동물이 되려면 현재 나이를 알려줘야 한다.
	int getAge();
	
	// 동물이 되려면 이동하는 방법을 알려줘야 한다.
	String run();
	
	// 동물이 되려면 등급의 가중치를 문자열("A", "B", "C", "D")를 알려줘야 한다.
	// 각 동물 별로 등급 문자열("ㅆㅅㅌㅊ", "ㅅㅌㅊ", "ㅈㅌㅊ", "ㅎㅌㅊ")로 알려줘야한다.
	String grade(String level);
	
	// 동물이 되려면 동물 자신의 정보를 알려줘야 한다.
	void showInfo();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
