package day09;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone 클래스로부터 상속받은 필드값 출력해보기
		System.out.println("모델: " + dmbPhone.model);
		System.out.println("색상: " + dmbPhone.color);
		
		//DmbCellPhone의 필드 출력해 보기
		System.out.println("채널: " + dmbPhone.channel);
		
		//CellPhone으로 부터 상속받은 메서드 사용해보기
		dmbPhone.poweOn();
		dmbPhone.bell();
		dmbPhone.sendVoice("여보세요");
		dmbPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbPhone.sendVoice("아~ 예, 반갑습니다.");
		dmbPhone.hangUp();
		
		//DmbCellPhone 자신의 메서드 사용해보기
		dmbPhone.turnOnDmb();
		dmbPhone.changeChannelDmb(12);
		dmbPhone.turnOffDmb();
		
	}
}
