/*
	=== 생성자 (constructor) ===

	※ 생성자(constructor)란?
	-- 객체를 생성(클래스 명 객체변수명 = new 클래스명(); ) 할 때 마다
	   자동적으로 호출되는 어떠한 행위를 기술한 것이다.

	※ 생성자(constructor) 생성 규칙
	-- 1. 생성자 명이 "반드시" 클래스명과 동일해야 한다.
	   2. 리턴타입이 없다.

	※ 생성자(constructor)의 주요 역활
	-- 일반적으로 멤버 변수(instance, static)의 초기화를 하고자 하는데 있다.
*/

public class MyConstructorTest
{
	int age;
	String name;
	String address;

	public MyConstructorTest(){

		age = 35;
		name = "김정은";
		address = "평양";

		System.out.println("MyConstructorTest 객체 생성 완료");
	}
	public MyConstructorTest(int age, String name, String address){
		// 생성자 내에서 선언된 변수는 지역 변수(local)이다.
		// 멤버 변수명과 지역 변수명이 동일할 경우 지역 변수명이 우선된다.
		// so, 2개의 변수명을 구분하기 위한 방법으로 this.멤버변수명으로 구분한다.
		this.age = age;
		this.name = name;
		this.address = address;

		System.out.println("파라미터가 있는 MyConstructorTest 객체 생성 완료");
	}
	public static void main(String[] args) 
	{
		System.out.println("Here is a first line.");

		MyConstructorTest myobj = new MyConstructorTest();

		System.out.println("myobj.age : " + myobj.age);
		System.out.println("myobj.name : " + myobj.name);
		System.out.println("myobj.address : " + myobj.address);

		System.out.println("=================================");

		MyConstructorTest myobj2 = new MyConstructorTest();

		System.out.println("myobj2.age : " + myobj2.age);
		System.out.println("myobj2.name : " + myobj2.name);
		System.out.println("myobj2.address : " + myobj2.address);
		
		System.out.println("=================================");

		MyConstructorTest myobj3 = new MyConstructorTest(54, "푸틴", "모스크바");
		System.out.println("myobj3.age : " + myobj3.age);
		System.out.println("myobj3.name : " + myobj3.name);
		System.out.println("myobj3.address : " + myobj3.address);

		System.out.println("=================================");

		MyConstructorTest myobj4 = new MyConstructorTest(51, "트럼프", "워싱턴DC");
		System.out.println("myobj4.age : " + myobj4.age);
		System.out.println("myobj4.name : " + myobj4.name);
		System.out.println("myobj4.address : " + myobj4.address);

		myobj.myPrint();
		myobj.myPrint();
	}

	public void myPrint() {
		System.out.println("Hello");
	}
}