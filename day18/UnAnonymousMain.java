package my.day18;

public class UnAnonymousMain {
	
	public static void main(String[] agrs) {
		
		BottonMusic btnMusic = new BottonMusic();
		System.out.println(btnMusic + "을 클릭하면...");
		
		btnMusic.musicClick();
		
		
		System.out.println("\n");
		
		
		ButtonExit btnExit = new ButtonExit();
		System.out.println(btnExit + "을 클릭하면...");
		btnExit.exitClick();
	}

}
