package day09;

public class Singleton {
	//자기 자신 타입의 객체를 저장하기 위한 객체변수 선언하기
	//private - 접근을 제한하기 위해 static - 아래 메서드에서 사용하기 위해
	private static Singleton singleton = new Singleton();
	
	//생성자 접근을 제한, 외부에서 객체를 생성할 수 없게한다.
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	//Singleton 타입을 반환하는 메서드
	static Singleton getInstance(){
		return singleton;
	}
	
}
