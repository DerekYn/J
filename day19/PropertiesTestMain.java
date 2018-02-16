/*
 	Properties는 HashMap 의 구버전인 Hashtable 을 상속받아 구현한 것으로,
 	Hashtable 은 키와 값(Object, Object)의 형태로 저장하는데 비해서
 	Properties는 (String, String) 의 형태로 저장하는 단순화된 컬렉션이다.
 	키는 고유해야 한다. 즉, 중복을 허락하지 않는다. 중복된 값을 넣으면 마지막에 넣은 값으로 덮어씌운다.
 	주로 어플리케이션의 환경설정과 롼련된 속성(property)을 저장하는데 사용하며,
 	텍스트 데이터를 파일로 부터 읽고 쓰는데 사용한다.
 */


package my.day19;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTestMain {

	public static void main(String[] args) {

		Properties prop = new Properties();
		
		prop.setProperty("jdk", "http://www.oracle.com/technetwork/java/javase/downloads/index.html");
		prop.setProperty("eclipse", "https://www.eclipse.org/downloads/download.php?file=/oomph/epp/oxygen/R2/eclipse-inst-win64.exe");
		prop.setProperty("eclipse", "http://www.oracle.com/technetwork/database/enterprise-edition/downloads/index.html");
		prop.setProperty("DB", "http://www.oracle.com/technetwork/database/database-technologies/express-edition/downloads/index.html");
		
		String url = prop.getProperty("eclipse");
		
		System.out.println(url);
		
		System.out.println("\n======================================================================\n");
		
		Enumeration<String> en = (Enumeration<String>)prop.propertyNames();
								// 키 목록을 Enumeration 형태로 반환시켜줌.
		
		while(en.hasMoreElements()) {
			
			String key = en.nextElement();
			System.out.print(key);
			System.out.print(" = ");
			System.out.println(prop.getProperty(key));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// end of main()-------------------------------------------------------------------------------

}
