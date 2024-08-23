package day14.stringEx;

public class ByteToStringEx {
	public static void main(String[] args) {
		//byte 타입 배열
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		System.out.println(bytes[0]);
		
		//byte 배열을 문자열로 변환
		String str1 = new String(bytes);
		System.out.println(str1);
		
		//배열의 offset 인덱스 위치부터 length 만큼 String 객체로 생성
		String str2 = new String(bytes, 6, 4); //6번부터 4개
		System.out.println(str2);
	}
}
