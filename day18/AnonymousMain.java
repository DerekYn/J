package my.day18;

public class AnonymousMain {

	public static void main(String[] args) {
		
		ButtonMusic2 btnMusic = new ButtonMusic2();
		System.out.println(btnMusic + "을 클릭하면...");
		
		btnMusic.musicClick();
		
		
		System.out.println("\n");

		ButtonExit2 btnExit = new ButtonExit2();
		System.out.println(btnExit + "을 클릭하면...");
		
		btnExit.exitClick();
		
		
	}

}
