package day05;

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평군: " + avg);
		
		//배열을 new 연산자를 통해 사이즈만 설정해서 객체를 생성하면 메모리가 할당됨
		//각 원소는 int의 경우 0으로 초기화
		int[] arr = new int[3];
		//향상된 for문으로 배열읽기
		for (int i : arr) {
			System.out.println(i);
		}
		
//		int[] intArray = null; 참조 타입 변수 intArray가 존재하지 않는 객체르 참조하고 있는 상태
//		System.out.println(intArray[0]); NullPointerException 발생.
//		존재하지 않는 값을 참조하고 있음
	}
}
