/*
 	==== *** 객체지향 프로그래밍(Object Oriented Programming)이란? *** ===
 	  ※ OOP 의 4가지 특징
 	   --> 1. 상속성
 	   --> 2. 추상화
 	   --> 3. 캡슐화
 	   --> 4. 다형성
 	
 	부동산 관리 어플리케이션 프로그래밍 제작 시 필요한 요소(부품)를 생각해보자.
 	아주 다양하고, 많은 요소들이 필요할 것이다.
 	
 	예를들어,
 	집, 매도자, 매수자, 중개인 ...... 등등 많다.
 	이러한 요소(부품)들이 바로 객체(Object)인데, 이 객체를 만드는 설계도면이 클래스이다.
 	
 	위와(부동산 관리 어플리케이션 프로그래밍 제작) 같이 현실세계에 존재하는
 	다양한 객체들을 각각 하나하나 추상화 시켜서 클래스로 옮기는 것을
 	객체지향 프로그램(Object Oriented Programming)이라고 한다.
 	
 	여기서 추상화 란?
 	 ==> 일반적인 의미의 추상화(Abstraction)란?
 	 	  -- 어떤 물체(Object)에서 주된 특징을 부각시켜 표현하고,
 	 	          나머지 부분은 과감하게 생략하는 것을 말한다.
 	 	 추상화릐 반대는 아주 시시콜콜한 것(세세한 것)까지 전부 몽땅 다 묘사하는 것을
 	 	 말하는데 이것은 정밀화 라고 한다.
 	 	 그래서, 추상화라는 것은 객체의 아주 세세한 모든것들을 속성(property)으로
 	 	 지정하는 것이 아니라, 프로그래밍에서 필요한 부분만 속성(property)으로
 	 	 뽑아내는 것을 추상화라고 한다.
 	 	 
 	※	객체지향 프로그래밍(Object Oriented Programming)에서 사용되는 추상화도
 	 	이와 비슷하다. 어떤 하나의 물체를 대표하는 속성(명사, 맴버변수)과 기능(동사, 메소드)을
 	 	추출하는것을 OOP 프로그래밍에서는 추상화라고 한다.
 	 	
 	 	예: > DB에서 테이블명		  ==>  컬럼, 컬럼, 컬럼... (행)
 	 		  	  employees   ==>  사원번호, 사원명, 주민번호, 입사일, 급여...(사원)
 	 		  	  
 	 		 OOP에서는 클래스명	  ==>  멤버변수(명사, 컬럼명에 해당), 메소드(동사, 함수에 해당)
 	 		 
 		 	  실제 DB에서 조회(Select)해온 직원의 정보를 프로그래밍에서 다루고자 한다면
 		 	  직원의 정보를 담을 변수가 필요하다.
 		 	  이러한 직원의 정보를 담을 부품(객체변수)이 필요한데 이것이 바로 객체(Object)이다.
 		 	  직원정보를 담을 부품        ==>  객체(Object)
 		 	  
 		>> 예를 들어, 부동산 관리 어플리케이션 제작시 필요한 부품(요소)중 하나인 "집"에
 		      대해서 알아보자.
 		   "집" 이 가지고 있는 속성(명사, 멤버변수)과 행동양식(기능, 동사, 메소드)을 뽑아보자.
 		   
 		   1). 속성(property, attribute)은 멤버변수가 되고,
 		   2). 행동양식(기능)은 메소드가 되는 것이다.
 		   
 		   ex). "집"을 프로그래밍으로 추상화 해보면.....
 		   
 		   House(클래스)
 		   	  |
 		   	  |-- 속성(property, attribute) : 면적, 방 개수, 화장실 개수, 가격, 집주인 전화번호
 		   	  |-- 행동양식(행위, 기능, 메소드) : 사다, 팔다, 매매하다, 전세를 놓다, 월세를 놓다
 		   	  
 		>>> 정리하면 <<<
 		1. 클래스(class) : 부품(요소, 객체)인 객체를 만들어 내는 틀(설계도면)이다.
 						 ex) 집 설계도, 회원 설계도
 						 
 		2. 객체(object) : 클래스(class)를 통해 만들어진 구조문(구현체)
 						 ex) 우리집 ( 32평, 방 3개, 화장실 갯수 1개, 3억, 나평민 )
 						          너네집 ( 50평, 방 4개, 화장실 갯수 2개, 25억, 너부자 )
 	
 	
 	
 	
 */

package my.day9;

import java.util.Scanner;

public class BDSApp {
		
	public static void menu() {
		System.out.println("----- >> 메뉴 << -----\n" + 
						   "  1. 매매주택조회\n" + 
						   "  2. 전세주택조회\n" + 
						   "  3. 월세주택조회\n" + 
						   "  4. 종료\n" + 
						   "  -----------------------\n" + 
						   "  >> 선택하세요 => ");
	}

	public static void main(String[] args) {

		HouseTrade HT = new HouseTrade();
		
		House[] houseArr = new House[5];
		
		Owner owner1 = new Owner("나주인", "서울시 종로구", "010-4978-1913");
		Owner owner2 = new Owner("박다솜", "강원도 원주시", "010-3132-5823");
		Owner owner3 = new Owner("윤찬영", "전라북도 전주시", "010-4915-3214");
		Owner owner4 = new Owner("배은정", "충청남도 당진시", "010-6543-4813");
		Owner owner5 = new Owner("임규하", "함경북도 함흥시", "010-1561-2134");
		
		houseArr[0] = new House(3, "경기도 용인시 수지구", owner1, 's', 300, "매매" ,1);
		houseArr[1] = new House(5, "제주특별시 서귀포", owner2, 'N', 800, "매매" ,2);
		houseArr[2] = new House(1, "울릉도 독도시", owner3, 'S', 30, "전세", 3);
		houseArr[3] = new House(6, "서울특별시 마포구", owner4, 'w', 1000, "전세", 4);
		houseArr[4] = new House(2, "인천광역시 중구", owner5, 'E', 100, "월세", 5);
		
		
		
		////////////////////////////////////////////////////////////
				
	/*	 	1. 집주소 : 서울시 종로구 
		 	2. 매매가 : 300 백만원
		 	3. 방 개수 : 3
		 	4. 방   향 : 남향
		 	5. 집 주인 정보 : 나주인 010-9711-0830 서울시 종로구
		 	
		 	
		 	1. 집주소 : 제주특별시 서귀포 
		 	2. 매매가 : 800 백만원
		 	3. 방 개수 : 5
		 	4. 방   향 : 북향
		 	5. 집 주인 정보 : 박다솜 010-3132-5823 강원도 원주시
		 
		
		
		System.out.println("========= 매물 정보 =========");
		for(int i=0; i<houseArr.length; i++) {
			
			if( houseArr[i] != null ) {
				System.out.println();
				houseArr[i].showInfo();
			}
		*/
		
		int[] first = new int[3];
		
		for(; true;) {
			menu();
			try {
				Scanner sc = new Scanner(System.in);
				int menuNum = Integer.parseInt(sc.nextLine());
				int memulSuperNum = 0;
				
				if(menuNum == 1) {
					for(int i=0; i<houseArr.length; i++) {
						if("매매".equals(houseArr[i].how))
							System.out.println("houseno" + (i+1) + houseArr[i].address +" " + houseArr[i].price);
					}
				}
				
				else if(menuNum == 2) {
					for(int i=0; i<houseArr.length; i++) {
						if("전세".equals(houseArr[i].how))
							System.out.println("houseno" + (i+1) + houseArr[i].address +" " + houseArr[i].price);
					}
				}
				else if(menuNum == 3) {
					for(int i=0; i<houseArr.length; i++) {
						if("월세".equals(houseArr[i].how))
							System.out.println("houseno" + (i+1) + houseArr[i].address +" " + houseArr[i].price);
					}
				}
				else
					return;	
				
				System.out.print(" >> 조회하고자하는 매물번호를 선택하세요 => ");	
				memulSuperNum = Integer.parseInt(sc.nextLine());
				for(int i=0; i<houseArr.length; i++)
					if(houseArr[i].listNum==memulSuperNum) 
						houseArr[i].showInfo();
				
				
				
			} catch (NumberFormatException e) {
				
			}
		}
		
	}// end of main()-------------------------------------------------------
}

