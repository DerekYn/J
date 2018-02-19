package my.day20;

public class ThreadMain {

	public static void main(String[] args) {
		
		ThreadWho who = new ThreadWho();
		ThreadMyName myname = new ThreadMyName();
		
		who.start();
		myname.start();

		/*
		 	 개발자는 run() 메소드를 호출하는 것이 아니라, start() 메소드를 호출함으로써 
		 	 Thread가 실행되어진다.
		 	 그러면 JVM 이 알아서 Thread의 run() 메소드를 호출시켜준다.
		 	 또한 JVM의 스케쥴러가 알아서 Thread를 실행시켜 주므로, 
		 	 어떤 Thread가 먼저 실행되는지는 아무도 모른다.
		 	오로지 JVM 이 알아서 해줄 뿐이다.
		 	
		 	ThreadWho 클래스와 ThreadMyName 클래스가 Thread로 구현되었기 때문에
		 	무한루프로 실행되지만 번갈아 가며 실행된다.
		 	하지만 각 Thread마다 실행되어지는 순서는 JVM의 스케쥴러가 알아서 정해주기 때문에 
		 	어떤 Thread가 먼저 실행되어지고 다음번에 어떤 Thread가 실행되는지는 예측 불가다.
		 	이것이 Thread의 주요 특징이다.
		 */
		
		
	}

}
