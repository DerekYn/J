package nsc.test2;

public class Company {

	public static void main(String[] args) {
				
		Employee[] employees = new Employee[2];
				
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);
		
		
		System.out.println("name\t" + "department\t" + "salary");
		System.out.println("--------------------------------");
		for(Employee arr : employees) {
			System.out.print(arr.getName() + "\t");
			System.out.print(arr.getDepartment() + "\t");
			System.out.println(arr.getSalary());
		}
		
		for(Employee arr : employees) {
			System.out.println();
			arr.incentive(100);
		}
		System.out.println("인센티브 100 지급");
		
		System.out.println("name\t" + "department\t" + "salary\t" + "tax");
		System.out.println("--------------------------------");
		for(Employee arr : employees) {
			System.out.print(arr.getName() + "\t");
			System.out.print(arr.getDepartment() + "\t");
			System.out.print(arr.getSalary() + "\t");
			System.out.format("%.1f%n", arr.tax());
		}

	}

}
