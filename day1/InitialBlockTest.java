public class InitialBlockTest
{
	String id;
	String pwd;
	String name;
	
	/* == Ŭ���� �ʱ�ȭ �� ==
		Ŭ���� �ʱ�ȭ ���� �ش� Ŭ������ �޸𸮿� ó�� �ε��Ǿ��� ��
		�� 1���� ��������ִ� ���̴�.
	*/
	static {
		System.out.println("Ŭ���� InitialBlockTest�� ��ü ���� �Ϸ�!! from.Ŭ���� �ʱ�ȭ ��");
	}
	/* == �ν��Ͻ� �ʱ�ȭ �� ==
		��� �����ڿ��� ���������� ����Ǿ�� �� �ڵ尡 �ִ� ���,
		������ �����ڸ��� �ߺ��ǰ� ������(�ڵ�) ����,
		�ν��Ͻ� �ʱ�ȭ ���� 1���� �����(�ڵ�) �ϸ� �ȴ�.
		������ ���� �ν��Ͻ� �ʱ�ȭ ����� ���� ����ȴٴ� ���� ���!!
		And �ν��Ͻ� �ʱ�ȭ ����� ��ü�� �����Ǿ��������� �Ź� ����ȴ�.
	*/
	{
		System.out.println("Ŭ���� InitialBlockTest�� ��ü ���� �Ϸ�!! from.�ν��Ͻ� �ʱ�ȭ ��");
	}

	public InitialBlockTest() 
	{ 
		//System.out.println("Ŭ���� InitialBlockTest�� ��ü ���� �Ϸ�!!");
		System.out.println("�⺻ ������ ���� �Ϸ�!!");
	}
	public InitialBlockTest(String id, String pwd, String name)
	{
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		//System.out.println("Ŭ���� InitialBlockTest�� ��ü ���� �Ϸ�!!");
		System.out.println("�Ķ���Ͱ� �ִ� ������ ���� �Ϸ�!!");
	}

	public static void main(String[] args) 
	{
		/*
		InitialBlockTest obj1 = new InitialBlockTest();
		obj1.id = "Onami";
		obj1.pwd = "1234";
		obj1.name = "������";

		InitialBlockTest obj2 = new InitialBlockTest("hangu", "qwer", "���ѱ�");
		*/
	
		System.out.println("������");
	}
}
