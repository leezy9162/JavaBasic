package day15.wrapperEx;

public class BoxingUnBoxingEx {
	public static void main(String[] args) {
		//Boxing
		Integer obj1 = new Integer(100); //use deprecated method
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		//UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
	}
}
