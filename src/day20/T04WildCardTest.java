package day20;

import java.util.ArrayList;
import java.util.List;

public class T04WildCardTest {
/*
 * <와일드 카드 - '?'>
 * : 와일드카드는 제너릭 타입을 이용한 타입 안전한 코드를 위해
 * 사용되는 특별한 종류의(Argument)로서
 * 변수 선언, 객체생성 및 메서드를 정의 할때 사용된다.
 * (Class 선언하는 시점에서는 사용할 수 없다)
 * (또한 구체적으로 타입이 결정되야 하는 시점에서도 와일드카드를 사용할 수 없다)
 * 
 * <? extends T> => 와일드카드의 상한 제한. T와 그 자손들만 가능.
 * <? super T> => 와일드카드의 하한 제한. T와 그 조상들만 가능.
 * <?> => 허용가능한 모든 타입 가능.
 * 
 */
	
	
	
	
	public static void main(String[] args) {
//		List<E> myList = new ArrayList<E>(); => 생성하는 시점에는 구체화 되어야 한다.
		
		List<String> myList = new ArrayList<String>();
		//위처럼 만들면 이제 String 타입만 추가할 수 있음
		
		List<?> myList2 = new ArrayList<Integer>();
		List<?> myList3 = new ArrayList<String>();
		//이렇게 만들면 String이든 Integer or whatever 다 가능하다.
		
		//여기서 아예 모든 타입을 받는것이 아니라 제한을 주고 싶을때는 다음과 같은 방법을 사용한다.
		
		
		
		//FruitBos 객체에 Fruit type
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		System.out.println(fruitBox.getFruitList());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); -> generic을 Apple로 했기 때문..
		System.out.println(appleBox.getFruitList());
		
		//일반메서드
		Juicer.makeJuice1(fruitBox);
//		Juicer.makeJuice1(appleBox);
		
		//generic, bounded parameter 사용 메서드
		Juicer.makeJuice2(fruitBox);
		Juicer.makeJuice2(appleBox);
		
		//wildCard를 사용한 메서드
		Juicer.makeJuice3(fruitBox);
		Juicer.makeJuice3(appleBox);
	}
}

class Juicer{
	
	//파라미터에 FruitBox의 타입을 Fruit로 지정하고 있다.
	//Apple은 Fruit를 상속 받은 자식 클래스 이지만 해당 문법에서 허용되지 않는다.
	//오직 Fruit 타입만 매개 변수로 올 수 있다....
	
	//일반 메서드
	public static void makeJuice1(FruitBox<Fruit> box) {
		String fruitListStr = ""; //과일목록
		
		int cnt = 0; //출력시 ,를 위한 변수
		for(Object obj : box.getFruitList()) {
			if (cnt == 0) {
				fruitListStr += obj;
			} else {
				fruitListStr += ", " + obj;
			}
		}
		System.out.println(fruitListStr + " => 쥬스 완성!");
	}
	
	
	//generic + bounded parameter
	public static <T extends Fruit> void makeJuice2(FruitBox<T> box) {
		String fruitListStr = ""; //과일목록
		
		int cnt = 0; //출력시 ,를 위한 변수
		for(T obj : box.getFruitList()) {
			if (cnt == 0) {
				fruitListStr += obj;
			} else {
				fruitListStr += ", " + obj;
			}
		}
		System.out.println(fruitListStr + " => 쥬스 완성!");
	}
	
	//wildCard 이용 + 타입 제한
	public static  void makeJuice3(FruitBox<? extends Fruit> box) {
		String fruitListStr = "";
		
		int cnt = 0; 
		for(Object obj : box.getFruitList()) {
			if (cnt == 0) {
				fruitListStr += obj;
			} else {
				fruitListStr += ", " + obj;
			}
		}
		System.out.println(fruitListStr + " => 쥬스 완성!");
	}
}

//Super Class
class Fruit{
	//field
	private String name;

	//constructor
	public Fruit(String name) {
		this.name = name;
	}
	
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//toString
	@Override
	public String toString() {
		return "이름: " + name + " ";
	}
	
}


//Sub class1
class Apple extends Fruit{
	//constructor
	public Apple() {
		//부모 클래스의 생성자가 기본 생성자가 아니기 때문에...
		super("사과");
	}
}

//Sub class2
class Grape extends Fruit{
	//constructor
	public Grape() {
		super("포도");
	}
}

//Generic Class
//Class 선언할때는 wildCard를 사용할수 없다.
//class Test<?>{}

class FruitBox<T>{
	//Field
	private List<T> fruitList;
	
	//constructor - 생성될때 ArrayList로 초기화 해준다
	public FruitBox() {
		this.fruitList = new ArrayList<>();
	}
	
	//getter
	public List<T> getFruitList() {
		return fruitList;
	}
	
	//넘어오는 파라미터 값을 본인의 리스트에 추가해준다
	public void add(T fruit) {
		fruitList.add(fruit);
	}
}
