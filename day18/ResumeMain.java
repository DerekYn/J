package my.day18;

public class ResumeMain {

	public static void main(String[] args) {
		
		Resume rs1 = new Resume();
		
		rs1.name = "윤찬영";
		rs1.birthday = "1992-04-30";
		rs1.tel = "010-9612-0831";
		
		Resume.School sch = rs1.new School();
		
		sch.elementName = "평양 초등학교";
		sch.middleName = "함흥 중학교";
		sch.highName = "풍계리 고등학교";
		sch.univName = "김일성 제 1 대학";
		
		rs1.printInfo(sch);
	}

}
