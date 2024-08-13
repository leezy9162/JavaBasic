package day08;

public class Car {
	int speed;
	
	void run() {
		System.out.println(this.speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car car1 =  new Car();
		car1.speed = 60;
		car1.run();
	}
}
