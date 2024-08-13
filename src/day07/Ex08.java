package day07;

public class Ex08 {
	public static void main(String[] args) {
		//문자열 2차원배열 생성
		String[][] arr= {
						{"무궁화", "78", "89", "67"},
						{"개나리", "45", "67", "77"},
						{"진달래", "89", "99", "77"},
						{"수선화", "96", "56", "78"},
						{"라일락", "89", "67", "89"},
						};
		
		//총합 변수 선언
		int sum = 0;
		//이중 반복문으로 인덱스에 접근
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 4; j++) {
				//점수는 숫자이기에 합산을 위해 파싱
				sum += Integer.parseInt(arr[i][j]);
				if (j == 3) {
					//점수를 모두 탐색했으면 아래의 실행문
					System.out.println(arr[i][0] + "의 총합: " + sum);
					System.out.println(arr[i][0] + "의 평균: " + (double) sum / 3);
					//다음 행을 위해 변수 비우기
					sum = 0;
				}
			}
		}
		//배열로 출력하는 말이 이해가 안되서 임의로 출력만 했습니다.
		
	}
}
