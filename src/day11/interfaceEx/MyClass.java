package day11.interfaceEx;

public class MyClass {
	//field
	RemoteControl rc = new Television();
	
	//default constructor
	public MyClass() {
	
	}
	//constructor over-load
	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//method
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
	
}
