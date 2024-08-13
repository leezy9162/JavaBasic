package day07;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	public Car() {
		// TODO Auto-generated constructor stub
		this("택시", "노랑", 1000);
	}
	
	//파라미터로 모델명 하나만 들어올때의 생성자
	public Car(String model) {
		//this.model = model; 나머지 필드값은 설정이 안됨
		this(model, "은색", 250); //파라미터로 넘어온 모델명을 넣고 다른 생성자를 불러와 "은색", 250으로 필드 초기화
	}
	
	public Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 400);
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
