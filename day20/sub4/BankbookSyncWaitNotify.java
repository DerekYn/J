/*
 	=== 동기화(Synchronized) - 하나의 특정 메소드를 여러 스레드들이 순차적으로 줄을 서서 실행하는것 ===
  	
  		여러 스레드가 하나의 데이터를 공휴할 수 있다.
  		공유 메커니즘은 성능 및 자원의 효율설에서는 좋지만 데이터 일관성에 있어서는 문제가 발생될 수 있다.
  		여러 스레드가 하나의 데이터를 공유할 때 하나의 스레드가 해야하는 작업이 끝날때까지
  		그 데이터는 다른 스레드에게 공유되지 않도록 해야 하는데,
  		이것을 해결하는 방법으로 자바에서는 Synchronized 키워드를 사용하여 해결한다.
  
  		1. 동기화 메소드를 사용하는 방법
  			
  			접근 지정자 synchronized 리턴타입 메소드명() {
  				----
  				----
  			}
  			--> 메소드 선언시 synchronized 키워드를 지정하는 방법이다.
  				이 방법은 메소드내의 모든 코드가 동기화 된다.
  				따라서 특정 스레드가 이 메소드의 모든 내용을 모두 수행할 때까지 다른 스레드는 block 된다.
  				
  		2. 동기화 블럭을 사용하는 방법(추천)이다.
			접근 지정자 리턴타입 메소드명() {
				----
					synchronized(공유객체) {
						=====
					}
				----
			}
			--> 메소드내에서 synchronized 키워드 블럭을 사용하는 것이다.
			이 방법은 메소드내의 모든 코드가 아닌 synchronized 블럭만 동기화 된다.
			따라서 전체 메소드를 동기화 하는 방법보다 더 효율적이다.
			
		동일한 클래스의 같은 메소드를 동시에 여러 스레드가 호출해도
		synchronized(동기화)에 의하여 순차적으로 스레드들이 실행된다.
		에를 들어, 동일한 통장계좌 BankbookNoSync에 잔액이 100만원이 있을때
		부부가 동시에 입금하는 스레드와 출금하는 스레드를 여러번 동시에 실행시켰을 경우
		통장계좌에 입금과 출금 처리가 순차적으로 실행을 해서 기록을 해야 되는데,
		그렇지 않은 경우 입. 출금 스레드의 실행순서를 우리가 알 수 없으므로,
		통장계좌에 입금과 출금처리가 비 정상적으로 기록될 가능성이 있다.
 */
/*	=== 메소드에 동기화 처리를 한 경우  */


/*
  	=== 메소드에 동기화 처리를 했을 경우 ===
  	이번에는 항상 입금이 먼저 시작되고 그 다음에 출금,
  	또 다음에는 입금이 되고 그 다음에는 출금이 되도록 하겠다.
 
 */
package my.day20.sub4;

public class BankbookSyncWaitNotify { // 통장 클래스
	
	private String account; // 통장계좌번호
	private long balance;	// 잔고액
	
	private boolean boolDeposit = true;	// 입금을 먼저하기 위해 초기값을 true로 줌.
	//  boolDeposit 의 값이 true 이어야만 입금메소드 deposit(long money)이 정상작동하도록 한다.
	
	private boolean boolWithdraw = false;	// 출금은 먼저 입금이 된 이후에 하기 위해 초기치를 false로 줌.
	//  boolDeposit 의 값이 false 이어야만 출금메소드 withdraw(long money)이 정상작동하도록 한다.
	

	public String getAccount() {
	
		return account;
	}
	public void setAccount(String account) {
		
		this.account = account;
	}
	public long getBalance() {
		
		return balance;
	}
	public void setBalance(long balance) {
		
		this.balance = balance;
	}
	
	
	
	// === 동기화를 한 입금 메소드. money 만큼 입금된다. ===
	public synchronized void deposit(long money) {
		
		while(boolDeposit == false) {
			// boolDeposit의 값이 true 이어야만 입금메소드 deposit(long money)이 정상작동 하도록 한다.
			// boolDeposit의 값이 false 이면 입금메소드 deposit(long money)는 계속해서 wait() 상태로 빠지게 만든다.
			try {
				wait();
				// wait()가 호출되면 스레드는 수행 권한을 포기한다.
				// 이때 대기상태 (waiting Pool)로 들어가는데
				// 다른 스레드가 notify(); 해줄때까지 대기상태(waiting Pool)로 들어간다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		balance += money;
		System.out.println("계좌번호 : " + account + " 입금액 => " + money + ", 입금 후 잔액 => " + balance);
		
		boolDeposit = false;	// 입금금지
		boolWithdraw = true;	// 출금가능
		
		notify();
		// 대기실에서 대기하고 있는 스레드 아무거나 하나를 깨운다.
		// 이어 깨운 스레드를 Runnable 한 상태로 전환시켜준다.
		
	}
	
	// === 동기화를 한 출금 메소드. money 만큼 출금 된다.
	public synchronized void withdraw(long money) {
		
		while(boolWithdraw == false) {
			// boolWithdraw의 값이 true 이어야만 출금메소드 withdraw(long money)이 정상작동 하도록 한다.
			// boolWithdraw의 값이 false 이면 출금메소드 withdraw(long money)는 계속해서 wait() 상태로 빠지게 만든다.
			try {
				wait();
				// wait()가 호출되면 스레드는 수행 권한을 포기한다.
				// 이때 대기상태 (waiting Pool)로 들어가는데
				// 다른 스레드가 notify(); 해줄때까지 대기상태(waiting Pool)로 들어간다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		if(balance - money < 0) {
			
			System.out.println("계좌번호 : " + account + "잔액부족 !!!  현재금액 => " + balance + ", 출금요청금액 => " + money);
			
			boolWithdraw = false;	// 입금금지
			boolDeposit = true;		// 출금가능
			
			notify();
			// 대기실에서 대기하고 있는 스레드 아무거나 하나를 깨운다.
			// 이어 깨운 스레드를 Runnable 한 상태로 전환시켜준다.
			
			return;
		
		}
		
		balance -= money;
		System.out.println("계좌번호 : " + account + " 출금액 => " + money + ", 출금 후 잔액 => " + balance);
		
		boolWithdraw = false;	// 입금금지
		boolDeposit = true;		// 출금가능
		
		notify();
		// 대기실에서 대기하고 있는 스레드 아무거나 하나를 깨운다.
		// 이어 깨운 스레드를 Runnable 한 상태로 전환시켜준다.
		
	}
	
}
