package day11.interfaceEx;

public interface RemoteControl {
	//상수
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상 메서드 - 메서드 선언부만 작성
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
}
