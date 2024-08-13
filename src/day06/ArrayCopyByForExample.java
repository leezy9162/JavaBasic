package day06;


public class ArrayCopyByForExample {
	public static void main(String[] args) {
		//기존 배열생성
		int[] oldIntArray = {1, 2, 3};
		//새로운 배열
		int[] newIntArray = new int[5];
		
		
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for (int i : newIntArray) {
			System.out.print(i + ", ");
		}
		
		
	}

}
