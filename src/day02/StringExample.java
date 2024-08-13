package day02;

public class StringExample {
	public static void main(String[] args) {
//		String 타입은 문자열 리터럴을 저장한다. char 타입은 문자 리터럴.
		
		System.out.println("나는\t\"자바\"\t를 사랑\t합\\니\\다.\uac00"); // \ <- 이스케이프 문자, 특정 문자를 포할시킬 수 있다.
		
		String name = "홍길동";
		String job = "프로그래머";
		
		System.out.println(name);
		System.out.println(job);
	}
}
