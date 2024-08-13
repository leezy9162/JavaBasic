package day08;

public class Car2Example {
	public static void main(String[] args) {
		Car2 car = new Car2();
		
		//private 필드 접근 불가
//		car.speed = 50;
		
		//잘못된 속도 변경
		car.setSpeed(-50);
		System.out.println("현재 속도: " + car.getSpeed());
		
		//올바른 속도 변경
		car.setSpeed(60);
		System.out.println("현재 속도: " + car.getSpeed());
		
		//멈춤
		if (!car.isStop()) {
			car.setStop(true);
		}
		System.out.println("현재 속도: " + car.getSpeed());
		
	}
}
