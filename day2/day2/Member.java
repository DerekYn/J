/*

	�� �޼ҵ�(method)��?
	-- Ŭ���� �ȿ��� �����Ǿ��� ������ �Լ���� �����ϸ� �ȴ�.
	   ��� ������ ��ü������ �����Ͽ� ������ ��

	-- �޼ҵ�(method)�� �ݵ�� ���� Ÿ���� �������־�� �Ѵ�.
	   ���� Ÿ���� ������ �� ���� Ÿ�Կ� �ش��ϴ� Ÿ��(String, int, double)�� ����ϰ�,
	   ���� Ÿ���� ���� �޼ҵ�(method)��� ���� Ÿ���� ���ٴ� ���� void�� �������.

	�� �޼ҵ�(method)�� ����

	  1. �ν��Ͻ� �޼ҵ�(instance method)
		 -- ��ü��.�޼ҵ��();
	  2. ����ƽ �޼ҵ�(static method == Ŭ���� �޼ҵ�)
	     -- Ŭ������.�޼ҵ��();

*/

public class Member
{
	String userId;
	String passwd;
	String name;
	int age;
	double height;
	int hopeMonthSal;
	
	public Member() {}

	public Member(String userId, String passwd, String name, int age, double height, int hopeMonthSal)
	{
		this.userId = userId;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
		this.height = height;
		this.hopeMonthSal = hopeMonthSal;
	}

	public void infoPrint(){
		System.out.println("userId : " + userId + "\npasswd : " + passwd + "\nname : " 
		+ name + "\nage : " + age + "\nheight : " + height + "\nhopeMonthSal : " + hopeMonthSal);
	}

	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public double getHeight(){
		return height;
	}

	public void changeMyInfo(String passwd, int age, double height, int hopeMonthSal){
		this.passwd = passwd;
		this.age = age;
		this.height = height;
		this.hopeMonthSal = hopeMonthSal;
	}

	public int getHopeYearSal(){
		return hopeMonthSal * 12;
	}

	public String setHopeMonthSal(int newHopeMonthSal) {
		int beforeChangeSal = hopeMonthSal;
		hopeMonthSal = newHopeMonthSal;
		return name + "���� ���� ������޿� : " + beforeChangeSal + " ������� " + hopeMonthSal + " ������� ����Ǿ����ϴ�.";
	}

	public void showInfo(){
		String Info = "=== Information of " + name + " ===" + 
						"\n1. id : " + userId +
						"\n2. passwd : " + passwd +
						"\n3. name : " + name +
						"\n4. age : " + age +
						"\n5. height : " + height +
						"\n6. hopeMonthSal : " + hopeMonthSal;
		System.out.println(Info);
	}

	public String getStrYearSal() {
		return MyUtil.getMoney(hopeMonthSal * 12);
	}
}
