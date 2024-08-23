package day14.systemEx;

public class ExitEx {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i==5) {
				//break;
				//return;
				System.exit(0); //프로그램 강제 종료
			}
		}
		
		//실행되지 못하는 코드
		//break; 를 하면 loop만 빠져나오기 때문에 아래 코드는 실행된다.
		//return; 을 하면 main 메서드를 빠져나오기 때문에 아래의 코드가 실행되지 않는다.
		System.out.println("마무리 코드");
	}
}
