package my.day9;

import my.Util.MyUtil;

public class House {

	/*
	 	1) 속성(property, attribute)
	 	
	              속성(property, attribute)은 반드시 클래스명과 "has a" 관계가 성립되어야만 한다.
	              속성(property, attribute)은 멤버 변수가 된다.
	 */
	
	int room; 			// House has a room. int 의 기본 값은 0
	String address; 	// House has a room. String 의 기본 값은 null
	Owner owner;		// House has a owner. Owner 의 기본 값은 null
	char direction;		// House has a direction. char 의 기본 값은 ' '
	long price;			// House has a price. long 의 기본 값은 0
	String how;			// 어떤 종류의 매매인가.
	int listNum;		// 몇번째 있는놈인가.
	
	public House() { }
	
	public House(int room, String address, Owner owner, char direction, long price, String how, int listNum) {
		this.room = room;
		this.address = address;
		this.owner = owner;
		this.direction = direction;
		this.price = price;
		this.how = how;
		this.listNum = listNum;
	}
	
	/*
	 	1. 집주소 : 서울시 종로구 
	 	2. 매매가 : 300 백만원
	 	3. 방 개수 : 3
	 	4. 방   향 : 남향
	 	5. 집 주인 정보 : 나주인 010-9711-0830 서울시 종로구
	 */

	public void showInfo() {
		System.out.println("1. 집주소 = " + address);
		System.out.println("2. 매매가 = " + MyUtil.getCommaNumber(price));
		System.out.println("3. 방 개수 = " + room);

		
		String strDirection = " ";
		
		switch (direction) {
		case 'E':
		case 'e':
			strDirection = "동향";
			break;
		case 'W':
		case 'w':
			strDirection = "서향";
			break;
		case 'S':
		case 's':
			strDirection = "남향";
			break;
		case 'N':
		case 'n':
			strDirection = "북향";
			break;
		default:
			strDirection = "정보 없음";
			break;
		}// end of switch(direction)---------------------------------------------
		
		System.out.println("4. 방   향 = " + strDirection);
		System.out.println("5. 집 주인 정보 = " + owner.ownerInfo());		
	}

}