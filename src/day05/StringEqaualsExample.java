package day05;

public class StringEqaualsExample {
	public static void main(String[] args) {
		//리터럴을 변수에 대입
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		//같은 객체를 참조한다.
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		//물론 같은 문자열을 가지고 있다.
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		//객체를 생성해 변수에 대입
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		//각각의 객체이기 때문에 참조하는 주소값이 다르다.
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		//주소값은 다르지만 주소에 있는 문자열은 같다
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
	}
}
