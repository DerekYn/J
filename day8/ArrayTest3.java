package my.day8;

import my.Util.MyUtil;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		String str = "대한민국서울시종로구KH정보교육원";
		//            0 1 234 56 7 89....
		String substr = str.substring(4, 7);
		// 문자열 str 에서  시작인덱스번호 4 부터 마지막인덱스번호 7 앞 까지만
		// 추출하는 것이다.
		System.out.println(substr);
		// 서울시
		
		System.out.println("\n===================\n");
		
		str = "KH정보교육";
		// KH    KH정
		// H정      H정보
		// 정보     정보교
		// 보교     보교육
		// 교육       4개 == 6-3+1
		//  5개 == 6-2+1
		
		str = "KH정보교육원";
		// KH    KH정
		// H정      H정보
		// 정보     정보교
		// 보교     보교육
		// 교육     교육원
		// 육원        5개 == 7-3+1 (7글자를 - 3글자로 나눈다 + 1)
		//  6개 == 7-2+1 (7글자를 - 2글자로 나눈다 + 1)
		
		// 글자 2개씩 잘라서 나타내기 i<str.length()-2+1;
		for(int i=0; i<str.length()-1; i++) {
			//str.substring(0, 2);
			//str.substring(1, 3);
			//str.substring(2, 4);
			String result = str.substring(i, i+2);
			System.out.println(result);
		}
		/*
		  	KH
			H정
			정보
			보교
			교육
			육원 
		 */
		
		System.out.println("\n================\n");
		
		// 글자 3개씩 잘라서 나타내기 i<str.length()-3+1;
		for(int i=0; i<str.length()-2; i++) {
			//str.substring(0, 3);
			//str.substring(1, 4);
			//str.substring(2, 5);
			String result = str.substring(i, i+3);
			System.out.println(result);
		}
		/*
		 	KH정
			H정보
			정보교
			보교육
			교육원 
		 */
		
		System.out.println("\n===================\n");
		
		// 아래의 strArr 에서 "교육" 이라는 문자열이 들어있는 것을 추출하려고 한다.
		String[] strArr = {"KH정보교육원","서울교육대학교","서울시종로구","훈련교육대","경기도수원시"}; 
		int flag = 0;
		
		for(int i=0; i<strArr.length; i++) {
			
			for(int j=0; j<strArr[i].length()-1; j++) {
				String word = strArr[i].substring(j, j+2);
				if("교육".equals(word)) {
					flag = 1;
					System.out.println(strArr[i]);
					break;
				}
			}// end of 내부 for------------------------
		}// end of 바깥 for----------------------------
		if(flag == 0) {
			System.out.println("찾고자하는 단어를 가진 문자열은 없습니다.!!");
		}
		
		System.out.println("\n=====================\n");
		
		String names = "손성민,김민석,김남준,강민경,박병국";
		String[] namesArr = names.split(",");
		for(int i=0; i<namesArr.length; i++) {
			System.out.println((i+1) + ". " + namesArr[i]);
		}
		
		System.out.println("\n######################\n");
		
		String result = MyUtil.searchWord(strArr, "교육");
		System.out.println(result);
		
		System.out.println("\n=====================\n");
		
		String[] resultArr = result.split(",");
		for(String s : resultArr) {
			System.out.println(s);
		}
		
		System.out.println("\n=====================\n");
		
		result = MyUtil.searchWord(strArr, "교육원");
		System.out.println(result);
		
		
	}// end of main()--------------------------------

}// end of class ArrayTest3////////////////////////////
