package day10.abstractEx;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();
		
		SmartPhone smtp1 = new SmartPhone("홍길동");
		
		smtp1.turnOn();
		smtp1.internetSearch();
		smtp1.turnOff();
	}
}
