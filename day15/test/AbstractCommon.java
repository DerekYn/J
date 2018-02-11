package my.day15.test;

public abstract class AbstractCommon implements InterCommon{

	protected String id;
	protected String passwd;
	protected String name;
	protected String addr;
	protected String number;
	
	public AbstractCommon() {
		
	}
	
	public AbstractCommon(String id, String passwd, String name, String addr, String number) {
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.addr = addr;
		this.number = number;
	}
	@Override
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String showInfo() {
		
		String result = "▷ 아이디 : " + id +
						"\n▷ 비밀번호 : " + passwd +
						"\n▷ 이름 : " + name + 
						"\n▷ 주소 : " + addr +
						"\n▷ 화번호 : " + number;
		
		return result;		
	}

}
