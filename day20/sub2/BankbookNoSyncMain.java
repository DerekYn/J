package my.day20.sub2;

import java.util.Set;

public class BankbookNoSyncMain {

	public static void main(String[] args) {
		
		// 통장 개설
		BankbookNoSync myBankbook = new BankbookNoSync();
		
		myBankbook.setAccount("110-442-345611");
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
		
		
	}

}
