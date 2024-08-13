package day07;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		while(true) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			if (num1 == 0 && num2 == 0) {
				System.out.println("프로그램 종료");
				break;
			} else if (num1 + num2 >= 100) {
				System.out.println("100이상 값출력: " + (num1 + num2));
			} else {
				System.out.println(num1 + " " + num2);
			}
			
			
		}
		
		
	}
}
