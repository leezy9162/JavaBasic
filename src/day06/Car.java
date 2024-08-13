package day06;

public class Car {
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	// 기본 생성자
	public Car() {
	}
	
	//생성자2, 파라미터 값이 다르기 때문에 생성자를 오버로드할 수 있다.
	public Car(String color, int cc) {
		
	}
	
	//생성자2
	public Car(int cc, String color) {
		
	}
}
