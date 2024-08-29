package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class T10HashMapTest {
	public static void main(String[] args) {
		//Key를 String 타입으로 받고, Value도 String으로 받는 Map
		Map<String, String> map = new HashMap<String, String>();
		
		//데이터 추가하기 => put(key값, value값) 
		map.put("name", "홍길동");
		map.put("addr", "대전");
		map.put("tel", "010-1234-5678");
		//3개의 entry를 put
		System.out.println("map: " + map);
		
		//데이터 수정하기
		//=>데이터를 저장(추가)할때 key값이 같으면 나중에 입력한 값이 추가된다.
		map.put("addr", "서울");
		System.out.println("map: " + map);
		
		//데이터 삭제하기 => remove("삭제할 key값")
		map.remove("name");
		System.out.println("map: " + map);
		
		//데이터 읽기 => get(key값)
		System.out.println();
		System.out.println("addr: "+map.get("addr"));
		System.out.println("tel: "+map.get("tel"));
		System.out.println("---------------------------------------------");
		
//------key값들을 읽어와 데이터를 가져오는 방법---------------------------------
		//Map Collection 에 존재하는 keySet() 메서드를 활용한다.
		//새로운 Set에 Key값들을 모두 담는다.
		Set<String> keySet = map.keySet(); //Key 중복이 안되기 떼문에 Set 사용
		
		//방법1-1 => keySet() 메서드 이용. Map의 key값들만 읽어와 Set에 저장.
		System.out.println("Iterator 이용");
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next(); //keySet의 값을 하나씩 가져옴
			System.out.println(key + " : " + map.get(key)); //가져온 키 값을 get()에 활용
		}
		System.out.println("---------------------------------------------");
		
		//방법1-2 => Iterator 대신 향상된 for 문으로 처리
		System.out.println("향상된 for문을 이용한 방법");
		for (String key : keySet) {
 			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("---------------------------------------------");
		
		//방법2 => map.values는 모든 value를 가져온다.
		//value들을 for문으로 하나씩 꺼내서 출력한다.
		System.out.println("values() 메서드 이용한 방법");
		for (String value : map.values()) {
			System.out.println(value);
		}
		System.out.println("---------------------------------------------");
		
		//방법3 => Map.Entry 타입의 객체를 모두 가져와 처리하기
		//Map.entrySet()은 Set을 리턴한다.
		System.out.println("entrySet()을 이용한 방법");
		Set mapSet = map.entrySet();
		
		//Set에 있는 Entry들을 순서대로 처리하기 위해 Iterator 사용
		Iterator entryIt = mapSet.iterator();
		while (entryIt.hasNext()) {
			//Entry도 하나의 인터페이스다
			//Map.Entry 타입의 변수를 선언하고
			//Iterator를 통해 하나씩 다음 entry를 넣는다.
			//Entry 타입은 getKey와 getValue가 있어 이를 활용해 출력한다.
			Map.Entry entry = (Map.Entry) entryIt.next();
			System.out.println("key 값: " + entry.getKey());
			System.out.println("value 값: " + entry.getValue());
		}
	}
}
