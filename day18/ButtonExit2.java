package my.day18;

public class ButtonExit2 {
	
	@Override
	public String toString() {
		return "프로그램 종료 버튼2";
	}
	
	public void exitClick() {	// 이 클래스 내에서만 사용하는 1회용 메소드!!이므로 익명클래스로 구현해보자

		InterButtonClick action = new InterButtonClick() {
			
			@Override
			public void click() {
				System.out.println(">>> 프로그램을 종료 합니다.");
			}// 익명클래스
		
		};
		
		action.click();
		
	}

}
