package day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T11DisplayCharacterTest {
/*
 * 3개(명)의 스레드가 각각 알파벳 대문자를 출력하는데,
 * 출력을 끝낸 순서대로 결과를 나타내는 프로그램 작성하기
 */
	static int currRank = 1; //현재 순위 정보
	public static void main(String[] args) {
		List<DisplayCharacter> disCharList = new ArrayList<DisplayCharacter>();
		disCharList.add(new DisplayCharacter("한유림"));
		disCharList.add(new DisplayCharacter("최서연"));
		disCharList.add(new DisplayCharacter("최종윤"));
		disCharList.add(new DisplayCharacter("이상우"));
		
		for (int i = 0; i < disCharList.size(); i++) {
			disCharList.get(i).start();
		}
		
		for (DisplayCharacter dc : disCharList) {
			try {
				dc.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//경기가 끝나고 나면 순위가 정렬된 상태로 출력하기 위해 Collections.sort()
		Collections.sort(disCharList);
		
		System.out.println("경기 끝...");
		System.out.println("----------------------");
		System.out.println("\t경기 결과");
		System.out.println("----------------------");
		System.out.println("순위\t\t이름");
		System.out.println("----------------------");
		for (DisplayCharacter dc : disCharList) {
			System.out.println(dc.getRank() + "등"+"\t\t" + dc.getName());
		}
	}
}

//알파벳 대문자를 출력하는 스레드
class DisplayCharacter extends Thread implements Comparable<DisplayCharacter> {
	private String name;
	private int rank;
	
	//constructor
	public DisplayCharacter(String name) {
		super(name);
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(name + "의 출력문자: " + ch);
			
			try {
				//sleep() 메서드의 시간을 200~500 사이의 난수로 설정
				Thread.sleep((int) (Math.random()*301 + 200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		setRank(T11DisplayCharacterTest.currRank++);
		System.out.println(name + " 출력끝....");
	}

	@Override
	public int compareTo(DisplayCharacter o) {
		if (this.getRank()<o.getRank()) {
			return -1;
		} else if (this.getRank()==o.getRank()) {
			return 0;
		} else {
			return 1;
		}
		
//		return Integer.valueOf(this.rank).compareTo(o.getRank());
	}
	
}
