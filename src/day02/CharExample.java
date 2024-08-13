package day02;

public class CharExample {
	public static void main(String[] args) {
//		char 타입은 작은 따옴표 안의 문자 리터럴이 유니코드로 변환되어 저장된다.
//		유니코드는 각국의 문자를 2byte로 표현할 수 있눈 국제 표준 규약.		
		char c1 = 'A'; //문자 리터럴 직접 저장
		char c2 = 65; //10진수
		char c3 = '\u0041'; //16진수
		
		char c4 = '가'; //문자 리터럴 직접 저장
		char c5 = 44032; //10진수
		char c6 = '\uac00'; //16진수
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}
