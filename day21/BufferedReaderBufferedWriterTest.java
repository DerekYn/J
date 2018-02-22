package io.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedReaderBufferedWriterTest {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader istReader = new InputStreamReader(System.in);
		// Ű���忡�� �Է��ϴ� ���� 1byte ����ε� �̰��� 2byte ������� �����Ѵ�.
		BufferedReader bufReader = new BufferedReader(istReader, 1024);
		// ���ͽ�Ʈ��
		
		OutputStreamWriter ostWriter = new OutputStreamWriter(System.out);
		// ����Ϳ� ����ϴ� ���� 1byte ����ε� �̰��� 2byte ������� �����Ѵ�.
		BufferedWriter bufWriter = new BufferedWriter(ostWriter, 1024);
		// ���ͽ�Ʈ��
		
		bufWriter.write("������ �Է��ϼ��� => ");
		bufWriter.flush();
		String str = "";
		
		while( (str = bufReader.readLine()) != null) {
			/*
			  	readLine() �޼ҵ带 ����ϸ� �о���̴� ������ 1�� ������ �о���δ�.
			  	���⼭ 1���� ���� ����(\r\n)�̹Ƿ� ���������� �о���δ�.
			  	�߿��� ���� ���������� �о���̹Ƿ� ���ʹ� ���� �ʴ´�.
			 */
			bufWriter.write(str);
		//	bufWriter.write("\r\n");
			bufWriter.newLine();  // �ٺ���
			bufWriter.flush();
			
		}
		
		bufWriter.close();
		ostWriter.close();
		bufReader.close();
		istReader.close();
	}

	
}