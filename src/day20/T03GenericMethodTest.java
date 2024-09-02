package day20;

class Util2 {
	
	//Bounded parameter - Generic Method 
	public static <T extends Number> int compare(T t1, T t2) {
		/*
		제너릭 메서드에선 어떤 타입이 올지 결정해두지 않은 상태이다.
		때문에 없을수도 있는 다른 메서드를 기본적으론 호출할 수 없다
		double v1 = t1.doubleValue(); -> 사실 모든 숫자형 타입은 모두 doubleValue를 가지고 있다.
		하지만 숫자형 타입이 아닌 경우가 문제인 것이다.
		근데 나는 숫자타입 중에서 아무 타입이나 받을 건데...
		이때 사용하는 것이 '제한된 타입 파라미터'이다.(Bounded parameter)
		때문에 Number 를 extends 하면 숫자형 타입만 오도록 제한할 수 있다.
		*/
		
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
	}
	
}

/*
 * 제한된 타입파라미터(Bounded parameter) 예제
 */
public class T03GenericMethodTest {
	public static void main(String[] args) {
		int result1 = Util2.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util2.compare(3.14, 3);
		System.out.println(result2);
		
		//Using Bounded parameter
//		Util2.compare("C", "JAVA"); -> Number 타입 혹은 그 하위타입만 올 수 있다.
	}
}
