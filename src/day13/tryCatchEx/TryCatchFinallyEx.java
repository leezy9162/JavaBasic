package day13.tryCatchEx;

public class TryCatchFinallyEx {
	public static void main(String[] args) {
		try {
			System.out.println("프로그램 시작"); //예외가 발생하기 전까진 실행
			Class clazz = Class.forName("java.lang.String2"); //예외 발생... 아래는 실행되지 않고 catch
			System.out.println("프로그램이 종료되었습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("프로그램이 종료되었습니다.");
		}
		
	}
}
