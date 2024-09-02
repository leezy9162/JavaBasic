package day20;

class Util{

	/*
	 * 제너릭 메서드 <T, R> R method(T t)
	 * => 파라미터 타입과 리턴타입으로 타입글자를 가지는 메서드
	 * 
	 * -선언방법: 리턴타입 앞에 <>기호를 추가하고 타입글자를 기술후 사용함.
	 */
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {		
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	//메서드 매개변수에 들어오는 타입이 제너릭이면
	//메서드도 그 매개변수를 처리하기 위해, 제너릭으로 선언해줘야 한다.
}

/*
 * 멀티타입 <K, V>를 가지는 제너릭 클래스
 * @param <K>
 * @param <V>
 */
class Pair<K, V> {
	/*
	 * field key, value
	 */
	private K key;
	private V value;
	
	/*
	 * constructor - key, value
	 */
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	/*
	 * getter, setter about key, value
	 */
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	//키값과 value 값 출력하는 메서드
	public <K, V> void displayAll(K key, V val) {
		System.out.println(key + ": " + val);
	}
}

public class T02GenericMethodTest {
	public static void main(String[] args) {
		
		
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "홍길동");
		Pair<Integer, String> p2 = new Pair<>(1, "홍길동");
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		System.out.println(result1);

		Pair<String, String> p3 = new Pair<String, String>("001", "홍길동");
		Pair<String, String> p4 = new Pair<String, String>("002", "홍길동");
		boolean result2 = Util.compare(p3, p4);
		System.out.println(result2);
		
		//메서드의 제너릭이 더 우선시 된다...
		p3.displayAll("키", "180");
		p3.displayAll("키", 180);
	} 
	
}
