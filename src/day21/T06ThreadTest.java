package day21;

import javax.swing.JOptionPane;

/*
 * 멀티스레드를 활용한 카운트다운 처리예제
 */
public class T06ThreadTest {
	//사용자의 입력이 완료 되었는지 확인하기 위한 변수선언
	public static boolean inputCheck = false;
	
	public static void main(String[] args) {
		Thread th1 = new DataInput();
		Thread th2 = new CountDown();
		
		th1.start();
		th2.start();
	}
}

//데이터를 입력받는 스레드
class DataInput extends Thread{

	@Override
	public void run() {
		String str = JOptionPane.showInputDialog("아무거나 입력하세요");
		T06ThreadTest.inputCheck = true;
		System.out.println("입력한 값은 " + str + "입니다.");
	}
	/*
	 * 만약 입력을 하지 않으면 프로그램이 종료되지 않는다.
	 * (해당 스레드가 아직 살아있기 때문에)
	 * 이러한 부분 때문에 멀티 스레드 프로그래밍에서 스레드 관리가 요구된다.
	 */
	
}

//카운트다운을 하는 스레드
class CountDown extends Thread{
	@Override
	public void run() {
		for (int i = 10; i >= 1; i--) {
			if (T06ThreadTest.inputCheck==true) {
				return; //void 메서드를 탈출하기 위한 return
			}
			
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}