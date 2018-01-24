public class MethodTestMain 
{
	public static void main(String[] args) 
	{
		Member member1 = new Member("bitcoin", "1234", "gazua", 32, 183.4, 350);
		Member member2 = new Member("stock", "5678", "skinhead", 25, 157.4, 450);
		
		member1.infoPrint();

		System.out.println("===============================");

		member2.infoPrint();

		System.out.println("===============================");

		String name = member1.getName();
		System.out.println("name : " + name);
		int age = member1.getAge();
		System.out.println("age : " + age);
		double height = member1.getHeight();
		System.out.println("height : " + height);
		int hopeMonthSal = member1.getHopeYearSal();
		System.out.println("myTotalSalary : " + hopeMonthSal);

		System.out.println("===============================");

		member1.changeMyInfo("9876", 84, 283.4, 400);
		name = member1.getName();
		age = member1.getAge();
		height = member1.getHeight();
		hopeMonthSal = member1.getHopeYearSal();
		member1.infoPrint();
	
		System.out.println("===============================");

		System.out.println(name + "의 암호는 " + member1.passwd + "이고 나이는 " + age + ", 신장은 " + height + "입니다.");

		System.out.println("===============================");

		String result = member1.setHopeMonthSal(500);
		System.out.println(result);

		System.out.println("===============================");

		member1.showInfo();

		System.out.println("===============================");

		System.out.println("종료 시각 : " + MyUtil.getNowTime());
		
		System.out.println("===============================");

		Member member3 = new Member("hacker", "0000", "bigBro", 27, 183.5, 450000);

		System.out.println(member3.name + "의 희망 연 봉 : " + member3.getStrYearSal());
	}
}
