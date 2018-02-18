package my.day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		// 검색어 : 부서번호
		// 예 > 조회할 부서번호 : 10 엔터
		// 	   10번 부서에 근무하는 사원들만 출력
		
		// 예 > 조회할 부서번호 : 20 엔터
		//     20번 부서에서 근무하는 사원들만 출력
		
		HashMap<String, List<Employee>> map = new HashMap<String, List<Employee>>();
		
		List<Employee> list_10 = new ArrayList<Employee>();
		list_10.add(new Employee("10", "kh0001", "윤찬영", "회장"));
		
		List<Employee> list_20 = new ArrayList<Employee>();
		list_20.add(new Employee("20", "kh0002", "배은정", "사모님"));
		
		List<Employee> list_30 = new ArrayList<Employee>();
		list_30.add(new Employee("30", "kh0003", "윤은찬", "도련님"));
		
		map.put("10", list_10);
		map.put("20", list_20);
		map.put("30", list_30);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">>> 조회할 부서 번호 : ");
		String deptNo = sc.nextLine();
		
		List<Employee> empList = map.get(deptNo);
		
		if(empList != null) {
			for(Employee emp : empList) {
				System.out.println("▷ 사원번호 : " + emp.workerNo + ", 사원명 : " + emp.name);
			}
			System.out.println("---------------------------");
			System.out.print(">>> 조회할 사원번호 : ");
			String workerNo = sc.nextLine();
			int cnt = 0;
			for(int i=0; i<empList.size(); i++) {
				String exitworkerNo = empList.get(i).workerNo;
				if(exitworkerNo.equals(workerNo)) {
					System.out.println(empList.get(i));
					cnt = 1;
				}
			}
			
			if(cnt == 0) {
				System.out.println(">>> 조회하시려는 사원번호" + workerNo + "는 존재하지 않습니다.");
			}
		}
		else {
			System.out.println(">>> 조회하려는 부서번호 " + deptNo + "은 존재하지 않습니다.");
		}
		sc.close();
	}

}
