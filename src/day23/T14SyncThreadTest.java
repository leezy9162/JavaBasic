package day23;

public class T14SyncThreadTest {
	public static void main(String[] args) {
		ShareObject shareObject = new ShareObject();
		WorkerThread workerThread1 = new WorkerThread(shareObject);
		WorkerThread workerThread2 = new WorkerThread(shareObject);
		
		workerThread1.start();
		workerThread2.start();
	}
}

//공유 객체를 위한 클래스
class ShareObject{
	//field
	private int sum;
	
	//동기화 방법 1: 메서드 자체에 동기화 설정하기
	//스레드가 해당 메서드에 접근하는 순간 다른 스레드는 메서드에 접근 후 기다려야 한다.
//	synchronized public void add() {
	public void add() {
		//동기화 하는 방법2: 동기화 블럭 사용
		//mutex: Mutual exclusion Object(상호배체 - 동시접근 차단)
//		synchronized (this) {
//			for (int i = 0; i < 1000000000; i++) {}
//			int n = sum;
//			
//			n += 10;
//			
//			sum = n;
//			
//			//현재 실하는 스레드에 대한 정보 + 필드값 출력
//			System.out.println(Thread.currentThread().getName() + " 합계: " + sum);
//		}
		
		for (int i = 0; i < 1000000000; i++) {}
		int n = sum;
		
		n += 10;
		
		sum = n;
		
		//현재 실하는 스레드에 대한 정보 + 필드값 출력
		System.out.println(Thread.currentThread().getName() + " 합계: " + sum);
			
	}
}

//작업을 수행할 스레드
class WorkerThread extends Thread {
	//field
	private ShareObject sObj;
	
	//cons
	public WorkerThread(ShareObject sObj) {
		this.sObj = sObj;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			//호출하는 메서드에서 동기화 블럭 사용하기...
			synchronized (sObj) {
				sObj.add();
			}
		}
	}
	
}