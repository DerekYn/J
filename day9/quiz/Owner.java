package my.day9.quiz;

public class Owner {
	String name; 
	String addrees;
	String tel;
	public Owner() { }
	
	public Owner(String name, String addrees, String tel) {
		this.name = name;
		this.addrees = addrees;
		this.tel = tel;
	}
	
	public String ownerInfo() {
		
		return name+"  "+"("+tel+")  "+addrees;
	} 
	
}
