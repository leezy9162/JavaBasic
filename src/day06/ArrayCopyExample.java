package day06;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		String[] newStrArray2 = new String[5];
		
		//얕은 복사(주소값만 복사)
		newStrArray2 = oldStrArray;
		
		
		//배열복사 System.arraycopy(원본배열, 원본배열 시작 인덱스, 새배열, 새배열 시작인덱스, 복사할 개수);
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for (String string : newStrArray) {
			System.out.print(string + ", ");
		}
		
	}
}
