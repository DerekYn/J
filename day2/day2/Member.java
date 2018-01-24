/*

	※ 메소드(method)란?
	-- 클래스 안에서 구현되어진 일종의 함수라고 생각하면 된다.
	   어떠한 행위를 구체적으로 서술하여 정의한 것

	-- 메소드(method)는 반드시 리턴 타입을 정의해주어야 한다.
	   리턴 타입이 있으면 그 리턴 타입에 해당하는 타입(String, int, double)를 기술하고,
	   리턴 타입이 없는 메소드(method)라면 리턴 타입이 없다는 뜻의 void를 기술하자.

	※ 메소드(method)의 종류

	  1. 인스턴스 메소드(instance method)
		 -- 객체명.메소드명();
	  2. 스태틱 메소드(static method == 클래스 메소드)
	     -- 클래스명.메소드명();

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
		return name + "님의 기존 희망월급여 : " + beforeChangeSal + " 억원에서 " + hopeMonthSal + " 억원으로 변경되었습니다.";
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
