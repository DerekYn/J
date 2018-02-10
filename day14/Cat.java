package my.day14;

public class Cat  extends Animal {
	
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void crySound() {
		System.out.println("야옹~~");
		
	}

	@Override
	public void getBaby(int num) {
		System.out.println("고양이 " + num + "마리를 낳았습니다.");
		
	}

	public void printInfo() {
		
		String result = super.showInfo() + "색깔이 " + color + "색 입니다.";
		System.out.println(result);
		
	}

	@Override
	public void printInfo2() {
		String result = super.showInfo() + "색깔이 " + color + "색 입니다.";
		System.out.println(result);		
	}

}
