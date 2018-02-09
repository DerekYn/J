


package my.day13;

import my.day13.sub.Man;
import my.day13.sub.Woman;
 
public class InheritanceTestMain {

	public static void main(String[] args) {
		
		Man man = new Man();
		man.name = "윤찬영";
		man.height = 183.5;
		man.setWeight(71);
		man.enlistDay = "2018-02-09";
		
		Woman woman = new Woman();
		woman.name = "배은정";
		woman.height = 153.5;
		woman.setWeight(42);
		woman.childBrithDay = "2018-02-08";
		
		man.showInfo();
		man.printEnlistDay();
		System.out.println();
		woman.showInfo();
		woman.printChildBrithDay();
		
		System.out.println("=========================================\n");
		
		System.out.println("man => " + man);
		System.out.println("");
		System.out.println("woman => " + woman);
		
		System.out.println("=========================================\n");
		
		man.smile(3); 	// 사람이 3번 웃습니다.
		System.out.println();
		woman.smile(2);
		
		System.out.println("=========================================\n");
		
		Man man2 = new Man("슈퍼맨", 188.5, 97, "2014-03-12");
		System.out.println("man2 => " + man2);
		
		System.out.println("=========================================\n");
		
		Woman woman2 = new Woman("배은정", 153.5, 42, "2020-09-08");
		woman.printInfo();
		
	}

}
