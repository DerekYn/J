package my.day15;

public class Main {

	public static void main(String[] args) {
		
		AbstractAnimal[] animalArr = new AbstractAnimal[3];
		
		Dog dog = new Dog();
		dog.name = "뽀삐";
		dog.birthday = "2010-02-05";
		dog.setLevel(10);
		dog.setWeight(5);
		
		Cat cat = new Cat();
		cat.name = "톰";
		cat.birthday = "2011-11-22";
		cat.setLevel(5);
		cat.setColor("보라");
		
		Eagle eagle = new Eagle();
		eagle.name = "도널드";
		eagle.birthday = "2004-04-22";
		eagle.setLevel(9);
		eagle.setPrice(3000);
		
		animalArr[0] = dog;
		animalArr[1] = cat;
		animalArr[2] = eagle;
		
		for(AbstractAnimal ani : animalArr) {
			ani.crySound();
			ani.sleep();
			System.out.println("나이 : " + ani.getAge() + "살");
			System.out.println(ani.run());
			System.out.println("등급 : " + ani.grade(ani.getLevel()));
			ani.showInfo();
			
			System.out.println();
		}
		

		System.out.println("\n=======================================");
		
		// 인터페이스는 객체를  담을 수 있는 저장소 역할을 한다.!!!!!!
		
		InterAnimal[] interAnimalArr = new InterAnimal[3];
		
		Dog dog2 = new Dog();
		dog2.name = "뽀삐";
		dog2.birthday = "2010-02-05";
		dog2.setLevel(10);
		dog2.setWeight(5);
		
		Cat cat2 = new Cat();
		cat2.name = "톰";
		cat2.birthday = "2011-11-22";
		cat2.setLevel(5);
		cat2.setColor("보라");
		
		Eagle eagle2 = new Eagle();
		eagle2.name = "도널드";
		eagle2.birthday = "2004-04-22";
		eagle2.setLevel(9);
		eagle2.setPrice(3000);
		
		interAnimalArr[0] = dog2;
		interAnimalArr[1] = cat2;
		interAnimalArr[2] = eagle2;
		
		for(InterAnimal interani: interAnimalArr) {
			interani.crySound();
			interani.sleep();
			System.out.println("나이 : " + interani.getAge());
			System.out.println(interani.run());
			System.out.println("등급 : " + interani.grade(((AbstractAnimal)interani).getLevel()));
			interani.showInfo();
			
			System.out.println("\n");
		}
		
		System.out.println("\n=======================================");
		
		// 일반 for 문으로 짜보기
		
	}

}
