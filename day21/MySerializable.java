package io.day3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MySerializable {
	
	// == ����ȭ(��ü�� ���Ϸ� �����ϱ�) ==
	public void objectToFileSave(Object obj,String filename){
		
		try {
			FileOutputStream fost = new FileOutputStream(filename, false);
			BufferedOutputStream bost = new BufferedOutputStream(fost, 1024);
			// ��ü�� ���Ͽ� �����ϴ� ��Ʈ��
			ObjectOutputStream oost = new ObjectOutputStream(bost);
			
			oost.writeObject(obj); // ��ü�� ���Ͽ� ��������ִ�  �޼ҵ�
			
			oost.close();
			bost.close();
			fost.close();
		} catch (FileNotFoundException e) {
			System.out.println(filename + "���ϸ��� �����ϴ�.");
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	// == ������ȭ(���Ͽ� ����� ��ü�� �ҷ��� ��ü�� �����ν����ִ� ��)
	public Object getObjectfromFile(String filename) {
		Object result = null;
		
		try {
			
			FileInputStream fist = new FileInputStream(filename);
			BufferedInputStream bist = new BufferedInputStream(fist, 1024);
			
			// ���Ͽ� ����� ��ü������ �о�帮�� ��Ʈ��
			ObjectInputStream oist = new ObjectInputStream(bist);
			Object obj = oist.readObject(); // ���ϼӿ� ����� ��ü������ �о ��ü�� ������ִ� �޼ҵ� ȣ��
			
			result = obj;
			oist.close();
			bist.close();
			fist.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(filename +"������ �����ϴ�");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return result;
	}


}