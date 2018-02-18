/*
 	===== 배열(Array)과 Collection 의 차이점
 	
 	1. 배열(Array)은 오로지 동일한 데이터 타입만 들어가는 저장소이다.
 	      동일한 데이터 타입은 primitive 타입(int, double, char, ...) 및 
 				     reference 타입(class, String Wrapper, 사용자 정의 클래스, ...)
 	      배열은 그 크기가 한번 정해지면 크기를 변경할 수 없다.
 	      
 	2. Collection 은 오로지 """객체만""" 저장되는 저장소이다.
 	   reference 타입(class, String Wrapper, 사용자 정의 클래스, ...)
 	      객체이라면 저장이 되기 때문에 동일하지 않은 타입이어도 된다.
 	   Collection 은 그 크기가 자동적으로 늘어난다.!!!!
 	   
 	      
  
 */


package my.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import org.omg.CORBA.DATA_CONVERSION;

public class ListTestMain {

	public static void main(String[] args) {

		Vector vt = new Vector(5, 3);
		// 초기용량 : 5			증가치 : 3
		
		System.out.println("벡터 vt의 용량 : " + vt.capacity());
		// 벡터 vt의 용량 : 5
		
		System.out.println("벡터 vt에 저장된 현재 크기 : " + vt.size());
		// 벡터 vt에 저장된 현재 크기 : 0
		
		for(int i=0; i<5; i++) {
			vt.add(new Integer(i+1));	// Wrapper class Integer
			// 벡터에 요소(element) 넣기
			// ==> Vector 객체명.add(넣어야할 객체);

		}
		
		System.out.println("벡터 vt의 용량 : " + vt.capacity());
		// 벡터 vt의 용량 : 5
		
		System.out.println("벡터 vt에 저장된 현재 크기 : " + vt.size());
		// 벡터 vt에 저장된 현재 크기 : 5
		
		vt.add(new Integer(6));
		
		System.out.println("벡터 vt의 용량 : " + vt.capacity());
		// 벡터 vt의 용량 : 8			꽉차면 증가치 만큼 증가함 (3)
		
		System.out.println("벡터 vt에 저장된 현재 크기 : " + vt.size());
		// 벡터 vt에 저장된 현재 크기 : 6
		
		/////////////////////////////////////////////////////////////////
		
		vt.add(new Double(1.2345));
		vt.add(new String("안녕??"));
		
		System.out.println("벡터 vt의 용량 : " + vt.capacity());
		// 벡터 vt의 용량 : 8			꽉차면 증가치 만큼 증가함 (3)
		
		System.out.println("벡터 vt에 저장된 현재 크기 : " + vt.size());
		// 벡터 vt에 저장된 현재 크기 : 8
		
		vt.add(new String("행복해라.."));
		
		System.out.println("벡터 vt의 용량 : " + vt.capacity());
		// 벡터 vt의 용량 : 11			꽉차면 증가치 만큼 증가함 (3)
		
		System.out.println("벡터 vt에 저장된 현재 크기 : " + vt.size());
		// 벡터 vt에 저장된 현재 크기 : 9
		
		// *** === Vector 에 저장된 요소 꺼내오기 === *** //
		// Ovject Vector타입객체명.get(꺼내올 객체의 인덱스 번호);
		
		Object obj = vt.get(5);
		Integer intVal = (Integer)obj;
		
		System.out.println(intVal);	
		// intVal = 6
		
		System.out.println("\n");
		
		for(int i=0; i<vt.size(); i++) {
			
			Object obj2 = vt.get(i);
			
			if(obj2 instanceof Integer) {
				Integer inVal = (Integer)obj2;
				System.out.println("정수 : " + inVal);
			}
			else if(obj2 instanceof Double) {
				Double doVal = (Double)obj2;
				System.out.println("실수 : " + doVal);
			}
			else if(obj2 instanceof String) {
				String stVal = (String)obj2;
				System.out.println("문자열 : " + stVal);
			}
		}
		
		
		
		Vector myvt0 = new Vector();		// 기본 용량 [ 10 ]		증가량 [ 10 ]
		
		System.out.println("벡터 myvt1의 용량 : " + myvt0.capacity());
		// 벡터 vt의 용량 : 10			
		
		System.out.println("벡터 myvt1에 저장된 현재 크기 : " + myvt0.size());
		// 벡터 vt에 저장된 현재 크기 : 0
		
		for(int i=0; i<11; i++) {
			myvt0.add(new Integer(i));
		}
	
		System.out.println("벡터 myvt1의 용량 : " + myvt0.capacity());
		// 벡터 vt의 용량 : 20			
		
		System.out.println("벡터 myvt1에 저장된 현재 크기 : " + myvt0.size());
		// 벡터 vt에 저장된 현재 크기 : 11
	

	// === *** JDK 1.5 버전 이후 부터는 Generic 을 사용한다. *** === //
		
		Vector<Integer> myvt1 = new Vector<Integer>();
		Vector<Double> myvt2 = new Vector<Double>();
		Vector<String> myvt3 = new Vector<String>();
		
		for(int i=0; i<5; i++) {
			// myvt1.add(new Integer(i+1));
			// 또는
			myvt1.add(i+1);	// myvt1.add(int); 을 하면 자바가 알아서 int를 new Integer()로 변경해준다.	int ==> new Integer();
							// 이와 같이 자동적으로 바꿔주는 기능을 auto boxing 이라고 부른다.
		}
		
		for(int i=0; i<5; i++) {
			// myvt2.add(new Double(i+1.0));
			// 또는
			myvt2.add(i+1.0);	// myvt2.add(double); 을 하면 자바가 알아서 double를 new Double()로 변경해준다.	double ==> new Double();
								// 이와 같이 자동적으로 바꿔주는 기능을 auto boxing 이라고 부른다.
		}
		
		for(int i=0; i<5; i++) {
			// myvt3.add(new String("홍길동" + (i+1));
			// 또는
			myvt3.add("홍길동" + (i+1));	// myvt3.add(string); 을 하면 자바가 알아서 string를 new String()로 변경해준다.	string ==> new String();
										// 이와 같이 자동적으로 바꿔주는 기능을 auto boxing 이라고 부른다.
		}
		
		for(int i=0; i<myvt1.size(); i++) {
			// Integer val = myvt1.get(i);
			// 또는
			int val = myvt1.get(i);	// 객체 타입으로 되어진 데이터를 primitive 타입(원시형)으로 받아올수 있게 해주는 것을
									// auto unboxing 이라 한다.
			System.out.println(val);
		}
			
		for(int i=0; i<myvt1.size(); i++) {
			// Double val = myvt2.get(i);
			// 또는
			double val = myvt2.get(i);	// 객체 타입으로 되어진 데이터를 primitive 타입(원시형)으로 받아올수 있게 해주는 것을
										// auto unboxing 이라 한다.
			System.out.println(val);
		}
		
		for(int i=0; i<myvt1.size(); i++) {
			// String val = myvt3.get(i);
			// 또는
			String val = myvt3.get(i);	// 객체 타입으로 되어진 데이터를 primitive 타입(원시형)으로 받아올수 있게 해주는 것을
										// auto unboxing 이라 한다.
			System.out.println(val);
		}
		
		
		for(String str : myvt3) {	// 백터에 들어있는 만큼 출력
			System.out.println(str);
		}
		
		System.out.println("\n\n");
		////////////////////////// ==== *** ArrayList *** ==== ///////////////////////////////
		
		ArrayList arrList = new ArrayList();
		
		for(int i=0; i<5; i++) {
			arrList.add(i+1);
		}
		
		for(int i=0; i<5; i++) {
			arrList.add(i+11.0);
		}
		
		for(int i=0; i<5; i++) {
			arrList.add("김길동" + (i+1));
		}
		
		for(int i=0; i<arrList.size(); i++) {
			Object obj3 = arrList.get(i);
			if(obj3 instanceof Integer) {
				int val = (Integer)obj3;
				System.out.println("정수 : " + val);
			}
			else if(obj3 instanceof Double) {
				double val = (Double)obj3;
				System.out.println("실수 : " + val);
			}
			else if(obj3 instanceof String) {
				String val = (String)obj3;
				System.out.println("문자열 : " + val);
			}
		}
		
		System.out.println("\n\n");
		/*
			ArrayList<Integer> arrList1 = new ArrayList<Integer>();
			ArrayList<Double> arrList2 = new ArrayList<Double>();
			ArrayList<String> arrList3 = new ArrayList<String>();
		*/
		// 또는
		
		List<Integer> arrList1 = new ArrayList<Integer>();
		List<Double> arrList2 = new ArrayList<Double>();
		List<String> arrList3 = new ArrayList<String>();
		
		for(int i=0; i<5; i++) {
			arrList1.add(i+1);
		}
		
		for(int i=0; i<arrList1.size(); i++) {
			int val = arrList1.get(i);
			System.out.println(val);
		}
		
		for(int i=0; i<5; i++) {
			arrList2.add(i+1.0);
		}
		
		for(double db : arrList2) {
			System.out.println(db);
		}
		
		for(int i=0; i<5; i++) {
			arrList3.add("윤찬영" + (i+1));
		}
		
		for(String str : arrList3) {
			System.out.println(str);
		}
		
		System.out.println("\n=============================================================\n");
		
		List<String> cityList = new ArrayList<String>();
		
		cityList.add("SEOUL");
		cityList.add("Tokyo");
		cityList.add("beiJING");
		cityList.add("TaiPey");
		cityList.add("Manilla");
		
		/*
		 	▷ 검색하실 도시명 : tokyo 엔터
		 	>>> 검색한 도시명 tokyo 은 2번째로 저장되어 있습니다.
		 	>>> 저장된 도시명은 Tokyo 입니다.
		 	
		 	▷ 검색하실 도시명 : london 엔터
		 	>>> 검색한 도시명 london 은 없습니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("▷ 검색하실 도시명 : ");
		String city = sc.nextLine();
		
		int flag = 0;
		
		for(int i=0; i<cityList.size(); i++) {
			if(city.toUpperCase().equals(cityList.get(i).toUpperCase())){
				flag = 1;
				System.out.println(">>> 검색한 도시명은 " + city + "은 " + (i+1) + "번째로 저장되어 있습니다.");
				System.out.println(">>> 저장된 도시명은 " + cityList.get(i) + "입니다.");
				break;
			}
		}
		if(flag == 0) {
			System.out.println(">>> 검색한 도시명 " + city + "는 없습니다.");
		}

		
	}

}
