package day14.objectEx.equals;

public class Member {
	public int id;
	
	public Member(int id) {
		this.id = id;
	}
	
	//최상위 클래스 Object 클래스의 equals 메서드를 재정의.
	@Override
	public boolean equals(Object obj) {
		//매개변수가 Member 객체인지 확인
		if (obj instanceof Member) {
			//매개변수로 들어온 객체를 캐스팅
			Member member = (Member) obj;
			if (this.id==member.id) { //자신의 필드값 id와 매개변수 id 필드값이 같다면
				return true;
			}
		}
		//당연히 다른 타입 객체면 false
		return false;
	}
}
