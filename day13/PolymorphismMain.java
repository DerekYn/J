/*
 	=== *** Polymorphism(다형성) *** ===
 	--> 자식 클래스로 생성된 객체는 부모클래스의 타입으로 받을 수 있다.
 		이것을 Polymorphsim(다형성) 이라고 부른다.
 		
 */

package my.day13;

import my.day13.sub.Man;
import my.day13.sub.Woman;

public class PolymorphismMain {

	public static void main(String[] args) {
		
		Human[] hmArr = new Human[5];
		
		Human hm = new Human("인간", 173.8, 69);
		Man man = new Man("남자군", 177.6, 89, "2011-08-29");
		Woman woman = new Woman("여자양", 167.2, 48, "2020-01-08");
		Human hmman = new Man("남운도", 189.1, 76, "2014-06-07");
		Human hmwoman = new Woman("여수지", 157.6, 43, "2019-09-03");

		hmArr[0] = hm;
		hmArr[1] = man;
		hmArr[2] = woman;
		hmArr[3] = hmman;
		hmArr[4] = hmwoman;
		
		for(int i=0; i<hmArr.length; i++) {
			if(hmArr[i] instanceof Man) {
				// Human 배열속에 저장된 hmArr[i] 객체가 Man 클래스의 객체입니까?
				((Man)hmArr[i]).showInfo();
				System.out.println();
			}
			else if(hmArr[i] instanceof Woman) {
				((Woman)hmArr[i]).showInfo();
				System.out.println();
			}
			else {
				hmArr[i].showInfo();
				System.out.println();
			}
				
		}
	}

}
