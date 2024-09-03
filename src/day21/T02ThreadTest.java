package day21;

public class T02ThreadTest {
	public static void main(String[] args) {
		/*
		 * T01은 첫번째 for문이 끝나고 두번째 for문이 실행되는 반면에
		 * 아래의 코드는 두가지 쓰레드가 동시에 진행되기 때문에
		 * 출력이 섞이게 된다....
		 */
		
		//Multi thread program
		//방법 1: 
		//Tread 클래스를 상속한 클래스의 인스턴스를 생성한 후 이 인스턴스의 start() 메서드를 호출한다.
		Thread th1 = new MyThread1();
		th1.start(); //스레드 시작(구동)
//		th1.run(); -> run을 사용하면 별도의 callStack 을 생성하지 않는다..
		
		//방법 2:
		//Runnable 인터페이스를 구현한 클래스의 인스턴스를 생성한후 
		//이 인스턴스를 Thread 클래스의 생성자 매개변수로 넘겨주어 스레드 객체를 생성한다.
		Runnable r = new MyThread2(); //Thread 객체의 생성자 파라미터로 넘길 객체
		Thread th2 = new Thread(r);
		th2.start();
		
		//방법 3:
		//익명 클래스를 이용하는 방법
		//Runnable 인터페이스를 구현한 익명 클래스를
		//Thread 인스턴스를 생성할 때 파라미터로 넘겨준다...(방법2처럼 새로운 클래스를 선언하지 않고 바로 진행하는 방법이다.)
		Thread th3 = new Thread(new Runnable() {//익명객체
			@Override
			public void run() {
				for (int i = 1; i <= 200; i++) {
					System.out.print("@");
					try {
						Thread.sleep(100); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}
		});
		th3.start();
	}
}

//Multi Thread 구현 - Thread 클래스 상속받기
class MyThread1 extends Thread{ //MyThtread는 Thread 를 상속받는다.
	
	/*
	 * void run() 메서드 오버라이딩
	 * run 은 Thread class 에 있는 메서드이다
	 */
	@Override
	public void run() {
		//MyThread 가 실행할 코드
		for (int i = 1; i <= 200; i++) {
			System.out.print("*");
			try {
				Thread.sleep(100); 
				//Thread Class 의 static method
				//MyThread1 sleep: 주어진 시간동안 작업을 잠시 멈춘다.
				//시간은 밀리세컨드 단위를 사용한다. (1초 = 1000밀리세컨드)
				//위 명령은 0.1초 멈춘다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		System.out.println();
	}
}


//Multi Thread 구현 - Runnable 인터페이스 구현하기
//다중 상속을 피하기 위해 Runnable 인터페이스를 구현하는 방식으로 객체를 구현한다
//(다중 구현은 가능하기 때문)
class MyThread2 implements Runnable{
	@Override
	public void run() {
		//MyThread2가 실행할 명령
		for (int i = 1; i <= 200; i++) {
			System.out.print("$");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}