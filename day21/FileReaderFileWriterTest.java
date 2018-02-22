/*
 	>>>> FileReader / FileWriter
 
 	-- ��彺Ʈ�� : ���ϰ� ����
 	-- 2byte ��� ���� ��Ʈ��
 */

package io.day2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileReaderFileWriterTest {

	public static void main(String[] args) {
	
		String filename = "c:/Iotestdata/�̱�ȣ�����Ը���.txt";
		
		try {
			FileWriter fwriter = new FileWriter(filename);
			
			
			for(int i=1; i<=100; i++) {
				fwriter.write("�ٹ�ȣ : " + i + " ���������ϼ���~~~\r\n");
				fwriter.flush();
			}
			
		System.out.println(filename + "������ Ȯ���ϼ���");
		System.out.println("\n==================================================----\n");
		
		FileReader freader = new FileReader(filename);
		/*
		  	2byte ������� �Ǿ��� �����͸� �о�ͼ� ����Ϳ� ����ϱ� ���ؼ� System.out �� ����ؾ��Ѵ�
		  	�׷��� System.out �� 1byte ����̹Ƿ� �ٷ� ����� �� ����.
		  	�׷��� 1byte ����� ��³�彺Ʈ���� 2byte ����� ��³�彺Ʈ������ ������ �ش�.
		  	
		  	InputStreamReader ==> 1byte ����� �Է� ��Ʈ���� 2byte ����� �Է½�Ʈ������ �������ִ� ��.
		  	OutputStreamReader ==> 1byte ����� ��� ��Ʈ���� 2byte ����� ��½�Ʈ������ �������ִ� ��.
		  	
		 */
		OutputStreamWriter ostwriter = new OutputStreamWriter(System.out);
		char[] dataArr = new char[256];
		int inputlength = 0;
		while((inputlength = freader.read(dataArr)) != -1) {
		
			ostwriter.write(dataArr, 0, inputlength);
			ostwriter.flush();
		}
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}