/*
  	>>> File Ŭ���� <<<
  	-- �ڹٿ��� �����̶����� �ΰ����� �ִ�.
  	-- ù����, Ȯ���ڰ� ������ ����(���丮)�� ���ϸ�,
  	-- �ι�°, Ȯ���ڰ� ������ ������ ���Ѵ�.
  	
 */

package io.day3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> Ž���⿡ �����ϴ� ���ϸ��� �Է��ϼ��� : ");
		String fileName = sc.nextLine();
		
		File file = new File(fileName);
		System.out.println("���ϸ� : " + file.getName());
		
		long fileSize = file.length();
		System.out.println("���� ũ�� " + fileSize + "byte");
		
		String path = file.getPath();
		System.out.println("���� ��θ� : " + path );
		
		System.out.println("\n ====== ���丮 �����ϱ� ======");
		
		File dir = new File("Mydir");
		
		String result = (dir.exists()?"������":"�������� ����");
		System.out.println(dir.getName()+ "�� " + result);
		
		boolean bool = false;
		if(!dir.exists()) { //�ش� ���丮�� ����
			bool = dir.mkdir();	// ���丮 MyDir �� �����ض�
			
			result = bool?"���丮 ���� ����!!":"���丮 ���� ����!!";
			System.out.println("MyDir " + result);
			
			if(bool) {
				System.out.println("MyDir ���丮�� ����� : " + dir.getPath());
				System.out.println("MyDir ���丮�� ������ : " + dir.getAbsolutePath());
			}
			
		}
		
		System.out.println("\n ====== ���丮 �����ϱ� ======");
		// ������ �϶��� ����
		File dir2 = new File("TestDir");
		bool = dir2.delete();
		result = bool?"���丮 ���� ����!!":"���丮 ���� ����!!";
		System.out.println("TestDir" + result);
		
		System.out.println("\n\n ========= ���� �����ϱ� ==========");
		File file2 = new File("c:/Iotest/�׽�Ʈ.txt");
		
		bool = false;
		if(!file2.exists()) {
			try {
				bool = file2.createNewFile();
				result = bool?"���� ���� ����!!":"���� ���� ����!!";
				System.out.println(file2.getName() + result);
				System.out.println(file2.getName() +"���丮�� ����� : " + dir.getPath());
				System.out.println(file2.getName() +"���丮�� ������ : " + dir.getAbsolutePath());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		bool = file2.delete();
		result = bool?"���� ���� ����!!":"���� ���� ����!!";
		System.out.println("�׽�Ʈ.txt" + result);
		
	}

}