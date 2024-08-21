package day12.anonymousEx;

public class Anonymous {
	//필드 초기값 대입
	//Person 클래스를 기반으로 해당 타입 필드를 만든다.
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method1() {
		//로컬 변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		//로컬 변수 사용
		localVar.wake();
	}
	
	
	void method2(Person person) {
		person.wake();
	}
}
