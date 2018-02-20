package my.day20;

public class ThreadMyName extends Thread {
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println("my name is YN");
		}
		
	}

}
