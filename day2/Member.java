public class Member
{
	String userId;
	String passwd;
	String name;
	int age;
	double height;
	
	public Member() {}

	public Member(String userId, String passwd, String name, int age, double height)
	{
		this.userId = userId;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public void infoPrint()
	{
		System.out.println("userId : " + userId + "\npasswd : " + passwd + "\nname : "  + name + "\nage : " + age + "\nheight : " + height);
	}
}
