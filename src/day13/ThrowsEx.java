package day13;

public class ThrowsEx {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
		try {
			findClass2();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	//메서드
	//메서드 안에서 예외 발생 코드의 예외를 처리하지 않는다. 그 대신 예외를 던진다.
	//이 메서드를 호출한 곳에서 해당 예외를 처리해야 한다.
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
	
	//내 예외 발생 시키는 메서드
	public static void findClass2() throws MyException{
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			throw new MyException("내 예외 발생", e);
		}
	}
}
