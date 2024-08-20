package day11.interfaceEx;

public class RemoteControlExample {
	public static void main(String[] args) {
		//인터페이스 타입 변수 선언
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		System.out.println("------------------");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(50);
		rc.turnOff();
	}
}
