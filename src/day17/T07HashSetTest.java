package day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class T07HashSetTest {
	public static void main(String[] args) {
		/*
		 * Set도 결국 Collection interface를 implements 했기 때문에
		 * List와 사용법이 유사하다.
		 */
		
		//Create Set
		Set hs1 = new HashSet();
		
		//Set CRUD
		//Set에 데이터를 추가할 때에도 add() 메서드를 이용한다.
		hs1.add("DD"); //auto Boxing
		hs1.add("AA");
		hs1.add(2);
		hs1.add("CC");
		hs1.add("BB");
		hs1.add(1);
		hs1.add(3);
		System.out.println("Set 데이터: " + hs1);
		System.out.println();
		
		//Set은 데이터의 순서(인덱스) 개념을 사용하지 않는다.
		//데이터의 중복을 허용하지 않는다.
		//때문에 기존 데이터가 이미 존재하면 데이터는 추가되지 않는다.
		boolean isAdded = hs1.add("FF"); //boolean 값을 리턴한다.
		System.out.println("중복되지 않을때: " + isAdded);
		System.out.println("Set 데이터: " + hs1);
		System.out.println();
		
		isAdded = hs1.add("CC");
		System.out.println("중복될 때: " + hs1);
		System.out.println("Set 데이터: " + hs1);
		System.out.println();
		
		/*
		 * Set의 데이터를 수정하려면 수정하는 메서드가 따로 없기 때문에
		 * 해당 데이터를 삭제한 후 새로운 데이터를 추가해 주어야 한다.
		 * 
		 * 삭제하는 메서드)
		 * 1. clear() => Set의 모든 데이터 삭제
		 * 2. remove(삭제할 데이터) => 해당 데이터 삭제
		 */
		//'FF'를 'EE'로 수정하기
		hs1.remove("FF");
		System.out.println("FF 삭제 후 Set 데이터: " + hs1);
		System.out.println();
		
		hs1.add("EE");
		System.out.println("EE 추가 후 Set 데이터: " + hs1);
		System.out.println();
		
		System.out.println("Set의 데이터 개수: " + hs1.size());
		System.out.println();
		
//		hs1.clear(); //전체데이터 삭제
//		System.out.println("Set의 데이터 개수: " + hs1.size());
//		System.out.println();
		
		/*
		 * Set은 Index 정보가 없다. 때문에 get()을 사용할 수도 없다.
		 * 
		 * 그렇다면 값을 어떻게 꺼내오는가???
		 * 
		 * Set에서는 Iterator 를 사용하여 데이터에 접근한다.
		 * Iterate: '반복하다'
		 * 
		 * 모든 set은 iterator를 가지고 있다...
		 */
		//Iterator 사용법
		Iterator it = hs1.iterator();
		
		//hasNext() => 다음에 가져올 데이터가 있으면 true, 없으면 false 반환
		while (it.hasNext()) {
			//next() => 다음 데이터를 가져온다
			System.out.println(it.next());
		}
		System.out.println();
		
		/////////////////////////////////////////////////////////
		//1~100사이의 중복되지 않는 정수 5개 생성하기
		Set<Integer> intRnd = new HashSet<Integer>();
		while (intRnd.size() < 5) {
			int num = (int) (Math.random()*100) + 1 ;
			intRnd.add(num);
		}
		
//		System.out.println("만들어진 난수: " + intRnd);
		System.out.println("만들어진 난수들");
		for(Integer a : intRnd) {
			System.out.print(a + " ");
		}
		
		
	}
}
