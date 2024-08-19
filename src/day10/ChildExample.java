package day10;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		System.out.println("==============");
		
		Parent parent = child;
		parent.method1();
		parent.method2();
//		parent.method3(); -> 호출 불가, 컴파일 오류 발생
		
	}

}
