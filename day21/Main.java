package io.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static {
		User user1 = new User("�Ѽ���", 31, "����� ������ ��ȭ��");
		User user2 = new User("�μ���", 25, "��⵵ ����� ö�굿");
		User user3 = new User("������", 28, "����� ���￪ 1���ⱸ");
		User user4 = new User("�׼���", 27, "����� �������Ա��� 2���ⱸ");
		
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		
		MySerializable mysr = new MySerializable();
		mysr.objectToFileSave(userList, "c:/iotestdata/userinfo.txt");
	}
	
	public static void menu() {
		System.out.println("\n ======== <�޴�> ==============");
		System.out.println("1. ���Ͽ� ����� ��ü������ �ҷ�����");
		System.out.println("2. ���ɴ� �˻�");
		System.out.println("3. ����");
		System.out.println("=================================");
		System.out.println("�� �޴���ȣ ���� => ");
		
	}

	public static void main(String[] args) {
		
		MySerializable mysr = new MySerializable();
		Object obj = null;
		List<User> userList = null;
		
		Scanner sc = new Scanner(System.in);
		String menuNo = "";
		do {
			
			Main.menu();
			menuNo = sc.nextLine();
			
			switch (menuNo) {
			case "1":
				obj = mysr.getObjectfromFile("c:/iotestdata/userinfo.txt");
				
				if(obj != null) {
					
					userList = (List<User>)obj;
					for(User user : userList) {
						System.out.println(user);
					}
				}
				break;
			case "2":
				try {
					int age = 0;
					System.out.print("�˻��Ͻ� ���̴븦 �Է����ּ��� : ");
					age = Integer.parseInt(sc.nextLine());
					int flag = 0;
					obj = mysr.getObjectfromFile("c:/iotestdata/userinfo.txt");
					userList = (List<User>)obj;
					for(User user : userList) {
						if((user.getAge()/10) == age/10) {
							System.out.println(user);
							flag = 1;
						}
					}
					if(flag == 0) {
						System.out.println("�˻��Ͻ� ���ɴ밡 �����ϴ�.");
					}
					
				}catch (NumberFormatException e) {
					System.out.println("���̴� ���ڸ� �Է°��� �մϴ�");
				}
					
				
				break;
				
			case "3":
				System.out.println(">> ���α׷� ����");
				break;
			default : 
	
				break;
			}
			
		}while(!(menuNo.equals("3")));
		sc.close();

	}

}