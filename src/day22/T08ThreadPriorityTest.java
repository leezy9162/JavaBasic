package day22;

public class T08ThreadPriorityTest {
	public static void main(String[] args) {
		System.out.println("최대 우선순위: " + Thread.MAX_PRIORITY);
		System.out.println("최소 우선순위: " + Thread.MIN_PRIORITY);
		System.out.println("보통 우선순위: " + Thread.NORM_PRIORITY);
		
		Thread[] ths = new Thread[] {
				new ThreadTest1(), new ThreadTest1(),
				new ThreadTest1(), new ThreadTest1(),
				new ThreadTest1(), new ThreadTest1(),
				new ThreadTest1(), new ThreadTest1(),
				new ThreadTest1(), new ThreadTest1(),
				new ThreadTest1(), new ThreadTest1(),
				new ThreadTest1(), new ThreadTest1(),
				new ThreadTest1(), new ThreadTest1(),
				new ThreadTest2()
		};
		
		//우선순위는 start() 메서드 호출하기 전에 설정해야 한다.
		for (int i = 0; i < ths.length; i++) {
			if (i == 16) {
				ths[i].setPriority(10);
			} else {
				ths[i].setPriority(1);
			}
		}
		
		//설정된 우선순위 출력(스레드이름.getPriority())
		for (Thread th : ths) {
			System.out.println(th.getName() + "의 우선순위: " + th.getPriority());
		}
		
		//스레드 구동시키기
		for (Thread th : ths) {
			th.start();
		}
	}
}

//대문자를 출력하기 위한 스레드
class ThreadTest1 extends Thread {
	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			
			if (ch == 'Z') {
				System.out.println("Z(대문자) 끝");
			}
			//아무것도 하지 않은 반복문(시간 떼우기)
			//sleep은 스레드가 작동을 중지하는 것이고
			//아래와 같은 for문은 스레드가 동작중에 시간이 걸리는 개념이다.
			for (long i = 0; i <= 1000000000L; i++) {}
		}
	}
}

//대문자를 출력하기 위한 스레드
class ThreadTest2 extends Thread {
	@Override
	public void run() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
			
			if (ch == 'z') {
				System.out.println("z(소문자) 끝");
			}
			//아무것도 하지 않은 반복문(시간 떼우기)
			for (long i = 0; i <= 1000000000L; i++) {}
		}
	}
}