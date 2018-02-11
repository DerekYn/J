package my.day15.test;

import my.Util.MyUtil;

public class Recruit {
	
	// Recruit 클래스의 속성 정하기(추상화작업)
	
	private Company company;	// 구인회사
	private String gender;		// 채용 성별[1. 남 / 2. 여 / 3. 성별 무관]
	private int agemin;			// 채용 최소 나이
	private int agemax;			// 채용 최대 나이
	private String degree;		// 채용 학력[1. 대졸 이상 / 2. 초대졸 / 3. 고졸 / 4. 학력무관
	
	
	public Recruit() { }

	public Recruit(Company company, String gender, int agemin, int agemax, String school) {
		this.company = company;
		this.gender = gender;
		this.agemin = agemin;
		this.agemax = agemax;
		this.degree = degree;
	}
	
	

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAgemin() {
		return agemin;
	}

	public void setAgemin(int agemin) {
		this.agemin = agemin;
	}

	public int getAgemax() {
		return agemax;
	}

	public void setAgemax(int agemax) {
		this.agemax = agemax;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String showRecruit() {
	
		String info = "=== " + company.name+ "님의 프로필 ==="
				+ "\n1. 회사명 : " + company.name
				+ "\n2. 대표자명 : " + company.passwd
				+ "\n3. 회사 초기 자본 : " + MyUtil.getCommaNumber(company.getSeedmoney())
				+ "\n4. 업종 : " + company.getJobtype()
				+ "\n5. 회사주소 : " + company.addr
				+ "\n6. 회사 전화번호 : " + company.number
				+ "\n7. 채용 성별 : " + gender
				+ "\n8. 채용연령대 : " + agemin + "세 ~ " + agemax + "세"
				+ "\n9. 최종 학력 : " + degree
				+ "\n-----------------------------------------";
	
	return info;
		
	}
}
