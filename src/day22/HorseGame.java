package day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HorseGame {
/*
10마리의 말들이 경주하는 경마 프로그램 작성하기

말은 Horse라는 이름의 클래스로 구성하고,
이 클래스는 말이름(String), 등수(int)를 멤버변수로 갖는다.
그리고, 이 클래스에는 등수를 오름차순으로 처리할 수 있는
기능이 있다.( Comparable 인터페이스 구현)

경기 구간은 1~50구간으로 되어 있다.

경기 중 중간중간에 각 말들의 위치를 >로 나타내시오.
예)
1번말 --->------------------------------------
2번말 ----->----------------------------------
...

경기가 끝나면 등수를 기준으로 정렬하여 출력한다.
 */
	static int Rank = 1;
	
	public static void main(String[] args) {
		//Horse 클래스를 담는 ArrayList를 생성합니다.
		List<Horse> horseList = new ArrayList<Horse>();
		
		//리스트에 각 Horse객체를 추가합니다.
		horseList.add(new Horse("한유림님 경주마"));
		horseList.add(new Horse("최서연님 경주마"));
		horseList.add(new Horse("최종윤님 경주마"));
		horseList.add(new Horse("이상우님 경주마"));
		horseList.add(new Horse("곽철우님 경주마"));
		horseList.add(new Horse("김원빈님 경주마"));
		horseList.add(new Horse("육회평님 경주마"));
		horseList.add(new Horse("김동준님 경주마"));
		horseList.add(new Horse("이지용님 경주마"));
		horseList.add(new Horse("이경우님 경주마"));
		
		//경주 시작 카운트 다운인데 그냥 여기다...
		for (int i = 1000; i <= 3000; i += 1000) {
			try {
				Thread.sleep(i);
				switch (i) {
					case 1000:
						System.out.println("3초후 경주를 시작합니다...");
						break;
					case 2000:
						System.out.println("2초후 경주를 시작합니다...");
						break;
					case 3000:
						System.out.println("1초후 경주를 시작합니다...");
						break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//경주 시작 메세지 출력
		System.out.println("========= 경주를 시작합니다 ==========");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//리스트에 접근해 각 스레드를  start시킵니다.
		for (int i = 0; i < horseList.size(); i++) {
			horseList.get(i).start();
		}
		
		//조인합니다
		for (Horse dc : horseList) {
			try {
				dc.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//Horse 들을 돌리던 스레드들 이 멈추면 메세지 출력
		System.out.println("========= 경주가 끝났습니다 ==========");
		
		//등수별 정렬
		Collections.sort(horseList);
		
		//결과출력
		for (Horse horse : horseList) {
			System.out.println(horse.getRank()+"등은 " + horse.getHoresName()+"입니다.");
		}
		System.out.println("=========메인 스레드 종료 메세지=========");
		
	}
}

class Horse extends Thread implements Comparable<Horse>{
	private String horesName;
	private int rank; //전역변수를 통해 랭크가 담길 변수
	private String[] strArr = new String[50];
	
	
	public Horse(String horesName) {
		//생성되는 시점에 이름과 필드에 있는 배열을 사이즈만큼 모두 '-'로 초기화
		this.horesName = horesName;
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = "-";
		}
		System.out.println(horesName +" 등록 완료");
	}

	
	public String getHoresName() {
		return horesName;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}


	@Override
	public void run() {
		//아무것도 없는 String 변수 선언
		String go = "";
		
		//각 Horse 가 돌릴 메인 반복문
		for (int i = 0; i < strArr.length; i++) {
			
			//생성자를 통해 전부 '-'로 초기화된 부분을 '>'로 바꿉니다.
			this.strArr[i] = ">";
			
			//arr[-1]은 없기때문에 0을 제외하고 지나간 자리를 다시 '-'로 바꿔줍니다.
			if (i!=0) {
				this.strArr[i-1] = "-";
			}
			
			//아무것도 없던 String 변수에 전체 배열을 담아줍니다.
			for (int j = 0; j < strArr.length; j++) {
				go = go + strArr[j];
			}
			
			//현재까지 간 거리를 출력
			System.out.println(this.horesName + " " + go);
			
			//각 Horse 의 차이를 sleep, random 으로 구현합니다.
			try {
				Thread.sleep((int) (Math.random()*301 + 200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//go를 다시 초기화
			go = "";
		}
		//for 끝나면 전역변수를 사용해 랭크를 부여
		setRank(HorseGame.Rank++);
		System.out.println(this.horesName +"가 결승선을 도착....");
	}

	//Comparable 인터페이스 구현 메서드 compareTo Override
	@Override
	public int compareTo(Horse o) {
		//구현되어 있는 compareTo 활용
		return Integer.valueOf(this.getRank()).compareTo(o.getRank());
	}

	
}
