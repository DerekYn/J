/*
 	=== ArrayList ===		삭제 / 추가가 빈번하지 않으면 사용!!
 	
 	1. 출력시 저장된 순서대로 나온다.
 	2. 중복된 데이터를 저장할 수 있다.
 	3. 데이터를 읽어오는 속도는 ArrayList가 LinkedList 보다 상대적으로 빠르다.
 	4. 순차적으로 데이터를 추가 / 삭제 하는 경우에는 ArrayList가 LinkedList 보다 상대적으로 빠르다.
 	5. 일반적으로 데이터 추가 / 삭제는 데이터 중간마다 발생하므로 이러한 경우에는 ArrayList가 LinkedList 보다 상대적으로 느리다.
 	6. 결과값은 ArrayList를 사용하든지 LinkedList를 사용하든지 동일한 결과값을 가진다.
 	7. LinkedList 보다는 ArrayList를 사용하도록 하자.
 */



package my.day19;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestMain {
	
	public static void main(String args[]) {
		
		// Member 클래스의 객체를 저장할 수 있는 ArrayList 객체 memberList 를 생성하시오.
		
		List<Member> memberList = new ArrayList<Member>();
		
		//  Member 클래스의 객체 6개를 생성하여 memberList 에 저장하세요.
		memberList.add(new Member("cksdud0830", "!@Ka1u8j1", "윤찬영", 27, "수지"));
		memberList.add(new Member("gudwnsdhQk..", "rkawkxkd", "송아라", 26, "시골구로"));
		memberList.add(new Member("평양으로 가즈아", "김일성장군님", "조정래", 27, "광주"));
		memberList.add(new Member("배불뚝이회사동료♥", "hafsjdf123", "조성수", 27, "한양"));
		memberList.add(new Member("Hey, BangAs", "lovefishes", "실장님", 47, "천안"));
		
		Member mem1 = new Member("여주cc", "golfman", "정동우", 27, "여주");
		Member mem2 = mem1;
		
		memberList.add(mem1);
		memberList.add(mem2);
		
		memberList.add(new Member("Gey", "Billy", "김진", 27, "신촌"));
		// 김진 객체를 맨 뒤에 추가함.
		
		for(int i=0; i<memberList.size(); i++) {
			System.out.println(memberList.get(i).showInfo());
			System.out.println();
		}
		
		System.out.println("=============================================================");
		
		for(Member mem : memberList) {
			System.out.println(mem.showInfo());
			System.out.println();
		}
		
		System.out.println("========== 객체를 특정 인덱스 위치에 추가하기 ==============");

		memberList.add(new Member("Hey, BangAs", "lovefishes", "실장님", 47, "천안"));
		// 그냥 add를 하면 맨 뒤에 추가됨
		
		for(Member mem : memberList) {
			System.out.println(mem.showInfo());
			System.out.println();
		}
		
		System.out.println("=========================================================");
		
		memberList.add(1, new Member("대한", "민국", "설현", 6, "서울"));
		// 인덱스 번호를 주면 그 곳에 저장됨
		
		for(Member mem : memberList) {
			System.out.println(mem.showInfo());
			System.out.println();
		}
		
		System.out.println("========== 객체를 특정 인덱스 위치에 있는것과 교체하기 ==============");
		
		memberList.set(1,  new Member("suji", "qwer", "수지", 22, "경기도 용인시 수지구"));
		// 기존 인덱스 번호 1 위치에 있던 기존 객체를 제거하고 그 위치에 새로운 객체가 들어감.
		
		for(Member mem : memberList) {
			System.out.println(mem.showInfo());
			System.out.println();
		}
		
		System.out.println("========== 객체를 특정 인덱스를 삭제하기 ==============");
		
		memberList.remove(1);
		
		for(Member mem : memberList) {
			System.out.println(mem.showInfo());
			System.out.println();
		}
		
		for(Member mem : memberList) {
			if(mem.getId().equals("수지")) {
				memberList.remove(mem);
			}
			
		}
		
		/*System.out.println("========== 모든 객체를 삭제하기 ==============");
		
		memberList.clear();
		
		for(Member mem : memberList) {
			System.out.println(mem.showInfo());
			System.out.println();
		}*/
		

	}

}
