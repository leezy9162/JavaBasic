package day14.classEx;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		//첫번째 방법
		//clazz라는 변수에 Car 클래스에 대한 정보를 담는다.
		Class clazz = Car.class;
		
		//두번째 방법
		Class klass = Class.forName("day14.classEx.Car");
		
		//세번째 방법
		Car car1 = new Car();
		Class klazz = car1.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(klass.getSimpleName());
		System.out.println(klazz.getPackage().getName());
	}
}
