package day11.interfaceEx;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(6);
		rc.turnOff();
		System.out.println("---------");
		
		//Searchable 인터페이스에는 turnOn 등이 없기 때문에 seachable 변수에서는 호출할 수 없다.
		Searchable searchable = tv;
		searchable.search("www.naver.com");
		//turnOn 등의 메서드를 다시 호출하기 위해서는 다운캐스팅이 필요하다.
		
	}
}
