package my.day14;

public class Dog extends Animal {
	
	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if(weight < 0) {
			this.weight = 0;
		}
		else
			this.weight = weight;
	}

	@Override
	public void crySound() {
		System.out.println("멍멍~~");
		
	}

	@Override
	public void getBaby(int num) {
		System.out.println("강아지 " + num + "마리를 낳았습니다.");
		
	}

	public void printInfo() {
		
		String result = super.showInfo() + "무게가 " + weight + "kg 입니다.";
		System.out.println(result);
		
	}

	@Override
	public void printInfo2() {
		String result = super.showInfo() + "무게가 " + weight + "kg 입니다.";
		System.out.println(result);
		
	}
	
	

}
