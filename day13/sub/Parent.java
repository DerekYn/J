package my.day13.sub;

public class Parent {
	
	String name;
	
	public Parent() {
		System.out.println("Parent 클래스의 기본 생성자 호출함.");
		name = "부모님";
	}

	public Parent(String name) {
		System.out.println("Parent 클래스의 파라미터가 있는 생성자 호출함.");
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		Parent pt1 = new Parent();
		System.out.println("pt1.name = " + pt1.name);
		/*
		 Parent 클래스의 기본 생성자 호출함.
			pt1.name = 부모님
		 */
		
		System.out.println();
		
		Parent pt2 = new Parent("윤찬영");
		System.out.println("pt2.name = " + pt2.name);
		/*
		  Parent 클래스의 파라미터가 있는 생성자 호출함.
			pt2.name = 윤찬영
		 */
		

	}

}
