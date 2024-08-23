package day14.objectEx.toString;

public class SmartPhoneEx {
	public static void main(String[] args) {
		SmartPhone phone1 = new SmartPhone("구글", "안드로이드");
		
		String strObj1 = phone1.toString();
		System.out.println(strObj1);
		
		//기본적으로 객체.toString이 출력됨
		System.out.println(phone1);
	}
}
