public class MyConstructorTest2 
{
	String id;
	String pwd;
	String name;
	int age;
	
	// 기본 생성자는 파라미터가 있는 생성자가 없으면 자동으로 생성되지만,
	// 파라미터가 있는 생성자가 있으면 반드시 아래와 같이 기본 생성자를 만들어 주어야 한다.
	public MyConstructorTest2() {}
	
	// 파라미터가 있는 생성자
	public MyConstructorTest2(String id, String pwd, String name, int age)
	{ 
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) 
	{
		MyConstructorTest2 myobj1 = new MyConstructorTest2();
		myobj1.id = "정보보안";
		myobj1.pwd = "qwer1234";
		myobj1.name = "정보계장";
		myobj1.age = 44;

		System.out.println("myobj1.id = " + myobj1.id);
		System.out.println("myobj1.pwd = " + myobj1.pwd);
		System.out.println("myobj1.name = " + myobj1.name);
		System.out.println("myobj1.age = " + myobj1.age);

		System.out.println("=================================");

		MyConstructorTest2 myobj2 = new MyConstructorTest2("평양냉면", "12341234", "김전쟁", 35);

		System.out.println("myobj2.id = " + myobj2.id);
		System.out.println("myobj2.pwd = " + myobj2.pwd);
		System.out.println("myobj2.name = " + myobj2.name);
		System.out.println("myobj2.age = " + myobj2.age);

		System.out.println("=================================");
	}
}
