package day08.ex;

import java.util.Scanner;

public class ExEnWrdRandFor {
	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			//10개짜리 배열 생성
			String[] arr = new String[10];
			
			//10개의 배열에 차례대로 값을 입력
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextLine();
			}
			
			
			//배열 인덱스 섞기
			//이전과 같은 rand가 나오면 다시 
			String tmp = " ";
			for (int i = 0; i < arr.length; i++) {
				//난수 생성
				int rand = (int) (Math.random()*10);
				//새로이 난수를 만들었을때 이전과 같다면 다시
				if (arr[rand].equals(tmp)) {
						i--;
						continue;
				}
				//인덱스 0의 값 임시 저장
				tmp = arr[0];
				//인덱스 난수의 값 인덱스 0에 저장
				arr[0] = arr[rand];
				//인덱스 0에 있던 값 인덱스 난수에 저장
				arr[rand] = tmp;
			}			
			
			//배열 읽기
			for (String string : arr) {
				System.out.println(string);
			}
		
		}
	}
}
