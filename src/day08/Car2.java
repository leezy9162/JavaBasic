package day08;

public class Car2 {
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	public Car2() {
		
	}
	
	//메서드
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		if (speed < 0 ) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
}
