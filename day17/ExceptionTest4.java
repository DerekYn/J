package my.day17;

public class ExceptionTest4 {

	public static void main(String[] args) {
		
		try {
			for(int i=0; i<=5; i++) {
				int result = 50/(3-i);
				System.out.println("result => 50/" + (3-i) + "=" + result);
			}
		} catch (ArithmeticException e) {
			System.out.println(">>분모는 0이 될 수 없습니다.");
			// return;	// finally를 수행하고 나서 종료한다.
			// System.exit(0); // 정상종료 finally 절을 수행하지 않는다.
			/*
			 	System.exit(0);	==> 정상종료
			 	System.exit(1); ==> 비정상종료(0이 아닌 숫자 모두)
			 	예를 들어 예외처리 할때 catch 절에 에러문구 발생 후
			 		System.exit(1); 이라고 하면
			 		형태가 정상종료인지, 비정상종료인지 구분하기 편하다.
			 	그렇다고 해서 System.exit(0); 으로 써도 상관없다.
			 	관습적으로, 또 규정에 따라 그렇게 하고 있을뿐이다.
			 	다른 숫자를 써도 에러는 없다.
			 */
		}
		finally {
			// finally 에 쓰인 명령은 try{ } 의 부분을 실행하고서
			// try{ }  의 실행이 요류가 있든지 오류가 없든지 관계없이
			// 무조건 실행해주는 것이다.
			System.out.println("---- 반드시 출력해야할 내용 ----");
		}

		System.out.println("=== 프로그램 종료 ===");	// 오류가 없어야만 출력되는 부분.
		

	}

}
