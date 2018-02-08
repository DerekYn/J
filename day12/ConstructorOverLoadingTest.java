package my.day12;

import java.util.Calendar;

public class ConstructorOverLoadingTest {
	 
	private String userid;	// 필수 입력 사항
	private String passwd;	// 필수 입력 사항
	private String name;	// 필수 입력 사항
	private String birth;	// 선택 입력 사항
	private int point = 10;	// 기본이 10점
	private static int count;		// public static 변수는 다른 클래스에서 사용할 시 굳이 클래스 선언을 하지 않아도 사용할 수 있다.
	
	static {	// 스태틱 변수 초기화 블럭
		System.out.println("=== 여기는 static 변수 초기화 블럭입니다. ===");
		
	}
	
	{	// 인스턴스 변수 초기화 블럭
		System.out.println("=== 여기는 instance 변수 초기화 블럭입니다. ===");
		count++;
		
		if(count%2 != 0) {
			point = 20; 
		}
	}

	
	public ConstructorOverLoadingTest() { }
	
	public ConstructorOverLoadingTest(String userid, String passwd, String name) {
		/*
			this.userid = userid;
			this.passwd = passwd;
			this.name = name; 
		 */
		this(userid, passwd, name, "입력하지 않음");	// 생성자 내에서 this()는 오버로딩된 다른 생성자를 말한다.
		
	}
	
	public ConstructorOverLoadingTest(String userid, String passwd, String name, String birth) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.birth = birth;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}
