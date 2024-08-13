package day08;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-7895556", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa"; -> final 변수는 더 이상 변경할 수 없다.
//		p1.ssn = "88888888-888888"; -> final 변수는 더 이상 변경할 수 없다.
		p1.name = "이상우"; // final이 아닌 인스턴스 멤버 변수는 변경할 수 있다.
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	}
}
