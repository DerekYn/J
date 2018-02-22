/*
  	>>> PrintWriter <<<
  	-- ���ڿ� ��½� ���Ǵ� 2byte ����� ���ͽ�Ʈ���̴�.
	-- BufferedWriter �� ������ 2byte ����� ���ͽ�Ʈ��������
	      �̰��� ����ؼ� ������ִ� write()�޼ҵ�� �ڵ��� ������ ����.
	      �׷��� PrintWriter �� ����ϸ� println(), print() �޼ҵ带 ����Ͽ�  �ٺ����� ���ش�.
	      ���� PrintWriter �� ����ϸ� write() �޼ҵ嵵 ��밡���ϴ�.
	      
	== PrintWriter Ŭ������ autoFlush ==
	��¹��۸� �󸶳� ���� flush �ؾ��ұ�?
	
	flush ��?
	- ��¹��ۿ� �ӽ÷� �����Ǿ� ��Ʈ������ ��µ� ������ ������� �����͸� ��Ʈ������ ������ ���� flush ����Ѵ�.
	    ���ͽ�Ʈ���� BufferedWriter Ŭ������ ���۰� �������ų� ��Ʈ���� ���������� ���� �� flush() �޼ҵ带 �ڵ����� ȣ���Ѵ�.
	  BufferedWriter Ŭ������ flush() �޼ҵ尡 ȣ��Ǳ� �������� ���ۿ� �ӽ÷� ������ �����ʹ� ��Ʈ������ ������ ��µ��� �ʰ� ���ۿ� ����ϰ� �ְ� �ȴ�.
	
	�׷��� ���ͽ�Ʈ������ BufferedWriter ���ٴ� �ַ� PrintWriter �� ����ϴ� ������
	printXXX(print(), println()) Method ���� ����ϱ� ���ؼ��̴�.
	���� PrintWriter Ŭ������ ������ �߿� autoFlush �ɼ��� �ִ� ���� �ִ�.
	�� �ɼ��� true ������ �����Ǹ� print() �Ǵ� write() �޼ҵ��� ��쿣 ���������,
	println() �޼ҵ尡 ȣ��Ǹ� �ڵ����� flush() �޼ҵ带 ȣ���Ѵ�
	�׷���, ������ �� �ɼ��� ����ϸ� ����ġ�� ����ϰ� ���۸� ���� ������ �߻��Ѵ�.
 */

package io.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class PrintWriterTest {

public static void main(String[] args) throws IOException{
		
		InputStreamReader istReader = new InputStreamReader(System.in);
		// Ű���忡�� �Է��ϴ� ���� 1byte ����ε� �̰��� 2byte ������� �����Ѵ�.
		BufferedReader bufReader = new BufferedReader(istReader, 1024);
		// ���ͽ�Ʈ��
		
		OutputStreamWriter ostWriter = new OutputStreamWriter(System.out);
		// ����Ϳ� ����ϴ� ���� 1byte ����ε� �̰��� 2byte ������� �����Ѵ�.
		PrintWriter printWriter = new PrintWriter(ostWriter, true);	// ���ͽ�Ʈ��  		
		/*
		  	new PrintWriter(ostWriter, true);
		  	�ι�° �Ķ������ ���� true �� �ָ�
		  	true�� �ǹ̴� ���๮��(����)�� ������ ���� �ڵ����� flush() �޼ҵ尡 �۵��� �Ѵ�.
		  	print() �Ǵ� write()�޼ҵ��� ��쿡�� ����̾���.
		 */
		printWriter.println("������ �Է��ϼ��� => ");
		
		String str = "";
		
		while( (str = bufReader.readLine()) != null) {
			/*
			  	readLine() �޼ҵ带 ����ϸ� �о���̴� ������ 1�� ������ �о���δ�.
			  	���⼭ 1���� ���� ����(\r\n)�̹Ƿ� ���������� �о���δ�.
			  	�߿��� ���� ���������� �о���̹Ƿ� ���ʹ� ���� �ʴ´�.
			 */
			printWriter.println(str);
			
		}
		
		printWriter.close();
		ostWriter.close();
		bufReader.close();
		istReader.close();
	}

}