package my.day9.quiz;

import my.Util.MyUtil;

public class HouseTrade {
	String tradeSeq ="";
	static int no;
	 House house;
	 int tradetype; //1매매 2 전세 3.월세
	String registerDate;//등록날짜
	 
	 public HouseTrade() { }
	 public HouseTrade(House house, int tradetype) {
		 tradeSeq+="houseno"+ ++no;
		 this. house =house;
		 this. tradetype= tradetype;	 
		 registerDate = MyUtil.getNowTime();
		 }
	 
	 public void shortShowInfo() {
		 System.out.println(tradeSeq+" 매물 등록시각 : "+registerDate+"  "+house.address+"  "+MyUtil.getCommaNumber(house.price)+"백만원");
	 }
	 /*System.out.println("---->>메뉴<<----");
	System.out.println("1.매매주택조회\n2.전세주택조회\n3.월세주택조회\n4.종료");
	System.out.println("메뉴를 선택하세요==>");
*/

	}
	 
	 



