package day09;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calc = new Calculator();
		System.out.println("원면적: " + calc.areaCircle(r)); //부모 클래스를 만들었기 때문에 당연히 부모의 메서드 호출
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원면적: " + com.areaCircle(r)); //부모 클래스의 메서드가 아니라, 오버라이딩한 메서드가 출력됨
		
	}
}
