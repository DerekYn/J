public class InitialBlockTest
{
	String id;
	String pwd;
	String name;
	
	/* == 클래스 초기화 블럭 ==
		클래스 초기화 블럭은 해당 클래스가 메모리에 처음 로딩되어질 때
		딱 1번만 실행시켜주는 것이다.
	*/
	static {
		System.out.println("클래스 InitialBlockTest의 객체 생성 완료!! from.클래스 초기화 블럭");
	}
	/* == 인스턴스 초기화 블럭 ==
		모든 생성자에서 공통적으로 수행되어야 할 코드가 있는 경우,
		각각의 생성자마다 중복되게 만들지(코딩) 말고,
		인스턴스 초기화 블럭에 1번만 만들면(코딩) 하면 된다.
		생성자 보다 인스턴스 초기화 블록이 먼저 수행된다는 점을 기억!!
		And 인스턴스 초기화 블록은 객체가 생성되어질때마다 매번 실행된다.
	*/
	{
		System.out.println("클래스 InitialBlockTest의 객체 생성 완료!! from.인스턴스 초기화 블럭");
	}

	public InitialBlockTest() 
	{ 
		//System.out.println("클래스 InitialBlockTest의 객체 생성 완료!!");
		System.out.println("기본 생성자 생성 완료!!");
	}
	public InitialBlockTest(String id, String pwd, String name)
	{
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		//System.out.println("클래스 InitialBlockTest의 객체 생성 완료!!");
		System.out.println("파라미터가 있는 생성자 생성 완료!!");
	}

	public static void main(String[] args) 
	{
		/*
		InitialBlockTest obj1 = new InitialBlockTest();
		obj1.id = "Onami";
		obj1.pwd = "1234";
		obj1.name = "오나미";

		InitialBlockTest obj2 = new InitialBlockTest("hangu", "qwer", "곽한구");
		*/
	
		System.out.println("헤헤헤");
	}
}
