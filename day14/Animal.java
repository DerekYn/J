/*
 	==== *** 추상클래스(== 미완성 클래스) *** ====
  	
  	미완성 클래스(== 추상클래스)는 객체로 생성할 수 없는 클래스로서 
  	주로 일반 클래스의 부모 클래스로 사용된다.
  	class 앞에 abstract 라는 키워드를 붙이면 미완성 클래스(== 추상클래스)가 되어진다.
  	
  	미완성 클래스(==추상클래스)는 미완성메소드(==추상메소드)를 가지고 있는 클래스를 말한다.
  	미완성 클래스(==추상케소드)를 두는 이유는 자식클래스에서 메소드의 오버라이딩(==재정의)를 하기 때문이다.
 */


package my.day14;

public abstract class Animal {
	
	protected String name;
	private int age;
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age <= 0) {
			this.age = 1;
		}
		else
			this.age = age;
	}
	
	abstract public void crySound(); // 미완성메소드(== 추상메서드)
	
	abstract public void getBaby(int num);
	
	protected String showInfo() {
		
		String info = age + "살 " + name + "은(는) ";
		
		return info;
	}
	
	abstract public void printInfo2();

}
