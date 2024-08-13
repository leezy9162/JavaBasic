package day07;

public class CalculatorExample3 {
	public static void main(String[] args) {
		Calculator3 cal3 = new Calculator3();
		
		double result1 =  cal3.areaRectangle(10);
		double result2 = cal3.areaRectangle(10, 20); //매서드 오버로딩
		
		System.out.println("정사각형의 넓이= " + result1);
		System.out.println("직사각형의 넓이= " + result2);
	}
}
