package my.day15.test;

import my.Util.MyUtil;

public class Company extends AbstractCommon {
	
	// Company 클래스의 속성 정하기(추상화작업)
	
	private String ceo;
	private long seedmoney;
	private String jobtype;
	
	public Company() { }
	
	public Company(String comid, String passwd, String comname, String ceo, long seedmoney, String jobtype,
			String addr, String tel) {
		super(comid, passwd, comname, addr, tel);
		this.ceo = ceo;
		this.seedmoney = seedmoney;
		this.jobtype = jobtype;
	}
	
	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public long getSeedmoney() {
		return seedmoney;
	}

	public void setSeedmoney(long seedmoney) {
		this.seedmoney = seedmoney;
	}

	public String getJobtype() {
		return jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	public String showCompany() {
		String info = "=== " + super.name + " 회사의 프로필 ===";
			
		info += super.showInfo().replaceAll("▷ 이름", "▷ 회사명");
				
		info += "\n▷ 회사 대표 : " + ceo
				+ "\n▷ 회사 초기 자본 : " + MyUtil.getCommaNumber(seedmoney)
				+ "\n▷ 회사 업종 : " + jobtype
				+ "\n-----------------------------------------";
	
	return info;
		
	}
	
}

	
