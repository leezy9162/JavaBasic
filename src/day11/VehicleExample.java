package day11;

public class VehicleExample {
	public static void main(String[] args) {
		//promotion
		Vehicle vehicle =  new Bus();
		vehicle.run();
//		vehicle.checkFare(); -> Bus 객체가 인터페이스 Vehicle 타입에 담겨있기 때문에 checkFare 를 가져올 수 없다.
		
		//casting
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
		
		
	}
}
