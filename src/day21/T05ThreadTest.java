package day21;

import javax.swing.JOptionPane;
/*
 *  단일스레드에서의 사용자 입력 처리
 */
public class T05ThreadTest {
	public static void main(String[] args) {
		//아래는 사용자의 입력이 되고 나서 카운트 다운이 시작된다.
		//카운트다운이 되기 전에 입력을 받고 싶다면?
		String str = JOptionPane.showInputDialog("아무거나 입력하세요");
		System.out.println("입력한 값은 " + str + "입니다.");
		
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
