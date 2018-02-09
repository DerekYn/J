package my.day13.test;

import my.Util.MyUtil;

public class JobSeeker extends Common{
	
	//String userid;
	//String passwd;
	//String name;
	private int age;
	private String gender;
	//String address;
	private String degree;
	//String mobile;
	private String theOccupationDesired;
	private int theSaralyDesired;
	
	public JobSeeker() { }
	
	public JobSeeker(String userid, String passwd, String name, int age, String gender, String address, String degree,
			String mobile, String theOccupationDesired, int theSaralyDesired) {
		
		super(userid, passwd, name, address, mobile);
		
		this.age = age;
		this.gender = gender;
		this.degree = degree;
		this.theOccupationDesired = theOccupationDesired;
		this.theSaralyDesired = theSaralyDesired;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getTheOccupationDesired() {
		return theOccupationDesired;
	}

	public void setTheOccupationDesired(String theOccupationDesired) {
		this.theOccupationDesired = theOccupationDesired;
	}

	public int getTheSaralyDesired() {
		return theSaralyDesired;
	}

	public void setTheSaralyDesired(int theSaralyDesired) {
		this.theSaralyDesired = theSaralyDesired;
	}

	public String showJobSeeker() {
		
		String info = "=== " + super.name + "님의 프로필 ===";
		
		info += super.commonInfo().replace("▷ 이름", "▷ 사용자 명");
		
		info +=       "\n▷ 회원 나이 : " + age
					+ "\n▷ 회원 성별 : " + gender
					+ "\n▷ 회원 학력 : " + degree
					+ "\n▷ 회원 희망 직종 : " + theOccupationDesired
					+ "\n▷ 회원 희망 연봉 : " + MyUtil.getCommaNumber(theSaralyDesired)
					+ "\n-----------------------------------------";
		
		return info;
		
	}
	
}
