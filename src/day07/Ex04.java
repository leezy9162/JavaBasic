package day07;


public class Ex04 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0 || i % 3 ==0) {
				System.out.println(i);
			}
		}
	}
}
