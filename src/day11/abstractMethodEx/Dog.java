package day11.abstractMethodEx;

public class Dog extends Animal{
	
	public Dog() {
		this.kind = "포유류";
	}
	
	//추상메서드를 하위 클래스에서 정의
	@Override
	public void sound() {
		System.out.println("멍멍!");		
	}

}
