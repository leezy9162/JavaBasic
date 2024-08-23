package day14.stringEx;

import java.io.IOException;
import java.util.Arrays;

public class KeyboardToStringEx {
	public static void main(String[] args) throws IOException {
		//읽은 바이트를 저장하기 위한 배열 생성
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes); //배열에 읽은 바이트를 저장하고 읽은 바이트 수를 리턴
		
		System.out.println("bytes: " + Arrays.toString(bytes));
		
		//배열을 문자로 변환
		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);
	}
}
