package day10;

public class Tire {
	//field
	public int maxRotation; //최대 회전수
	public int accumulatedRotation; //누적 회전수
	public String location; //타이어 위치
	
	//constructor - location, maxRotation
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//method
	public boolean roll() {
		++accumulatedRotation; //누적 회전수를 1 증가.
		//누적 회전수가 최대 회전수에 도달하지 않으면  - 남은 회전수를 출력
		if (accumulatedRotation<maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			//최대 회전수에 도달하면  - 펑크 출력
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}
	
}
