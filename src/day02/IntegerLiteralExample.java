package day02;

public class IntegerLiteralExample {
	public static void main(String[] args) {
		
//		int(타입) var1(변수명) =(대입 연산자) 0b1011(리터럴);
		int var1 = 0b1011; //2진수 0b는 뒤의 숫자가 2진수임을 의미한다
		int var2 = 0206; //8진수 0~
		int var3 = 365; //10진수
		int var4 = 0xB3; //16진수 0x~ 
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
	}
}
