package day09;

public class StudentExample {
	public static void main(String[] args) {
		Student st1 = new Student("홍길동", "123456-1234567", 1);
		
		System.out.println("name: " + st1.name);
		System.out.println("ssn: " + st1.ssn);
		
		System.out.println("studentNo: " + st1.studentNo);
	}
}
