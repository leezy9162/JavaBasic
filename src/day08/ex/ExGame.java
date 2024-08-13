package day08.ex;

import java.util.Scanner;

public class ExGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            gameStart();

            String playerInput = sc.nextLine();
            if(playerInput.equals("종료")){
                System.out.println("게임을 종료합니다.");
                break;
            }

            doGame(playerInput, comInput());
        }
    }

    private static void gameStart(){
        System.out.println("==============================");
        System.out.println("        게임을 시작합니다.       ");
        System.out.println("==============================");
        System.out.println("가위, 바위, 보 중 어떤걸 내시겠습니까?");
        System.out.println(" (종료를 원하시면 종료를 입력하세요.) ");
    }

    private static String comInput(){
        int num = (int) (Math.random() * 3) + 1;
        return switch (num) {
            case 1 -> "가위";
            case 2 -> "바위";
            case 3 -> "보";
            default -> "에러";
        };
    }


    private static void doGame(String playerInput, String comInput){
        if(playerInput.equals(comInput)){
            System.out.println("당신: " + playerInput + "\n컴퓨터 : " + comInput);
            System.out.println("비겼습니다");
        } else if (playerInput.equals("가위") && comInput.equals("보") || playerInput.equals("바위")&&comInput.equals("가위") || playerInput.equals("보")&&comInput.equals("바위")){
        	System.out.println("당신: " + playerInput + "\n컴퓨터 : " + comInput);
            System.out.println("당신이 이겼습니다.");
        } else {
        	System.out.println("당신: " + playerInput + "\n컴퓨터 : " + comInput);
            System.out.println("당신이 졌습니다.");
        };
       
    }

}
