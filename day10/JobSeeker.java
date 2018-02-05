package my.day10;

import my.Util.MyUtil;

public class JobSeeker {
	
	String userid;
	String passwd;
	String name;
	int age;
	String gender;
	String address;
	String degree;
	String mobile;
	String theOccupationDesired;
	int theSaralyDesired;
	
	public JobSeeker() { }
	
	public JobSeeker(String userid, String passwd, String name, int age, String gender, String address, String degree,
			String mobile, String theOccupationDesired, int theSaralyDesired) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.degree = degree;
		this.mobile = mobile;
		this.theOccupationDesired = theOccupationDesired;
		this.theSaralyDesired = theSaralyDesired;
	}
	
	public String showJobSeeker() {
		
		String info = "=== " + name + "님의 프로필 ==="
					+ "\n1. 회원 아이디 : " + userid
					+ "\n2. 회원 비밀번호 : " + "*****" + passwd.substring(5)	// "qwer1234$".substring(3, 7) ==> r123	/ "qwer1234$".substring(3) ==> r1234$
					+ "\n3. 회원 이름 : " + name
					+ "\n4. 회원 나이 : " + age
					+ "\n5. 회원 성별 : " + gender
					+ "\n6. 회원 주소 : " + address
					+ "\n7. 회원 학력 : " + degree
					+ "\n8. 회원 번호 : " + mobile
					+ "\n9. 회원 희망 직종 : " + theOccupationDesired
					+ "\n10. 회원 희망 연봉 : " + MyUtil.getCommaNumber(theSaralyDesired)
					+ "\n-----------------------------------------";
		
		return info;
		
	}
	
}
