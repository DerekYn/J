/*
 		=== HashSet ===
 		1. 출력시 저장된 순서가 유지되지 않는다.
 		2. 중복된 데이터를 저장할 수 없다.
 		      그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할 때 많이 사용된다.
 		      
 		      
 		=== LinkedHashSet ===
 		1. 
 		
 */




package my.day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetTestMain {

	public static void main(String[] args) {
		
		System.out.println("\n================ Hash Set ==================\n");
		
		// Member 클래스의 객체를 저장할 수 있는 HashSet 객체 memberSet 을 생성
		Set<Member> memberSet = new HashSet<Member>();
			
		//  Member 클래스의 객체 6개를 생성하여 memberSet 에 저장하세요.
		memberSet.add(new Member("cksdud0830", "!@Ka1u8j1", "윤찬영", 27, "수지"));
		memberSet.add(new Member("gudwnsdhQk..", "rkawkxkd", "송아라", 26, "시골구로"));
		memberSet.add(new Member("평양으로 가즈아", "김일성장군님", "조정래", 27, "광주"));
		memberSet.add(new Member("배불뚝이회사동료♥", "hafsjdf123", "조성수", 27, "한양"));
		memberSet.add(new Member("Hey, BangAs", "lovefishes", "실장님", 47, "천안"));
		
		Member mem1 = new Member("여주cc", "golfman", "정동우", 27, "여주");
		Member mem2 = mem1;
		
		memberSet.add(mem1);
		memberSet.add(mem2);
		
		memberSet.add(new Member("Gey", "Billy", "김진", 27, "신촌"));
		// 김진 객체를 맨 뒤에 추가함.
		
		Iterator<Member> it = memberSet.iterator();
		
		while(it.hasNext()) {	// it에 대해 다음것이 있을 시 참을 리턴                        그리고 it에 대한 모든 객체들이 소진되서 다음번에 it.hasNext()를 하면 아무것도 안뜬다.
			Member member = it.next();
			System.out.println(member.showInfo());
		}
		
		System.out.println("\n===================== 삭제 해보기 =========================\n");
		
		it = memberSet.iterator();			// 이렇게 다시 대입해줘야 it.hasNext()를 사용할 수 있따.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">>> 삭제할 아이디 : ");
		String id = sc.nextLine();
		
		while(it.hasNext()) {
			Member member = it.next();
			if(member.getId().equals(id)) {
				memberSet.remove(member);
				break;
			}
		}
		
		System.out.println("\n================= 삭제 후 남은 데이터 정보 ==================\n");
		
		it = memberSet.iterator();
		
		while(it.hasNext()) {
			Member member = it.next();
			System.out.println(member.showInfo());
		}
		
		
		System.out.println("\n================ LinkedHashSet ==================\n");
		
		// Member 클래스의 객체를 저장할 수 있는 HashSet 객체 memberSet 을 생성
		Set<Member> memberSet2 = new LinkedHashSet<Member>();
			
		//  Member 클래스의 객체 6개를 생성하여 memberSet 에 저장하세요.
		memberSet.add(new Member("cksdud0830", "!@Ka1u8j1", "윤찬영", 27, "수지"));
		memberSet.add(new Member("gudwnsdhQk..", "rkawkxkd", "송아라", 26, "시골구로"));
		memberSet.add(new Member("평양으로 가즈아", "김일성장군님", "조정래", 27, "광주"));
		memberSet.add(new Member("배불뚝이회사동료♥", "hafsjdf123", "조성수", 27, "한양"));
		memberSet.add(new Member("Hey, BangAs", "lovefishes", "실장님", 47, "천안"));
		
		Member mem3 = new Member("여주cc", "golfman", "정동우", 27, "여주");
		Member mem4 = mem1;
		
		memberSet.add(mem3);
		memberSet.add(mem4);
		
		memberSet.add(new Member("Gey", "Billy", "김진", 27, "신촌"));
		// 김진 객체를 맨 뒤에 추가함.
		
		Iterator<Member> it2 = memberSet.iterator();
		
		while(it2.hasNext()) {	// it에 대해 다음것이 있을 시 참을 리턴                        그리고 it에 대한 모든 객체들이 소진되서 다음번에 it.hasNext()를 하면 아무것도 안뜬다.
			Member member = it2.next();
			System.out.println(member.showInfo());
		}
		
		System.out.println("\n==================== 삭제 해보기 ====================\n");
		
		it2 = memberSet2.iterator();			// 이렇게 다시 대입해줘야 it.hasNext()를 사용할 수 있따.
			
		System.out.print(">>> 삭제할 아이디 : ");
		String id2 = sc.nextLine();
		
		while(it2.hasNext()) {
			Member member = it2.next();
			if(member.getId().equals(id2)) {
				memberSet2.remove(member);
				break;
			}
		}
		
		System.out.println("\n================= 삭제 후 남은 데이터 정보 ==================\n");
		
		it2 = memberSet2.iterator();
		
		while(it2.hasNext()) {
			Member member = it2.next();
			System.out.println(member.showInfo());
		}

	}

}
