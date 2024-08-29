package day18;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class T09EqualsHashCodeTest {
/*
 * - 해시함수(hash function)
 * 임의의 길이의 데이터를 고정된 길이의 데이터로 매핑(Mapping)하는 함수
 * 해시함수를 통해 얻어지는 값은 해시값, 해시코드라 부른다.
 * 
 * HashSet, HashMap, Hashtable 같은 객체들을 사용할경우
 * 객체가 서로 같은지를 비교하기 위해 equals()와 hashCode()를 호출한다.
 * 그래서 객체의 중복 여부를 결정하려면 두 메서드의 재정의를 해주어야 한다.
 * 중복체크는 데이터를 추가할때 검사한다.
 * 
 * -equals()
 * 두 객체의 내용(값)이 같은지 비교하는 메서드
 * -hashCode()
 * 객체에 대한 해시코드값을 반환하는 메서드이다. (해시테이블 작성 및 접근시 사용됨)
 * 
 * <equals(), hashCode() 메서드에 관련된 규칙>
 * 1. 두 객체가 같으면 반드시 같은 해시코드를 가져야 한다.
 * 2. 두 객체가 같으면 equals() 메서드를 호출했을떄 true를 반환해야한다.
 * => 즉 객체 a, b가 같다면 a.equals(b)와 b.equals(a) 둘다 true
 * 3. 두 객체의 해시코드가 같다고 해서 두 객체가 반드시 같은 객체는 아니다.
 *    하지만, 두 객체가 같으면 반드시 해시코드가 같아야한다.(1번 규칙)
 * 4. equals() 메서드는 재정의 해야 한다면 hashCode도 재정의 해야 한다.
 * 5. hashCode()는 기본적으로 Heap 메모리에 존재하는 각 객체에 대한 메모리 주소 매핑정보를 기반으로 한 정수값을 반환한다.
 *    그러므로, 클래스에서 hashCode()를 재정의 하지 않으면 절대로 두 객체가 같은 해시코드를 가질수없다.
 */
	
	public static void main(String[] args) {
		System.out.println("Aa".hashCode()); //hashCode: 2112
		System.out.println("Aa".hashCode()); //hashCode: 2112
		System.out.println("BB".hashCode()); //hashCode: 2112
		//hashCode만 가지고도 다른 객체인지 알 수 없다.(대부분은 가능하긴함)
		//때문에 해시코드가 같다면 equals() 메서드를 한번 더 사용한다.
		
		//Person 객체 생성
		Person p1 = new Person(1, "홍길동");
		Person p2 = new Person(1, "홍길동");
		Person p3 = new Person(1, "이순신");
		
		//equals()를 오버라이딩 하지 않은 상태는 Object 클래스의 equals를 사용한다.
		//두 객체는 다른 메모리에 있기에 false를 반환한다.
//		System.out.println("p1.equals(p2): " + p1.equals(p2));
//		System.out.println("p1 == (p2): " + (p1==p2));
		
		//equals()를 오버라이딩 한 후
		//클래스 내부에 선언된 equals()를 사용해 값을 반환해준다.
		System.out.println("p1.equals(p2): " + p1.equals(p2));
		System.out.println("p1 == (p2): " + (p1==p2));
		System.out.println();
		
		Set<Person> hSet = new HashSet<Person>();
		System.out.println("add(p1) 성공여부: " + hSet.add(p1));
		System.out.println("add(p2) 성공여부: " + hSet.add(p2));
		System.out.println("p1 해시코드: " + p1.hashCode());
		System.out.println("p2 해시코드: " + p2.hashCode()); //p1과 p2는 해시코드가 다르다.
		//우리는 Person 객체의 번호와 이름이 같으면 같다고 판단하고 싶다!
		//이제 hashCode메서드를 재정의 했기 때문에 동일한 객체는 추가되지 않는다!
		
		System.out.println("\n<p1 p2 등록 후 데이터>");
		for (Person p : hSet) {
			System.out.print(p.getId() + " : " + p.getName());
			System.out.println();
		}
		System.out.println();
		
		System.out.println("add(p3) 성공여부: " + hSet.add(p3)+"\n");
		System.out.println("<p3 등록후 데이터>");
		for (Person p : hSet) {
			System.out.print(p.getId() + " : " + p.getName());
			System.out.println();
		}
		System.out.println();
		
		System.out.println("remove(p2) 성공여부: " + hSet.remove(p2)+"\n");
		System.out.println("<remove(p2) 후 데이터>");
		for (Person p : hSet) {
			System.out.print(p.getId() + " : " + p.getName());
			System.out.println();
		}
		
	}
	
}

class Person {
	//field
	private int id;
	private String name;
	
	//constructor
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//getter, setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//toString
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

//	자동완성 된 hashCode, equals Override
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
//	내가 만든 재정의
//	//equals Override
//	@Override
//	public boolean equals(Object obj) {
//		//매개변수로 받은 객체를 Person으로 형변환.
//		Person p = (Person) obj;
//		
//		//id와 name이 같다면 같은 객체로 판단한다.
//		return this.getId() == p.getId() && this.getName().equals(p.getName());
//	}
//	
//	
//	//hashCode Override
//	 @Override
//	public int hashCode() {
//		 //String 클래스에 오버라이딩된 해시코드 메서드를 활용해보자.
//		 //field name+id 는 String + int => String...
//		 //합쳐서 해시코드가 나오게 만들었다...
//		 return (this.name + this.id).hashCode();
//	}
	
	
}
