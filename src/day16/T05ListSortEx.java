package day16;

import java.util.ArrayList;
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
		
	}
}
