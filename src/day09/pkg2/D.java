package day09.pkg2;

import day09.pkg1.A; //A 클래스 자체는 public 접근 가능, 패키지 다름 -> import 필요

public class D extends A{
	
	//A 클래스의 필드 - 생성자 - 메서드는 protected, 다른 패키지라 원래 접근이 불가능 하지만
	//D는 A 클래스를 상속받았기 때문에 접근 가능하다.
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
