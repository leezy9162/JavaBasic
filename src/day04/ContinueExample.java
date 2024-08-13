package day04;

public class ContinueExample {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			//2로 나눈 값이 0이 아닌 경우는 생략.
			if(i % 2 != 0) {
				continue; //증감식 동작 후 다시 조건식으로 이동.
			}
			System.out.println(i);
		}
	}
}
