/*
 	*** 상속(Inheritance)에 대해서 알아본다 ***
 	
 	상속은 어떤 클래스를 생성할때 추상화 되어진 결과물(멤버변수, 메소드)들이 공통적으로 가진다면 
 	즉, 교집합이 있다면 이것들(공통적인 멤버변수, 공통적인 메소드)만 빼내서 새로운 클래스(교집합, 부모클래스)를
 	만들어서 관리하는 것이 유지보수 측면에서 좋다.
 	왜냐하면, 부모클래스에서 1번만 수정을 하면 자식클래스들에게 모두 적용되기 때문이다. 	
 */

package my.day13;

public class Human {
	
	protected String name;
	protected double height;
	private int weight;	// 같은 클래스에서는 쓸 수 있는 private
	
	public Human() {
		System.out.println(">> Human의 기본생성자 호출을 했군요.");
	}
	
	public Human(String name, double height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	protected void showInfo() {
		System.out.print("1.성 명 : " + name + "님 , 2. 신 장 : " + height +"cm, ");		
		System.out.println("3.체 중 : " + weight);
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if(weight > 0)
			this.weight = weight;
	}
	
	 public void smile(int num) {
		 System.out.println("사람이 " + num + "번 웃습니다.");
	 }
	
}
