package my.day17;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		try {
			for(int i=0; i<=5; i++) {
				int result = 50/(3-i);
				System.out.println("result => 50/" + (3-i) + "=" + result);
			}
		} finally {
			// finally 에 쓰인 명령은 try{ } 의 부분을 실행하고서
			// try{ }  의 실행이 요류가 있든지 오류가 없든지 관계없이
			// 무조건 실행해주는 것이다.
			System.out.println("---- 반드시 출력해야할 내용 ----");
		}

		System.out.println("=== 프로그램 종료 ===");	// 오류가 없어야만 출력되는 부분.
		
		
		
		
	}

}
