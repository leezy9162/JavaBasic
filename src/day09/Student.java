package day09;

public class Student extends People{
	//필드
	public int studentNo;
	
	//생성자
	public Student(String name, String ssn, int studentNo) {
//		super(); -> 상속받은 People 클래스의 생성자는 기본 생상자가 아니다.
		super(name, ssn); //때문에 정해진 매개변수를 부모 클래스에 넘겨줘야 한다.
//		항상 부모 클래스를 먼저 생성하고 자식 클래스를 초기화 해야 한다.
//		this.name = name;
//		this.ssn = ssn; super(name, ssn) 에서 이미 초기화가 되었다.
		this.studentNo = studentNo;
	}

	
	

}
