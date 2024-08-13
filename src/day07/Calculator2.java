package day07;

public class Calculator2 {
	
	int plus(int x, int y) {
		return x + y;
	}
	
	double avg(int x, int y) {
		return (double) plus(x, y) / 2; //plus 메서드 내부 호출
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
