/*
 	=== 익명클래스(anonymous class) ===
 	
 		- 익명클래스는 다른 내부클래스들과 달리 이름이 없다.
 		    클래스의 선언과 객체 생성을 동시에 하기 때문에 단 한번만 사용될 수 있고(전담 마크)
 		    오직 하나의 객체만을 생성할 수 있는 일회용 클래스(이름이 없으므로 다른곳에서는 객체 생성이 안되므로 일회용임)이다.
 		    
 		- 이름이 없기 때문에 생성자도 가질 수 없으며,
 		    조상(부모)클래스의 이름이나 구현하고자 하는 인터페이스의 이름을 빌려서(사용) 정의하기 때문에 
 		    오로지 단 하나의 클래스를 상속받거나 단 하나의 인터페이스만을 구현할 수 있다.
 		    
 		  "UI 이벤트 처리 객체"나 스레드 객체를 간편하게 생성할 목적으로 익명객체가 많이 활용된다.( 안드로이드에서 이벤트 처리 할때 많이 씀 )
 		  
 		  new 조상클래스이름() {
 		    ......
 		  }
 		  
 		  또는
 		  
 		  new 인터페이스 이름() {
 		      .......
 		  }
 */



package my.day18;

public class ButtonMusic2 {
	
	@Override
	public String toString() {
		return "음악소리버튼2";
	}
	
	public void musicClick() {	// 이 클래스 내에서만 사용하는 1회용 메소드!!이므로 익명클래스로 구현해보자

		InterButtonClick action = new InterButtonClick() {
			
			@Override
			public void click() {
				System.out.println("띠리리리리이이링 음악소리가 나옵니다.");
			}
		// 익명클래스
		};
		
		action.click();
		
	}// end of musicClick() --------------------------------------------------------------

}
