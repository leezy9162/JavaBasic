package day07;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			int num = sc.nextInt();
			
			if (num != 0) {
				sum += num;
			} if(num == 0) {
				System.out.println(sum);
				break;
			}
		}
		
	}
}
