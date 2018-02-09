package my.day13;

public class Child extends Parent {

	
	int age;
	
	public Child() {
		// super(); ==> 자식 클래스의 생성자에는 부모클래스의 기본 생성자 super()가 생략되어져 있다.
		// 				부모클래스의 기본 생성자가 생략되어져 있을뿐 작동은 한다.
		System.out.println("Child 클래스의 기본생성자 호출함");
	}
	
	public Child(int age) {
		System.out.println("Child 클래스의 파라미터 int age가 있는 생성자가 호출함");
		this.age = age;
	}
	
	public Child(String name, int age) {
		// 생성자 내에서 다른 생성자[ super() or this() ]를 호출할 경우 무조건 맨 첫 라인에 기술해야한다.
		super(name);	// 자식 클래스의 생성자 내에서 부모클래스의 생성자를 명시적으로 호출한것.
		System.out.println("Child 클래스의 파라미터 String name, int age가 있는 생성자가 호출함");
		this.age = age;
	}
	
	public static void main(String agrs[]) {
		
		Child child1 = new Child();
		System.out.println("child1.name = " + child1.name);
		System.out.println("child1.age = " + child1.age);
		
		/*
		 	Parent 클래스의 기본 생성자 호출함.
			Child 클래스의 기본생성자 호출함
			child1.name = 부모님
		 */
		
		System.out.println("\n");
		
		Child child2 = new Child(26);
		System.out.println("child2.name = " + child2.name);
		System.out.println("child2.age = " + child2.age);
		
		
		System.out.println("\n");
		
		Child child3 = new Child("배은정", 26);
		System.out.println("child3.name = " + child3.name);
		System.out.println("child3.age = " + child3.age);
		
		
	}
}
