
/*
	== 변수의 종류 ==

	1. 멤버변수 (member 변수) -->
		1.1 클래스 변수(== static 변수)
		1.2 인스턴스 변수(instance 변수)
	  --- 멤버변수가 사용되어지는 범위는 해당 클래스 내에서 어디서나 사용가능하다.
		  멤버변수가 선언되어 지는 위치는 일반적으로 해당 클래스명 바로 아래 선언된다.
	  --- 변수 선언 후 값을 부여(초기화)하지 않더라도 자동적으로 JVM이 기본값을 부여한다.
		  정수형은 0, 실수형은 0.0, 문자형은 ' ', 객체형은 NULL(존재하지 않는것[0이 아니다])로 초기화 된다.

	  --- 클래스 변수(static)에 접근 하기 위해서는 클래스명.변수명으로 접근한다.
		  모든 객체들이 하나의 static 변수를 공유한다.
	  --- 인스턴스 변수(instance)에 접근하기 위해서는 반드시 객체를 생성후 객체명.인스턴스 변수명으로 접근한다.

	  --- 클래스 변수(static)는 클래스가 실행될때 생성되고,
	      인스턴스 변수는 객체가 생성될때 생성된다.

	  --- 해당 프로그램이 종료되면 클래스 변수(static)와 인스턴스 변수는 쓰래기가 된다.
		  그 후 JVM에서 가비지 컬렉터가 작동하여 자동적으로 메모리에서 소멸시킨다.

	2. 지역변수 (local 변수)
	  --- 지역변수가 사용되어지는 범위는 지역 변수가 생성된 {   } 내에서만 사용가능하다.
		  특정 메소드내에서나, 생성자 내에서 선언되어지는 것이다.
	  --- 지역변수는 {    } 을 벗어나면 자동적으로 소멸된다.
*/
public class MyVariable
{
	int a = 10;				// 인스턴스 변수
	static int b = 20;		// 클래스(static) 변수
	// 명시적 초기화

	int no1;
	static int no2;
	// JVM 기본 초기화

	String name1 = "한정우";
	static String name2 = "두정우";

	String id;
	String pwd;
	int phone;
	static String address;

	public static void main(String[] args) 
	{
		int c = 30;

		MyVariable myobj = new MyVariable();
		// myobj를 클래스 MyVariable의 객체 변수라 부른다.
		// myobj를 클래스 MyVariable의 인스턴스라 부른다.
		// MyVariable();을 객체 생성이라고 하고 인스턴스화 한다 라고 한다.

		System.out.println("a : " + myobj.a);
		// "문자열" + 변수명에서 +는 더하기가 아닌 문자열 결합을 뜻한다.

		// System.out.println("b : " + b);
		// System.out.println("b : " + myobj.b);
		System.out.println("b : " + MyVariable.b);
		// static 변수는 무조건 클래스 명. 변수명으로 쓴다. 다른 프로그래머가 이해하기 어려움

		System.out.println("c : " + c);
		
		System.out.print("\r\n ==================== \r\n");
		
		int no3 = 999;	// 지역 변수는 초기화를 꼭 해주어야 한다.

		System.out.println("no1 : " + myobj.no1);
		System.out.println("no2 : " + MyVariable.no2);
		System.out.println("no3 : " + no3);

		System.out.print("\r\n ==================== \r\n");

		System.out.println("name1 : " + myobj.name1);
		System.out.println("name2 : " + MyVariable.name2);
	
		System.out.print("\r\n ==================== \r\n");

		MyVariable member1 = new MyVariable();
		member1.id = "나문희";
		member1.pwd = "호박고구마";
		member1.phone = 119;
		MyVariable.address = "경기도 용인시";

		MyVariable member2 = new MyVariable();
		member2.id = "이순재";
		member2.pwd = "야한동영상";
		member2.phone = 112;
		MyVariable.address = "경기도 성남시";

		System.out.println("member1의 id = " + member1.id);
		System.out.println("member1의 pwd = " + member1.pwd);
		System.out.println("member1의 phone = " + member1.phone);
		System.out.println("member1의 address = " + member1.address);

		System.out.println("member2의 id = " + member2.id);
		System.out.println("member2의 pwd = " + member2.pwd);
		System.out.println("member2의 phone = " + member2.phone);
		System.out.println("member2의 address = " + member2.address);
	}
}
