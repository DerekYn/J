package my.day20.sub3;

public class UpMoneyRunnable implements Runnable {
	
	private BankbookSync bankbook;
	private long upmoney;
	
	public BankbookSync getBankbook() {
		return bankbook;
	}

	public void setBankbook(BankbookSync bankbook) {
		this.bankbook = bankbook;
	}

	public long getUpmoney() {
		return upmoney;
	}

	public void setUpmoney(long upmoney) {
		this.upmoney = upmoney;
	}

	@Override
	public void run() {
		
		try {
			Thread.sleep(500);
			
			bankbook.deposit(upmoney);
			// 특정 계좌에 돈을 입금한다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	// 500밀리초(0.5초) 동안만 스레드가 block 하도록 한다.		
		
	}

}
