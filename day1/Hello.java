// 1줄 주석문

/*
	여러줄
	주석문
*/

/**
	문서화 주석
	==> javadoc 를 이용해서 API 문서를 만들때 사용한다.
*/

// ================  ***  CLASS (클래스)의 구조  ***  ====================
/*
	CLASS (클래스)는 어떠한 어플리케이션 제작시 필요한 설계 도면이라고 생각하자.
	
	1. 패키지 선언문

		==> 패키지란 클래스가 저장되어진 디렉토리 경로라고 보면된다.

		package 패키지명;	==> 이때 패키지명은 반드시 소문자로 시작해야 한다.

		예) package my.com;


	2. import 문

		예) import 패키지명.클래스명;

			import java.lang.String;
			import java.lang.System;
			import java.*;

	3. 클래스 선언문

	4. 컴파일하기

	5. 실행하기




*/

import java.util.Date;
import java.lang.String;
import java.lang.System;

public class Hello
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println("안녕 세계");
		// System.out 은 모니터(콘솔화면)를 뜻한다.
		// System.out.println("안녕");은 모니터(콘솔화면)에 안녕을 출력

		System.out.print("Hi world!");

		System.out.println(new Date());
		// 현재 날짜를 나타내자
		// new Date() 가 현재 시스템의 날짜 시간을 얻어오는 것이다.
	}
}
