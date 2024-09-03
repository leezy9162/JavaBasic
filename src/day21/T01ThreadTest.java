package day21;

public class T01ThreadTest {
	public static void main(String[] args) {
		//single thread program
		//main thread 가 생성되어 아래의 코드를 진행한다.
		for (int i = 1; i <= 200; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <= 200; i++) {
			System.out.print("$");
		}
	}
}
