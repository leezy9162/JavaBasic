package day20;


public class PlanetEnumEx {
	//enum 객체 선언
	public enum Planet{
		수성(2439), 금성(6052), 지구(6371), 화성(3390), 목성(69911), 토성(58232), 
		천왕성(25362), 해왕성(24622);
		static final double PI = 3.14;
		
		private int data;

		Planet(int data) {
			this.data = data;
		}
		
		//enum 객체는 안에 메서드를 사용할 수 있다.
		public int getData() {
			return data;
		}
	}
	
	//Main
	public static void main(String[] args) {
		//행성면적을 구하는 공식을 잘 모르겠습니다...4*pi*r^2
		Planet[] enumArr = Planet.values();
		for (int i = 0; i < enumArr.length; i++) {
			System.out.println(enumArr[i] + ": " + 
							   Math.round(Math.pow(enumArr[i].getData(),2)*Planet.PI*4)+"Km^2");
		}
		System.out.println();
	}
}
