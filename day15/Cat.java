package my.day15;

public class Cat extends AbstractAnimal {
	
	private String color;
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	@Override
	public void crySound() {
		System.out.println("고양이는 야옹이라고 합네다.");
	}

	@Override
	public void sleep() {
		System.out.println("고양이는 식탁 위에서 잠을 잡니다.");
	}

	@Override
	public String run() {
		
		return "고양이는 2발로 점프합니다.";
	}

	@Override
	public String grade(String level) {
		
		String grade = "";
		
		switch (level) {
		case "A":
			grade = "최우수 품종묘";
			break;
		case "B":
			grade = "우수 품종묘";
			break;
		case "C":
			grade = "반려묘";
			break;
		case "D":
			grade = "길고양이";
			break;
		default:
			break;
		}
		return grade;
	}

	@Override
	public void showInfo() { }	// 사용하지 않을 지언정 재정의는 필수!!

}
