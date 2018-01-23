// 인스턴스 변수의 초기화 순서
// JVM 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 파라미터가 있는 생성자

public class InitialBlockTest2
{
	String id = "cksdud0830";
	String name = "윤찬영";
	int age = 27;

	// 인스턴스 초기화 블럭
	{
		id = "tigerBro";
		name = "호형님";
		age = 4;
	}

	public InitialBlockTest2() {}
	public InitialBlockTest2(String id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) 
	{
		InitialBlockTest2 obj = new InitialBlockTest2();
		System.out.println("id : " + obj.id + ", name : " + obj.name + ", age : " + obj.age);

		System.out.println("");

		InitialBlockTest2 obj2 = new InitialBlockTest2("IU", "아이유", 27);
		System.out.println("id : " + obj2.id + ", name : " + obj2.name + ", age : " + obj2.age);
	}
}
