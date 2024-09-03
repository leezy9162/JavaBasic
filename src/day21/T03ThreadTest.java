package day21;

/*
 * 스레드이 수행시간 테스트 해보기.
 */

public class T03ThreadTest {
	public static void main(String[] args) {
		Thread th = new Thread(new MyRunner());
		
		/*
		 * UTC(Universal Time Coordinated, 협정 세계 표준시)를 사용하여
		 * 1970년 1월 1일 0시 0분 0초를 기준으로 경과한 시간을 
		 * 밀리세컨드(1/1000초) 단위로 나타낸다.
		 */
		long startTime = System.currentTimeMillis();
		th.start();
		try {
			th.join(); //현재 실행중인 스레드(Main)에서 작업중인 스레드(th)가 종료될때까지 기다린다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("경과 시간: " + (endTime-startTime)+"(ms)");
	}
}



class MyRunner implements Runnable{
	/*
	 * run() over ride
	 */
	@Override
	public void run() {
		//1~10억 까지의 합계를 구하는 스레드
		long sum = 0;
		for (int i = 1; i <= 1000000000; i++) {
			sum += i;
		}
		System.out.println("합계: " + sum);
	}
}