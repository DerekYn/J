package my.day14;

public class Bird extends Animal {

	private int price;
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price < 0) {
			this.price = 0;
		}
		else
			this.price = price;
	}

	@Override
	public void crySound() {
		System.out.println("짹짹~~");
		
	}
	
	@Override
	public void getBaby(int num) {
		System.out.println("새알 " + num + "개를 낳았습니다.");
		
	}

	public void printInfo() {
		
		String result = super.showInfo() + "가격이 " + price + "원 입니다.";
		System.out.println(result);
		
	}

	@Override
	public void printInfo2() {
		String result = super.showInfo() + "가격이 " + price + "원 입니다.";
		System.out.println(result);		
	}
	
}
