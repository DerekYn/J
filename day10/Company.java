package my.day10;

import my.Util.MyUtil;

public class Company {
	
	// Company 클래스의 속성 정하기(추상화작업)
	
	String comid;
	String passwd;
	String comname;
	String ceo;
	long seedmoney;
	String jobtype;
	String addr;
	String tel;
	
	public Company() { }
	
	public Company(String comid, String passwd, String comname, String ceo, long seedmoney, String jobtype,
			String addr, String tel) {
		this.comid = comid;
		this.passwd = passwd;
		this.comname = comname;
		this.ceo = ceo;
		this.seedmoney = seedmoney;
		this.jobtype = jobtype;
		this.addr = addr;
		this.tel = tel;
	}
	
	
	public String showCompany() {
		String info = "=== " + comid + " 회사의 프로필 ==="
				+ "\n1. 회사 아이디 : " + comid
				+ "\n2. 회사 비밀번호 : " + "*****" + passwd.substring(5)	// "qwer1234$".substring(3, 7) ==> r123	/ "qwer1234$".substring(3) ==> r1234$
				+ "\n3. 회사 이름 : " + comname
				+ "\n4. 회사 대표 : " + ceo
				+ "\n5. 회사 초기 자본 : " + seedmoney
				+ "\n6. 회사 업종 : " + jobtype
				+ "\n7. 회사 주소 : " + addr
				+ "\n8. 회사 전화번호 : " + tel
				+ "\n-----------------------------------------";
	
	return info;
		
	}
	
}

	
