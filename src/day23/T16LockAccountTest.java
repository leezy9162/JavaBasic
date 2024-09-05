package day23;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 은행의 입출금을 스레드로 처리하는 예제
 * (Lock 객체를 이용한 동기화)
 */
public class T16LockAccountTest {
	public static void main(String[] args) {
		/*
		 * ReentrantLock
		 * : Read 및 Write 구분없이 사용하기 위한 락 클래스로 동기화 처리를 위해 사용된다
		 * Synchronized를 이용한 동기화 처리보다 부가적인 기능이 제공되는 장점이 있다.
		 * 
		 * ex) Fairness 설정 : 가장 오래 기다린 스레드가 가장 먼저 락으 획득하게 한다.
		 */
		//락 객체 생성
		ReentrantLock lock  = new ReentrantLock(true);
		
		//LockAccount 객체를 생성하는 시점에 Lock 객체 넘기기
		LockAccount lockAccount = new LockAccount(lock);
		lockAccount.deposit(10000);
		
		//공유객체 LockAccount 사용하는 2가지 스레드
		BankThread2 bankThread2 = new BankThread2(lockAccount);
		BankThread2 bankThread3 = new BankThread2(lockAccount);
		
		//run
		bankThread2.start();
		bankThread3.start();
		
		
	}
}


//입출금 처리용 공유객체
class LockAccount{
	//Lock 객체를 위한 변수: private final 로 선언한다.
	private final Lock lock; 
	private int balance;

	public LockAccount(Lock lock) {
		//생성 시점에 Lock 객체를 넣어준다...
		this.lock = lock;
	}

	public int getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		/*
		 * Lock 객체의 lock()메서드가 동기화 시작이고, unlock()메서드가 동기화 끝을 나타낸다
		 * lock()메서드로 동기화를 설정한 곳에서는 반드시 unlock()메서드로 해제 해 주어야 한다.
		 */
		lock.lock(); //락 설정(락을 획득하기 까지 BLOCKED 됨)
		balance += money; // 동기화 처리 부분
		lock.unlock(); //락 해제
	}
	
	public boolean withdraw(int money) {
		boolean chk = false;
		
		//try~catch 블럭을 사용할 경우에는 
		//unlock()메서드 호출을 finally 블럭에서 해주어야 한다.
		try {
			lock.lock(); // 락 설정
			
			if (balance>=money) { //잔액이 충분한 경우
				for (int i = 0; i < 1000000000; i++) {}
				balance -= money;
				System.out.println("메서드 안에서 balance: " + getBalance());
				chk = true;
			} 
			
//			lock.unlock();
			//위의 if 문에서 예외처리로 넘어갈 수 있기 때문에 finally 블럭에서 unlock()를 한다
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock(); // 락 해제
		}
		
		return chk;
	}
}


//은행 업무를 처리하는 스레드
class BankThread2 extends Thread{
	private LockAccount lAcc;
	
	//cons
	public BankThread2(LockAccount lAcc) {
		this.lAcc = lAcc;
	}
	
	@Override
	public void run() {
		boolean result = lAcc.withdraw(6000); //6000원 인출
		System.out.println("스레드 안에서 result= " + result + ", balance: " + lAcc.getBalance());
	}
	
}