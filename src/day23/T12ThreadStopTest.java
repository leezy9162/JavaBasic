package day23;

public class T12ThreadStopTest {
	public static void main(String[] args) {
//		1. flag 변수를 활용해 스레드를 정지시키는법
//		ThreadStopEx1 th1 = new ThreadStopEx1();
//		th1.start();
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		th1.stop(); => 스레드가 실행중이더라도 강제 종료 -> 사용하지 않는 것이 좋다
//		th1.setStoped(true); //스레드 종료시키기(Flag 변수(boolean)를 사용하기)
		
		
//		2. interrupt 를 걸어 스레드를 정지시키는 방법
		ThreadStopEx2 th2 = new ThreadStopEx2();
		th2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th2.interrupt(); //th2 스레드에 인터럽트 걸기
		
		

	}
}

class ThreadStopEx1 extends Thread {
	private boolean isStoped;

	//setter
	public void setStoped(boolean isStoped) {
		this.isStoped = isStoped;
	}
	
	@Override
	public void run() {
//		while (!isStoped) {
//			System.out.println("스레드 처리중.....");
//		}
//		
//		System.out.println("자원 정리 중.....");
//		System.out.println("실행 종료.....");
		
	}
	
	
}

//interrupt()메서드를 이용하여 스레드를 멈추기
class ThreadStopEx2 extends Thread{
	@Override
	public void run() {
		//방법1. sleep()메서드나 join()메서드를 사용했을때
		//interrupt()메서드를 호출하면 InterruptExcoption이 발생한다. 이 예외를 이용하기
//		try {
//			//예외발생(interrupt 호출)전까지 무한반복 
//			while (true) {
//				System.out.println("스레드 처리중...");
//				Thread.sleep(1);
//			}
//		} catch (InterruptedException ex) {}
//		
		
		//방법2. interrupt 메서드가 호출되었는지 검사하는 방법
		while (true) {
			System.out.println("스레드 처리 중...");
			
			//검사방법1: 스레드의 인스턴스 객체용 메서드를 이용하는 방법
//			if (this.isInterrupted()) {
//				System.out.println("인스턴스용 isInterrupted() 호출됨");
//				break;
//			}
			
			//검사방법2: Thread 클래스의 정적 메서드 활용
			if (Thread.interrupted()) {
				System.out.println("Thread.Interrupted() 호출됨");
				break;
			}
		}
		
		System.out.println("자원 정리 중........");
		System.out.println("실행종료");
	}
}