package day09;

public class DmbCellPhone extends CellPhone{
	//필드
	//DmbCellPhone만의 필드
	int channel;
	//CellPhone 에서 정의한 필드를 다시 정의할 필요가 없다. - 상속
	
	//생성자
	//상속받은 필드와 자신의 필드를 매개변수로 값을 받아 초기화. - 상속
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메서드
	//아래의 메서드 말고도 상속받은 메서드를 사용할 수 있다. - 상속
	void turnOnDmb() {
		System.out.println("채널 " + this.channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel  = channel;
		System.out.println("채널 " + this.channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
