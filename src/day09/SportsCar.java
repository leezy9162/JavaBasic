package day09;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		this.speed += 10;
	}
	
	//final method stop 은 재정의할 수 없다.
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		this.speed = 0;
//	}
}
