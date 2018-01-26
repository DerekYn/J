package my.day3;

public class Member {
	
	String id;
	String passwd;
	String name;
	int age;
	String addr;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		String result = "id : " + id +
						", passwd : " + passwd +
						", name : " + name +
						", age : " + age +
						", addr : " + addr;
		
		return result;
	}
}
