package day09;

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton obj1 = new Singleton(); -> Singleton 클래스의 생성자 접근 제한이 private기 때문에
//		Singleton obj2 = new Singleton();
		
		//Singleton 클래스 타입의 변수 obj에 Singleton. 으로 접근해서 값을 담는다.
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
		
		
	}
}
