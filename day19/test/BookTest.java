package my.day19.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BookTest {

	public static void main(String[] args) {

		Map<String, Book> map = new HashMap<String, Book>();
		
		map.put("SQL PLUS", new Book("IT", "SQL PLUS", 50000, 5));
		map.put("JAVA 2.0", new Book("IT", "JAVA 2.0", 40000, 3));
		map.put("JSP Servlet", new Book("IT", "JSP Servlet", 60000, 6));
		map.put("davinci code", new Book("Novel", "davinci code", 30000, 10));
		map.put("coloven hoof", new Book("Novel", "coloven hoof", 50000, 5));
		
		Set<String> keys = map.keySet();			// 모든 키값들을 출력
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " = " + map.get(key));
		}
		
		
	}
	
}
