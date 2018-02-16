package my.day19;

public class Employee {
	
	String deptNo;		// 부서 번호
	String workerNo;	// 사원코드 번호
	String name; 		// 사원명
	String position;	// 직급
	
	public Employee() { }
	
	public Employee(String deptNo, String workerNo, String name, String position) {
		this.deptNo = deptNo;
		this.workerNo = workerNo;
		this.name = name;
		this.position = position;
	}
	
	@Override
	public String toString() {
		
		String result = "▷ 부서 번호 : " + deptNo
						+ "\n▷ 사원코드 번호 : " + workerNo
						+ "\n▷ 사원명 : " + name
						+ "\n▷ 직급 : " + position;
		
		return result;
	}
	
}
