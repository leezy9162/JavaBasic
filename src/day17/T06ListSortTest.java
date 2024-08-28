package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class T06ListSortTest {
	public static void main(String[] args) {
		List<Member> memList = new ArrayList<Member>();
		
		memList.add(new Member(1, "홍길동", "010-1111-1111"));
		memList.add(new Member(5, "변학도", "010-1111-2222"));
		memList.add(new Member(9, "성춘향", "010-1111-3333"));
		memList.add(new Member(3, "이순신", "010-1111-4444"));
		memList.add(new Member(6, "강감찬", "010-1111-5555"));
		memList.add(new Member(2, "일지매", "010-1111-6666"));
		System.out.println("정렬 전)");
		for (Member m: memList) {
			System.out.println(m);
		}
		System.out.println("--------------------------------------------------");
		
		//기본정렬을 사용해보자
//		Collections.sort(memList); -> 컴파일 오류 발생
		/*
		 * Member는 필드만 3개고 타입도 다른데 어케 비교해서 정렬할건데?
		 * 다른 기본 클래스들은 이미 implements 되어 있는 상태라 쓰는데 문제 없던거임!
		 */
		
		
		//내가 over ride 한 compareTo 정렬해보기
		Collections.sort(memList); // -> 이제 정렬기준 compareTo를 오버라이딩 했기 때문에 가능
		System.out.println("정렬 후)");
		for (Member m: memList) {
			System.out.println(m);
		}
		System.out.println("--------------------------------------------------");
		
		
		//다시 리스트 데이터 섞기
		Collections.shuffle(memList);
		System.out.println("섞은 후)");
		for (Member m: memList) {
			System.out.println(m);
		}
		System.out.println("--------------------------------------------------");
		
		//외부 정렬자 사용하기
		Collections.sort(memList, new SortName());
		System.out.println("정렬 후) -> 외부 정렬자 사용");
		for (Member m: memList) {
			System.out.println(m);
		}
		System.out.println("--------------------------------------------------");
		
	}
}


//Member 객체의 필드 값 번호(num)의 내림차순으로 정렬
//여기서 comparator가 아니라 왜 comparable를 implements 하는가?
//클래스를 정의 하면서 정렬기준을 생성할때는 comparable을 사용한다.
//때문에 자바에서 제공하는 클래스들은 comparable이 이미 정의 되어 있고
//내가 새로운 정렬기준을 적용하고자 할때 comparator를 사용한다...
class Member implements Comparable<Member>{
	//field
	private int num; //번호
	private String name; //이름
	private String tel; //번호
	
	//constructor
	public Member(int num, String name, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.tel = tel;
	}
	
	//getter setter method
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//toString method over ride
	@Override
	public String toString() {
		return "Member [num = " + num + ", name = " + name + ", tel = " + tel + "]";
	}
	
	
	//compareTo method over ride
	@Override
	public int compareTo(Member memberObj) {
//		if (this.getNum() > memberObj.getNum()) {
//			//현재 Member 객체와 파라미터로 넘어온 Member객체의 num을 가져와 비교
//			return -1; //내림차순이기 때문에 현재 객체가 클때 -1 반환
//		} else if (this.getNum() == memberObj.getNum()) {
//			return 0;
//		} else {
//			return 1;
//		}
		
		//Integer 클래스를 이용해 리턴값을 정렬을 정의해보자
//		return Integer.valueOf(this.getNum()).compareTo(memberObj.getNum());
		
		return Integer.compare(this.getNum(), memberObj.getNum()) * -1;
	}
	
	
}

//Member 객체의 이름의 오름차순 정렬 기능 부여하기
class SortName implements Comparator<Member>{

	@Override
	public int compare(Member mem1, Member mem2) {
		return mem1.getName().compareTo(mem2.getName());
	}
	
}
