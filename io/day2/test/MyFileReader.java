package io.day2.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class MyFileReader {

	public void fileOpen(String fileName) {
		
		try {
			// == 입력 노드 스트림 생성           ==> FileReader
			FileReader fReader = new FileReader(fileName);
			
			// == 입력 필터(보조)스트림 생성   ==> BufferedReader
			BufferedReader bufReader = new BufferedReader(fReader); 
			
		
			// 출력 노드 스트림 생성            ==> System.out -> OutputStreamWriter 
			OutputStreamWriter ostWriter = new OutputStreamWriter(System.out);  
						
			// 출력 필터(보조)스트림 생성    ==> BufferedWriter
			BufferedWriter bufWriter = new BufferedWriter(ostWriter);
			
			String str = "";
						
			while ( (str = bufReader.readLine()) != null ) {
				
				bufWriter.write(str);
				bufWriter.newLine();
				bufWriter.flush();
				
			}// end of while---------------------------
			
			bufWriter.close();
			ostWriter.close();
			bufReader.close();
			fReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // end of void fileOpen(String fileName)-----------------
	
	
	public void fileOpen2(String fileName) {
		
		try {
			// == 입력 노드 스트림 생성           ==> FileReader
			FileReader fReader = new FileReader(fileName);
			
			// == 입력 필터(보조)스트림 생성   ==> BufferedReader
			BufferedReader bufReader = new BufferedReader(fReader); 
			
		
			// 출력 노드 스트림 생성            ==> System.out -> OutputStreamWriter 
			OutputStreamWriter ostWriter = new OutputStreamWriter(System.out);  
						
			// 출력 필터(보조)스트림 생성    ==> PrintWriter
			PrintWriter printWriter = new PrintWriter(ostWriter, true);
			
			String str = "";
						
			while ( (str = bufReader.readLine()) != null ) {
				
				printWriter.println(str);
				
			}// end of while---------------------------
			
			printWriter.close();
			ostWriter.close();
			bufReader.close();
			fReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	} // end of void fileOpen2(String fileName)-----------------	
	
	
}
