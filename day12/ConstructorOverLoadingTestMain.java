package my.day12;

public class ConstructorOverLoadingTestMain {

	public static void main(String[] args) {
		
	 	
		ConstructorOverLoadingTest obj1 = new ConstructorOverLoadingTest("leess", "qwer1234$", "이순신", "1994-05-21");
		ConstructorOverLoadingTest obj2 = new ConstructorOverLoadingTest("ycy", "asdf5678*", "윤찬영", "1992-04-30");
		ConstructorOverLoadingTest obj3 = new ConstructorOverLoadingTest("bej", "zxcv90=+", "배은정", "1993-09-04");
		
		System.out.println("obj1.getName()" + "님의 포인트는 " + obj1.getPoint());
		System.out.println("obj2.getName()" + "님의 포인트는 " + obj2.getPoint());
		System.out.println("obj3.getName()" + "님의 포인트는 " + obj3.getPoint());
		
		System.out.println("====================================================");
		
		ConstructorOverLoadingTest obj4 = new ConstructorOverLoadingTest("Fed", "nhalsdf12", "루화가");
		
		System.out.println(obj1.getName() + "님의 생일는 " + obj1.getBirth());
		System.out.println(obj2.getName() + "님의 생일는 " + obj2.getBirth());
		System.out.println(obj3.getName() + "님의 생일는 " + obj3.getBirth());
		System.out.println(obj4.getName() + "님의 생일는 " + obj4.getBirth());
		

	}

}