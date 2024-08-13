package day08;

public class CalculatorExample {
	public static void main(String[] args) {
		//정적 필드 가져오기
		double result1 = 10 * 10 * Calculator.pi;
		//정적 메서드 사용하기
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
	}
}
