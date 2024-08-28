package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class T05ListSortEx {
	public static void main(String[] args) {
		/*
		 * 정렬과 관련된 interfaces: Comparable Comparator
		 * 
		 * - 보통 객체 자체에 정렬기능을 구현하기 위해서는 Comparable 사용
		 * - 정렬 기준을 별도로 구현하고 싶을 때에는 Comparator 사용
		 * 
		 * - Comparable 에서는 compareTo() 메서드를 구현해야 한다
		 * - Comparator 에서는 compare() 메서드를 구현해야 한다
		 */
		
		List<String> list = new ArrayList<String>();
		list.add("일지매");
		list.add("홍길동");
		list.add("성춘향");
		list.add("변학도");
		list.add("이순신");
		System.out.println("정렬 전 list: " + list);
		
		/*
		 * 정렬을 Collections.sort()메서드를 이용한다.
		 * 정렬은 기본적으로 '오름차순 정렬'을 수행한다.
		 * 
		 * Collection 자체는 인터페이스고 관련 필요 메서드는 
		 * Collections 클래스에 정의 되어 있다.
		 * static 메서드를 가져와 정렬한 모습이 아래와 같다.
		 */
		Collections.sort(list); //List sort method
		System.out.println("정렬 후 list: " + list);
		
		//만든 정렬을 적용하기 위해, 다시 데이터 섞기
		Collections.shuffle(list);
		System.out.println("섞은 후 lsit: " + list);
		
		/*
		 * 기본정렬인 asc 방식 말고, 정렬방식을 변경하려면
		 * 정렬방식을 결정하는 객체를 생성해서
		 * Collection.sort(obj, comparator)메서드에 파라미터로 넣어주면 된다.
		 */
		
		//정렬하기
		Collections.sort(list, new Desc()); //클래스이기 때문에 생성을 해줘야 한다.
		System.out.println("정렬 후 list: " + list + " -> 외부정렬자 사용");
		
	}
}

//문자열을 내림차순으로 정렬시키기 위한 외부 정렬자 클래스
class Desc implements Comparator<String>{ //Desc는 Comparator 인터페이스 구현 클래스...
	/*
	 * compare()메서드의 구현시 반환값을 결정하는 방법)
	 * - 오름차순_ASC 정렬일 경우
	 * 앞의 값이 크면 양수, 같으면 0, 뒤의 값이 크면 음수를 반환하도록 구현.
	 * - 내림차순_DESC 정렬일 경우
	 * 앞의 값이 크면 음수, 같으면 0, 뒤의 값이 크면 양수를 반환하도록 구현.
	 */
	@Override
	public int compare(String str1, String str2) {//비교해서 int를 리턴하는 메서드
		//이미 String 클래스는 compareTo가 정의되어 있음
		//이를 이용해 반환되는 값의 부호를 바꾸기 위해 * -1을 해주자.
		return str1.compareTo(str2) * -1; 
	}
}
