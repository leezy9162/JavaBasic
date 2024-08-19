package day10.casting;

public class ChildExample {
	public static void main(String[] args) {
		//자식 객체를 부모 타입 변수에 담기(promotion)
		Parent parent =  new Child();
		
		parent.field1 = "Parent field1 접근";
//		parent.field2 = "Child field2 접근" -> 자식 인스턴스의 필드에 접근할 수 없다.
		parent.method1();
		parent.method2();
//		parent.method3(); -> 자식 인스턴스 메서드에 접근할 수 없다.
		
		//자식 인스턴스에 접근하려면 다운캐스팅이 필요함
		Child child = (Child) parent;
		child.field2 = "Child field2 접근 가능";
		child.method3();
		
		child.method1();
		child.method2();
		
	}
}
