package day08.ex;

public class ExTest {
	public static void main(String[] args) {
		int[] arr = new int[6];
		
		
		for (int i = 0; i < arr.length; i++) {
			int num = (int) (Math.random() * 45) + 1;
			arr[i] = num;
			for (int j = 0; j < i; j++) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		
	}

}
