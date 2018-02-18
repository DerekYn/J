 /*
  		==== Map 계열 ====
  		
  		1. HashMap 과 Hashtable, Properties가 있다.
  		2. Map 계열은 List 계열 (Vector, ArrayList, LinkedList) 처럼 index가 사용되어 저장되는 것이 아니라
  		   Map 계열은 key 값과 value값을 쌍으로 사용되어 저장하는데
  		      데이터 저장시 사용되는 메소드 put(String key, Object value) 메소드를 사용한다.
  		      이때 key 값은 반드시 고유한 값을 가져야 하고, value 값은 중복된 값이 와도 괜찮다. 
  		3. Map 계열에 저장된 key 값들은 순서와는 관계없이 저장된다.
  		4. Map 계열에 저장된 value 값을 추출하려면 반드시 key를 이용해서 가져오는데
  		   value 값의 추출은 get(String key) 메소드를 사용한다.
  */




package my.day19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTestMain {

	public static void main(String[] args) {
		
		// Member 클래스의 객체를 저장할 수 있는 HashMap 객체 map 을 생성
		Map<String, Member> map = new HashMap<String, Member>();
			
		//  Member 클래스의 객체 6개를 생성하여 HashMap 에 저장하세요.
		map.put("cksdud0830", new Member("cksdud0830", "!@Ka1u8j1", "윤찬영", 27, "수지"));
		map.put("gudwnsdhQk..", new Member("gudwnsdhQk..", "rkawkxkd", "송아라", 26, "시골구로"));
		map.put("평양으로 가즈아", new Member("평양으로 가즈아", "김일성장군님", "조정래", 27, "광주"));
		map.put("배불뚝이회사동료♥", new Member("배불뚝이회사동료♥", "hafsjdf123", "조성수", 27, "한양"));
		map.put("Hey, BangAs", new Member("Hey, BangAs", "lovefishes", "실장님", 47, "천안"));
		
		Member mem1 = new Member("여주cc", "golfman", "정동우", 27, "여주");
		Member mem2 = mem1;
		
		map.put("여주cc", mem1);
		map.put("이천cc", mem2);
		
		map.put("Gey", new Member("Gey", "Billy", "김진", 27, "신촌"));
		// 김진 객체를 맨 뒤에 추가함.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 ID 명 : ");
		String id = sc.nextLine();
		
		Member mem = map.get(id);
		
		if(mem != null)
			System.out.println(mem.showInfo());
		else
			System.out.println(">>> 검색하려는 ID명 " + id + "는 존재하지 않습니다.");
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("##################################################################");
		
		
		/*
		 	=== map 에 저장된 모든 Member 들의 정보를 출력하세요 ===
		 	map 에 저장된 모든 키 값들을 안다라면 추출이 가능하다.
		 	map 에 저장된 모든 키 값들을 출력해 주는 메소드가 keySet() 메소드이다.
		 	
		 */
		
		Set<String> keysets = map.keySet();			// 모든 키값들을 출력
		for(String key : keysets) {
			System.out.println(key);
		}
		
		System.out.println("\n ==== keySet() 메소드를 사용하여 map 에 저장된 모든 value 값 출력 ====\n");
		for(String key : keysets) {
			Member member = map.get(key);
			System.out.println(member.showInfo());
		}
		
		System.out.println("\n ==== values() 메소드를 사용하여 map 에 저장된 모든 value 값 출력 ====\n");
		Collection<Member> collect = map.values();
		
		/*
		 	HashMap 객체명.values() 메소드는 
		 	HashMap 객체명(map)에 저장된 value 값만 뽑아주는 메소드이다.
		 	Collection 타입 단독으로는 사용이 불가하며,
		 	interator() 메소드를 사용하여 Iterator 타입으로 변경해야만 사용가능하다. 
		 */
		Iterator<Member> itMember = collect.iterator();
		
		while(itMember.hasNext()) {
			Member member = itMember.next();
			System.out.println(member.showInfo());
		}
		
		sc.close();
		
	}

}
