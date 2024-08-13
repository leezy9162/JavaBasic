package day09;

public class Computer extends Calculator{
	
	//상속받은 메서드를 수정
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
