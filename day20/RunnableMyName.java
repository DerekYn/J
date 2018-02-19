package my.day20;

public class RunnableMyName extends Parent implements Runnable {

	@Override
	public void run() {
		
		while(true) {
			System.out.println("저는 윤찬영입니다.");
			super.goodmoring();
		}
		
	}

}
