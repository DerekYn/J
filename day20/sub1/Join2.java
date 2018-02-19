package my.day20.sub1;

public class Join2 implements Runnable {
	
	private String name;
	private String email;

	private void showInfo() {
		System.out.println("===== Join2 =====");
		System.out.println("▷ 이름 : " + name + ", 이메일 : " + email);
		System.out.println();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public void run() {
		showInfo();
	}
	
}
