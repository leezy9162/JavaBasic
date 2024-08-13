package day07;

public class Ex07 {
	public static void main(String[] args) {
		//5*5사이즈 2차원 배열
		int[][] arr = new int[5][5];
		
		//배열에 넣을 값 배열에 넣어놓기
		int[] input = {34, 67, 89, 23, 12, 56, 23, 45, 67, 78, 56, 44, 34, 21, 90, 67, 34, 66, 78, 98, 56, 67, 90, 56, 12};
		
		// input 배열의 index 를 세어줄 변수
		int count = 0;
		
		//5*5 배열에 input 값 차례대로 값 넣기
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = input[count];
				count ++;
			}
		}
		
		//arr 출력해보기
		System.out.println("===input값을 확인해 봅니다.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("===input 확인 끝.");
		System.out.println();
		
		
		//가로줄 더해서 출력
		System.out.println("===가로줄의 합을 행마다 출력합니다.");
		int horizenSum = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				horizenSum += arr[i][j];
				if(j == 4) {
					System.out.println(i + 1 + "번째 가로줄 합: " +  horizenSum);
					horizenSum = 0;
				}
			}
		}
		System.out.println("===가로행 출력 끝.");
		System.out.println();
		
		//가로줄 더해서 출력
		System.out.println("===세로줄의 합을 열마다 출력합니다.");
		int verticalSum = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				verticalSum += arr[j][i];
				if(j == 4) {
					System.out.println(i + 1 + "번째 세로줄 합: " +  verticalSum);
					verticalSum = 0;
				}
			}
		}
		System.out.println("===세로열 출력 끝.");
		
		
		
	}
}
