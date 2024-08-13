package day07;

public class Computer {
	
	//매개변수로 인트 배열을 받아서 처리
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	//가변형 인수(Variable Arguments) 문법 사용해서 처리
	int sum2(int ... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
