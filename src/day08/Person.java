package day08;

public class Person {
	final String nation = "Korea";
	final String ssn; //파이널 변수는 꼭 초기화 해야 한다. 우리는 아래 생성자에서 초기화한다.
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn; //생성할때 초기화된 값을 더 이상 변경 할 수 없도록
		this.name = name;
	}
	
}
