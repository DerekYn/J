package my.day17;

public class Member {
	
	private String id;	// "admin" 으로 시작하는 id는 사용불가!!
	private String pw;	// passwd의 길이는 5글자 미만이라면 사용불가!!
	private String name;
	private String addr;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) throws UserExceptionIDFail {
		
		if(id == null)
			throw new UserExceptionIDFail();
			// ---> 오류메시지가 "ID명에 NULL은 불가합니다."
		else if(id != null && id.startsWith("admin"))		// "adminstrator"
			// 문자열 id 값이 admin 으로 시작하면
			throw new UserExceptionIDFail("ID명은 admin 으로 시작할 수 없습니다. 다시 입력해주세요.");
		else		
			this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) throws UserExceptionPWFail {
		
		if(pw == null || (pw != null && pw.length() < 5)) {
			// 입력받은 pw가 null 또는 입력받은 pw의 길이가 5보다 작으면..
			throw new UserExceptionPWFail();
		}
		else
			this.pw = pw;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
}
