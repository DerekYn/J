package my.day14;

public class Main {
	public static void main(String[] agrs) {
		
		Dog dog = new Dog();
		dog.name = "뽀삐";
		dog.setAge(5);
		dog.setWeight(123);
		
		Cat cat = new Cat();
		cat.name = "톰";
		cat.setAge(12);
		cat.setColor("보라");
		
		Bird bird = new Bird();
		bird.name = "트럼프";
		bird.setAge(65);
		bird.setPrice(200);
		
		Animal[] aniArr = new Animal[3];
		
		aniArr[0] = dog;
		aniArr[1] = cat;
		aniArr[2] = bird;
		
		for(int i=0; i<aniArr.length; i++) {
			aniArr[i].crySound();
			aniArr[i].getBaby(i+1);
			if(aniArr[i] instanceof Dog) {
				((Dog) aniArr[i]).printInfo();
			}
			else if(aniArr[i] instanceof Cat) {
				((Cat) aniArr[i]).printInfo();
			}
			else
				((Bird) aniArr[i]).printInfo();
			
			
			System.out.println("");
		}
		
		System.out.println("=============================================");
		
		for(int i=0; i<aniArr.length; i++) {
			aniArr[i].crySound();
			aniArr[i].getBaby(i+1);
			aniArr[i].printInfo2();
				
			System.out.println("");
		}

		System.out.println("=============================================");
		
		int cnt = 0;
		for(Animal ani : aniArr) {
			ani.crySound();
			ani.getBaby(cnt++);
			ani.printInfo2();
		}
	}
}