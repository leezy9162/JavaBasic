package day11.abstractMethodEx;

public abstract class Animal {
	public String kind;
	
	//일반 메서드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메서드
	public abstract void sound(); //추상 메서드는 선언시 바디를 작성하지 않아도 된다.

}
