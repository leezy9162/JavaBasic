package day09;

public class SupersonicAirplane extends Airplane{
	//상수값 선언.
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	//flyMode를 NOMAL과 SUPERSONIC 사이에서 선택할 수 있도록
	public int flyMode = NOMAL; //NORMAL, SUPERSONIC으로 해놓는 것이 가독성이 좋다.
	
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly(); //부모 클래스의 메서드를 호출
		}
	}
	
}
