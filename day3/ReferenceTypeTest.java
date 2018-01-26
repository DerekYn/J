package my.day3;

public class ReferenceTypeTest {

	public static void main(String[] args) {
		
		Member me = new Member();
		me.id = "suji";
		me.passwd = "qwer1234";
		me.name = "수지";
		me.age = 23;
		me.addr = "서울시 강남구";
		
		Member suji = new Member();
		suji.id = "suji";
		suji.passwd = "qwer1234";
		suji.name = "수지";
		suji.age = 23;
		suji.addr = "서울시 강남구";
		
		System.out.println("me : " + me);
		//me : my.day3.Member@70dea4e
		System.out.println("suji : " + suji);
		//suji : my.day3.Member@5c647e05
		
		Member IU = suji;	// 메모리 주소 공유 이제 같은 데이터가 된다.
		
		System.out.println("IU : " + IU);
		//IU : my.day3.Member@5c647e05

		System.out.println("");
		
		boolean bool = (me == suji);
		System.out.println(bool);
		bool = (suji == IU);
		System.out.println(bool);

		System.out.println("\n === 데이터 변경 후 ===\n");
		
		me.setId("Korea");
		me.setName("YOON");
		me.setAddr("경기도 이천시");
		
		System.out.println("me : " + me);
		System.out.println("suji : " + suji);
		System.out.println("IU : " + IU);
		
		suji.setId("Japan");
		suji.setName("Kim");
		suji.setAddr("부산광역시");
		
		System.out.println("me : " + me);
		System.out.println("suji : " + suji);
		System.out.println("IU : " + IU);
	}

}
