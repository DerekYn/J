/*
  		===== *** 캡슐활(은닉화) *** =====
  		
  		접근지정자		자기자신 클래스 내부	동일 패키지		하위(자식)클래스		그 외의 영역
  		-----------------------------------------------------------------------------------
  		public			  O			   O			 O				O
  		protected		  O			   O			 O				X
  		default			  O			   O			 X				X
  		private			  O			   X			 X				X
 */

package my.day11;

public class AccessModifierTest {
	
	public String userid = "superman";
	protected String passwd = "qwer1234$";
	String name = "이순신";
	private String addr = "서울시 종로구";
	
	
	

}
