package day15.stringEx;

public class StringToLowerUpperCaseEx {
	public static void main(String[] args) {
		String str1 = "java programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lower1 = str1.toLowerCase();
		String lower2 = str2.toLowerCase();
		System.out.println(lower1.equals(lower2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
