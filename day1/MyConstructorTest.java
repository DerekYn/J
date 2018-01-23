/*
	=== ������ (constructor) ===

	�� ������(constructor)��?
	-- ��ü�� ����(Ŭ���� �� ��ü������ = new Ŭ������(); ) �� �� ����
	   �ڵ������� ȣ��Ǵ� ��� ������ ����� ���̴�.

	�� ������(constructor) ���� ��Ģ
	-- 1. ������ ���� "�ݵ��" Ŭ������� �����ؾ� �Ѵ�.
	   2. ����Ÿ���� ����.

	�� ������(constructor)�� �ֿ� ��Ȱ
	-- �Ϲ������� ��� ����(instance, static)�� �ʱ�ȭ�� �ϰ��� �ϴµ� �ִ�.
*/

public class MyConstructorTest
{
	int age;
	String name;
	String address;

	public MyConstructorTest(){

		age = 35;
		name = "������";
		address = "���";

		System.out.println("MyConstructorTest ��ü ���� �Ϸ�");
	}
	public MyConstructorTest(int age, String name, String address){
		// ������ ������ ����� ������ ���� ����(local)�̴�.
		// ��� ������� ���� �������� ������ ��� ���� �������� �켱�ȴ�.
		// so, 2���� �������� �����ϱ� ���� ������� this.������������� �����Ѵ�.
		this.age = age;
		this.name = name;
		this.address = address;

		System.out.println("�Ķ���Ͱ� �ִ� MyConstructorTest ��ü ���� �Ϸ�");
	}
	public static void main(String[] args) 
	{
		System.out.println("Here is a first line.");

		MyConstructorTest myobj = new MyConstructorTest();

		System.out.println("myobj.age : " + myobj.age);
		System.out.println("myobj.name : " + myobj.name);
		System.out.println("myobj.address : " + myobj.address);

		System.out.println("=================================");

		MyConstructorTest myobj2 = new MyConstructorTest();

		System.out.println("myobj2.age : " + myobj2.age);
		System.out.println("myobj2.name : " + myobj2.name);
		System.out.println("myobj2.address : " + myobj2.address);
		
		System.out.println("=================================");

		MyConstructorTest myobj3 = new MyConstructorTest(54, "Ǫƾ", "��ũ��");
		System.out.println("myobj3.age : " + myobj3.age);
		System.out.println("myobj3.name : " + myobj3.name);
		System.out.println("myobj3.address : " + myobj3.address);

		System.out.println("=================================");

		MyConstructorTest myobj4 = new MyConstructorTest(51, "Ʈ����", "������DC");
		System.out.println("myobj4.age : " + myobj4.age);
		System.out.println("myobj4.name : " + myobj4.name);
		System.out.println("myobj4.address : " + myobj4.address);

		myobj.myPrint();
		myobj.myPrint();
	}

	public void myPrint() {
		System.out.println("Hello");
	}
}