package day02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10; //리터럴이 int 타입 범위 이내라면 L 을 붙이지 않아도 된다.
		long var2 = 20L;
//		기본적으로 정수 리터럴은 int 타입으로 간주하기 때문에... 범위 초과시 컴파일러에게 알려줘야 한다.
//		long var3 = 1000000000000; 허용범위를 초과하였지만 L 을 붙이지 않음.
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
	}
}
