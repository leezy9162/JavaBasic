package day07;

public class Calculator {
	
	//void - 리턴값이 없음
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	//int 타입을 반환하는 plus 메서드
	int plus(int x, int y) {
		return x + y;
	}
	
	double divide(int x, int y) {
		return (double) x / (double) y;
	}
	
	void poweOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	
}
