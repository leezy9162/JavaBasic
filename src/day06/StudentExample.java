package day06;

public class StudentExample {
	public static void main(String[] args) {
		//Student 클래스를 이용해 인스턴스 생성
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		//서로 같은 객체를 참조하는지 확인
		System.out.println(s1 == s2);
	}
}
