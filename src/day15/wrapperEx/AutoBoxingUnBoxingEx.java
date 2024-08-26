package day15.wrapperEx;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		//Auto Boxing
		Integer obj1 = 100;
		System.out.println("value: " + obj1.intValue());
		
		//대입시 Auto UnBoxing
		int value1 = obj1;
		System.out.println("value: " + value1);
		
		//연산시 Auto UnBoxing
		int result = obj1 + 100;
		System.out.println("result: " + result);
		
	}
}
