package my.day18;

public class Resume {
	
	String name;
	String birthday;
	String tel;
	
	class School {
		String elementName;
		String middleName;
		String highName;
		String univName;
		
		String schoolInfo() {
			String result = "초등학교 : " + elementName
							+ "\n중학교 : " + middleName
							+ "\n고등학교" + highName
							+ "\n대학교" + univName;
			return result;
			
		}
		
	}
	
	void printInfo(School sch) {
		System.out.println("1. 지원자명 : " + name);
		System.out.println("2. 생년월일 : " + birthday);
		System.out.println("3. 연락처 : " + tel);
		System.out.println("4. 학력사항 : ");
		
		//Resume.School sch = this.new School();	=> 정식표현
		// School sch = new School();				//  => 약식표현
		
		System.out.println(sch.schoolInfo());
	}

}
