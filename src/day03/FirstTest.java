package day03;

public class FirstTest {
	public static void main(String[] args) {
		//byte -> int promotion
		byte byteValue = 10;
		int intValue = byteValue; //더 큰 허용범위의 타입이기 때문에 오류가 발생하지 않는다.
		
		long longValue = 5000000000L;
		float floatValue = longValue;
		double doubleValue = longValue;
		
		System.out.println("longValue: " + longValue);
		System.out.println("floatValue: " + floatValue);
		System.out.println("doubleValue: " + doubleValue);
		
		char charValue = 65;
		int intValue2 = charValue;
		
		byte byteValue2 = 64;
//		char charValue2 = byteValue2; -> 컴파일 오류 발생, char type 은 음수를 허용하지 않지만 byte 는 허용 한다.
//		따라서 자동형변환을 사용할 수 없다.
		
		//정수 타입 변수가 산술 연삭식의 피연산자로 사용되는 경우
		byte x = 10;
		byte y = 20;
//		byte result = x + y;
		int result = x + y;
//		byte, char, short 타입 변수는 int 타입으로 자동 형변환이 되어 계산된다.
		
		int intValue3 = 10;
		double doubleValue2 = 5.5;
		
		double result2 = intValue3 + doubleValue2; //int + double -> 더 큰 타입인 더블로 계산하고 결과를 변수에 대입.
		System.out.println("result2: " + result2);
		
		int result3 = intValue3 + (int) doubleValue2; //casting.
		System.out.println("result3: " + result3);
		
		double result4 = 1.5 + 2.3;
//		float result5 = 1.5 + 2.3; -> 실수 리터럴은 기본적으로 double 로 인식한다.
		float result5 = 1.5f + 2.3f; 
		
		int x2 = 1;
		int y2 = 2;
		double result6 = x2 / y2;
		System.out.println("result6: " + result6); //출력 결과: 0.0
		
		int x3 = 1;
		int y3 = 2;
		double result7 = (double) x2 / y2; 
		System.out.println("result7: " + result7); //출력 결과: 0.5
		
		String str = String.valueOf(y3); // 2 + "" 와 같은 결과
		System.out.println("str: " + str);
		
		//형식화된 문자열 출력 printf
		System.out.printf("이름: %s     %s, 나이 %d", "Hello", "world!!", 32);
	}
}
