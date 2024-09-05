package day23;

/*
 * 은행 입출금을 스레드로 처리하는 예제
 */
public class T15SyncAccountTest {
	public static void main(String[] args) {
		//계좌는 하나
		SyncAccount sAcc = new SyncAccount();
		sAcc.deposit(10000);
		
		BankThread bTh1 = new BankThread(sAcc);
		BankThread bTh2 = new BankThread(sAcc);
		
		bTh1.start();
		bTh2.start();
	}
}

// 은행의 입출금 처리를 위한 공유 객체
class SyncAccount {
	//field
	private int balance; //잔액

	//getter
	synchronized int getBalance() {
		return balance;
	}
	
	//입금 처리를 수행하는 메서드
	public void deposit(int money) {
		balance += money;
	}
	
	//출금 처리를 수행하는 메서드 (출금 성공: true, 실패: false)
	//동기화 영역에서 호출하는 메서드도 동기화 처리를 해주어야 한다.
	//withdraw 메서드에 동기화 처리를 해주는데 메서드 안에서 호출하는 getBalance() 메서드도 동기화 처리를 해주는 것이 좋다..
	synchronized boolean withdraw (int money) {
		if (balance>=money) { //잔액이 충분한 경우
			for (int i = 0; i < 1000000000; i++) {}
			balance -= money;
			System.out.println("메서드 안에서 balance: " + getBalance());
			return true;
		} else {
			return false;
		}
	}
}


//은행 업무를 처리하는 스레드
class BankThread extends Thread{
	private SyncAccount sAcc;
	
	//cons
	public BankThread(SyncAccount sAcc) {
		this.sAcc = sAcc;
	}
	
	@Override
	public void run() {
		boolean result = sAcc.withdraw(6000); //6000원 인출
		System.out.println("스레드 안에서 result= " + result + ", balance: " + sAcc.getBalance());
	}
	
}
