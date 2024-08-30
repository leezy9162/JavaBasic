package day19;

import java.util.HashMap;
import java.util.Map;

/*
 * 제너릭 클래스를 선언하는 방법
 * 
 * - 형식(클래스를 제너릭 클래스로 만드는 법)
 * class 클래스명<제너릭타입글자>{
 * 		제너릭타입글자 변수명; //객체변수 선언에 제너릭을 사용하는 경우
 * 		...
 * 		
 * 		제너릭타입글자 메서드명(){ //반환값이 있는 메서드에 사용하는 경우
 * 			...
 * 
 * 			return 값;
 * 		}
 * 		...
 * }
 * --제너릭 타입 글자--
 * T=> Type
 * L=> Key
 * V=> Value
 * E=> Element
 */


//Generic이 아닌 클래스
class NonGeneric {
	private Object val;

	public Object getVal() {
		return val;
	}

	public void setVal(Object val) {
		this.val = val;
	}
	
	
}

//Generic class
class MyGeneric<T> { //<>안의 문자는 이제 오타가 아닌 타입을 의미한다
	private T val; //여기서 T는 MyGeneri을 쓸때 <>안에 들어온 타입을 의미한다

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}
	
}

//제너릭이 없다면...
class MyGeneric1 { 
	private String val; 

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
}
class MyGeneric2 { 
	private Integer val; 

	public Integer getVal() {
		return val;
	}

	public void setVal(Integer val) {
		this.val = val;
	}
	
}

public class T01GenericClassTest {
	public static void main(String[] args) {
		//NonGeneric 클래스는 필드값 형식이 Object 이기 때문에
		//필드를 set 할때 어떤 형식을 넘겨도 문제가 없다.
		NonGeneric ng1 = new NonGeneric();
		ng1.setVal("가나다라");
		NonGeneric ng2 = new NonGeneric();
		ng2.setVal(200);
		
		//단, 해당 필드 값을 꺼내 사용하려면 매번 Casting을 해줘야 한다.
		String rtnVal1 = (String) ng1.getVal();
		System.out.println("문자열 반환값 rtnVal1:  " + rtnVal1 );
		int rtnVal2 = (int) ng2.getVal();
		System.out.println("정수형 반환값 rtnVal2: " + rtnVal2);
		
		/////////////////////////////////////////////////////////
		
		MyGeneric<String> mg1 = new MyGeneric<String>();
		MyGeneric<Integer> mg2 = new MyGeneric<Integer>();
		
		mg1.setVal("우리나라");
		mg2.setVal(500);
		
		rtnVal1 = mg1.getVal();
		rtnVal2 = mg2.getVal();
		
		System.out.println("제너릭 문자열 반환값: " + rtnVal1);
		System.out.println("제너릭 정수 반환값: " + rtnVal2);
		
		
		
		
		
		
		
		
	}
}
