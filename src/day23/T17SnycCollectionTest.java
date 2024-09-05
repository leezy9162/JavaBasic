package day23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 동기화 처리한 리스트 예제
 */
public class T17SnycCollectionTest {
/*
 * Vector, Hashtable 등의 예전부터 존재하던 Collecton 클래스들은
 * 내부에 동기화 처리가 되어 있다.
 * 그런데 최근에 새로 구성된 Collection 들은 동기화 처리가 되어있지 않다.
 * 그래서 동기화가 필요한 프로그램에서 
 * 이러한 Collection 클래스들을 사용하려면 동기화 처리를 한 후에 사용해야 한다.
 * (동기화 처리를 하면 프로그램의 퍼포먼스가 떨어지기 때문에 처리가 되어있지 않다.)
 */
	//동기화 처리를 하지 않을 경우
	private static List<Integer> list1 = new ArrayList<Integer>();

	//동기화 처리를 할 경우
	private static List<Integer> list2 = Collections.synchronizedList
										(new ArrayList<Integer>());
	
	public static void main(String[] args) {
		//익명 구현 객체 생성 - 전역 List에 1~10000 넣는다
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 10000; i++) {
//					list1.add(i);
					list2.add(i);
				}
			}
		};
		
		//
		Thread[] ths = new Thread[] {
				new Thread(r), new Thread(r),
				new Thread(r), new Thread(r), new Thread(r)
		};
		
		for (Thread th : ths) {
			th.start();
		}
		
		for (Thread th : ths) {
			try {
				th.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		System.out.println("list1의 개수: " + list1.size());
		System.out.println("list2의 개수: " + list2.size());
		
	}
}
