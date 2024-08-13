package day09;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		//객체 생성
		SupersonicAirplane sa = new SupersonicAirplane();
		
		//메서드 호출
		sa.takeOff(); //상속받은 메서드 호출
		System.out.println("-------------------------------");
		sa.fly(); //flyMode != SUPERSONIC -> 부모 클래스의 메서드 호출
		System.out.println("-------------------------------");
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); //flyMode == SUPERSONIC -> 오버 라이딩 메서드 호출
		System.out.println("-------------------------------");
		sa.flyMode = SupersonicAirplane.NOMAL;
		sa.fly();
		System.out.println("-------------------------------");
		sa.land();
	}
}
