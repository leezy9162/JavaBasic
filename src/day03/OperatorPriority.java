package day03;

public class OperatorPriority {
	public static void main(String[] args) {
		int x = 1;
		int y = -1;
		
		boolean result1 = x > 0 && y < 0;
		System.out.println("result: " + result1);
		
		//우선순위가 같을 때는 왼쪽에서 오른쪽 순으로 진행한다.
		int result2 = 100 * 2 / 3 % 5;
		System.out.println("result2: " + result2);
		
		int var1 = 1;
		int var2 = 3;
		int var3 = 2;
		
		int result3 = var1 + var2 * var3;		
		System.out.println("result3: " + result3);
		
		int result4 = (var1 + var2) * var3;
		System.out.println("result4: " + result4);
		
		int x2 = 1;
		int y2 = 1;
		
		int result5 = ++x2 + 10;
		System.out.println("result5: " + result5);
		int result6 = y2++ + 10;
		System.out.println("result6: " + result6);
		
	}
}
