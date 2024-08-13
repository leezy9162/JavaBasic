package day06;

import java.util.Scanner;

public class ExCalculator {
	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		//프로그램 시작 알림문 출력
		System.out.println("===============================================\r\n"
				+ "  계산기 프로그램\r\n"
				+ "===============================================");
		
		//무한 반복문 시작
		while(true) {
			//메뉴 선택 알림문 출력
			System.out.println("  메뉴를 선택하세요.\r\n"
					+ "  1. 더하기연산\r\n"
					+ "  2. 빼기연산\r\n"
					+ "  3. 곱하기연산\r\n"
					+ "  4. 나누기연산\r\n"
					+ "  0. 프로그램 종료");
			
			//메뉴 선택 값 받기
			int opt = sc.nextInt();
			
			//옵션에 따른 계산 및 종료
			if(opt == 0) {
				System.out.println("프로그램을 종료합니다...");
				break;
			} else if(opt == 1) {
				System.out.println("  더하기 연산을 위한 두 수를 입력하세요.");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println("== 연산결과 출력 ==");
				System.out.println("   " + num1 + " + " + num2 + " = " + (num1 + num2));
			} else if (opt == 2) {
				System.out.println("  빼기 연산을 위한 두 수를 입력하세요.");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println("== 연산결과 출력 ==");
				System.out.println("   " + num1 + " - " + num2 + " = " + (num1 - num2));
			} else if (opt == 3) {
				System.out.println("  곱하기 연산을 위한 두 수를 입력하세요.");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println("== 연산결과 출력 ==");
				System.out.println("   " + num1 + " * " + num2 + " = " + (num1 * num2));
			} else if (opt == 4) {
				System.out.println("  나누기 연산을 위한 두 수를 입력하세요.");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				System.out.println("== 연산결과 출력 ==");
				System.out.println("   " + num1 + " / " + num2 + " = " + (num1 / num2));
			}
			
			//한줄 띄우기
			System.out.println();
		}
	}
}
