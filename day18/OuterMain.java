package my.day18;

import my.day18.Outer.Inner;

public class OuterMain {

	public static void main(String[] args) {
		
		// Outer 클래스의 인스턴스 변수 a 를 출력하고,
		// Outer 클래스의 내부클래스의 인스턴스 변수 c와 메소드 innerMethod() 를 호출해보자
		
		Outer ot = new Outer();
		
		System.out.println("Outer 클래스의 인스턴스 변수  a : " + ot.a);
		
		
		Outer.Inner otinner = ot.new Inner();
		System.out.println("Outer 클래스의 내부클래스 Inner 의 인스턴스 변수 c : " + otinner.c);
		
		// 또는
		
		Outer.Inner otinner2 = new Outer().new Inner();
		System.out.println("Outer 클래스의 내부클래스 Inner 의 인스턴스 변수 c : " + otinner2.c);
		
		otinner.innerMethod();
		new Outer().new Inner().innerMethod();
		
		System.out.println("\n================================================\n");
		
		// Outer 클래스의 멤버변수 b 를 출력하고,
		// Outer 클래스의 내부클래스 인스턴스 변수 d와 스태틱 변수 e를 출력하고, 
		// 메소드 staticInner_InstanceMethod() 와 staticInner_StaticMethod() 를 호출해보자
		
		System.out.println("Outer 클래스의 클래스변수 b => " + Outer.b);
		
		Outer.StaticInner otsinner = new Outer.StaticInner();
		System.out.println("Outer.StaticInner 클래스의 인스턴스 변수 d => " + otsinner.d);
		
		otsinner.staticInner_InstanceMethod();

		System.out.println("Outer.StaticInner 클래스의 스태틱 변수 e => " + Outer.StaticInner.e);
		
		Outer.StaticInner.staticInner_StaticMethod();	// static 은 그냥 클래스 명만 써주면 된다. 단 한개의 메소드 이기 때문에
		
		System.out.println("\n================================================================\n");
		
		ot.test();
		
		
		
	}

}
