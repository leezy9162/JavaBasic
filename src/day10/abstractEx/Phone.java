package day10.abstractEx;

public abstract class Phone {
	//abstract class 
	//field
	public String owner;
	
	//constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//method
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
