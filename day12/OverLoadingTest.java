/*
 		== *** 메소드의 오버로딩(OverLoading) *** ===
 		
 		메소드 생성시 메소드의 이름을 중복하여 사용할 수 있다.
 		단, 메소드의 파라미터는 형식이 달라야만 한다.
 		그리고 메소드의 오버로딩은 메소드의 리턴 타입는 관련이 없다.
 */



package my.day12;
 
import java.util.Calendar;

public class OverLoadingTest {
	 
	private String userid;
	private String passwd;
	private String name;
	private String birth;
	private int point;
	
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
	
	// -- 생년을 입력 받아서 현재 나이를 리턴시켜주는 메소드 생성
	public int getAge(String birth) { // 1992-04-30
		
		int birthyear = Integer.parseInt(birth.substring(0, 4));	// substring (부터, 까지) 짤라주는 메소드
		
		
		Calendar currentdate = Calendar.getInstance();		// 현재 날짜와 시간을 얻어온다.
		
		int currentage = currentdate.get(Calendar.YEAR) - birthyear + 1;
		
		// 현재 나이 = 현재 년도 - 태어난 년도 + 1
		
		
		return currentage;
	}
	
	
	// -- 현재나이를 입력 받아서 연령대를 리턴시켜주는 메소드 생성
	public int getAge(int age) {
		
		//	20		24		27		28		29
		//	20/10	24/10	27/10	28/10	29/10
		//	2*10	2*10	2*10	2*10	2*10
				
		return age/10*10;
	}
	
	
	/////////////////////////////////////////////////////////////////
	
	
	public byte example(int a, int b, int c) {
		
		return 0;
	}

	public byte example(int a, int b) {
		
		return 0;
	}

	public byte example(int a, double b) {
	
	 return 0;
	}
	
	public byte example(double a, int b) {
		
		return 0;
	}
	
	public byte example(String a) {
		
		return 0;
	}

	public byte example(int a) {
	
	return 0;
	}
	
	public byte example() {
		
		return 0;
	}
}
