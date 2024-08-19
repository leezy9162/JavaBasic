package day10.instanceOf;

public class InstanceOfExample {
	//method1
	public static void method1(Parent parent) { //Parent 타입 파라미터를 받아
		//만약 받은 Parent 가 Child 로 만들어진 인스턴스라면
		if (parent instanceof Child) {
			//다운캐스팅을 하라
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			//그렇지 않으면 다운캐스팅 x
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	//method2
	public static void method2(Parent parent) {//Parent 타입 파라미터를 받아
		//다운캐스팅 하라
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	//main
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}
}
