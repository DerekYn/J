package my.day20.sub4;


public class BankbookSyncWaitNotifyMain {

	public static void main(String[] args) {
		
		// 통장 개설
		BankbookSyncWaitNotify myBankbook = new BankbookSyncWaitNotify();
		
		myBankbook.setAccount("984-128-318784");
		myBankbook.setBalance(10000);
		
		// *** 입금 스레드 구현 객체 10개 생성 ***
		UpMoneyRunnable[] uprunArr = new UpMoneyRunnable[10];
		Thread[] thrupArr = new Thread[10];
		
		for(int i=0; i<uprunArr.length; i++) {
			
			UpMoneyRunnable uprunnable = new UpMoneyRunnable();
						
			uprunnable.setBankbook(myBankbook);
			// 여러 입금 스레드 구현 객체들이(10개) 특정 myBankbook 데이터 1개를 같이 사용함.
			
			uprunnable.setUpmoney(1000);	
			// 입금액 1000원
			
			uprunArr[i] = uprunnable;
			
			thrupArr[i] = new Thread(uprunArr[i]);
			
		}
		
		
		// *** 출금 스레드 구현 객체 10개 생성 ***
		DownMoneyRunnable[] downrunArr = new DownMoneyRunnable[10];
		Thread[] thrdownArr = new Thread[10];
		
		for(int i=0; i<downrunArr.length; i++) {
			
			DownMoneyRunnable downrunnable = new DownMoneyRunnable();
			
			downrunnable.setBankbook(myBankbook);
			// 여러 출금 스레드 구현 객체들이(10개) 특정 myBankbook 데이터 1개를 같이 사용함.
			
			downrunnable.setDownmoney(1000);	
			// 출금액 1000원
			
			downrunArr[i] = downrunnable;
			
			thrdownArr[i] = new Thread(downrunArr[i]);
			
		}
		
		for(int i=0; i<thrupArr.length; i++) {
			thrupArr[i].start();	// 10개의 입금 스레드들을 작동시킴.
			thrdownArr[i].start();	// 10개의 출금 스레드들을 작동시킴.
			
		}
		
		/*
		 	이때 수행되는 스레드의 순서는 JVM이 결정지으므로 어떤 스레드가 먼저 수행되는지는 개발자는 알 수 없다.
		 	그러므로 만약, 각각 해당 스레드의 run 메소드에서 수행되어지는 데이터가 동일한 객체(BankbookNoSync myBankbook 계좌번호 "984-128-318784")를
		 	공유하는 내용이라면 실행되는 순서가 아주 중요한 것으로 발생될 수 있다.
		 	이러한 순서를 지켜주기 위해서는 run 메소드에서 수행되어지는 메소드에 동기화(Synchronized - 순서를 지켜주는것) 처리를 반드시 해주어야 한다.
		 	동기화 처리를 해주면 어떤 스레드 A가 동일한 객체 데이터 (BankbookNoSync myBankbook 계좌번호 "984-128-318784")에 접근하여
		 	작업(deposit 또는 withdraw)을 처리할 동안에 다른 스레드 B 는 대기상태에 머물렀다가
		 	어떤 스레드 A의 작업(deposit 또는 withdraw)이 끝나면 B 는 자신의 작업 (deposit 또는 withdraw)을 하는 방식으로 처리해준다.
		 	하지만 어떤 스레드는 먼저 할지는 랜덤이므로 우리는 알 수가 없다.
		 	입금 후 출금을 하든, 아니면 출금 후 입금을 하든 어떤것이든지 괜찮기 때문이다.
		 */

	}

}
