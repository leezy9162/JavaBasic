package day02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//실수값 저장
//		float var1 = 3.14; -> 실수 리터럴은 기본적으로 double 로 인식 되기 때문에 컴파일 오류 발생. var2 처럼 f 를 붙이면 된다.
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 사용하기
		double var6 = 3e6;
		float var7 = 3e6f;
		double var8 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
	}
}
