package day08.ex;

import java.util.Scanner;

public class ExLotteryTicket {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        while(true){
	            System.out.println("메뉴 선택 1. 구입 2. 종료");

	            int opt = sc.nextInt();
	            if (opt == 2){
	                System.out.println("종료");
	                break;
	            } else if (opt != 1) {
	                System.out.println("잘못된 입력 다시");
	                continue;
	            }

	            //몇번 출력할지, 잔돈은 얼만지 계산하기
	            System.out.print("금액 입력: ");
	            int input = sc.nextInt();
	            int times;
	            int change;
	            times = input / 1000; //1000원으로 나눈 몫이 횟수
	            change = input % 1000; //1000원으로 나눈 나머지가 잔돈
	            System.out.println("받은 금액은 " + input + "이고 거스름돈은 " + change + "입니다.");

	            //중복제거 기능 넣어야 함.
	            int[] lottery = new int[6];


	            for (int i = 1; i <= times; i++) {
	            	//랜덤한 값 넣기
	                for (int j = 0; j < lottery.length; j++) {
	                    int num = (int) (Math.random() * 45) + 1;
	                    lottery[j] = num;
	                    for (int k = 0; k < j; k++) {
	                    	//지금까지 넣은 숫자랑 같은 값이 발견되면 다시
							if(lottery[k] == lottery[j]) {
								j--;
								break;
							}
						}
	                }
	                //출력
	                for (int k = 0; k < lottery.length; k++) {
	                    if (k == lottery.length - 1){
	                        System.out.print(lottery[k]);
	                        break;
	                    }
	                    System.out.print(lottery[k] + ",");
	                }
	                System.out.println();
	            }

	        }

	   }
	   
}
