package day08.ex;

import java.util.Random;

public class ExTest2 {
	public static void main(String[] args) {
		Random random = new Random();
		int count = 0;
		while(count != 10) {
			int a = random.nextInt(6);
			System.out.println(a);
			count++;
		}
	}

}
