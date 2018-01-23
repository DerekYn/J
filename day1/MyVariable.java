
/*
	== ������ ���� ==

	1. ������� (member ����) -->
		1.1 Ŭ���� ����(== static ����)
		1.2 �ν��Ͻ� ����(instance ����)
	  --- ��������� ���Ǿ����� ������ �ش� Ŭ���� ������ ��𼭳� ��밡���ϴ�.
		  ��������� ����Ǿ� ���� ��ġ�� �Ϲ������� �ش� Ŭ������ �ٷ� �Ʒ� ����ȴ�.
	  --- ���� ���� �� ���� �ο�(�ʱ�ȭ)���� �ʴ��� �ڵ������� JVM�� �⺻���� �ο��Ѵ�.
		  �������� 0, �Ǽ����� 0.0, �������� ' ', ��ü���� NULL(�������� �ʴ°�[0�� �ƴϴ�])�� �ʱ�ȭ �ȴ�.

	  --- Ŭ���� ����(static)�� ���� �ϱ� ���ؼ��� Ŭ������.���������� �����Ѵ�.
		  ��� ��ü���� �ϳ��� static ������ �����Ѵ�.
	  --- �ν��Ͻ� ����(instance)�� �����ϱ� ���ؼ��� �ݵ�� ��ü�� ������ ��ü��.�ν��Ͻ� ���������� �����Ѵ�.

	  --- Ŭ���� ����(static)�� Ŭ������ ����ɶ� �����ǰ�,
	      �ν��Ͻ� ������ ��ü�� �����ɶ� �����ȴ�.

	  --- �ش� ���α׷��� ����Ǹ� Ŭ���� ����(static)�� �ν��Ͻ� ������ �����Ⱑ �ȴ�.
		  �� �� JVM���� ������ �÷��Ͱ� �۵��Ͽ� �ڵ������� �޸𸮿��� �Ҹ��Ų��.

	2. �������� (local ����)
	  --- ���������� ���Ǿ����� ������ ���� ������ ������ {   } �������� ��밡���ϴ�.
		  Ư�� �޼ҵ峻������, ������ ������ ����Ǿ����� ���̴�.
	  --- ���������� {    } �� ����� �ڵ������� �Ҹ�ȴ�.
*/
public class MyVariable
{
	int a = 10;				// �ν��Ͻ� ����
	static int b = 20;		// Ŭ����(static) ����
	// ����� �ʱ�ȭ

	int no1;
	static int no2;
	// JVM �⺻ �ʱ�ȭ

	String name1 = "������";
	static String name2 = "������";

	String id;
	String pwd;
	int phone;
	static String address;

	public static void main(String[] args) 
	{
		int c = 30;

		MyVariable myobj = new MyVariable();
		// myobj�� Ŭ���� MyVariable�� ��ü ������ �θ���.
		// myobj�� Ŭ���� MyVariable�� �ν��Ͻ��� �θ���.
		// MyVariable();�� ��ü �����̶�� �ϰ� �ν��Ͻ�ȭ �Ѵ� ��� �Ѵ�.

		System.out.println("a : " + myobj.a);
		// "���ڿ�" + �������� +�� ���ϱⰡ �ƴ� ���ڿ� ������ ���Ѵ�.

		// System.out.println("b : " + b);
		// System.out.println("b : " + myobj.b);
		System.out.println("b : " + MyVariable.b);
		// static ������ ������ Ŭ���� ��. ���������� ����. �ٸ� ���α׷��Ӱ� �����ϱ� �����

		System.out.println("c : " + c);
		
		System.out.print("\r\n ==================== \r\n");
		
		int no3 = 999;	// ���� ������ �ʱ�ȭ�� �� ���־�� �Ѵ�.

		System.out.println("no1 : " + myobj.no1);
		System.out.println("no2 : " + MyVariable.no2);
		System.out.println("no3 : " + no3);

		System.out.print("\r\n ==================== \r\n");

		System.out.println("name1 : " + myobj.name1);
		System.out.println("name2 : " + MyVariable.name2);
	
		System.out.print("\r\n ==================== \r\n");

		MyVariable member1 = new MyVariable();
		member1.id = "������";
		member1.pwd = "ȣ�ڰ���";
		member1.phone = 119;
		MyVariable.address = "��⵵ ���ν�";

		MyVariable member2 = new MyVariable();
		member2.id = "�̼���";
		member2.pwd = "���ѵ�����";
		member2.phone = 112;
		MyVariable.address = "��⵵ ������";

		System.out.println("member1�� id = " + member1.id);
		System.out.println("member1�� pwd = " + member1.pwd);
		System.out.println("member1�� phone = " + member1.phone);
		System.out.println("member1�� address = " + member1.address);

		System.out.println("member2�� id = " + member2.id);
		System.out.println("member2�� pwd = " + member2.pwd);
		System.out.println("member2�� phone = " + member2.phone);
		System.out.println("member2�� address = " + member2.address);
	}
}
