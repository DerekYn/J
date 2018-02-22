package io.day3;

import java.util.Scanner;

public class Main2 {
		
	public static void insert(MySerializable mysr ,Scanner sc) {
		
		int flag = 0;
		int age = 0;
		
		System.out.print("������ �Է����ּ��� :");
		String name = sc.nextLine();
		
		do {
			
			try {
				System.out.print("���̸� �Է����ּ��� : ");
				int agetest = Integer.parseInt(sc.nextLine());
				if(agetest <= 0) {
					System.out.println("���̴� 1���̻� �Է� �����մϴ�.");
				}else {
					age = agetest;	
				}
				
			} catch (NumberFormatException e) {
				System.out.println("���̴� ���ڸ� �Է� �����մϴ�.");
			}
			
		} while (!(age > 0));
		
		System.out.print("�ּҸ� �Է����ּ��� : ");
		String addr = sc.nextLine();
		
		System.out.println("���� : " + name);
		System.out.println("���� : " + age + "��");
		System.out.println("�ּ� : " + addr);
		System.out.print("����Ͻðڽ��ϱ�??[Y,N]");
		String cho = sc.nextLine();
		
		if(cho.toLowerCase().equals("y")) {
			User user = new User(name, age, addr);
			mysr.objectToFileSave(user, "c:/iotestdata/userinfo1.txt" );
			System.out.println("��� �Ϸ�");
			
		}else {
			System.out.println("����Ͽ����ϴ�");
		}
	}
	
	public static void menu() {
		System.out.println("\n ======== <�޴�> ==============");
		System.out.println("1. ȸ�� �߰��ϱ�");
		System.out.println("2. ȸ�� ���� Ȯ��");
		System.out.println("3. ����");
		System.out.println("�� �޴���ȣ ���� => ");
	}
	

	public static void main(String[] args) {
		
		MySerializable mysr = new MySerializable();
		
		Object obj = null;
		Scanner sc = new Scanner(System.in);
		
		String snum = "";
		do {
			menu();
			snum = sc.nextLine();
			switch (snum) {
			case "1":
				insert(mysr, sc);
				break;
			case "2":
				obj = mysr.getObjectfromFile("c:/iotestdata/userinfo1.txt");
				if(obj == null) {
					System.out.println("��ϵ� ȸ�������� �����ϴ�.");
				}else {
					User user = (User)obj;
					System.out.println(user);
				}
				break;
			case "3":
				System.out.println(">> �����մϴ�");
				
				break;

			default:
				break;
			}
			
		} while (!(snum.equals("3")));
		
		
		
		

	}

}