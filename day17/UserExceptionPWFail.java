package my.day17;

public class UserExceptionPWFail extends Exception{
	
	public UserExceptionPWFail() {
		super("PW는 null은 불가하며, PW의 길이는 5글자 이상이어야 합니다.");
	}
	
	public UserExceptionPWFail(String errorMsg) {
		super(errorMsg);
	}
	
}
