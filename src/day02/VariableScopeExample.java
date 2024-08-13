package day02;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		
//		if (v1 > 10) {
//			int v2; -> v2 변수의 생존 시작
//			v2 = v1 - 10;
//		} -> v2 변수 생존 끝
//		
//		int v3 = v1 + v2 + 5; -> v2 변수는 if 구문 밖에서 사용할 수 없다
		
		//ref
		int v2 = 0;
		
		if (v1 > 10) {
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 - 10;
		
		System.out.println(v3);
	}
}
