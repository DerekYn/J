package my.day15;

public class Eagle extends AbstractAnimal {

	private int price;
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	@Override
	public void crySound() {
		System.out.println("독수리 동무는 끼야야아 지저귑디다.");
	}

	@Override
	public void sleep() {
		System.out.println("독수리는 장롱 위에서 잠을 잡니다.");
	}

	@Override
	public String run() {
		
		return "독수리는 두 날개로 날아다닙니다.";
	}

	@Override
	public String grade(String level) {
		
		String grade = "";
		
		switch (level) {
		case "A":
			grade = "두바이 석유왕자의 독수리";
			break;
		case "B":
			grade = "몽골 사냥꾼의 독수리";
			break;
		case "C":
			grade = "백두산 자연의 독수리";
			break;
		case "D":
			grade = "동물원의 독수리";
			break;
		default:
			break;
		}
		return grade;
	}

	@Override
	public void showInfo() {
		System.out.println(">>>>>> 독수리 정보 <<<<<<");
		System.out.println("▷이름 : " + super.name);
		System.out.println("▷출생일자 : " + super.birthday);
		System.out.println("▷현재나이 : " + super.getAge() + "살");
		System.out.println("▷등급 : " + this.grade(super.getLevel()));
		System.out.println("▷몸무게 : " + price + "원");
	}

}
