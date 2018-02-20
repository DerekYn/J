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
/*	=== 메소드에 동기화 처리를 하지 않는 경우  */

package my.day20.sub2;

public class BankbookNoSync { // 통장 클래스
	
	private String account; // 통장계좌번호
	private long balance;	// 잔고액
	

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
	
	
	
	// === 동기화를 하지 않은 입금 메소드. money 만큼 입금된다. ===
	public void deposit(long money) {
		
		balance += money;
		System.out.println("계좌번호 : " + account + " 입금액 => " + money + ", 입금 후 잔액 => " + balance);
		
	}
	
	// === 동기화를 하지 않은 출금 메소드. money 만큼 출금 된다.
	public void withdraw(long money) {
		
		if(balance - money < 0) {
			
			System.out.println("계좌번호 : " + account + "잔액부족 !!!  현재금액 => " + balance + ", 출금요청금액 => " + money);
			
			return;
		}
		
		balance -= money;
		System.out.println("계좌번호 : " + account + " 출금액 => " + money + ", 출금 후 잔액 => " + balance);
		
	}
	
	
	

}
