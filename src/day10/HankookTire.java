package day10;

public class HankookTire extends Tire {
	//field
	
	//constructor
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation<maxRotation) {
			System.out.println(location + "HanKookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "HanKookTire 펑크 ***");
			return false;
		}
	}
}
